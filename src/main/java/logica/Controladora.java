/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
        try {
            VentaJpaController jpaVenta = new VentaJpaController();
            jpaVenta.create(ventas);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
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

    //PROVEEDOR
    public void crearProveedor(Proveedor proveedor) {
        jpaProveedor.create(proveedor);
    }

    public Proveedor traerProveedor(int id) {
        Proveedor proveedor = new Proveedor();
        proveedor = jpaProveedor.findProveedor(id);
        System.out.println("jpa encontro el proveedor " + proveedor);
        return proveedor;

    }

    public List listaProveedores() {
        List listaProveedores = new ArrayList<Proveedor>();
        listaProveedores = jpaProveedor.findProveedorEntities();
        return listaProveedores;
    }

    public Cliente traerIdNombreCliente(String nombreCliente) {

        List<Cliente> listaClientes = jpaCliente.findClienteEntities();
        for (Cliente cliente : listaClientes) {
            String name = cliente.getNombre();
            System.out.println("cliente en lista" + cliente.getNombre());
            if (nombreCliente.equals(name)) {
                return cliente;
            }
        }

        return null;

    }

    public void reiniciarApp() {
        try {
            String javaBin = System.getProperty("java.home") + "/bin/java";
            String jarPath = new java.io.File(Main.class.getProtectionDomain()
                    .getCodeSource().getLocation().toURI()).getPath();

            ProcessBuilder pb = new ProcessBuilder(javaBin, "-jar", jarPath);
            pb.start(); // Lanza una nueva instancia
            System.exit(0); // Cierra la actual
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int traerIdNombreProveedor(String nombreProveedor) {
        int idProv = 2;
        List<Proveedor> listaProveedores = jpaProveedor.findProveedorEntities();
        for (Proveedor proveedor : listaProveedores) {
            String name = proveedor.getNombreProveedor();
            if (nombreProveedor.equals(name)) {
                idProv = proveedor.getIdProveedor();
                System.out.println("proveedor encontrado con id " + idProv);
            }
        }

        return idProv;

    }

    //OTRAS FUNCIONES
    public void exportarExcel(JTable tablaExporte) {

        ModeloExcel obj;

        try {
            obj = new ModeloExcel();
            obj.exportarExcel(tablaExporte);
            //LANZAMIENTO VENTANA EXITOSA
            JOptionPane optionPane = new JOptionPane("Se guardó Correctamente");
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Exito!");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

}
