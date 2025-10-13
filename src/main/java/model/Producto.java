/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name ="producto")
public class Producto implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int idProducto;
 private String nombreProducto;
 private int cantidad;
 private String DescripcionProducto;
 private double precioAdquirido;
 private double precioPorUnidad;
 private String numeroFactura;
 private String inversor;
 private double gananciaDeseada;
 private double precioPublico;
 private LocalDate fechaCompraProducto;
 
 //RELACION MANY TO TONE
 @ManyToOne
 @JoinColumn(name ="idProveedor",nullable = false)
 private Proveedor proveedor;
 

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, int cantidad, String DescripcionProducto, double precioAdquirido, double precioPorUnidad, String numeroFactura, String inversor, double gananciaDeseada, double precioPublico, LocalDate fechaCompraProducto, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.DescripcionProducto = DescripcionProducto;
        this.precioAdquirido = precioAdquirido;
        this.precioPorUnidad = precioPorUnidad;
        this.numeroFactura = numeroFactura;
        this.inversor = inversor;
        this.gananciaDeseada = gananciaDeseada;
        this.precioPublico = precioPublico;
        this.fechaCompraProducto = fechaCompraProducto;
        this.proveedor = proveedor;
    }

    //GETTERS AND SETTERS

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public double getPrecioAdquirido() {
        return precioAdquirido;
    }

    public void setPrecioAdquirido(double precioAdquirido) {
        this.precioAdquirido = precioAdquirido;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getInversor() {
        return inversor;
    }

    public void setInversor(String inversor) {
        this.inversor = inversor;
    }

    public double getGananciaDeseada() {
        return gananciaDeseada;
    }

    public void setGananciaDeseada(double gananciaDeseada) {
        this.gananciaDeseada = gananciaDeseada;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }

    public LocalDate getFechaCompraProducto() {
        return fechaCompraProducto;
    }

    public void setFechaCompraProducto(LocalDate fechaCompraProducto) {
        this.fechaCompraProducto = fechaCompraProducto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    

   
 
    
    
}
