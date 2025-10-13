

package logica;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import model.Producto;
import model.Proveedor;
import userInterface.MainUi;
    

public class Main {

    public static void main(String[] args) {
        
        
        //CREAR PROVEEDOR
        /*Proveedor proveedor = new Proveedor();
        proveedor.setNombreProveedor("DOLLARCITY");
        List<Producto> listaProductos = new ArrayList<>();
        Controladora control = new Controladora();
        listaProductos=control.listaProductos();
        proveedor.setListaProductos(listaProductos);
        control.crearProveedor(proveedor);*/
       
           // Inicializa JPA y crea tablas si no existen
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaPU");
        //inicio interfaz grafica
        MainUi mainUi = new MainUi();
        mainUi.setVisible(true);
        mainUi.setLocationRelativeTo(null);
    }
}
