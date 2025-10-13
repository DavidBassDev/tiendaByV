package model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ComprasPendientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompraPendiente;

    private String nombreProducto;
    private int cantidad;

    public ComprasPendientes() {
    }

    public ComprasPendientes(int idCompraPendiente, String nombreProducto, int cantidad) {
        this.idCompraPendiente = idCompraPendiente;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }

    public int getIdCompraPendiente() {
        return idCompraPendiente;
    }

    public void setIdCompraPendiente(int idCompraPendiente) {
        this.idCompraPendiente = idCompraPendiente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
