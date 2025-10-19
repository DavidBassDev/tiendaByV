

package logica;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Producto;
import model.Proveedor;
import userInterface.MainUi;
    

public class Main {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        List<Producto> listaProductos = new ArrayList();
        listaProductos= control.jpaProducto.findProductoEntities();
        int cantidadTotalDePdtos =0;
        for(Producto producto : listaProductos) {
        int cantidad = producto.getCantidad();
        if(cantidad>1) {
        cantidadTotalDePdtos= cantidadTotalDePdtos + producto.getCantidad();
        }
        }
        if(cantidadTotalDePdtos>=1) {
       
           // Inicializa JPA y crea tablas si no existen
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaPU");
        //inicio interfaz grafica
        MainUi mainUi = new MainUi();
        mainUi.setVisible(true);
        mainUi.setLocationRelativeTo(null);
        } else {
        JOptionPane.showMessageDialog(null, "Error, no tienes ningun producto para vender!");
        System.exit(0);
        
        }
    }
}
