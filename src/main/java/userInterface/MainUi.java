/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import logica.Controladora;
import logica.ControladoraPool;
import logica.Main;
import logica.ModeloExcel;
import model.Cliente;
import model.Producto;
import model.Proveedor;
import model.Venta;

public class MainUi extends javax.swing.JFrame {

    int mouseX, mouseY;
    private RegistrarNuevoProveedor nuevoProveedor;
    ControladoraPool controlPool = new ControladoraPool();
    private int cantidadPdtoHabilitados = 0;
    public double valorTotal = 0.0;
    Double valorRegistroVenta = 0.0;
    LocalDate fechaActual = LocalDate.now();
    private RegistrarNuevoPDTO nuevoPdtoUi;

    private Controladora control = new Controladora();

    public MainUi() {
        this.setUndecorated(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - mouseX;
                int y = e.getYOnScreen() - mouseY;
                setLocation(x, y);
            }
        });
        initComponents();
        cargarListaClientes();
        cargarDashBoardUsuarios();
        cargarDashBoardVentas();
        cargarDashBoardRegistrarPdto();

        nuevoProveedor = new RegistrarNuevoProveedor();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        paneLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainLogo = new javax.swing.JLabel();
        separadorBnner = new javax.swing.JSeparator();
        btnCrearCliente = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnRegistrarVenta = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        btnRegistrarPdto = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        btnRegistrarPagos = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        btnConsultarVentas1 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        btnConsultarVentas = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        paneBanner = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCierreApp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mainTabbedPane = new javax.swing.JTabbedPane();
        jPanelCrearCliente = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanelInternoRPTO = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jButtonCreateUser = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabelUsuariosCreados = new javax.swing.JLabel();
        jPanelRegistrarVenta = new javax.swing.JPanel();
        jTitleRegVenta = new javax.swing.JLabel();
        jLblPDTO0 = new javax.swing.JLabel();
        jButtonAddPdto = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLblPDTO1 = new javax.swing.JLabel();
        jCmbPTO1 = new javax.swing.JComboBox<>();
        jCmbPTO2 = new javax.swing.JComboBox<>();
        jLblPDTO2 = new javax.swing.JLabel();
        jLblPDTO3 = new javax.swing.JLabel();
        jCmbPTO3 = new javax.swing.JComboBox<>();
        jLblPDTO4 = new javax.swing.JLabel();
        jCmbPTO4 = new javax.swing.JComboBox<>();
        jLblPDTO5 = new javax.swing.JLabel();
        jCmbPTO5 = new javax.swing.JComboBox<>();
        jLblPDTO6 = new javax.swing.JLabel();
        jCmbPTO6 = new javax.swing.JComboBox<>();
        jLblCliente = new javax.swing.JLabel();
        jLblCantPDTO1 = new javax.swing.JLabel();
        jLblCantPDTO2 = new javax.swing.JLabel();
        jLblCantPDTO3 = new javax.swing.JLabel();
        jLblCantPDTO4 = new javax.swing.JLabel();
        jLblCantPDTO5 = new javax.swing.JLabel();
        jLblCantPDTO6 = new javax.swing.JLabel();
        jLblCantPDTO8 = new javax.swing.JLabel();
        jCmbCliente = new javax.swing.JComboBox<>();
        jLblCantPDTO0 = new javax.swing.JLabel();
        jCmbPTO0 = new javax.swing.JComboBox<>();
        jTextFieldCantidad6 = new javax.swing.JTextField();
        jTextFieldCantidad1 = new javax.swing.JTextField();
        jTextFieldCantidad2 = new javax.swing.JTextField();
        jTextFieldCantidad3 = new javax.swing.JTextField();
        jTextFieldCantidad4 = new javax.swing.JTextField();
        jTextFieldCantidad5 = new javax.swing.JTextField();
        jTextFieldCantidad0 = new javax.swing.JTextField();
        jButtonCreateVenta = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButtonCreateVenta4 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButtonCreateVenta5 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButtonRemovePdto1 = new javax.swing.JLabel();
        jButtonRemovePdto6 = new javax.swing.JLabel();
        jButtonRemovePdto5 = new javax.swing.JLabel();
        jButtonRemovePdto4 = new javax.swing.JLabel();
        jButtonRemovePdto3 = new javax.swing.JLabel();
        jButtonRemovePdto2 = new javax.swing.JLabel();
        jTextFieldValorPdto0 = new javax.swing.JLabel();
        jPaneValorPdto0 = new javax.swing.JPanel();
        jTextValorPdto0 = new javax.swing.JLabel();
        jLabeSignoPeso1 = new javax.swing.JLabel();
        jTextFieldValorPdto1 = new javax.swing.JLabel();
        jPaneValorPdto1 = new javax.swing.JPanel();
        jTextValorPdto1 = new javax.swing.JLabel();
        jLabeSignoPeso2 = new javax.swing.JLabel();
        jTextFieldValorPdto2 = new javax.swing.JLabel();
        jPaneValorPdto2 = new javax.swing.JPanel();
        jTextValorPdto2 = new javax.swing.JLabel();
        jLabeSignoPeso3 = new javax.swing.JLabel();
        jTextFieldValorPdto3 = new javax.swing.JLabel();
        jPaneValorPdto3 = new javax.swing.JPanel();
        jTextValorPdto3 = new javax.swing.JLabel();
        jLabeSignoPeso4 = new javax.swing.JLabel();
        jTextFieldValorPdto4 = new javax.swing.JLabel();
        jPaneValorPdto4 = new javax.swing.JPanel();
        jTextValorPdto4 = new javax.swing.JLabel();
        jLabeSignoPeso5 = new javax.swing.JLabel();
        jTextFieldValorPdto5 = new javax.swing.JLabel();
        jPaneValorPdto5 = new javax.swing.JPanel();
        jTextValorPdto5 = new javax.swing.JLabel();
        jLabeSignoPeso6 = new javax.swing.JLabel();
        jTextFieldValorPdto6 = new javax.swing.JLabel();
        jPaneValorPdto6 = new javax.swing.JPanel();
        jTextValorPdto6 = new javax.swing.JLabel();
        jLabeSignoPeso7 = new javax.swing.JLabel();
        jCheckBoxPagado = new javax.swing.JCheckBox();
        jCmbFormaPago = new javax.swing.JComboBox<>();
        jLblFormaPago = new javax.swing.JLabel();
        jPanelRegistrarPagos = new javax.swing.JPanel();
        jTitleRegVenta1 = new javax.swing.JLabel();
        jLblCliente1 = new javax.swing.JLabel();
        jCmbFormaPago1 = new javax.swing.JComboBox<>();
        jLblCantPDTO12 = new javax.swing.JLabel();
        jPaneValorTotalPdtos1 = new javax.swing.JPanel();
        jTextValorTotal1 = new javax.swing.JLabel();
        jLabeSignoPeso8 = new javax.swing.JLabel();
        JBtnExportarExcel = new javax.swing.JPanel();
        jButtonCreateVenta14 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jButtonCreateVenta15 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jBtnRegistrarPago = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jButtonCreateVenta12 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jButtonCreateVenta13 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistroPagos = new javax.swing.JTable();
        jButtonConsultarPagosPdtes = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButtonCreateVenta6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButtonCreateVenta7 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jCmbCliente2 = new javax.swing.JComboBox<>();
        jLblCliente3 = new javax.swing.JLabel();
        jPanelRegistrarPDTO = new javax.swing.JPanel();
        jCheckBoxNuevoProv = new javax.swing.JCheckBox();
        jTextDescripcion = new javax.swing.JLabel();
        jCmbListPdto = new javax.swing.JComboBox<>();
        jButtonCreatePdtos = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLblPDTO8 = new javax.swing.JLabel();
        jCmbProveedor = new javax.swing.JComboBox<>();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextPdto = new javax.swing.JLabel();
        jTextFieldPrecioAdquirido = new javax.swing.JTextField();
        jTextPrecioAdquirido = new javax.swing.JLabel();
        jtextPrecioUnd = new javax.swing.JLabel();
        jButtonAbrirCalendario = new javax.swing.JTextField();
        jTextNoFactura = new javax.swing.JLabel();
        jTextFieldNoFactura = new javax.swing.JTextField();
        jCheckBoxNuevoPdto = new javax.swing.JCheckBox();
        jTextGananciaDeseada = new javax.swing.JLabel();
        jTextFieldPorcGanan = new javax.swing.JTextField();
        jLblCantPDTO15 = new javax.swing.JLabel();
        jTextPrecioPublico = new javax.swing.JTextField();
        jTextPdto1 = new javax.swing.JLabel();
        jCmbListInversor = new javax.swing.JComboBox<>();
        jLblPDTO9 = new javax.swing.JLabel();
        jTextFieldPrecioUnd = new javax.swing.JTextField();
        jPanelGanancias = new javax.swing.JPanel();
        jTitleRegVenta2 = new javax.swing.JLabel();
        jLblCantPDTO13 = new javax.swing.JLabel();
        jPaneValorTotalPdtos2 = new javax.swing.JPanel();
        jTextVentasTotales = new javax.swing.JLabel();
        jLabeSignoPeso9 = new javax.swing.JLabel();
        jLblCliente2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRegistroVentas = new javax.swing.JTable();
        jButtonConsultarVentas = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jButtonCreateVenta10 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButtonCreateVenta11 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        JBtnExportarExcel1 = new javax.swing.JPanel();
        jButtonCreateVenta16 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jButtonCreateVenta17 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButtonAbrirCalendario1 = new javax.swing.JTextField();
        jPanelComprasPendientes = new javax.swing.JPanel();
        jTitleRegVenta3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRegistroPagos2 = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jButtonAbrirCalendario2 = new javax.swing.JTextField();
        jButtonConsultarVentas1 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jButtonCreateVenta18 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jButtonCreateVenta19 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jCheckComprasPdtes = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(54, 33, 89));

        paneLogo.setBackground(new java.awt.Color(54, 33, 89));
        paneLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tienda B&V");
        paneLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 33, -1, -1));

        mainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/MainLogo.png"))); // NOI18N
        paneLogo.add(mainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, 80));

        separadorBnner.setBackground(new java.awt.Color(255, 255, 255));
        paneLogo.add(separadorBnner, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 105, 211, -1));

        btnCrearCliente.setBackground(new java.awt.Color(54, 33, 89));
        btnCrearCliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCrearClienteMouseMoved(evt);
            }
        });
        btnCrearCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearClienteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearClienteMouseExited(evt);
            }
        });
        btnCrearCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Registrar Cliente");
        btnCrearCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregarUsuario.png"))); // NOI18N
        jLabel17.setToolTipText("");
        btnCrearCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        btnRegistrarVenta.setBackground(new java.awt.Color(54, 33, 89));
        btnRegistrarVenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegistrarVentaMouseMoved(evt);
            }
        });
        btnRegistrarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarVentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarVentaMouseExited(evt);
            }
        });
        btnRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 17)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Registrar Venta");
        btnRegistrarVenta.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 40));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/verVentas.png"))); // NOI18N
        jLabel64.setToolTipText("");
        btnRegistrarVenta.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        btnRegistrarPdto.setBackground(new java.awt.Color(54, 33, 89));
        btnRegistrarPdto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegistrarPdtoMouseMoved(evt);
            }
        });
        btnRegistrarPdto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPdtoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarPdtoMouseExited(evt);
            }
        });
        btnRegistrarPdto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Registrar Producto");
        btnRegistrarPdto.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 40));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregarProducto.png"))); // NOI18N
        jLabel66.setToolTipText("");
        btnRegistrarPdto.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        btnRegistrarPagos.setBackground(new java.awt.Color(54, 33, 89));
        btnRegistrarPagos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegistrarPagosMouseMoved(evt);
            }
        });
        btnRegistrarPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPagosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarPagosMouseExited(evt);
            }
        });
        btnRegistrarPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 17)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Registrar Pagos");
        btnRegistrarPagos.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 40));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/RegistrarPago.png"))); // NOI18N
        jLabel68.setToolTipText("");
        btnRegistrarPagos.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        btnConsultarVentas1.setBackground(new java.awt.Color(54, 33, 89));
        btnConsultarVentas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnConsultarVentas1MouseMoved(evt);
            }
        });
        btnConsultarVentas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarVentas1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarVentas1MouseExited(evt);
            }
        });
        btnConsultarVentas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel95.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Mis Compras");
        btnConsultarVentas1.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, 40));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/RegistrarPago.png"))); // NOI18N
        jLabel96.setToolTipText("");
        btnConsultarVentas1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        btnConsultarVentas.setBackground(new java.awt.Color(54, 33, 89));
        btnConsultarVentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnConsultarVentasMouseMoved(evt);
            }
        });
        btnConsultarVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarVentasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarVentasMouseExited(evt);
            }
        });
        btnConsultarVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 17)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Consultar Ventas");
        btnConsultarVentas.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 40));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/RegistrarPago.png"))); // NOI18N
        jLabel88.setToolTipText("");
        btnConsultarVentas.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(btnConsultarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRegistrarPagos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarPdto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnConsultarVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(paneLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnRegistrarPdto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnRegistrarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnConsultarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnConsultarVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        mainPanel.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 699));

        paneBanner.setBackground(new java.awt.Color(102, 72, 221));
        paneBanner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("PRODUCTO MAS VENDIDO");

        jLabel5.setText("ANALITICA -MES-");

        jLabel6.setText("NOMBRE PRODUCTO");

        jLabel7.setText("CANTIDAD");

        jLabel8.setText("Ventas del mes");

        jLabel9.setText("$$ Total ventas -MES-");

        jLabel10.setText("$$ Pendiente de pago");

        jLabel11.setText("valor");

        jLabel12.setText("valor");

        javax.swing.GroupLayout paneBannerLayout = new javax.swing.GroupLayout(paneBanner);
        paneBanner.setLayout(paneBannerLayout);
        paneBannerLayout.setHorizontalGroup(
            paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBannerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBannerLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(204, 204, 204)
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBannerLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(31, 31, 31)))
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        paneBannerLayout.setVerticalGroup(
            paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBannerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addGroup(paneBannerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBannerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)))
                    .addGroup(paneBannerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(paneBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 47, 990, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ADMINISTRACION DE TIENDA B&V");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 320, -1));

        panelCierreApp.setBackground(new java.awt.Color(255, 255, 255));
        panelCierreApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelCierreAppMouseMoved(evt);
            }
        });
        panelCierreApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCierreAppMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCierreAppMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("X");

        javax.swing.GroupLayout panelCierreAppLayout = new javax.swing.GroupLayout(panelCierreApp);
        panelCierreApp.setLayout(panelCierreAppLayout);
        panelCierreAppLayout.setHorizontalGroup(
            panelCierreAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCierreAppLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        panelCierreAppLayout.setVerticalGroup(
            panelCierreAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCierreAppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(panelCierreApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        jPanelCrearCliente.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCrearCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/MainLogo.png"))); // NOI18N
        jPanelCrearCliente.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 80, 70));

        jPanelInternoRPTO.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Registrar Cliente");

        jLabel27.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Nombre:");

        jTextNombre.setBackground(new java.awt.Color(54, 33, 89));
        jTextNombre.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 22)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNombre.setText("Ingrese el Nombre del cliente");
        jTextNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNombreMouseClicked(evt);
            }
        });

        jButtonCreateUser.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateUserMouseMoved(evt);
            }
        });
        jButtonCreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateUserMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateUserMouseExited(evt);
            }
        });
        jButtonCreateUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("CREAR");
        jButtonCreateUser.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 140, 30));

        jLabel63.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Usuarios Creados:");

        jLabelUsuariosCreados.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabelUsuariosCreados.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsuariosCreados.setText("0");

        javax.swing.GroupLayout jPanelInternoRPTOLayout = new javax.swing.GroupLayout(jPanelInternoRPTO);
        jPanelInternoRPTO.setLayout(jPanelInternoRPTOLayout);
        jPanelInternoRPTOLayout.setHorizontalGroup(
            jPanelInternoRPTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInternoRPTOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInternoRPTOLayout.createSequentialGroup()
                .addGap(0, 197, Short.MAX_VALUE)
                .addGroup(jPanelInternoRPTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInternoRPTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInternoRPTOLayout.createSequentialGroup()
                            .addComponent(jLabel63)
                            .addGap(13, 13, 13)
                            .addComponent(jLabelUsuariosCreados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(219, 219, 219))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInternoRPTOLayout.createSequentialGroup()
                            .addGroup(jPanelInternoRPTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(95, 95, 95)))))
        );
        jPanelInternoRPTOLayout.setVerticalGroup(
            jPanelInternoRPTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInternoRPTOLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel26)
                .addGap(26, 26, 26)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanelInternoRPTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuariosCreados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanelCrearCliente.add(jPanelInternoRPTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 740, 430));

        mainTabbedPane.addTab("tab1", jPanelCrearCliente);

        jPanelRegistrarVenta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitleRegVenta.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jTitleRegVenta.setForeground(new java.awt.Color(0, 0, 0));
        jTitleRegVenta.setText("Registrar Venta");
        jPanelRegistrarVenta.add(jTitleRegVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLblPDTO0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO0.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO0.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jButtonAddPdto.setBackground(new java.awt.Color(54, 33, 89));
        jButtonAddPdto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonAddPdtoMouseMoved(evt);
            }
        });
        jButtonAddPdto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddPdtoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAddPdtoMouseExited(evt);
            }
        });
        jButtonAddPdto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Registrar otro producto");
        jButtonAddPdto.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonAddPdto.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 37, 25));

        jPanelRegistrarVenta.add(jButtonAddPdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 260, 30));

        jLblPDTO1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO1.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO1.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jCmbPTO1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jCmbPTO1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCmbPTO1FocusLost(evt);
            }
        });
        jPanelRegistrarVenta.add(jCmbPTO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 190, -1));

        jCmbPTO2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jPanelRegistrarVenta.add(jCmbPTO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 190, -1));

        jLblPDTO2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO2.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO2.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLblPDTO3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO3.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO3.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        jCmbPTO3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jPanelRegistrarVenta.add(jCmbPTO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 190, -1));

        jLblPDTO4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO4.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO4.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

        jCmbPTO4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jPanelRegistrarVenta.add(jCmbPTO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 190, -1));

        jLblPDTO5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO5.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO5.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        jCmbPTO5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jPanelRegistrarVenta.add(jCmbPTO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 190, -1));

        jLblPDTO6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO6.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO6.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        jCmbPTO6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jPanelRegistrarVenta.add(jCmbPTO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 190, -1));

        jLblCliente.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCliente.setForeground(new java.awt.Color(0, 0, 0));
        jLblCliente.setText("Cliente");
        jPanelRegistrarVenta.add(jLblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLblCantPDTO1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO1.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO1.setText("Cantidad");
        jPanelRegistrarVenta.add(jLblCantPDTO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, 20));

        jLblCantPDTO2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO2.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO2.setText("Cantidad");
        jPanelRegistrarVenta.add(jLblCantPDTO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, 20));

        jLblCantPDTO3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO3.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO3.setText("Cantidad");
        jPanelRegistrarVenta.add(jLblCantPDTO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 20));

        jLblCantPDTO4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO4.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO4.setText("Cantidad");
        jPanelRegistrarVenta.add(jLblCantPDTO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, 20));

        jLblCantPDTO5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO5.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO5.setText("Cantidad");
        jPanelRegistrarVenta.add(jLblCantPDTO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, 20));

        jLblCantPDTO6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO6.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO6.setText("Cantidad");
        jPanelRegistrarVenta.add(jLblCantPDTO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, 20));

        jLblCantPDTO8.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO8.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO8.setText("PAGO CONTADO?");
        jPanelRegistrarVenta.add(jLblCantPDTO8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 30));

        jCmbCliente.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Susy SST", "David Muñoz", "Ximena" }));
        jPanelRegistrarVenta.add(jCmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 210, -1));

        jLblCantPDTO0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO0.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO0.setText("Cantidad");
        jPanelRegistrarVenta.add(jLblCantPDTO0, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, 20));

        jCmbPTO0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jPanelRegistrarVenta.add(jCmbPTO0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 190, -1));

        jTextFieldCantidad6.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad6.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad6.setText("0");
        jTextFieldCantidad6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidad6KeyPressed(evt);
            }
        });
        jPanelRegistrarVenta.add(jTextFieldCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 100, -1));

        jTextFieldCantidad1.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad1.setText("0");
        jTextFieldCantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidad1KeyPressed(evt);
            }
        });
        jPanelRegistrarVenta.add(jTextFieldCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 100, -1));

        jTextFieldCantidad2.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad2.setText("0");
        jTextFieldCantidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidad2KeyPressed(evt);
            }
        });
        jPanelRegistrarVenta.add(jTextFieldCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 100, -1));

        jTextFieldCantidad3.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad3.setText("0");
        jTextFieldCantidad3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidad3KeyPressed(evt);
            }
        });
        jPanelRegistrarVenta.add(jTextFieldCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 100, -1));

        jTextFieldCantidad4.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad4.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad4.setText("0");
        jTextFieldCantidad4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidad4KeyPressed(evt);
            }
        });
        jPanelRegistrarVenta.add(jTextFieldCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 100, -1));

        jTextFieldCantidad5.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad5.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad5.setText("0");
        jTextFieldCantidad5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidad5KeyPressed(evt);
            }
        });
        jPanelRegistrarVenta.add(jTextFieldCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 100, -1));

        jTextFieldCantidad0.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad0.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad0.setText("0");
        jTextFieldCantidad0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidad0KeyPressed(evt);
            }
        });
        jPanelRegistrarVenta.add(jTextFieldCantidad0, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 100, -1));

        jButtonCreateVenta.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVentaMouseMoved(evt);
            }
        });
        jButtonCreateVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVentaMouseExited(evt);
            }
        });
        jButtonCreateVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("REGISTRAR VENTA");
        jButtonCreateVenta.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta4.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta4MouseMoved(evt);
            }
        });
        jButtonCreateVenta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta4MouseExited(evt);
            }
        });
        jButtonCreateVenta4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("REGISTRAR VENTA");
        jButtonCreateVenta4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta5.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta5MouseMoved(evt);
            }
        });
        jButtonCreateVenta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta5MouseExited(evt);
            }
        });
        jButtonCreateVenta5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("REGISTRAR VENTA");
        jButtonCreateVenta5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta4.add(jButtonCreateVenta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jButtonCreateVenta.add(jButtonCreateVenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jPanelRegistrarVenta.add(jButtonCreateVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 260, 30));

        jButtonRemovePdto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/botonEliminar.png"))); // NOI18N
        jButtonRemovePdto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemovePdto1MouseClicked(evt);
            }
        });
        jPanelRegistrarVenta.add(jButtonRemovePdto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jButtonRemovePdto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/botonEliminar.png"))); // NOI18N
        jButtonRemovePdto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemovePdto6MouseClicked(evt);
            }
        });
        jPanelRegistrarVenta.add(jButtonRemovePdto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jButtonRemovePdto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/botonEliminar.png"))); // NOI18N
        jButtonRemovePdto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemovePdto5MouseClicked(evt);
            }
        });
        jPanelRegistrarVenta.add(jButtonRemovePdto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jButtonRemovePdto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/botonEliminar.png"))); // NOI18N
        jButtonRemovePdto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemovePdto4MouseClicked(evt);
            }
        });
        jPanelRegistrarVenta.add(jButtonRemovePdto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jButtonRemovePdto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/botonEliminar.png"))); // NOI18N
        jButtonRemovePdto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemovePdto3MouseClicked(evt);
            }
        });
        jPanelRegistrarVenta.add(jButtonRemovePdto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jButtonRemovePdto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/botonEliminar.png"))); // NOI18N
        jButtonRemovePdto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemovePdto2MouseClicked(evt);
            }
        });
        jPanelRegistrarVenta.add(jButtonRemovePdto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jTextFieldValorPdto0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextFieldValorPdto0.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorPdto0.setText("Valor Producto");
        jPanelRegistrarVenta.add(jTextFieldValorPdto0, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, 20));

        jPaneValorPdto0.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto0.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto0.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPaneValorPdto0FocusLost(evt);
            }
        });
        jPaneValorPdto0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto0.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto0.setText("0");
        jPaneValorPdto0.add(jTextValorPdto0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        jLabeSignoPeso1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso1.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso1.setText("$");
        jPaneValorPdto0.add(jLabeSignoPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto0, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 120, 20));

        jTextFieldValorPdto1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextFieldValorPdto1.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorPdto1.setText("Valor Producto");
        jPanelRegistrarVenta.add(jTextFieldValorPdto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, 20));

        jPaneValorPdto1.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto1.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto1.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto1.setText("0");
        jPaneValorPdto1.add(jTextValorPdto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, -1));

        jLabeSignoPeso2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso2.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso2.setText("$");
        jPaneValorPdto1.add(jLabeSignoPeso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 120, 20));

        jTextFieldValorPdto2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextFieldValorPdto2.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorPdto2.setText("Valor Producto");
        jPanelRegistrarVenta.add(jTextFieldValorPdto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, 20));

        jPaneValorPdto2.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto2.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto2.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto2.setText("0");
        jPaneValorPdto2.add(jTextValorPdto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, -1));

        jLabeSignoPeso3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso3.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso3.setText("$");
        jPaneValorPdto2.add(jLabeSignoPeso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 120, 20));

        jTextFieldValorPdto3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextFieldValorPdto3.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorPdto3.setText("Valor Producto");
        jPanelRegistrarVenta.add(jTextFieldValorPdto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, -1, 20));

        jPaneValorPdto3.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto3.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto3.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto3.setText("0");
        jPaneValorPdto3.add(jTextValorPdto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, -1));

        jLabeSignoPeso4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso4.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso4.setText("$");
        jPaneValorPdto3.add(jLabeSignoPeso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 120, 20));

        jTextFieldValorPdto4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextFieldValorPdto4.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorPdto4.setText("Valor Producto");
        jPanelRegistrarVenta.add(jTextFieldValorPdto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, 20));

        jPaneValorPdto4.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto4.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto4.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto4.setText("0");
        jPaneValorPdto4.add(jTextValorPdto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, -1));

        jLabeSignoPeso5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso5.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso5.setText("$");
        jPaneValorPdto4.add(jLabeSignoPeso5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 120, 20));

        jTextFieldValorPdto5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextFieldValorPdto5.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorPdto5.setText("Valor Producto");
        jPanelRegistrarVenta.add(jTextFieldValorPdto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, 20));

        jPaneValorPdto5.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto5.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto5.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto5.setText("0");
        jPaneValorPdto5.add(jTextValorPdto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, -1));

        jLabeSignoPeso6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso6.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso6.setText("$");
        jPaneValorPdto5.add(jLabeSignoPeso6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 120, 20));

        jTextFieldValorPdto6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextFieldValorPdto6.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorPdto6.setText("Valor Producto");
        jPanelRegistrarVenta.add(jTextFieldValorPdto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, 20));

        jPaneValorPdto6.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto6.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto6.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto6.setText("0");
        jPaneValorPdto6.add(jTextValorPdto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, -1));

        jLabeSignoPeso7.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso7.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso7.setText("$");
        jPaneValorPdto6.add(jLabeSignoPeso7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 120, 20));

        jCheckBoxPagado.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jCheckBoxPagado.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxPagado.setText("  Si");
        jCheckBoxPagado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxPagadoStateChanged(evt);
            }
        });
        jCheckBoxPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPagadoActionPerformed(evt);
            }
        });
        jPanelRegistrarVenta.add(jCheckBoxPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 50, -1));

        jCmbFormaPago.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "NEQUI", "CONSIGNACION" }));
        jPanelRegistrarVenta.add(jCmbFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 170, -1));

        jLblFormaPago.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblFormaPago.setForeground(new java.awt.Color(0, 0, 0));
        jLblFormaPago.setText("Forma");
        jPanelRegistrarVenta.add(jLblFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, 20));

        mainTabbedPane.addTab("tab2", jPanelRegistrarVenta);

        jPanelRegistrarPagos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitleRegVenta1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jTitleRegVenta1.setForeground(new java.awt.Color(0, 0, 0));
        jTitleRegVenta1.setText("Registrar y Consultar Pagos");
        jPanelRegistrarPagos.add(jTitleRegVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLblCliente1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCliente1.setForeground(new java.awt.Color(0, 0, 0));
        jLblCliente1.setText("Metodo Pago");
        jPanelRegistrarPagos.add(jLblCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, 20));

        jCmbFormaPago1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbFormaPago1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Consignacion", "Nequi" }));
        jPanelRegistrarPagos.add(jCmbFormaPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 220, -1));

        jLblCantPDTO12.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO12.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO12.setText("Valor Total");
        jPanelRegistrarPagos.add(jLblCantPDTO12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, 20));

        jPaneValorTotalPdtos1.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorTotalPdtos1.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorTotalPdtos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorTotal1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorTotal1.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorTotal1.setText("0");
        jPaneValorTotalPdtos1.add(jTextValorTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, -1));

        jLabeSignoPeso8.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso8.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso8.setText("$");
        jPaneValorTotalPdtos1.add(jLabeSignoPeso8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarPagos.add(jPaneValorTotalPdtos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 140, 20));

        JBtnExportarExcel.setBackground(new java.awt.Color(54, 33, 89));
        JBtnExportarExcel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JBtnExportarExcelMouseMoved(evt);
            }
        });
        JBtnExportarExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnExportarExcelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBtnExportarExcelMouseExited(evt);
            }
        });
        JBtnExportarExcel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCreateVenta14.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta14MouseMoved(evt);
            }
        });
        jButtonCreateVenta14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta14MouseExited(evt);
            }
        });
        jButtonCreateVenta14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("REGISTRAR VENTA");
        jButtonCreateVenta14.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta14.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta15.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta15MouseMoved(evt);
            }
        });
        jButtonCreateVenta15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta15MouseExited(evt);
            }
        });
        jButtonCreateVenta15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("REGISTRAR VENTA");
        jButtonCreateVenta15.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta15.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta14.add(jButtonCreateVenta15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        JBtnExportarExcel.add(jButtonCreateVenta14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jLabel75.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("EXPORTAR");
        JBtnExportarExcel.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        JBtnExportarExcel.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanelRegistrarPagos.add(JBtnExportarExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, 30));

        jBtnRegistrarPago.setBackground(new java.awt.Color(54, 33, 89));
        jBtnRegistrarPago.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBtnRegistrarPagoMouseMoved(evt);
            }
        });
        jBtnRegistrarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnRegistrarPagoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnRegistrarPagoMouseExited(evt);
            }
        });
        jBtnRegistrarPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("REGISTRAR PAGO");
        jBtnRegistrarPago.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 30));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jBtnRegistrarPago.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jButtonCreateVenta12.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta12MouseMoved(evt);
            }
        });
        jButtonCreateVenta12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta12MouseExited(evt);
            }
        });
        jButtonCreateVenta12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("REGISTRAR VENTA");
        jButtonCreateVenta12.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta12.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta13.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta13MouseMoved(evt);
            }
        });
        jButtonCreateVenta13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta13MouseExited(evt);
            }
        });
        jButtonCreateVenta13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("REGISTRAR VENTA");
        jButtonCreateVenta13.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta13.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta12.add(jButtonCreateVenta13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jBtnRegistrarPago.add(jButtonCreateVenta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jPanelRegistrarPagos.add(jBtnRegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 190, 30));

        jTableRegistroPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableRegistroPagos);

        jPanelRegistrarPagos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 960, 390));

        jButtonConsultarPagosPdtes.setBackground(new java.awt.Color(54, 33, 89));
        jButtonConsultarPagosPdtes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonConsultarPagosPdtesMouseMoved(evt);
            }
        });
        jButtonConsultarPagosPdtes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultarPagosPdtesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarPagosPdtesMouseExited(evt);
            }
        });
        jButtonConsultarPagosPdtes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("CONSULTAR PAGOS PENDIENTES");
        jButtonConsultarPagosPdtes.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonConsultarPagosPdtes.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta6.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta6MouseMoved(evt);
            }
        });
        jButtonCreateVenta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta6MouseExited(evt);
            }
        });
        jButtonCreateVenta6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("REGISTRAR VENTA");
        jButtonCreateVenta6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta6.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta7.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta7MouseMoved(evt);
            }
        });
        jButtonCreateVenta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta7MouseExited(evt);
            }
        });
        jButtonCreateVenta7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("REGISTRAR VENTA");
        jButtonCreateVenta7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta6.add(jButtonCreateVenta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jButtonConsultarPagosPdtes.add(jButtonCreateVenta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jPanelRegistrarPagos.add(jButtonConsultarPagosPdtes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 380, 30));

        jCmbCliente2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbCliente2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Todos", "Alvaro Flota" }));
        jPanelRegistrarPagos.add(jCmbCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 220, -1));

        jLblCliente3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCliente3.setForeground(new java.awt.Color(0, 0, 0));
        jLblCliente3.setText("Cliente");
        jPanelRegistrarPagos.add(jLblCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        mainTabbedPane.addTab("tab4", jPanelRegistrarPagos);

        jPanelRegistrarPDTO.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarPDTO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxNuevoProv.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jCheckBoxNuevoProv.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxNuevoProv.setText(" Nuevo Proveedor?");
        jCheckBoxNuevoProv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxNuevoProvItemStateChanged(evt);
            }
        });
        jCheckBoxNuevoProv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCheckBoxNuevoProvMouseMoved(evt);
            }
        });
        jCheckBoxNuevoProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxNuevoProvMouseExited(evt);
            }
        });
        jCheckBoxNuevoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNuevoProvActionPerformed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jCheckBoxNuevoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        jTextDescripcion.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jTextDescripcion.setText("Descripcion:");
        jPanelRegistrarPDTO.add(jTextDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        jCmbListPdto.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbListPdto.setForeground(new java.awt.Color(0, 0, 0));
        jCmbListPdto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jPanelRegistrarPDTO.add(jCmbListPdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, -1));

        jButtonCreatePdtos.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreatePdtos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreatePdtosMouseMoved(evt);
            }
        });
        jButtonCreatePdtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreatePdtosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreatePdtosMouseExited(evt);
            }
        });
        jButtonCreatePdtos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("REGISTRAR PRODUCTOS");
        jButtonCreatePdtos.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 230, 30));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreatePdtos.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanelRegistrarPDTO.add(jButtonCreatePdtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 280, 30));

        jTextCantidad.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jTextCantidad.setText("Cantidad");
        jPanelRegistrarPDTO.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        jTextFieldCantidad.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad.setText("0");
        jPanelRegistrarPDTO.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 190, -1));

        jLblPDTO8.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO8.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO8.setText("Fecha compra");
        jPanelRegistrarPDTO.add(jLblPDTO8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 30));

        jCmbProveedor.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbProveedor.setForeground(new java.awt.Color(0, 0, 0));
        jCmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "AGENCIA DE ABARROTES RPA SAS", "INVERSIONES QAP OM SAS", "PANADERIA", "DOLLARCITY", "PRICESMART" }));
        jPanelRegistrarPDTO.add(jCmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 230, -1));

        jTextFieldDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDescripcion.setText("OPCIONAL");
        jPanelRegistrarPDTO.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 190, 60));

        jTextPdto.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextPdto.setForeground(new java.awt.Color(0, 0, 0));
        jTextPdto.setText("Producto:");
        jPanelRegistrarPDTO.add(jTextPdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jTextFieldPrecioAdquirido.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldPrecioAdquirido.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldPrecioAdquirido.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPrecioAdquirido.setText("0");
        jTextFieldPrecioAdquirido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioAdquiridoKeyPressed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jTextFieldPrecioAdquirido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 190, -1));

        jTextPrecioAdquirido.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextPrecioAdquirido.setForeground(new java.awt.Color(0, 0, 0));
        jTextPrecioAdquirido.setText("Precio adquirido");
        jPanelRegistrarPDTO.add(jTextPrecioAdquirido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        jtextPrecioUnd.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jtextPrecioUnd.setForeground(new java.awt.Color(0, 0, 0));
        jtextPrecioUnd.setText("Precio por unidad");
        jPanelRegistrarPDTO.add(jtextPrecioUnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, 20));

        jButtonAbrirCalendario.setEditable(false);
        jButtonAbrirCalendario.setBackground(new java.awt.Color(54, 33, 89));
        jButtonAbrirCalendario.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jButtonAbrirCalendario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAbrirCalendario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jButtonAbrirCalendario.setText("ABRIR CALENDARIO");
        jButtonAbrirCalendario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendarioMouseMoved(evt);
            }
        });
        jButtonAbrirCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendarioMouseExited(evt);
            }
        });
        jButtonAbrirCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirCalendarioActionPerformed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jButtonAbrirCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 170, -1));

        jTextNoFactura.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextNoFactura.setForeground(new java.awt.Color(0, 0, 0));
        jTextNoFactura.setText("Numero factura");
        jPanelRegistrarPDTO.add(jTextNoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, 20));

        jTextFieldNoFactura.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldNoFactura.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldNoFactura.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNoFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNoFactura.setText("SIN NUMERO");
        jTextFieldNoFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNoFacturaMouseClicked(evt);
            }
        });
        jPanelRegistrarPDTO.add(jTextFieldNoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 190, -1));

        jCheckBoxNuevoPdto.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jCheckBoxNuevoPdto.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxNuevoPdto.setText(" Nuevo Producto?");
        jCheckBoxNuevoPdto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxNuevoPdtoItemStateChanged(evt);
            }
        });
        jCheckBoxNuevoPdto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCheckBoxNuevoPdtoMouseMoved(evt);
            }
        });
        jCheckBoxNuevoPdto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxNuevoPdtoMouseExited(evt);
            }
        });
        jPanelRegistrarPDTO.add(jCheckBoxNuevoPdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextGananciaDeseada.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextGananciaDeseada.setForeground(new java.awt.Color(0, 0, 0));
        jTextGananciaDeseada.setText("% Ganancia deseada");
        jPanelRegistrarPDTO.add(jTextGananciaDeseada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 20));

        jTextFieldPorcGanan.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldPorcGanan.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldPorcGanan.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPorcGanan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPorcGanan.setText("15");
        jTextFieldPorcGanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPorcGananKeyPressed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jTextFieldPorcGanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 180, -1));

        jLblCantPDTO15.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO15.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO15.setText("Precio al publico");
        jPanelRegistrarPDTO.add(jLblCantPDTO15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 20));

        jTextPrecioPublico.setEditable(false);
        jTextPrecioPublico.setBackground(new java.awt.Color(54, 33, 89));
        jTextPrecioPublico.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextPrecioPublico.setForeground(new java.awt.Color(255, 255, 255));
        jTextPrecioPublico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPrecioPublico.setText("0");
        jPanelRegistrarPDTO.add(jTextPrecioPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 180, -1));

        jTextPdto1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextPdto1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPdto1.setText("Inversor");
        jPanelRegistrarPDTO.add(jTextPdto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jCmbListInversor.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbListInversor.setForeground(new java.awt.Color(0, 0, 0));
        jCmbListInversor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "JOHA", "VANE", "BETSY" }));
        jPanelRegistrarPDTO.add(jCmbListInversor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, -1));

        jLblPDTO9.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO9.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO9.setText("Proveedor");
        jPanelRegistrarPDTO.add(jLblPDTO9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, 30));

        jTextFieldPrecioUnd.setEditable(false);
        jTextFieldPrecioUnd.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldPrecioUnd.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldPrecioUnd.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPrecioUnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrecioUnd.setText("0");
        jTextFieldPrecioUnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioUndActionPerformed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jTextFieldPrecioUnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 180, -1));

        mainTabbedPane.addTab("tab3", jPanelRegistrarPDTO);

        jPanelGanancias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitleRegVenta2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jTitleRegVenta2.setForeground(new java.awt.Color(0, 0, 0));
        jTitleRegVenta2.setText("Consultar Ventas");
        jPanelGanancias.add(jTitleRegVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLblCantPDTO13.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO13.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO13.setText("Ventas Totales");
        jPanelGanancias.add(jLblCantPDTO13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 20));

        jPaneValorTotalPdtos2.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorTotalPdtos2.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorTotalPdtos2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextVentasTotales.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextVentasTotales.setForeground(new java.awt.Color(255, 255, 255));
        jTextVentasTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextVentasTotales.setText("0");
        jPaneValorTotalPdtos2.add(jTextVentasTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, -1));

        jLabeSignoPeso9.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso9.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso9.setText("$");
        jPaneValorTotalPdtos2.add(jLabeSignoPeso9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelGanancias.add(jPaneValorTotalPdtos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 140, 20));

        jLblCliente2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCliente2.setForeground(new java.awt.Color(0, 0, 0));
        jLblCliente2.setText("Fecha");
        jPanelGanancias.add(jLblCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jTableRegistroVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableRegistroVentas);

        jPanelGanancias.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, 950, 360));

        jButtonConsultarVentas.setBackground(new java.awt.Color(54, 33, 89));
        jButtonConsultarVentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonConsultarVentasMouseMoved(evt);
            }
        });
        jButtonConsultarVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultarVentasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarVentasMouseExited(evt);
            }
        });
        jButtonConsultarVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("CONSULTAR GANANCIAS");
        jButtonConsultarVentas.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jButtonCreateVenta10.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta10MouseMoved(evt);
            }
        });
        jButtonCreateVenta10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta10MouseExited(evt);
            }
        });
        jButtonCreateVenta10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("REGISTRAR VENTA");
        jButtonCreateVenta10.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta10.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta11.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta11MouseMoved(evt);
            }
        });
        jButtonCreateVenta11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta11MouseExited(evt);
            }
        });
        jButtonCreateVenta11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("REGISTRAR VENTA");
        jButtonCreateVenta11.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta11.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta10.add(jButtonCreateVenta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jButtonConsultarVentas.add(jButtonCreateVenta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonConsultarVentas.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 31, 24));

        jPanelGanancias.add(jButtonConsultarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 300, 30));

        JBtnExportarExcel1.setBackground(new java.awt.Color(54, 33, 89));
        JBtnExportarExcel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JBtnExportarExcel1MouseMoved(evt);
            }
        });
        JBtnExportarExcel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnExportarExcel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBtnExportarExcel1MouseExited(evt);
            }
        });
        JBtnExportarExcel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCreateVenta16.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta16MouseMoved(evt);
            }
        });
        jButtonCreateVenta16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta16MouseExited(evt);
            }
        });
        jButtonCreateVenta16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("REGISTRAR VENTA");
        jButtonCreateVenta16.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta16.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta17.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta17MouseMoved(evt);
            }
        });
        jButtonCreateVenta17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta17MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta17MouseExited(evt);
            }
        });
        jButtonCreateVenta17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("REGISTRAR VENTA");
        jButtonCreateVenta17.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta17.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta16.add(jButtonCreateVenta17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        JBtnExportarExcel1.add(jButtonCreateVenta16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jLabel85.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 16)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("EXPORTAR");
        JBtnExportarExcel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        JBtnExportarExcel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanelGanancias.add(JBtnExportarExcel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 30));

        jButtonAbrirCalendario1.setEditable(false);
        jButtonAbrirCalendario1.setBackground(new java.awt.Color(54, 33, 89));
        jButtonAbrirCalendario1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jButtonAbrirCalendario1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAbrirCalendario1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jButtonAbrirCalendario1.setText("ABRIR CALENDARIO");
        jButtonAbrirCalendario1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendario1MouseMoved(evt);
            }
        });
        jButtonAbrirCalendario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendario1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendario1MouseExited(evt);
            }
        });
        jButtonAbrirCalendario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirCalendario1ActionPerformed(evt);
            }
        });
        jPanelGanancias.add(jButtonAbrirCalendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, -1));

        mainTabbedPane.addTab("tab5", jPanelGanancias);

        jPanelComprasPendientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitleRegVenta3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jTitleRegVenta3.setForeground(new java.awt.Color(0, 0, 0));
        jTitleRegVenta3.setText("Compras Realizadas");
        jPanelComprasPendientes.add(jTitleRegVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel30.setText("Boton compras pendientes CONSULTA SQL CON PRODUCTO DONDE SEA 0 o >=3 por ej");
        jPanelComprasPendientes.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 20));

        jTableRegistroPagos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableRegistroPagos2);

        jPanelComprasPendientes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 950, 360));

        jLabel32.setText("TABLA DE CONSULTA SQL CON PRODUCTO EN GENERAL, TRAERLO POR MES-AÑO");
        jPanelComprasPendientes.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 20));

        jButtonAbrirCalendario2.setEditable(false);
        jButtonAbrirCalendario2.setBackground(new java.awt.Color(54, 33, 89));
        jButtonAbrirCalendario2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jButtonAbrirCalendario2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAbrirCalendario2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jButtonAbrirCalendario2.setText("ABRIR CALENDARIO");
        jButtonAbrirCalendario2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendario2MouseMoved(evt);
            }
        });
        jButtonAbrirCalendario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendario2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAbrirCalendario2MouseExited(evt);
            }
        });
        jButtonAbrirCalendario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirCalendario2ActionPerformed(evt);
            }
        });
        jPanelComprasPendientes.add(jButtonAbrirCalendario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));

        jButtonConsultarVentas1.setBackground(new java.awt.Color(54, 33, 89));
        jButtonConsultarVentas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonConsultarVentas1MouseMoved(evt);
            }
        });
        jButtonConsultarVentas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultarVentas1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarVentas1MouseExited(evt);
            }
        });
        jButtonConsultarVentas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("CONSULTAR");
        jButtonConsultarVentas1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));

        jButtonCreateVenta18.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta18MouseMoved(evt);
            }
        });
        jButtonCreateVenta18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta18MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta18MouseExited(evt);
            }
        });
        jButtonCreateVenta18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("REGISTRAR VENTA");
        jButtonCreateVenta18.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta18.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta19.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta19MouseMoved(evt);
            }
        });
        jButtonCreateVenta19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta19MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta19MouseExited(evt);
            }
        });
        jButtonCreateVenta19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("REGISTRAR VENTA");
        jButtonCreateVenta19.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta19.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta18.add(jButtonCreateVenta19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jButtonConsultarVentas1.add(jButtonCreateVenta18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonConsultarVentas1.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 31, 24));

        jPanelComprasPendientes.add(jButtonConsultarVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 190, 30));

        jCheckComprasPdtes.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCheckComprasPdtes.setForeground(new java.awt.Color(0, 0, 0));
        jCheckComprasPdtes.setText("Compras Pendientes");
        jPanelComprasPendientes.add(jCheckComprasPdtes, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        mainTabbedPane.addTab("tab6", jPanelComprasPendientes);

        mainPanel.add(mainTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 980, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void reiniciarApp() {

        control.reiniciarApp();
    }


    private void btnCrearClienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearClienteMouseMoved

        btnCrearCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCrearCliente.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_btnCrearClienteMouseMoved

    private void btnCrearClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearClienteMouseExited
        btnCrearCliente.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCrearCliente.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btnCrearClienteMouseExited

    private void habilitarProducto(int index, JLabel labelPdto, JLabel labelCant, JComboBox comboPdto, JLabel jLblCantPDTO11, JTextField campoCantidad, JLabel campoValor, JPanel panelValor) {
        jLblCantPDTO11.setVisible(true);
        /*jLblCantPDTO1.setVisible(true);*/
        labelPdto.setVisible(true);
        comboPdto.setVisible(true);
        labelCant.setVisible(true);
        campoCantidad.setText("");
        campoCantidad.setVisible(true);
        campoCantidad.setForeground(Color.WHITE);
        campoValor.setVisible(true);
        campoValor.setText("");
        panelValor.setVisible(true);
        panelValor.setEnabled(true);

        // agrega escuchadores para recalcular automáticamente
        campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recalcularValorTotal();
            }
        });
        campoValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recalcularValorTotal();
            }
        });
    }

    private double obtenerValor(JTextField campoCantidad, JLabel campoValor) {
        try {
            String cant = campoCantidad.getText().trim();
            String val = campoValor.getText().trim();

            if (cant.isEmpty() || val.isEmpty()) {
                return 0.0;
            }

            // evita que placeholder cause error
            if (!cant.matches("[0-9]+(\\.[0-9]+)?") || !val.matches("[0-9]+(\\.[0-9]+)?")) {
                return 0.0;
            }

            return Double.parseDouble(cant) * Double.parseDouble(val);
        } catch (Exception e) {
            return 0.0;
        }
    }

    private void recalcularValorTotal() {
        double total = 0.0;

        total += obtenerValor(jTextFieldCantidad0, jTextFieldValorPdto0);

        if (cantidadPdtoHabilitados >= 2) {
            total += obtenerValor(jTextFieldCantidad1, jTextFieldValorPdto1);
        }
        if (cantidadPdtoHabilitados >= 3) {
            total += obtenerValor(jTextFieldCantidad2, jTextFieldValorPdto2);
        }
        if (cantidadPdtoHabilitados >= 4) {
            total += obtenerValor(jTextFieldCantidad3, jTextFieldValorPdto3);
        }
        if (cantidadPdtoHabilitados >= 5) {
            total += obtenerValor(jTextFieldCantidad4, jTextFieldValorPdto4);
        }
        if (cantidadPdtoHabilitados >= 6) {
            total += obtenerValor(jTextFieldCantidad5, jTextFieldValorPdto5);
        }
        if (cantidadPdtoHabilitados >= 7) {
            total += obtenerValor(jTextFieldCantidad6, jTextFieldValorPdto6);
        }

        valorTotal = total;

    }


    private void panelCierreAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreAppMouseClicked
        int confirmacion = JOptionPane.showConfirmDialog(this, "Deseas salir del sistema?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_panelCierreAppMouseClicked

    private void btnCrearClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearClienteMouseClicked
        //navegacion dentro del Jpanned
        cargarDashBoardUsuarios();
        mainTabbedPane.setSelectedIndex(0);


    }//GEN-LAST:event_btnCrearClienteMouseClicked

    private void btnRegistrarVentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarVentaMouseMoved
        btnRegistrarVenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegistrarVenta.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_btnRegistrarVentaMouseMoved

    private void btnRegistrarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarVentaMouseClicked

        mainTabbedPane.setSelectedIndex(1);

    }//GEN-LAST:event_btnRegistrarVentaMouseClicked

    private void btnRegistrarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarVentaMouseExited
        btnRegistrarVenta.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnRegistrarVenta.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btnRegistrarVentaMouseExited

    private void btnRegistrarPdtoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPdtoMouseMoved

        btnRegistrarPdto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegistrarPdto.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_btnRegistrarPdtoMouseMoved

    private void btnRegistrarPdtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPdtoMouseClicked
        mainTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_btnRegistrarPdtoMouseClicked

    private void btnRegistrarPdtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPdtoMouseExited
        btnRegistrarPdto.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnRegistrarPdto.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btnRegistrarPdtoMouseExited

    private void panelCierreAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreAppMouseMoved
        panelCierreApp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panelCierreApp.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_panelCierreAppMouseMoved

    private void panelCierreAppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreAppMouseExited
        panelCierreApp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        panelCierreApp.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_panelCierreAppMouseExited

    private void btnRegistrarPagosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPagosMouseMoved
        btnRegistrarPagos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegistrarPagos.setBackground(new Color(146, 118, 193));

    }//GEN-LAST:event_btnRegistrarPagosMouseMoved

    private void btnRegistrarPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPagosMouseClicked
        mainTabbedPane.setSelectedIndex(2);
        jTableRegistroPagos.setDefaultEditor(Object.class, null);
        controlPool.traerPagosPendientes(jTableRegistroPagos);
        Double valorPagoPendiente=0.0;
        DecimalFormat df = new DecimalFormat("#,###");
        
        int filas= jTableRegistroPagos.getRowCount();
        int columnas = jTableRegistroPagos.getColumnCount();
        for(int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++) {
                
                }

                Object valor = jTableRegistroPagos.getValueAt(i, 4);
                valorPagoPendiente+= Double.parseDouble(String.valueOf(valor));
                
                }
        String formateado = df.format(valorPagoPendiente);
        System.out.println("valorPagoPendiente "+valorPagoPendiente);
        System.out.println("formateado  "+formateado);
            jTextValorTotal1.setText(formateado);
    }//GEN-LAST:event_btnRegistrarPagosMouseClicked

    private void btnRegistrarPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPagosMouseExited
        btnRegistrarPagos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnRegistrarPagos.setBackground(new Color(54, 33, 89));

    }//GEN-LAST:event_btnRegistrarPagosMouseExited

    private void btnConsultarVentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVentasMouseMoved
        btnConsultarVentas.setBackground(new Color(146,118,193));
        btnConsultarVentas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnConsultarVentasMouseMoved

    private void btnConsultarVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVentasMouseClicked
        
        mainTabbedPane.setSelectedIndex(4);
        jTableRegistroVentas.setDefaultEditor(Object.class, null);
        controlPool.traerVentas(jTableRegistroVentas,fechaActual);
        Double valorPagoPendiente=0.0;
        DecimalFormat df = new DecimalFormat("#,###");
        
        int filas= jTableRegistroVentas.getRowCount();
        int columnas = jTableRegistroVentas.getColumnCount();
        for(int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++) {
                
                }

                Object valor = jTableRegistroVentas.getValueAt(i, 1);//CORREGIR POR VALOR REAL
                valorPagoPendiente+= Double.parseDouble(String.valueOf(valor));
                
                }
        String formateado = df.format(valorPagoPendiente);
        System.out.println("valorPagoPendiente "+valorPagoPendiente);
        System.out.println("formateado  "+formateado);
            jTextVentasTotales.setText(formateado);
    }//GEN-LAST:event_btnConsultarVentasMouseClicked

    private void btnConsultarVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVentasMouseExited
       btnConsultarVentas.setBackground(new Color(54,33,89));
       btnConsultarVentas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnConsultarVentasMouseExited

    private void jButtonAbrirCalendario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirCalendario1ActionPerformed

    private void jButtonAbrirCalendario1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario1MouseExited
        jButtonAbrirCalendario1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButtonAbrirCalendario1MouseExited

    private void jButtonAbrirCalendario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario1MouseClicked
        CalendarioMes dialog = new CalendarioMes(this, true, fechaActual);
        dialog.setVisible(true);
        LocalDate nuevaFecha = dialog.getFecha();
        jButtonAbrirCalendario1.setText(String.valueOf(nuevaFecha));
    }//GEN-LAST:event_jButtonAbrirCalendario1MouseClicked

    private void jButtonAbrirCalendario1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario1MouseMoved
        jButtonAbrirCalendario1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonAbrirCalendario1MouseMoved

    private void JBtnExportarExcel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnExportarExcel1MouseExited
        JBtnExportarExcel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_JBtnExportarExcel1MouseExited

    private void JBtnExportarExcel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnExportarExcel1MouseClicked
        control.exportarExcel(jTableRegistroVentas);
    }//GEN-LAST:event_JBtnExportarExcel1MouseClicked

    private void JBtnExportarExcel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnExportarExcel1MouseMoved
        JBtnExportarExcel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_JBtnExportarExcel1MouseMoved

    private void jButtonCreateVenta16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta16MouseExited

    private void jButtonCreateVenta16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta16MouseClicked

    private void jButtonCreateVenta16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta16MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta16MouseMoved

    private void jButtonCreateVenta17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta17MouseExited

    private void jButtonCreateVenta17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta17MouseClicked

    private void jButtonCreateVenta17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta17MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta17MouseMoved

    private void jButtonConsultarVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarVentasMouseExited
        jButtonConsultarVentas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButtonConsultarVentasMouseExited

    private void jButtonConsultarVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarVentasMouseClicked
        LocalDate fechaSelected = LocalDate.parse(String.valueOf(jButtonAbrirCalendario1.getText()));
        controlPool.traerVentas(jTableRegistroVentas,fechaSelected);
        Double valorPagoPendiente=0.0;
        DecimalFormat df = new DecimalFormat("#,###");

        int filas= jTableRegistroVentas.getRowCount();
        int columnas = jTableRegistroVentas.getColumnCount();
        for(int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++) {

            }

            Object valor = jTableRegistroVentas.getValueAt(i, 1);//CORREGIR POR VALOR REAL
            valorPagoPendiente+= Double.parseDouble(String.valueOf(valor));

        }
        String formateado = df.format(valorPagoPendiente);
        System.out.println("valorPagoPendiente "+valorPagoPendiente);
        System.out.println("formateado  "+formateado);
        jTextVentasTotales.setText(formateado);
    }//GEN-LAST:event_jButtonConsultarVentasMouseClicked

    private void jButtonConsultarVentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarVentasMouseMoved
        jButtonConsultarVentas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonConsultarVentasMouseMoved

    private void jButtonCreateVenta10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta10MouseExited

    private void jButtonCreateVenta10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta10MouseClicked

    private void jButtonCreateVenta10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta10MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta10MouseMoved

    private void jButtonCreateVenta11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta11MouseExited

    private void jButtonCreateVenta11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta11MouseClicked

    private void jButtonCreateVenta11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta11MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta11MouseMoved

    private void jTextFieldPrecioUndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioUndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioUndActionPerformed

    private void jTextFieldPorcGananKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPorcGananKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadIngresada = Integer.parseInt(jTextFieldCantidad.getText());
                int precioAdquirido = Integer.parseInt(jTextFieldPrecioAdquirido.getText());

                // Calcular precio por unidad (evitando división por 0)
                double precioPorUnidad = cantidadIngresada > 0 ? precioAdquirido / cantidadIngresada : precioAdquirido;

                jTextFieldPrecioUnd.setText(String.valueOf(precioPorUnidad));

                // Convertir porcentaje de ganancia a decimal
                double ganancia = Double.parseDouble(jTextFieldPorcGanan.getText()) / 100;

                // Precio público
                double precioPublico = precioPorUnidad + (precioPorUnidad * ganancia);
                jTextPrecioPublico.setText(String.valueOf(precioPublico));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");

            }
        }
    }//GEN-LAST:event_jTextFieldPorcGananKeyPressed

    private void jCheckBoxNuevoPdtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdtoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNuevoPdtoMouseExited

    private void jCheckBoxNuevoPdtoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdtoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNuevoPdtoMouseMoved

    private void jCheckBoxNuevoPdtoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdtoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (nuevoPdtoUi == null || !nuevoPdtoUi.isShowing()) {
                nuevoPdtoUi = new RegistrarNuevoPDTO();
                nuevoPdtoUi.setLocationRelativeTo(null);
                nuevoPdtoUi.setVisible(true);
                jCheckBoxNuevoPdto.setSelected(false);
            }
        }
    }//GEN-LAST:event_jCheckBoxNuevoPdtoItemStateChanged

    private void jTextFieldNoFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNoFacturaMouseClicked
        jTextFieldNoFactura.setText("");
    }//GEN-LAST:event_jTextFieldNoFacturaMouseClicked

    private void jButtonAbrirCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirCalendarioActionPerformed

    private void jButtonAbrirCalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendarioMouseExited
        jButtonAbrirCalendario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButtonAbrirCalendarioMouseExited

    private void jButtonAbrirCalendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendarioMouseClicked
        Calendario dialog = new Calendario(this, true, fechaActual);
        dialog.setVisible(true);
        LocalDate nuevaFecha = dialog.getFecha();
        jButtonAbrirCalendario.setText(String.valueOf(nuevaFecha));

        /*abrirCalendario();*/
    }//GEN-LAST:event_jButtonAbrirCalendarioMouseClicked

    private void jButtonAbrirCalendarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendarioMouseMoved
        jButtonAbrirCalendario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonAbrirCalendarioMouseMoved

    private void jTextFieldPrecioAdquiridoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioAdquiridoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadIngresada = Integer.parseInt(jTextFieldCantidad.getText());
                int precioAdquirido = Integer.parseInt(jTextFieldPrecioAdquirido.getText());

                // Calcular precio por unidad (evitando división por 0)
                double precioPorUnidad = cantidadIngresada > 0 ? precioAdquirido / cantidadIngresada : precioAdquirido;

                jTextFieldPrecioUnd.setText(String.valueOf(precioPorUnidad));

                // Convertir porcentaje de ganancia a decimal
                double ganancia = Double.parseDouble(jTextFieldPorcGanan.getText()) / 100;

                // Precio público
                double precioPublico = precioPorUnidad + (precioPorUnidad * ganancia);
                jTextPrecioPublico.setText(String.valueOf(precioPublico));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un numero  válido.");
            }
        }

    }//GEN-LAST:event_jTextFieldPrecioAdquiridoKeyPressed

    private void jButtonCreatePdtosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreatePdtosMouseExited
        jButtonCreatePdtos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButtonCreatePdtosMouseExited

    private void jButtonCreatePdtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreatePdtosMouseClicked

        try {
            // Crear nuevo producto
            Producto nuevoProducto = new Producto();

            // Obtener valores del formulario
            nuevoProducto.setNombreProducto(String.valueOf(jCmbListPdto.getSelectedItem()));
            int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
            nuevoProducto.setCantidad(cantidad);
            nuevoProducto.setDescripcionProducto(jTextFieldDescripcion.getText());

            double precioAdquirido = Double.parseDouble(jTextFieldPrecioAdquirido.getText());
            nuevoProducto.setPrecioAdquirido(precioAdquirido);

            // Calcular precio por unidad (evitando división por 0)
            double precioPorUnidad = cantidad > 0 ? precioAdquirido / cantidad : precioAdquirido;
            nuevoProducto.setPrecioPorUnidad(precioPorUnidad);

            nuevoProducto.setNumeroFactura(jTextFieldNoFactura.getText());
            nuevoProducto.setInversor(String.valueOf(jCmbListInversor.getSelectedItem()));

            // Convertir porcentaje de ganancia a decimal
            double ganancia = Double.parseDouble(jTextFieldPorcGanan.getText()) / 100;
            nuevoProducto.setGananciaDeseada(ganancia);

            // Precio público
            double precioPublico = precioPorUnidad + (precioPorUnidad * ganancia);
            nuevoProducto.setPrecioPublico(precioPublico);

            // Obtener proveedor
            String nombreProveedor = String.valueOf(jCmbProveedor.getSelectedItem());
            int idProveedor = control.traerIdNombreProveedor(nombreProveedor);
            Proveedor proveedor = control.traerProveedor(idProveedor);
            if (proveedor == null) {
                JOptionPane.showMessageDialog(null, "Error: El proveedor con ID + " + idProveedor + " no fue encontrado.");
                return;
            }

            // Asignar proveedor al producto
            nuevoProducto.setProveedor(proveedor);
            nuevoProducto.setFechaCompraProducto(LocalDate.parse(jButtonAbrirCalendario.getText()));

            // Registrar el producto
            control.registrarProducto(nuevoProducto);
            JOptionPane.showMessageDialog(null, "Producto registrado con éxito.");
            int opcion = JOptionPane.showConfirmDialog(null, "Registrar otro producto?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(opcion== JOptionPane.NO_OPTION) {
                control.reiniciarApp();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato numérico. Verifica los campos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar producto: " + ex.getMessage());
            ex.printStackTrace();
        }

        cargarDashBoardRegistrarPdto();

    }//GEN-LAST:event_jButtonCreatePdtosMouseClicked

    private void jButtonCreatePdtosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreatePdtosMouseMoved
        jButtonCreatePdtos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonCreatePdtosMouseMoved

    private void jCheckBoxNuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoProvActionPerformed
        if (jCheckBoxNuevoProv.isSelected()) {
            //logica ventana nueva
            nuevoProveedor.setVisible(true);
            nuevoProveedor.setLocationRelativeTo(null);
        } else {
            //debe cerrar la ventana nueva

            System.out.println("cmb en false");
        }
    }//GEN-LAST:event_jCheckBoxNuevoProvActionPerformed

    private void jCheckBoxNuevoProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoProvMouseExited
        jCheckBoxNuevoProv.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        jCheckBoxNuevoProv.setBackground(new Color(255, 255, 255));
        jCheckBoxNuevoProv.setForeground(new Color(60, 83, 65));

    }//GEN-LAST:event_jCheckBoxNuevoProvMouseExited

    //VISUAL DE REGISTRO PRODUTOS

    private void jCheckBoxNuevoProvMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoProvMouseMoved
        // TODO add your handling code here:
        jCheckBoxNuevoProv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jCheckBoxNuevoProv.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_jCheckBoxNuevoProvMouseMoved

    private void jCheckBoxNuevoProvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoProvItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (nuevoProveedor == null || !nuevoProveedor.isShowing()) {
                nuevoProveedor = new RegistrarNuevoProveedor();
                nuevoProveedor.setLocationRelativeTo(null);
                nuevoProveedor.setVisible(true);
                jCheckBoxNuevoProv.setSelected(false);
            }
        }
    }//GEN-LAST:event_jCheckBoxNuevoProvItemStateChanged

    private void jButtonConsultarPagosPdtesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarPagosPdtesMouseExited
        jButtonConsultarPagosPdtes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButtonConsultarPagosPdtesMouseExited

    private void jButtonConsultarPagosPdtesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarPagosPdtesMouseClicked
        String nombre = String.valueOf(jCmbCliente2.getSelectedItem());
        if (nombre.equals("Seleccionar Todos")) {
            controlPool.traerPagosPendientes(jTableRegistroPagos);

        } else {
            System.out.println("nombre que se envia a pool "+nombre);
            controlPool.traerPagosPendientes(nombre, jTableRegistroPagos);
        }
    }//GEN-LAST:event_jButtonConsultarPagosPdtesMouseClicked

    private void jButtonConsultarPagosPdtesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarPagosPdtesMouseMoved
        jButtonConsultarPagosPdtes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonConsultarPagosPdtesMouseMoved

    private void jButtonCreateVenta6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta6MouseExited

    private void jButtonCreateVenta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta6MouseClicked

    private void jButtonCreateVenta6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta6MouseMoved

    private void jButtonCreateVenta7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta7MouseExited

    private void jButtonCreateVenta7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta7MouseClicked

    private void jButtonCreateVenta7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta7MouseMoved

    private void jBtnRegistrarPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRegistrarPagoMouseExited
        jBtnRegistrarPago.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jBtnRegistrarPagoMouseExited

    private void jBtnRegistrarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRegistrarPagoMouseClicked
        Double valorPagoPendiente = 0.0;
        int idCliente = 99999999;
        String nombreCte = "";
        LocalDate fecha= LocalDate.now();
        String formaPago= String.valueOf(jCmbFormaPago1.getSelectedItem());
        int[] filasSeleccionadas = jTableRegistroPagos.getSelectedRows();
        if (filasSeleccionadas.length > 0) {
            for (int fila : filasSeleccionadas) {
                Object idCte = jTableRegistroPagos.getValueAt(fila, 5);
                Object valorVenta = jTableRegistroPagos.getValueAt(fila, 4);
                idCliente = Integer.parseInt(String.valueOf(idCte));
                valorPagoPendiente += Double.parseDouble(String.valueOf(valorVenta));
                nombreCte = String.valueOf(jTableRegistroPagos.getValueAt(fila, 0));

            }
            jTextValorTotal1.setText(String.valueOf(valorPagoPendiente));
            int opcion = JOptionPane.showConfirmDialog(null, "¿Registrar pago a " + nombreCte + " por " + valorPagoPendiente + " ?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == JOptionPane.YES_OPTION) {
                for (int fila : filasSeleccionadas) {
                    Object idVta = jTableRegistroPagos.getValueAt(fila, 6);
                    int idVenta = Integer.parseInt(String.valueOf(idVta));
                    controlPool.registrarPagoCte(idVenta,formaPago,fecha);
                }
                JOptionPane.showMessageDialog(null, "Pago(s) registrados con exito", "Pago registrado" +nombreCte, JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una o mas ventas (de un cliente)");
        }
    }//GEN-LAST:event_jBtnRegistrarPagoMouseClicked

    private void jBtnRegistrarPagoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRegistrarPagoMouseMoved
        jBtnRegistrarPago.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jBtnRegistrarPagoMouseMoved

    private void jButtonCreateVenta12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta12MouseExited

    private void jButtonCreateVenta12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta12MouseClicked

    private void jButtonCreateVenta12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta12MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta12MouseMoved

    private void jButtonCreateVenta13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta13MouseExited

    private void jButtonCreateVenta13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta13MouseClicked

    private void jButtonCreateVenta13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta13MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta13MouseMoved

    private void JBtnExportarExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnExportarExcelMouseExited
        JBtnExportarExcel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_JBtnExportarExcelMouseExited

    private void JBtnExportarExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnExportarExcelMouseClicked

        control.exportarExcel(jTableRegistroPagos);
    }//GEN-LAST:event_JBtnExportarExcelMouseClicked

    private void JBtnExportarExcelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnExportarExcelMouseMoved
        JBtnExportarExcel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_JBtnExportarExcelMouseMoved

    private void jButtonCreateVenta14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta14MouseExited

    private void jButtonCreateVenta14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta14MouseClicked

    private void jButtonCreateVenta14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta14MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta14MouseMoved

    private void jButtonCreateVenta15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta15MouseExited

    private void jButtonCreateVenta15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta15MouseClicked

    private void jButtonCreateVenta15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta15MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta15MouseMoved

    private void jCheckBoxPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPagadoActionPerformed

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // VISUAL DE CARGA
                SwingUtilities.invokeLater(() -> {
                    if (jCheckBoxPagado.isSelected()) {
                        jCmbFormaPago.setVisible(true);
                        jLblFormaPago.setVisible(true);
                        System.out.println("checkbox encendido");
                    } else {
                        jCmbFormaPago.setVisible(false);
                        jLblFormaPago.setVisible(false);
                        System.out.println("checkbox apagado");
                    }
                });
                return null;
            }
        };

        worker.execute();
    }//GEN-LAST:event_jCheckBoxPagadoActionPerformed

    private void jCheckBoxPagadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxPagadoStateChanged

        if (jCheckBoxPagado.isSelected()) {
            if (!jCheckBoxPagado.isSelected()) {
                jCmbFormaPago.setVisible(false);
                jLblFormaPago.setVisible(false);
                System.out.println("con focus lost check box apagado");
            } else {
                jCmbFormaPago.setVisible(true);
                jLblFormaPago.setVisible(true);
                System.out.println("con focus lostcheckbox encendido");
            }
        }
    }//GEN-LAST:event_jCheckBoxPagadoStateChanged

    private void jPaneValorPdto0FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPaneValorPdto0FocusLost
        //PRECIO PDTO0
        Double precioProducto0 = 0.0;
        List<Producto> listaCantidadPdtoDisp = new ArrayList<>();
        String nombrePdto0 = String.valueOf(jCmbPTO0.getSelectedItem());
        int cantidadPdto0 = 0;
        listaCantidadPdtoDisp = control.listaProductos();
        for (Producto producto : listaCantidadPdtoDisp) {
            if (producto.getNombreProducto().equals(nombrePdto0)) {
                cantidadPdto0 = producto.getCantidad();
                precioProducto0 = producto.getPrecioPublico() * cantidadPdto0;
                valorRegistroVenta = valorRegistroVenta + precioProducto0;
            }
        }
        int cantidad = Integer.parseInt(jTextFieldCantidad0.getText());
        double valorPdto = Double.parseDouble(jTextValorPdto0.getText());

        Double valorTotalPdtos = cantidad * valorPdto;

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // VISUAL DE CARGA
                SwingUtilities.invokeLater(() -> {
                    jTextValorPdto0.setText(String.valueOf(valorTotalPdtos));
                });
                return null;
            }
        };

        worker.execute();

    }//GEN-LAST:event_jPaneValorPdto0FocusLost

    private void jButtonRemovePdto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovePdto2MouseClicked
        //QUITA CAMPOS DE PORODUCTOSS

        jCmbPTO2.setVisible(false);
        jTextFieldCantidad2.setText("");
        jTextFieldCantidad2.setVisible(false);
        jLblPDTO2.setVisible(false);
        jButtonRemovePdto2.setVisible(false);
        jLblCantPDTO2.setVisible(false);
        jTextFieldValorPdto2.setVisible(false);
        jPaneValorPdto2.setVisible(false);
        jTextValorPdto2.setText("0");
        cantidadPdtoHabilitados--;
    }//GEN-LAST:event_jButtonRemovePdto2MouseClicked

    private void jButtonRemovePdto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovePdto3MouseClicked
        //QUITA CAMPOS DE PORODUCTOSS

        jCmbPTO3.setVisible(false);
        jTextFieldCantidad3.setText("");
        jTextFieldCantidad3.setVisible(false);
        jLblPDTO3.setVisible(false);
        jButtonRemovePdto3.setVisible(false);
        jLblCantPDTO3.setVisible(false);
        jTextFieldValorPdto3.setVisible(false);
        jPaneValorPdto3.setVisible(false);
        jTextValorPdto3.setText("0");
        cantidadPdtoHabilitados--;
    }//GEN-LAST:event_jButtonRemovePdto3MouseClicked

    private void jButtonRemovePdto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovePdto4MouseClicked

        //QUITA CAMPOS DE PORODUCTOSS
        jCmbPTO4.setVisible(false);
        jTextFieldCantidad4.setText("");
        jTextFieldCantidad4.setVisible(false);
        jLblPDTO4.setVisible(false);
        jButtonRemovePdto4.setVisible(false);
        jLblCantPDTO4.setVisible(false);
        jTextFieldValorPdto4.setVisible(false);
        jPaneValorPdto4.setVisible(false);
        jTextValorPdto4.setText("0");
        cantidadPdtoHabilitados--;
    }//GEN-LAST:event_jButtonRemovePdto4MouseClicked

    private void jButtonRemovePdto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovePdto5MouseClicked
        //QUITA CAMPOS DE PORODUCTOSS

        jCmbPTO5.setVisible(false);
        jTextFieldCantidad5.setText("");
        jTextFieldCantidad5.setVisible(false);
        jLblPDTO5.setVisible(false);
        jButtonRemovePdto5.setVisible(false);
        jLblCantPDTO5.setVisible(false);
        jTextFieldValorPdto5.setVisible(false);
        jPaneValorPdto5.setVisible(false);
        jTextValorPdto5.setText("0");
        cantidadPdtoHabilitados--;
    }//GEN-LAST:event_jButtonRemovePdto5MouseClicked

    private void jButtonRemovePdto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovePdto6MouseClicked
        //QUITA CAMPOS DE PORODUCTOSS

        jCmbPTO6.setVisible(false);
        jTextFieldCantidad6.setText("");
        jTextFieldCantidad6.setVisible(false);
        jLblPDTO6.setVisible(false);
        jButtonRemovePdto6.setVisible(false);
        jLblCantPDTO6.setVisible(false);
        jTextFieldValorPdto6.setVisible(false);
        jPaneValorPdto6.setVisible(false);
        jTextValorPdto6.setText("0");
        cantidadPdtoHabilitados--;
    }//GEN-LAST:event_jButtonRemovePdto6MouseClicked

    private void jButtonRemovePdto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovePdto1MouseClicked
        //QUITA CAMPOS DE PORODUCTOSS

        jCmbPTO1.setVisible(false);
        jTextFieldCantidad1.setText("");
        jTextFieldCantidad1.setVisible(false);
        jLblPDTO1.setVisible(false);
        jButtonRemovePdto1.setVisible(false);
        jLblCantPDTO1.setVisible(false);
        jTextFieldValorPdto1.setVisible(false);
        jPaneValorPdto1.setVisible(false);
        jTextValorPdto1.setText("0");
        cantidadPdtoHabilitados--;
    }//GEN-LAST:event_jButtonRemovePdto1MouseClicked

    private void jButtonCreateVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVentaMouseExited
        jButtonCreateVenta.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        jButtonCreateVenta.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_jButtonCreateVentaMouseExited

    private void jButtonCreateVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVentaMouseClicked

        Cliente cliente = control.traerIdNombreCliente(String.valueOf(jCmbCliente.getSelectedItem()));
        String formaPago = jCheckBoxPagado.isSelected() ? String.valueOf(jCmbFormaPago.getSelectedItem()) : "FIADO";
        String estado = jCheckBoxPagado.isSelected() ? "PAGADO" : "PENDIENTE";

        List<Venta> listaVentasCliente = new ArrayList<>();

        // Combos, cantidades y valores agrupados
        JComboBox[] combos = {jCmbPTO0, jCmbPTO1, jCmbPTO2, jCmbPTO3, jCmbPTO4, jCmbPTO5, jCmbPTO6};
        JTextField[] camposCantidad = {jTextFieldCantidad0, jTextFieldCantidad1, jTextFieldCantidad2, jTextFieldCantidad3, jTextFieldCantidad4, jTextFieldCantidad5, jTextFieldCantidad6};
        JLabel[] camposValor = {jTextValorPdto0, jTextValorPdto1, jTextValorPdto2, jTextValorPdto3, jTextValorPdto4, jTextValorPdto5, jTextValorPdto6};

        double valorRegistroVenta = 0.0;

        // Recorre todos los productos activos
        for (int i = 0; i < cantidadPdtoHabilitados; i++) {
            try {
                String producto = String.valueOf(combos[i].getSelectedItem());
                String strCant = camposCantidad[i].getText().trim();
                String strVal = camposValor[i].getText().trim();

                // Validar datos
                if (producto == null || producto.isEmpty() || !strCant.matches("\\d+") || !strVal.matches("[0-9]+(\\.[0-9]+)?")) {
                    continue;
                }

                int cantidad = Integer.parseInt(strCant);
                double valorTotalProducto = Double.parseDouble(strVal); // ya es total (precio × cantidad)

                Venta venta = new Venta();
                venta.setCliente(cliente);
                venta.setProducto(producto);
                venta.setCantidad(cantidad);
                venta.setValor(valorTotalProducto); // ✅ NO volver a multiplicar
                venta.setFormaPago(formaPago);
                venta.setEstado(estado);
                venta.setObservacion("sin comentario " + (i + 1));

                listaVentasCliente.add(venta);
                valorRegistroVenta += valorTotalProducto; // ✅ suma directa sin duplicar
            } catch (NumberFormatException e) {
                System.out.println("Error procesando producto " + (i + 1) + ": " + e.getMessage());
            }
        }

        // Validación si no hay productos válidos
        if (listaVentasCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay productos válidos para registrar.");
            return;
        }

        // Confirmar compra
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Confirmar compra por un total de $" + String.format("%.2f", valorRegistroVenta) + "?",
            "Confirmar Compra",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmacion == JOptionPane.YES_OPTION) {
            for (Venta venta : listaVentasCliente) {
                String nombrePdtoComprado = venta.getProducto();
                int cantidadPdtoComprado = venta.getCantidad();
                controlPool.RemoverCantidadCompra(nombrePdtoComprado, cantidadPdtoComprado);
                control.crearVenta(venta);
            }

            JOptionPane.showMessageDialog(this, "Venta(s) registrada(s) a " + cliente.getNombre());
            listaVentasCliente.clear();
            // ✅ Reinicia la app solo una vez
            reiniciarApp();

        }

    }//GEN-LAST:event_jButtonCreateVentaMouseClicked

    private void jButtonCreateVentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVentaMouseMoved
        jButtonCreateVenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButtonCreateVenta.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_jButtonCreateVentaMouseMoved

    private void jButtonCreateVenta4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta4MouseExited

    private void jButtonCreateVenta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta4MouseClicked

    private void jButtonCreateVenta4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta4MouseMoved

    private void jButtonCreateVenta5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta5MouseExited

    private void jButtonCreateVenta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta5MouseClicked

    private void jButtonCreateVenta5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta5MouseMoved

    private void jTextFieldCantidad0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidad0KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadSolicitada = Integer.parseInt(jTextFieldCantidad0.getText());
                String nombrePdto0 = String.valueOf(jCmbPTO0.getSelectedItem());

                List<Producto> listaProductos = control.listaProductos();
                int cantidadDisponible = 0;
                double precioUnitario = 0.0;

                // Buscar el producto seleccionado
                for (Producto producto : listaProductos) {
                    if (producto.getNombreProducto().equals(nombrePdto0) && producto.getCantidad() > 0) {
                        cantidadDisponible = producto.getCantidad();
                        precioUnitario = producto.getPrecioPublico();
                        break;
                    }
                }

                // Validar disponibilidad
                if (cantidadSolicitada > cantidadDisponible) {
                    JOptionPane.showMessageDialog(null,
                        "Solo hay " + cantidadDisponible + " unidades disponibles de " + nombrePdto0);
                    cantidadSolicitada = cantidadDisponible;
                    jTextFieldCantidad0.setText(String.valueOf(cantidadDisponible));
                }

                // Calcular valor total de este producto
                double valorPdt0 = precioUnitario * cantidadSolicitada;
                jTextValorPdto0.setText(String.valueOf(valorPdt0));

                // ⚠️ Aquí NO sumes al valor total de venta global todavía.
                // Ese cálculo debe hacerse solo al crear la venta final.
                // Si lo haces aquí, cada Enter duplicará el monto.
                // Solo muestra un valor de referencia, si quieres:
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");
            }
        }
    }//GEN-LAST:event_jTextFieldCantidad0KeyPressed

    private void jTextFieldCantidad5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidad5KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadSolicitada = Integer.parseInt(jTextFieldCantidad5.getText());
                String nombrePdto0 = String.valueOf(jCmbPTO5.getSelectedItem());

                List<Producto> listaProductos = control.listaProductos();
                int cantidadDisponible = 0;
                double precioUnitario = 0.0;

                // Buscar el producto seleccionado
                for (Producto producto : listaProductos) {
                    if (producto.getNombreProducto().equals(nombrePdto0) && producto.getCantidad() > 0) {
                        cantidadDisponible = producto.getCantidad();
                        precioUnitario = producto.getPrecioPublico();
                        break;
                    }
                }

                // Validar disponibilidad
                if (cantidadSolicitada > cantidadDisponible) {
                    JOptionPane.showMessageDialog(null,
                        "Solo hay " + cantidadDisponible + " unidades disponibles de " + nombrePdto0);
                    cantidadSolicitada = cantidadDisponible;
                    jTextFieldCantidad5.setText(String.valueOf(cantidadDisponible));
                }

                // Calcular valor total de este producto
                double valorPdt0 = precioUnitario * cantidadSolicitada;
                jTextValorPdto5.setText(String.valueOf(valorPdt0));

                // ⚠️ Aquí NO sumes al valor total de venta global todavía.
                // Ese cálculo debe hacerse solo al crear la venta final.
                // Si lo haces aquí, cada Enter duplicará el monto.
                // Solo muestra un valor de referencia, si quieres:
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");
            }
        }
    }//GEN-LAST:event_jTextFieldCantidad5KeyPressed

    private void jTextFieldCantidad4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidad4KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadSolicitada = Integer.parseInt(jTextFieldCantidad4.getText());
                String nombrePdto0 = String.valueOf(jCmbPTO4.getSelectedItem());

                List<Producto> listaProductos = control.listaProductos();
                int cantidadDisponible = 0;
                double precioUnitario = 0.0;

                // Buscar el producto seleccionado
                for (Producto producto : listaProductos) {
                    if (producto.getNombreProducto().equals(nombrePdto0) && producto.getCantidad() > 0) {
                        cantidadDisponible = producto.getCantidad();
                        precioUnitario = producto.getPrecioPublico();
                        break;
                    }
                }

                // Validar disponibilidad
                if (cantidadSolicitada > cantidadDisponible) {
                    JOptionPane.showMessageDialog(null,
                        "Solo hay " + cantidadDisponible + " unidades disponibles de " + nombrePdto0);
                    cantidadSolicitada = cantidadDisponible;
                    jTextFieldCantidad4.setText(String.valueOf(cantidadDisponible));
                }

                // Calcular valor total de este producto
                double valorPdt0 = precioUnitario * cantidadSolicitada;
                jTextValorPdto4.setText(String.valueOf(valorPdt0));

                // ⚠️ Aquí NO sumes al valor total de venta global todavía.
                // Ese cálculo debe hacerse solo al crear la venta final.
                // Si lo haces aquí, cada Enter duplicará el monto.
                // Solo muestra un valor de referencia, si quieres:
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");
            }
        }
    }//GEN-LAST:event_jTextFieldCantidad4KeyPressed

    private void jTextFieldCantidad3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidad3KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadSolicitada = Integer.parseInt(jTextFieldCantidad3.getText());
                String nombrePdto0 = String.valueOf(jCmbPTO3.getSelectedItem());

                List<Producto> listaProductos = control.listaProductos();
                int cantidadDisponible = 0;
                double precioUnitario = 0.0;

                // Buscar el producto seleccionado
                for (Producto producto : listaProductos) {
                    if (producto.getNombreProducto().equals(nombrePdto0) && producto.getCantidad() > 0) {
                        cantidadDisponible = producto.getCantidad();
                        precioUnitario = producto.getPrecioPublico();
                        break;
                    }
                }

                // Validar disponibilidad
                if (cantidadSolicitada > cantidadDisponible) {
                    JOptionPane.showMessageDialog(null,
                        "Solo hay " + cantidadDisponible + " unidades disponibles de " + nombrePdto0);
                    cantidadSolicitada = cantidadDisponible;
                    jTextFieldCantidad3.setText(String.valueOf(cantidadDisponible));
                }

                // Calcular valor total de este producto
                double valorPdt0 = precioUnitario * cantidadSolicitada;
                jTextValorPdto3.setText(String.valueOf(valorPdt0));

                // ⚠️ Aquí NO sumes al valor total de venta global todavía.
                // Ese cálculo debe hacerse solo al crear la venta final.
                // Si lo haces aquí, cada Enter duplicará el monto.
                // Solo muestra un valor de referencia, si quieres:
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");
            }
        }
    }//GEN-LAST:event_jTextFieldCantidad3KeyPressed

    private void jTextFieldCantidad2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidad2KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadSolicitada = Integer.parseInt(jTextFieldCantidad2.getText());
                String nombrePdto0 = String.valueOf(jCmbPTO2.getSelectedItem());

                List<Producto> listaProductos = control.listaProductos();
                int cantidadDisponible = 0;
                double precioUnitario = 0.0;

                // Buscar el producto seleccionado
                for (Producto producto : listaProductos) {
                    if (producto.getNombreProducto().equals(nombrePdto0) && producto.getCantidad() > 0) {
                        cantidadDisponible = producto.getCantidad();
                        precioUnitario = producto.getPrecioPublico();
                        break;
                    }
                }

                // Validar disponibilidad
                if (cantidadSolicitada > cantidadDisponible) {
                    JOptionPane.showMessageDialog(null,
                        "Solo hay " + cantidadDisponible + " unidades disponibles de " + nombrePdto0);
                    cantidadSolicitada = cantidadDisponible;
                    jTextFieldCantidad2.setText(String.valueOf(cantidadDisponible));
                }

                // Calcular valor total de este producto
                double valorPdt0 = precioUnitario * cantidadSolicitada;
                jTextValorPdto2.setText(String.valueOf(valorPdt0));

                // ⚠️ Aquí NO sumes al valor total de venta global todavía.
                // Ese cálculo debe hacerse solo al crear la venta final.
                // Si lo haces aquí, cada Enter duplicará el monto.
                // Solo muestra un valor de referencia, si quieres:
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");
            }
        }
    }//GEN-LAST:event_jTextFieldCantidad2KeyPressed

    private void jTextFieldCantidad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidad1KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadSolicitada = Integer.parseInt(jTextFieldCantidad1.getText());
                String nombrePdto0 = String.valueOf(jCmbPTO1.getSelectedItem());

                List<Producto> listaProductos = control.listaProductos();
                int cantidadDisponible = 0;
                double precioUnitario = 0.0;

                // Buscar el producto seleccionado
                for (Producto producto : listaProductos) {
                    if (producto.getNombreProducto().equals(nombrePdto0) && producto.getCantidad() > 0) {
                        cantidadDisponible = producto.getCantidad();
                        precioUnitario = producto.getPrecioPublico();
                        break;
                    }
                }

                // Validar disponibilidad
                if (cantidadSolicitada > cantidadDisponible) {
                    JOptionPane.showMessageDialog(null,
                        "Solo hay " + cantidadDisponible + " unidades disponibles de " + nombrePdto0);
                    cantidadSolicitada = cantidadDisponible;
                    jTextFieldCantidad1.setText(String.valueOf(cantidadDisponible));
                }

                // Calcular valor total de este producto
                double valorPdt0 = precioUnitario * cantidadSolicitada;
                jTextValorPdto1.setText(String.valueOf(valorPdt0));

                // ⚠️ Aquí NO sumes al valor total de venta global todavía.
                // Ese cálculo debe hacerse solo al crear la venta final.
                // Si lo haces aquí, cada Enter duplicará el monto.
                // Solo muestra un valor de referencia, si quieres:
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");
            }
        }
    }//GEN-LAST:event_jTextFieldCantidad1KeyPressed

    private void jTextFieldCantidad6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidad6KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                int cantidadSolicitada = Integer.parseInt(jTextFieldCantidad6.getText());
                String nombrePdto0 = String.valueOf(jCmbPTO0.getSelectedItem());

                List<Producto> listaProductos = control.listaProductos();
                int cantidadDisponible = 0;
                double precioUnitario = 0.0;

                // Buscar el producto seleccionado
                for (Producto producto : listaProductos) {
                    if (producto.getNombreProducto().equals(nombrePdto0) && producto.getCantidad() > 0) {
                        cantidadDisponible = producto.getCantidad();
                        precioUnitario = producto.getPrecioPublico();
                        break;
                    }
                }

                // Validar disponibilidad
                if (cantidadSolicitada > cantidadDisponible) {
                    JOptionPane.showMessageDialog(null,
                        "Solo hay " + cantidadDisponible + " unidades disponibles de " + nombrePdto0);
                    cantidadSolicitada = cantidadDisponible;
                    jTextFieldCantidad6.setText(String.valueOf(cantidadDisponible));
                }

                // Calcular valor total de este producto
                double valorPdt0 = precioUnitario * cantidadSolicitada;
                jTextValorPdto6.setText(String.valueOf(valorPdt0));

                // ⚠️ Aquí NO sumes al valor total de venta global todavía.
                // Ese cálculo debe hacerse solo al crear la venta final.
                // Si lo haces aquí, cada Enter duplicará el monto.
                // Solo muestra un valor de referencia, si quieres:
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad válida.");
            }
        }
    }//GEN-LAST:event_jTextFieldCantidad6KeyPressed

    private void jCmbPTO1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCmbPTO1FocusLost
        System.out.println("con focus lost detecta cambio a " + jCmbPTO1.getSelectedItem());
        String nombrePdtoSeleccionado = String.valueOf(jCmbPTO1.getSelectedItem());
        List<Producto> listaProdutos = control.listaProductos();
        for (Producto producto : listaProdutos) {
            if (producto.getNombreProducto().equals(nombrePdtoSeleccionado)) {
                jTextValorPdto1.setText(String.valueOf(producto.getPrecioPublico()));
            }
        }
    }//GEN-LAST:event_jCmbPTO1FocusLost

    private void jButtonAddPdtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddPdtoMouseExited

        jButtonAddPdto.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        jButtonAddPdto.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_jButtonAddPdtoMouseExited

    private void jButtonAddPdtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddPdtoMouseClicked
        // Agrega un nuevo producto a la compra
        cantidadPdtoHabilitados++;
        System.out.println("Cantidad de productos habilitados: " + cantidadPdtoHabilitados);

        switch (cantidadPdtoHabilitados) {
            case 2:
            habilitarProducto(1, jButtonRemovePdto1, jLblPDTO1, jCmbPTO1, jLblCantPDTO1, jTextFieldCantidad1, jTextFieldValorPdto1, jPaneValorPdto1);
            break;
            case 3:
            habilitarProducto(2, jButtonRemovePdto2, jLblPDTO2, jCmbPTO2, jLblCantPDTO2, jTextFieldCantidad2, jTextFieldValorPdto2, jPaneValorPdto2);
            break;
            case 4:
            habilitarProducto(3, jButtonRemovePdto3, jLblPDTO3, jCmbPTO3, jLblCantPDTO3, jTextFieldCantidad3, jTextFieldValorPdto3, jPaneValorPdto3);
            break;
            case 5:
            habilitarProducto(4, jButtonRemovePdto4, jLblPDTO4, jCmbPTO4, jLblCantPDTO4, jTextFieldCantidad4, jTextFieldValorPdto4, jPaneValorPdto4);
            break;
            case 6:
            habilitarProducto(5, jButtonRemovePdto5, jLblPDTO5, jCmbPTO5, jLblCantPDTO5, jTextFieldCantidad5, jTextFieldValorPdto5, jPaneValorPdto5);
            break;
            case 7:
            habilitarProducto(6, jButtonRemovePdto6, jLblPDTO6, jCmbPTO6, jLblCantPDTO6, jTextFieldCantidad6, jTextFieldValorPdto6, jPaneValorPdto6);
            break;
            default:
            JOptionPane.showMessageDialog(null, "Ya has registrado todos los productos, ingresa la venta y adiciona nuevos.");
            cantidadPdtoHabilitados = 7;
            break;
        }

        // recalcula siempre después de habilitar uno nuevo
        recalcularValorTotal();
    }//GEN-LAST:event_jButtonAddPdtoMouseClicked

    private void jButtonAddPdtoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddPdtoMouseMoved
        jButtonAddPdto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButtonAddPdto.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_jButtonAddPdtoMouseMoved

    private void jButtonCreateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateUserMouseExited

        jButtonCreateUser.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        jButtonCreateUser.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_jButtonCreateUserMouseExited

    private void jButtonCreateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateUserMouseClicked

        //LOGICA CREACION DE USUARIO
        String nombre = (String.valueOf(jTextNombre.getText().toUpperCase()));

        //LOGICA
        if (nombre.equals("") || nombre.equals("INGRESE EL NOMBRE DEL CLIENTE") || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digita el nombre del cliente antes de ingresarlo");

        } else {
            //Creacion Usuario
            try {
                Cliente cliente = new Cliente();
                cliente.setNombre(nombre);
                control.crearUsuario(cliente);
                JOptionPane.showMessageDialog(null, nombre + " Creado!");
                int cantidadUsuarios = Integer.parseInt(String.valueOf(control.listaClientes.size()));
                reiniciarApp();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al crear usuario:" + ex);
            }
        }

    }//GEN-LAST:event_jButtonCreateUserMouseClicked

    private void jButtonCreateUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateUserMouseMoved

        jButtonCreateUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButtonCreateUser.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_jButtonCreateUserMouseMoved

    private void jTextNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNombreMouseClicked
        jTextNombre.setText("");
    }//GEN-LAST:event_jTextNombreMouseClicked

    private void jButtonAbrirCalendario2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirCalendario2MouseMoved

    private void jButtonAbrirCalendario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirCalendario2MouseClicked

    private void jButtonAbrirCalendario2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirCalendario2MouseExited

    private void jButtonAbrirCalendario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirCalendario2ActionPerformed

    private void jButtonCreateVenta19MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta19MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta19MouseMoved

    private void jButtonCreateVenta19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta19MouseClicked

    private void jButtonCreateVenta19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta19MouseExited

    private void jButtonCreateVenta18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta18MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta18MouseMoved

    private void jButtonCreateVenta18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta18MouseClicked

    private void jButtonCreateVenta18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta18MouseExited

    private void jButtonConsultarVentas1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarVentas1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarVentas1MouseMoved

    private void jButtonConsultarVentas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarVentas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarVentas1MouseClicked

    private void jButtonConsultarVentas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarVentas1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarVentas1MouseExited

    private void btnConsultarVentas1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVentas1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarVentas1MouseMoved

    private void btnConsultarVentas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVentas1MouseClicked
        mainTabbedPane.setSelectedIndex(5);
    }//GEN-LAST:event_btnConsultarVentas1MouseClicked

    private void btnConsultarVentas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVentas1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarVentas1MouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JBtnExportarExcel;
    private javax.swing.JPanel JBtnExportarExcel1;
    private javax.swing.JPanel btnConsultarVentas;
    private javax.swing.JPanel btnConsultarVentas1;
    private javax.swing.JPanel btnCrearCliente;
    private javax.swing.JPanel btnRegistrarPagos;
    private javax.swing.JPanel btnRegistrarPdto;
    private javax.swing.JPanel btnRegistrarVenta;
    private javax.swing.JPanel jBtnRegistrarPago;
    private javax.swing.JTextField jButtonAbrirCalendario;
    private javax.swing.JTextField jButtonAbrirCalendario1;
    private javax.swing.JTextField jButtonAbrirCalendario2;
    private javax.swing.JPanel jButtonAddPdto;
    private javax.swing.JPanel jButtonConsultarPagosPdtes;
    private javax.swing.JPanel jButtonConsultarVentas;
    private javax.swing.JPanel jButtonConsultarVentas1;
    private javax.swing.JPanel jButtonCreatePdtos;
    private javax.swing.JPanel jButtonCreateUser;
    private javax.swing.JPanel jButtonCreateVenta;
    private javax.swing.JPanel jButtonCreateVenta10;
    private javax.swing.JPanel jButtonCreateVenta11;
    private javax.swing.JPanel jButtonCreateVenta12;
    private javax.swing.JPanel jButtonCreateVenta13;
    private javax.swing.JPanel jButtonCreateVenta14;
    private javax.swing.JPanel jButtonCreateVenta15;
    private javax.swing.JPanel jButtonCreateVenta16;
    private javax.swing.JPanel jButtonCreateVenta17;
    private javax.swing.JPanel jButtonCreateVenta18;
    private javax.swing.JPanel jButtonCreateVenta19;
    private javax.swing.JPanel jButtonCreateVenta4;
    private javax.swing.JPanel jButtonCreateVenta5;
    private javax.swing.JPanel jButtonCreateVenta6;
    private javax.swing.JPanel jButtonCreateVenta7;
    private javax.swing.JLabel jButtonRemovePdto1;
    private javax.swing.JLabel jButtonRemovePdto2;
    private javax.swing.JLabel jButtonRemovePdto3;
    private javax.swing.JLabel jButtonRemovePdto4;
    private javax.swing.JLabel jButtonRemovePdto5;
    private javax.swing.JLabel jButtonRemovePdto6;
    private javax.swing.JCheckBox jCheckBoxNuevoPdto;
    private javax.swing.JCheckBox jCheckBoxNuevoProv;
    private javax.swing.JCheckBox jCheckBoxPagado;
    private javax.swing.JCheckBox jCheckComprasPdtes;
    private javax.swing.JComboBox<String> jCmbCliente;
    private javax.swing.JComboBox<String> jCmbCliente2;
    private javax.swing.JComboBox<String> jCmbFormaPago;
    private javax.swing.JComboBox<String> jCmbFormaPago1;
    private javax.swing.JComboBox<String> jCmbListInversor;
    private javax.swing.JComboBox<String> jCmbListPdto;
    private javax.swing.JComboBox<String> jCmbPTO0;
    private javax.swing.JComboBox<String> jCmbPTO1;
    private javax.swing.JComboBox<String> jCmbPTO2;
    private javax.swing.JComboBox<String> jCmbPTO3;
    private javax.swing.JComboBox<String> jCmbPTO4;
    private javax.swing.JComboBox<String> jCmbPTO5;
    private javax.swing.JComboBox<String> jCmbPTO6;
    private javax.swing.JComboBox<String> jCmbProveedor;
    private javax.swing.JLabel jLabeSignoPeso1;
    private javax.swing.JLabel jLabeSignoPeso2;
    private javax.swing.JLabel jLabeSignoPeso3;
    private javax.swing.JLabel jLabeSignoPeso4;
    private javax.swing.JLabel jLabeSignoPeso5;
    private javax.swing.JLabel jLabeSignoPeso6;
    private javax.swing.JLabel jLabeSignoPeso7;
    private javax.swing.JLabel jLabeSignoPeso8;
    private javax.swing.JLabel jLabeSignoPeso9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabelUsuariosCreados;
    private javax.swing.JLabel jLblCantPDTO0;
    private javax.swing.JLabel jLblCantPDTO1;
    private javax.swing.JLabel jLblCantPDTO12;
    private javax.swing.JLabel jLblCantPDTO13;
    private javax.swing.JLabel jLblCantPDTO15;
    private javax.swing.JLabel jLblCantPDTO2;
    private javax.swing.JLabel jLblCantPDTO3;
    private javax.swing.JLabel jLblCantPDTO4;
    private javax.swing.JLabel jLblCantPDTO5;
    private javax.swing.JLabel jLblCantPDTO6;
    private javax.swing.JLabel jLblCantPDTO8;
    private javax.swing.JLabel jLblCliente;
    private javax.swing.JLabel jLblCliente1;
    private javax.swing.JLabel jLblCliente2;
    private javax.swing.JLabel jLblCliente3;
    private javax.swing.JLabel jLblFormaPago;
    private javax.swing.JLabel jLblPDTO0;
    private javax.swing.JLabel jLblPDTO1;
    private javax.swing.JLabel jLblPDTO2;
    private javax.swing.JLabel jLblPDTO3;
    private javax.swing.JLabel jLblPDTO4;
    private javax.swing.JLabel jLblPDTO5;
    private javax.swing.JLabel jLblPDTO6;
    private javax.swing.JLabel jLblPDTO8;
    private javax.swing.JLabel jLblPDTO9;
    private javax.swing.JPanel jPaneValorPdto0;
    private javax.swing.JPanel jPaneValorPdto1;
    private javax.swing.JPanel jPaneValorPdto2;
    private javax.swing.JPanel jPaneValorPdto3;
    private javax.swing.JPanel jPaneValorPdto4;
    private javax.swing.JPanel jPaneValorPdto5;
    private javax.swing.JPanel jPaneValorPdto6;
    private javax.swing.JPanel jPaneValorTotalPdtos1;
    private javax.swing.JPanel jPaneValorTotalPdtos2;
    private javax.swing.JPanel jPanelComprasPendientes;
    private javax.swing.JPanel jPanelCrearCliente;
    private javax.swing.JPanel jPanelGanancias;
    private javax.swing.JPanel jPanelInternoRPTO;
    private javax.swing.JPanel jPanelRegistrarPDTO;
    private javax.swing.JPanel jPanelRegistrarPagos;
    private javax.swing.JPanel jPanelRegistrarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableRegistroPagos;
    private javax.swing.JTable jTableRegistroPagos2;
    private javax.swing.JTable jTableRegistroVentas;
    private javax.swing.JLabel jTextCantidad;
    private javax.swing.JLabel jTextDescripcion;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCantidad0;
    private javax.swing.JTextField jTextFieldCantidad1;
    private javax.swing.JTextField jTextFieldCantidad2;
    private javax.swing.JTextField jTextFieldCantidad3;
    private javax.swing.JTextField jTextFieldCantidad4;
    private javax.swing.JTextField jTextFieldCantidad5;
    private javax.swing.JTextField jTextFieldCantidad6;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldNoFactura;
    private javax.swing.JTextField jTextFieldPorcGanan;
    private javax.swing.JTextField jTextFieldPrecioAdquirido;
    private javax.swing.JTextField jTextFieldPrecioUnd;
    private javax.swing.JLabel jTextFieldValorPdto0;
    private javax.swing.JLabel jTextFieldValorPdto1;
    private javax.swing.JLabel jTextFieldValorPdto2;
    private javax.swing.JLabel jTextFieldValorPdto3;
    private javax.swing.JLabel jTextFieldValorPdto4;
    private javax.swing.JLabel jTextFieldValorPdto5;
    private javax.swing.JLabel jTextFieldValorPdto6;
    private javax.swing.JLabel jTextGananciaDeseada;
    private javax.swing.JLabel jTextNoFactura;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JLabel jTextPdto;
    private javax.swing.JLabel jTextPdto1;
    private javax.swing.JLabel jTextPrecioAdquirido;
    private javax.swing.JTextField jTextPrecioPublico;
    private javax.swing.JLabel jTextValorPdto0;
    private javax.swing.JLabel jTextValorPdto1;
    private javax.swing.JLabel jTextValorPdto2;
    private javax.swing.JLabel jTextValorPdto3;
    private javax.swing.JLabel jTextValorPdto4;
    private javax.swing.JLabel jTextValorPdto5;
    private javax.swing.JLabel jTextValorPdto6;
    private javax.swing.JLabel jTextValorTotal1;
    private javax.swing.JLabel jTextVentasTotales;
    private javax.swing.JLabel jTitleRegVenta;
    private javax.swing.JLabel jTitleRegVenta1;
    private javax.swing.JLabel jTitleRegVenta2;
    private javax.swing.JLabel jTitleRegVenta3;
    private javax.swing.JLabel jtextPrecioUnd;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel paneBanner;
    private javax.swing.JPanel paneLogo;
    private javax.swing.JPanel panelCierreApp;
    private javax.swing.JSeparator separadorBnner;
    // End of variables declaration//GEN-END:variables

    private void cargarDashBoardUsuarios() {

        int cantidadUsuarios = Integer.parseInt(String.valueOf(control.listaClientes.size()));
        jLabelUsuariosCreados.setText(String.valueOf(cantidadUsuarios));
        jPanelInternoRPTO.setBorder(new RoundedBorder(25));
        jTextNombre.setBorder(new RoundedBorder(25));
        jButtonCreateUser.setBorder(new RoundedBorder(25));

    }

    public void cargarDashBoardVentas() {
        cargarListaProductos();
        //checkbox
        jCheckBoxPagado.setSelected(false);

        //TEXTFIELD
        jCmbPTO1.setVisible(false);
        jLblPDTO1.setVisible(false);
        jLblPDTO2.setVisible(false);
        jLblPDTO3.setVisible(false);
        jLblPDTO4.setVisible(false);
        jLblPDTO5.setVisible(false);
        jLblPDTO6.setVisible(false);

        //COMBOBOX
        jCmbFormaPago.setVisible(false);
        jCmbPTO1.setVisible(false);
        jCmbPTO1.setVisible(false);
        jCmbPTO2.setVisible(false);
        jCmbPTO3.setVisible(false);
        jCmbPTO4.setVisible(false);
        jCmbPTO5.setVisible(false);
        jCmbPTO6.setVisible(false);

        //JPANEL CANTIDAD
        jLblCantPDTO1.setVisible(false);
        jLblCantPDTO2.setVisible(false);
        jLblCantPDTO3.setVisible(false);
        jLblCantPDTO4.setVisible(false);
        jLblCantPDTO4.setVisible(false);
        jLblCantPDTO5.setVisible(false);
        jLblCantPDTO6.setVisible(false);

        //JTEXT FIELDS 
        jLblFormaPago.setVisible(false);
        jTextFieldCantidad1.setVisible(false);
        jTextFieldCantidad2.setVisible(false);
        jTextFieldCantidad3.setVisible(false);
        jTextFieldCantidad4.setVisible(false);
        jTextFieldCantidad5.setVisible(false);
        jTextFieldCantidad6.setVisible(false);
        jTextFieldCantidad0.setText("0");
        jTextFieldCantidad1.setText("0");
        jTextFieldCantidad2.setText("0");
        jTextFieldCantidad3.setText("0");
        jTextFieldCantidad4.setText("0");
        jTextFieldCantidad5.setText("0");
        jTextFieldCantidad6.setText("0");

        //REMOVE BUTTONS
        jButtonRemovePdto1.setVisible(false);
        jButtonRemovePdto2.setVisible(false);
        jButtonRemovePdto3.setVisible(false);
        jButtonRemovePdto4.setVisible(false);
        jButtonRemovePdto5.setVisible(false);
        jButtonRemovePdto6.setVisible(false);

        //VALORES PRODUCTOS
        jTextFieldValorPdto1.setVisible(false);
        jPaneValorPdto1.setVisible(false);
        jTextFieldValorPdto2.setVisible(false);
        jPaneValorPdto2.setVisible(false);
        jTextFieldValorPdto3.setVisible(false);
        jPaneValorPdto3.setVisible(false);
        jTextFieldValorPdto4.setVisible(false);
        jPaneValorPdto4.setVisible(false);
        jTextFieldValorPdto5.setVisible(false);
        jPaneValorPdto5.setVisible(false);
        jTextFieldValorPdto6.setVisible(false);
        jPaneValorPdto6.setVisible(false);

        //REINICIAR COMBOBOX
        jCmbCliente.setSelectedIndex(0);
        //REINICIO POR ITEM
        jCmbPTO0.setSelectedIndex(0);
        jCmbPTO1.setSelectedIndex(0);
        jCmbPTO2.setSelectedIndex(0);
        jCmbPTO3.setSelectedIndex(0);
        jCmbPTO4.setSelectedIndex(0);
        jCmbPTO5.setSelectedIndex(0);
        jCmbPTO6.setSelectedIndex(0);
        cantidadPdtoHabilitados = 1;

    }

    private void cargarDashBoardRegistrarPdto() {
        LocalDate fecha = LocalDate.now();
        cargarListaProductosPanelPdtos();
        jCmbListPdto.setSelectedIndex(0);
        jCmbProveedor.setSelectedIndex(0);
        jCmbListInversor.setSelectedIndex(0);
        jTextFieldDescripcion.setText("");
        jTextFieldCantidad.setText("0");
        jTextFieldPrecioAdquirido.setText("0");
        jButtonAbrirCalendario.setText(String.valueOf(fecha));
        jTextFieldPorcGanan.setText("15");
        jTextPrecioPublico.setText("0");
        jTextFieldNoFactura.setText("Sin numero");
    }

    private void cargarListaClientes() {
        //OBTENER CLIENTES REGISTRADOS
        List<Cliente> listaClientes = control.listaClientes;

        //LIMPIAR COMBO BOX
        jCmbCliente.removeAllItems(); 
        jCmbCliente2.removeAllItems();
        //RECORRER Y LLENAR COMBO BOX
        for (Cliente cliente : listaClientes) {
            String nombre = cliente.getNombre();
            jCmbCliente.addItem(nombre);
            jCmbCliente2.addItem(nombre);

        }
    }

    private void cargarListaProductos() {
        // Obtener los productos registrados
        List<Producto> listaProductos = control.listaProductos();
        Set<String> nombresUnicos = new HashSet<>(); // evita duplicados automáticamente

        // Limpiar combo boxes
        JComboBox[] combos = {jCmbPTO0, jCmbPTO1, jCmbPTO2, jCmbPTO3, jCmbPTO4, jCmbPTO5, jCmbPTO6};
        for (JComboBox combo : combos) {
            combo.removeAllItems();
        }

        // Recorrer y llenar combos
        for (Producto producto : listaProductos) {
            if (producto.getCantidad() > 0) {
                String nombre = producto.getNombreProducto();

                // solo agregar si no se ha agregado antes
                if (nombresUnicos.add(nombre)) {
                    for (JComboBox combo : combos) {
                        combo.addItem(nombre);
                    }
                }
            }
        }
    }

    private void cargarListaProductosPanelPdtos() {
        //OBTENER CLIENTES REGISTRADOS
        List<Producto> listaProductos = control.listaProductos();
        List<Proveedor> listaProveedor = control.listaProveedores();
        //LIMPIAR COMBO BOXS
        jCmbListPdto.removeAllItems();
        jCmbListInversor.removeAllItems();
        jCmbProveedor.removeAllItems();

        //RECORRER Y LLENAR COMBO BOX
        List<String> listaPdtos = new ArrayList<>();
        List<String> listaInversores = new ArrayList<>();
        List<String> listaProveedores = new ArrayList<>();
        for (Producto producto : listaProductos) {
            String nombreProducto = producto.getNombreProducto();
            String nombreInversor = producto.getInversor();
            if (listaPdtos.contains(nombreProducto)) {
                System.out.println("dice que ya tiene el producto " + nombreProducto);

            } else {
                listaPdtos.add(nombreProducto);
            }
            if (listaInversores.contains(nombreInversor)) {
                System.out.println("ya tiene el inversor " + nombreInversor);
            } else {
                listaInversores.add(nombreInversor);
            }

        }

        //LLENAR COMBO BOX PRODUCTO
        for (String item : listaPdtos) {
            jCmbListPdto.addItem(item);
        }
        //LLENAR COMBO BOX INVERSOR
        for (String item : listaInversores) {
            jCmbListInversor.addItem(item);
        }

        //LLENAR COMO BOX PROVEEDOR
        for (Proveedor proveedor : listaProveedor) {
            String nombreProveedor = proveedor.getNombreProveedor();
            if (listaProveedores.contains(nombreProveedor)) {

            } else {
                listaProveedores.add(nombreProveedor);
            }

        }
        //llenar despues del primer for
        for (String item : listaProveedores) {
            jCmbProveedor.addItem(item);
        }

    }

    public void abrirCalendario() {
        //abrir calendario

        Calendario calendario = new Calendario(this, fechaActual);
        calendario.setVisible(true);
        calendario.setLocationRelativeTo(null);
    }

    public void recibirFecha(LocalDate fecha) {
        System.out.println("se ha recibido la fecha " + fecha);
        this.fechaActual = fecha;
        jButtonAbrirCalendario.setText(String.valueOf(fecha));
    }

    void recibirFechaMes(LocalDate fecha) {
       System.out.println("se ha recibido la fecha " + fecha);
        this.fechaActual = fecha;
        jButtonAbrirCalendario1.setText(String.valueOf(fecha));
    }

}
