/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Producto;
import model.Proveedor;
import model.Venta;
import persistence.ClienteJpaController;
import persistence.ProductoJpaController;
import persistence.ProveedorJpaController;
import persistence.VentaJpaController;

public class Controladora {

    ClienteJpaController jpaCliente = new ClienteJpaController();
    ProductoJpaController jpaProducto = new ProductoJpaController();
    ProveedorJpaController jpaProveedor = new ProveedorJpaController();
    //METODOS USUARIOS

    //CREAR USUARIO
    public void crearUsuario(Cliente cliente) {

        jpaCliente.create(cliente);
    }

    //OBTENER LISTA CLIENTES
    public List<Cliente> listaClientes = jpaCliente.findClienteEntities();

    //OBTENER CLIENTE POR NOMBRE
    public Cliente traerCliente(int id) {
        Cliente cliente = new Cliente();
        return cliente = jpaCliente.findCliente(id);
    }

    //
    public void crearCliente(Cliente cliente) {
        jpaCliente.create(cliente);

    }

    public void crearVenta(Venta ventas) {
       try { VentaJpaController jpaVenta = new VentaJpaController();
        jpaVenta.create(ventas);} catch (Exception ex) {JOptionPane.showMessageDialog(null, "error "+ex);}
    }

    //TRAER NOMBRE DEL CLIENTE
    public String nombreCliente(int id) {
        Cliente cliente = new Cliente();
        cliente = jpaCliente.findCliente(id);
        return String.valueOf(cliente.getNombre());

    }

    //PRODUCTOS
    public void registrarProducto(Producto nuevoProducto) {
        jpaProducto.create(nuevoProducto);
    }

    //TRAER LISTA PRODUCTOS 
    public List listaProductos() {
        List listaPdtos = new ArrayList<Producto>();
        listaPdtos = jpaProducto.findProductoEntities();
        return listaPdtos;
    }

    public void crearProveedor(Proveedor proveedor) {
        jpaProveedor.create(proveedor);
    }
    
    public Proveedor traerProveedor (int id) {
    id=1;
    Proveedor proveedor = new Proveedor();    
    proveedor=jpaProveedor.findProveedor(id);
        System.out.println("jpa encontro el proveedor "+proveedor);
    return proveedor;
    
    }

}
