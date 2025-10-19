package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistence.Pool;

public class ControladoraPool {

    public void conectar() {
        try (Connection connect = Pool.getInstance().getDataSource().getConnection()) {
            System.out.println("✅ Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void RemoverCantidadCompra(String nombrePdto, int cantidad) {
        String selectSQL = "SELECT cantidad FROM producto WHERE nombreProducto = ?";
        String updateSQL = "UPDATE producto SET cantidad = ? WHERE nombreProducto = ?";

        try (Connection conn = Pool.getInstance().getDataSource().getConnection();
             PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
             PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {

            // 1️⃣ Buscar cantidad actual
            selectStmt.setString(1, nombrePdto);
            ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                int cantidadActual = rs.getInt("cantidad");
                int nuevaCantidad = cantidadActual - cantidad;

                if (nuevaCantidad < 0) {
                    nuevaCantidad = 0; // evita cantidades negativas
                }

                // 2️⃣ Actualizar cantidad
                updateStmt.setInt(1, nuevaCantidad);
                updateStmt.setString(2, nombrePdto);
                updateStmt.executeUpdate();

                System.out.println("✅ Cantidad actualizada para " + nombrePdto + ": " + nuevaCantidad);
            } else {
                System.out.println("⚠️ Producto no encontrado: " + nombrePdto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
