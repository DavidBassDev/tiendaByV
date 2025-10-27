package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static org.eclipse.persistence.expressions.ExpressionOperator.LocalDate;
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

        try (Connection conn = Pool.getInstance().getDataSource().getConnection(); PreparedStatement selectStmt = conn.prepareStatement(selectSQL); PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {

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

    public void traerPagosPendientes(JTable jTableRegistroPagos) {
        DefaultTableModel modeloTabla;

        String[] columnas = {"Nombre", "Estado", "Producto", "Cantidad", "Valor", "idCliente", "idVenta"};
        modeloTabla = new DefaultTableModel(null, columnas);
        modeloTabla.setColumnIdentifiers(columnas);
        String[] registro = new String[7];

        String selectSQL = "";
        selectSQL = "SELECT "
                + "v.cantidad, "
                + "v.estado, "
                + "v.producto, "
                + "v.valor, "
                + "v.idVenta, "
                + "v.idCliente, "
                + "c.nombre "
                + "FROM venta AS v "
                + "INNER JOIN cliente AS c ON v.idCliente = c.idCliente "
                + "WHERE v.estado = 'PENDIENTE';";

        try (Connection conn = Pool.getInstance().getDataSource().getConnection(); PreparedStatement selectStmt = conn.prepareStatement(selectSQL); ResultSet rs = selectStmt.executeQuery()) {

            while (rs.next()) {
                registro[0] = rs.getString("nombre");
                registro[1] = rs.getString("estado");
                registro[2] = rs.getString("producto");
                registro[3] = rs.getString("cantidad");
                registro[4] = rs.getString("valor");
                registro[5] = rs.getString("idCliente");
                registro[6] = rs.getString("idVenta");

                modeloTabla.addRow(registro);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        jTableRegistroPagos.setModel(modeloTabla);
    }

    public void traerPagosPendientes(String nombre, JTable jTableRegistroPagos) {
        DefaultTableModel modeloTabla;

        String[] columnas = {"Nombre", "Estado", "Producto", "Cantidad", "Valor", "idCliente", "idVenta"};
        modeloTabla = new DefaultTableModel(null, columnas);
        modeloTabla.setColumnIdentifiers(columnas);
        String[] registro = new String[7];

        String selectSQL = "";
        selectSQL = "SELECT "
                + "v.cantidad, "
                + "v.estado, "
                + "v.producto, "
                + "v.valor, "
                + "v.idCliente, "
                + "v.idVenta, "
                + "c.nombre "
                + "FROM venta AS v "
                + "INNER JOIN cliente AS c ON v.idCliente = c.idCliente "
                + "WHERE v.estado = 'PENDIENTE' AND c.nombre ='" + nombre + "' ;";

        try (Connection conn = Pool.getInstance().getDataSource().getConnection(); PreparedStatement selectStmt = conn.prepareStatement(selectSQL); ResultSet rs = selectStmt.executeQuery()) {

            while (rs.next()) {
                registro[0] = rs.getString("nombre");
                registro[1] = rs.getString("estado");
                registro[2] = rs.getString("producto");
                registro[3] = rs.getString("cantidad");
                registro[4] = rs.getString("valor");
                registro[5] = rs.getString("idCliente");
                registro[6] = rs.getString("idVenta");

                modeloTabla.addRow(registro);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        jTableRegistroPagos.setModel(modeloTabla);
    }

    public void registrarPagoCte(int idVenta, String formaPago, LocalDate fecha) {

        String selectSQL = "";

        java.sql.Date fechaPago = java.sql.Date.valueOf(fecha);

        selectSQL = "UPDATE Venta "
                + "SET estado = 'PAGADO', formaPago = ?, fechaPago = ? "
                + "WHERE idVenta = ?";

        try (Connection conn = Pool.getInstance().getDataSource().getConnection(); PreparedStatement selectStmt = conn.prepareStatement(selectSQL)) {

            // Asignamos los parámetros en orden
            selectStmt.setString(1, formaPago);
            selectStmt.setDate(2, fechaPago);
            selectStmt.setInt(3, idVenta);

            // Ejecutamos el UPDATE
            int filasAfectadas = selectStmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Venta actualizada correctamente.");
            } else {
                System.out.println("No se encontró ninguna venta con ese ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void traerVentas(JTable jTableRegistroVentas, LocalDate fechaActual) {
        DefaultTableModel modeloTabla;
        int actualYear = fechaActual.getYear();
        int month = fechaActual.getMonthValue();
        String[] columnas = {"Producto", "Valor", "Cantidad", "NombreCliente","Estado", "FechaPago", "FormaPago", "Observacion"};
        modeloTabla = new DefaultTableModel(null, columnas);
        modeloTabla.setColumnIdentifiers(columnas);
        String[] registro = new String[8];

        String selectSQL = "";
        selectSQL = "SELECT "
                + "v.cantidad, "
                + "v.estado, "
                + "v.producto, "
                + "v.valor, "
                + "v.fechaPago, "
                + "v.formaPago, "
                + "v.observacion, "
                + "c.nombre "
                + "FROM venta AS v "
                + "INNER JOIN cliente AS c ON v.idCliente = c.idCliente "
                + "WHERE v.estado = 'PAGADO' "
                + "AND YEAR(v.fechaPago) = " + actualYear + " "
                + "AND MONTH(v.fechaPago) = " + month + ";";

        try (Connection conn = Pool.getInstance().getDataSource().getConnection(); PreparedStatement selectStmt = conn.prepareStatement(selectSQL); ResultSet rs = selectStmt.executeQuery()) {

            while (rs.next()) {
                registro[0] = rs.getString("producto");
                registro[1] = rs.getString("valor");
                registro[2] = rs.getString("cantidad");
                registro[3] = rs.getString("nombre");
                registro[4] = rs.getString("estado");
                registro[5] = rs.getString("fechaPago");
                registro[6] = rs.getString("formaPago");
                registro[7] = rs.getString("observacion");
 
                modeloTabla.addRow(registro);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        jTableRegistroVentas.setModel(modeloTabla);
    }
}
