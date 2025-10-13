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
import model.Venta;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author David
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    public ClienteJpaController () {emf= Persistence.createEntityManagerFactory("TiendaPU");}

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }


    public void create(Cliente cliente) {
        if (cliente.getVentas_clientes() == null) {
            cliente.setVentas_clientes(new ArrayList<Venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Venta> attachedVentas_clientes = new ArrayList<Venta>();
            for (Venta ventas_clientesVentaToAttach : cliente.getVentas_clientes()) {
                ventas_clientesVentaToAttach = em.getReference(ventas_clientesVentaToAttach.getClass(), ventas_clientesVentaToAttach.getIdVenta());
                attachedVentas_clientes.add(ventas_clientesVentaToAttach);
            }
            cliente.setVentas_clientes(attachedVentas_clientes);
            em.persist(cliente);
            for (Venta ventas_clientesVenta : cliente.getVentas_clientes()) {
                Cliente oldClienteOfVentas_clientesVenta = ventas_clientesVenta.getCliente();
                ventas_clientesVenta.setCliente(cliente);
                ventas_clientesVenta = em.merge(ventas_clientesVenta);
                if (oldClienteOfVentas_clientesVenta != null) {
                    oldClienteOfVentas_clientesVenta.getVentas_clientes().remove(ventas_clientesVenta);
                    oldClienteOfVentas_clientesVenta = em.merge(oldClienteOfVentas_clientesVenta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getIdCliente());
            List<Venta> ventas_clientesOld = persistentCliente.getVentas_clientes();
            List<Venta> ventas_clientesNew = cliente.getVentas_clientes();
            List<Venta> attachedVentas_clientesNew = new ArrayList<Venta>();
            for (Venta ventas_clientesNewVentaToAttach : ventas_clientesNew) {
                ventas_clientesNewVentaToAttach = em.getReference(ventas_clientesNewVentaToAttach.getClass(), ventas_clientesNewVentaToAttach.getIdVenta());
                attachedVentas_clientesNew.add(ventas_clientesNewVentaToAttach);
            }
            ventas_clientesNew = attachedVentas_clientesNew;
            cliente.setVentas_clientes(ventas_clientesNew);
            cliente = em.merge(cliente);
            for (Venta ventas_clientesOldVenta : ventas_clientesOld) {
                if (!ventas_clientesNew.contains(ventas_clientesOldVenta)) {
                    ventas_clientesOldVenta.setCliente(null);
                    ventas_clientesOldVenta = em.merge(ventas_clientesOldVenta);
                }
            }
            for (Venta ventas_clientesNewVenta : ventas_clientesNew) {
                if (!ventas_clientesOld.contains(ventas_clientesNewVenta)) {
                    Cliente oldClienteOfVentas_clientesNewVenta = ventas_clientesNewVenta.getCliente();
                    ventas_clientesNewVenta.setCliente(cliente);
                    ventas_clientesNewVenta = em.merge(ventas_clientesNewVenta);
                    if (oldClienteOfVentas_clientesNewVenta != null && !oldClienteOfVentas_clientesNewVenta.equals(cliente)) {
                        oldClienteOfVentas_clientesNewVenta.getVentas_clientes().remove(ventas_clientesNewVenta);
                        oldClienteOfVentas_clientesNewVenta = em.merge(oldClienteOfVentas_clientesNewVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getIdCliente();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
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
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getIdCliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<Venta> ventas_clientes = cliente.getVentas_clientes();
            for (Venta ventas_clientesVenta : ventas_clientes) {
                ventas_clientesVenta.setCliente(null);
                ventas_clientesVenta = em.merge(ventas_clientesVenta);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
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

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
