package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


@Entity
public class Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;

    private String producto;
    private int cantidad;
    private Double valor;
    private String formaPago;
    private LocalDate fechaPago; //SE DEBE VALIDAR SI SE HABRE UN POP UP O SI DENTRO DEL FEEDBACK, CABE
    private String estado; //AUTOMATICO SEGUN OPCION EN COMBOBOX DE ATRIBUTO FORMAPAGO SI CORRESPONDIENTE A PENDIENTE
    private String observacion; //MEJOR UN CHECKBOX, SI ES TRUE HABILITAR POP UP PARA COMENTARIO
    /*private localDate fechaCompra;*/ //VALIDAR SI SE REEMPLAZA POR OBSERVACION O SE CREA

    @ManyToOne
    @JoinColumn(name = "idCLiente")
    private Cliente cliente;

    public Venta() {
    }

    public Venta(int idVenta, String producto, int cantidad, Double valor, String formaPago, LocalDate fechaPago, String estado, String observacion, Cliente cliente) {
        this.idVenta = idVenta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor = valor;
        this.formaPago = formaPago;
        this.fechaPago = fechaPago;
        this.estado = estado;
        this.observacion = observacion;
        this.cliente = cliente;
    }
       
    
    
    
    
    
    //GETTERS AND SETTERS
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   

}
