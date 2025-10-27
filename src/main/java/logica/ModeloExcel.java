
package logica;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 *
 * @author David
 */
public class ModeloExcel {
    
       
    public void exportarExcel(JTable t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("exporte");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                /*Desktop.getDesktop().open(archivoXLS);*/
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
    public String Importar(File archivo, JTable datosExcel) {
    Workbook book = null;
    String mensaje = "Error en la Importación";
    DefaultTableModel modelo = new DefaultTableModel();
    datosExcel.setModel(modelo);
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    try (FileInputStream fis = new FileInputStream(archivo)) {
        book = WorkbookFactory.create(fis);
        Sheet hoja = book.getSheetAt(0);
        Iterator<Row> filaIterator = hoja.rowIterator();
        
        if (filaIterator.hasNext()) {
            // Agregar las columnas
            Row encabezado = filaIterator.next();
            for (Cell celda : encabezado) {
                modelo.addColumn(celda.getStringCellValue());
            }
        }

        // Procesar las filas
        while (filaIterator.hasNext()) {
            Row fila = filaIterator.next();
            List<Object> listaColumna = new ArrayList<>();
            for (Cell celda : fila) {
                if (celda != null) {
                    switch (celda.getCellType()) {
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(celda)) {
                                listaColumna.add(sdf.format(celda.getDateCellValue()));
                            } else {
                                listaColumna.add(celda.getNumericCellValue());
                            }
                            break;
                        case STRING:
                            listaColumna.add(celda.getStringCellValue());
                            break;
                        case BOOLEAN:
                            listaColumna.add(celda.getBooleanCellValue());
                            break;
                        default:
                            listaColumna.add(null); // O manejar otros tipos de celdas si es necesario
                            break;
                    }
                } else {
                    listaColumna.add(null); // Agregar null si la celda está vacía
                }
            }
            modelo.addRow(listaColumna.toArray());
        }
        mensaje = "Importación Exitosa";
    } catch (IOException | EncryptedDocumentException e) {
        e.printStackTrace();
    } finally {
        try {
            if (book != null) {
                book.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return mensaje;
}


}
