/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import model.ComprasPendientes;
import persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author David
 */
public class ComprasPendientesJpaController implements Serializable {

   public ComprasPendientesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    public ComprasPendientesJpaController () {emf= Persistence.createEntityManagerFactory("TiendaPU");}

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ComprasPendientes comprasPendientes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(comprasPendientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ComprasPendientes comprasPendientes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            comprasPendientes = em.merge(comprasPendientes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = comprasPendientes.getIdCompraPendiente();
                if (findComprasPendientes(id) == null) {
                    throw new NonexistentEntityException("The comprasPendientes with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ComprasPendientes comprasPendientes;
            try {
                comprasPendientes = em.getReference(ComprasPendientes.class, id);
                comprasPendientes.getIdCompraPendiente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The comprasPendientes with id " + id + " no longer exists.", enfe);
            }
            em.remove(comprasPendientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ComprasPendientes> findComprasPendientesEntities() {
        return findComprasPendientesEntities(true, -1, -1);
    }

    public List<ComprasPendientes> findComprasPendientesEntities(int maxResults, int firstResult) {
        return findComprasPendientesEntities(false, maxResults, firstResult);
    }

    private List<ComprasPendientes> findComprasPendientesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ComprasPendientes.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ComprasPendientes findComprasPendientes(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ComprasPendientes.class, id);
        } finally {
            em.close();
        }
    }

    public int getComprasPendientesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ComprasPendientes> rt = cq.from(ComprasPendientes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
