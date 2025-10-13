/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import logica.Controladora;
import model.Cliente;
import model.Producto;
import model.Proveedor;
import model.Venta;

public class MainUi extends javax.swing.JFrame {

    int mouseX, mouseY;
    private RegistrarNuevoPDTO nuevoPdtoUI;
    private int cantidadPdtoHabilitados = 1;
    private double valorTotal = 0.0;
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

        nuevoPdtoUI = new RegistrarNuevoPDTO();

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
        jPaneValorTotalPdtos = new javax.swing.JPanel();
        jTextValorTotal = new javax.swing.JLabel();
        jLabeSignoPeso = new javax.swing.JLabel();
        jLblCantPDTO11 = new javax.swing.JLabel();
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
        jPaneValorPdto = new javax.swing.JPanel();
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
        jRadioPagoContado = new javax.swing.JRadioButton();
        hiddenPagado = new javax.swing.JLabel();
        jPanelRegistrarPagos = new javax.swing.JPanel();
        jTitleRegVenta1 = new javax.swing.JLabel();
        jLblCliente1 = new javax.swing.JLabel();
        jCmbCliente1 = new javax.swing.JComboBox<>();
        jLblCantPDTO12 = new javax.swing.JLabel();
        jPaneValorTotalPdtos1 = new javax.swing.JPanel();
        jTextValorTotal1 = new javax.swing.JLabel();
        jLabeSignoPeso8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistroPagos = new javax.swing.JTable();
        jButtonCreateVenta1 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButtonCreateVenta6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButtonCreateVenta7 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanelRegistrarPDTO = new javax.swing.JPanel();
        jCheckBoxNuevoPdto = new javax.swing.JCheckBox();
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
        jCheckBoxNuevoPdto1 = new javax.swing.JCheckBox();
        jTextGananciaDeseada = new javax.swing.JLabel();
        jTextFieldPorcGanan = new javax.swing.JTextField();
        jLblCantPDTO15 = new javax.swing.JLabel();
        jTextPrecioPublico = new javax.swing.JTextField();
        jTextPdto1 = new javax.swing.JLabel();
        jCmbListInversor = new javax.swing.JComboBox<>();
        jLblPDTO9 = new javax.swing.JLabel();
        jTextFieldPrecioUnd1 = new javax.swing.JTextField();
        jPanelGanancias = new javax.swing.JPanel();
        jTitleRegVenta2 = new javax.swing.JLabel();
        jLblCantPDTO13 = new javax.swing.JLabel();
        jPaneValorTotalPdtos2 = new javax.swing.JPanel();
        jTextValorTotal2 = new javax.swing.JLabel();
        jLabeSignoPeso9 = new javax.swing.JLabel();
        jLblCliente2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRegistroPagos1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jButtonCreateVenta2 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jButtonCreateVenta8 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButtonCreateVenta9 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButtonCreateVenta3 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jButtonCreateVenta10 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButtonCreateVenta11 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanelComprasPendientes = new javax.swing.JPanel();
        jTitleRegVenta3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

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
        jLabel16.setText("Registrar Cliente");
        btnCrearCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 160, 40));

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
        jLabel31.setText("Registrar Venta");
        btnRegistrarVenta.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 160, 40));

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
        jLabel65.setText("Registrar Producto");
        btnRegistrarPdto.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 40));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregarProducto.png"))); // NOI18N
        jLabel66.setToolTipText("");
        btnRegistrarPdto.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPdto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(0, 344, Short.MAX_VALUE))
        );

        mainPanel.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 699));

        paneBanner.setBackground(new java.awt.Color(102, 72, 221));

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
                    .addComponent(jLabel7)
                    .addGroup(paneBannerLayout.createSequentialGroup()
                        .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneBannerLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(169, 169, 169)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6))
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
                            .addComponent(jLabel11))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        paneBannerLayout.setVerticalGroup(
            paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBannerLayout.createSequentialGroup()
                        .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(paneBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12)))
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(paneBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 67, 990, 70));

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

        jPanelRegistrarVenta.add(jButtonAddPdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 260, 30));

        jLblPDTO1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblPDTO1.setForeground(new java.awt.Color(0, 0, 0));
        jLblPDTO1.setText("Producto:");
        jPanelRegistrarVenta.add(jLblPDTO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jCmbPTO1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
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

        jPaneValorTotalPdtos.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorTotalPdtos.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorTotalPdtos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorTotal.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorTotal.setText("0");
        jPaneValorTotalPdtos.add(jTextValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, -1));

        jLabeSignoPeso.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso.setText("$");
        jPaneValorTotalPdtos.add(jLabeSignoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorTotalPdtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 140, 20));

        jLblCantPDTO11.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO11.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO11.setText("Valor Total");
        jPanelRegistrarVenta.add(jLblCantPDTO11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, 20));

        jCmbPTO0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 10)); // NOI18N
        jCmbPTO0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coca Cola 250ml", "Hit Personal Mora", "Hit Personal Mango", "Vive 100" }));
        jCmbPTO0.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCmbPTO0PropertyChange(evt);
            }
        });
        jPanelRegistrarVenta.add(jCmbPTO0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 190, -1));

        jTextFieldCantidad6.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad6.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad6.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad6.setText("0");
        jPanelRegistrarVenta.add(jTextFieldCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 100, -1));

        jTextFieldCantidad1.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad1.setText("0");
        jPanelRegistrarVenta.add(jTextFieldCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 100, -1));

        jTextFieldCantidad2.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad2.setText("0");
        jPanelRegistrarVenta.add(jTextFieldCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 100, -1));

        jTextFieldCantidad3.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad3.setText("0");
        jPanelRegistrarVenta.add(jTextFieldCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 100, -1));

        jTextFieldCantidad4.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad4.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad4.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad4.setText("0");
        jPanelRegistrarVenta.add(jTextFieldCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 100, -1));

        jTextFieldCantidad5.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad5.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad5.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad5.setText("0");
        jPanelRegistrarVenta.add(jTextFieldCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 100, -1));

        jTextFieldCantidad0.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldCantidad0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldCantidad0.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidad0.setText("0");
        jTextFieldCantidad0.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCantidad0FocusLost(evt);
            }
        });
        jTextFieldCantidad0.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextFieldCantidad0PropertyChange(evt);
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

        jPanelRegistrarVenta.add(jButtonCreateVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 260, 30));

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

        jPaneValorPdto.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorPdto.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorPdto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorPdto0.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorPdto0.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorPdto0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorPdto0.setText("0");
        jPaneValorPdto.add(jTextValorPdto0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        jLabeSignoPeso1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso1.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso1.setText("$");
        jPaneValorPdto.add(jLabeSignoPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelRegistrarVenta.add(jPaneValorPdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 120, 20));

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

        jRadioPagoContado.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jRadioPagoContado.setForeground(new java.awt.Color(0, 0, 0));
        jRadioPagoContado.setText("  SI");
        jRadioPagoContado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioPagoContado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioPagoContadoStateChanged(evt);
            }
        });
        jPanelRegistrarVenta.add(jRadioPagoContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 90, -1));

        hiddenPagado.setText("NO");
        jPanelRegistrarVenta.add(hiddenPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        mainTabbedPane.addTab("tab2", jPanelRegistrarVenta);

        jPanelRegistrarPagos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitleRegVenta1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jTitleRegVenta1.setForeground(new java.awt.Color(0, 0, 0));
        jTitleRegVenta1.setText("Registrar Pagos");
        jPanelRegistrarPagos.add(jTitleRegVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLblCliente1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCliente1.setForeground(new java.awt.Color(0, 0, 0));
        jLblCliente1.setText("Cliente");
        jPanelRegistrarPagos.add(jLblCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jCmbCliente1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jCmbCliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Todos", "Susy SST", "David Muñoz", "Ximena" }));
        jPanelRegistrarPagos.add(jCmbCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 210, -1));

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

        jPanelRegistrarPagos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, 950, 360));

        jButtonCreateVenta1.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta1MouseMoved(evt);
            }
        });
        jButtonCreateVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta1MouseExited(evt);
            }
        });
        jButtonCreateVenta1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("CONSULTAR PAGOS PENDIENTES");
        jButtonCreateVenta1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

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

        jButtonCreateVenta1.add(jButtonCreateVenta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jPanelRegistrarPagos.add(jButtonCreateVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 380, 30));

        mainTabbedPane.addTab("tab4", jPanelRegistrarPagos);

        jPanelRegistrarPDTO.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarPDTO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxNuevoPdto.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jCheckBoxNuevoPdto.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxNuevoPdto.setText(" Nuevo Proveedor?");
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
        jCheckBoxNuevoPdto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNuevoPdtoActionPerformed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jCheckBoxNuevoPdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

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
        jPanelRegistrarPDTO.add(jTextFieldNoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 190, -1));

        jCheckBoxNuevoPdto1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jCheckBoxNuevoPdto1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxNuevoPdto1.setText(" Nuevo Producto?");
        jCheckBoxNuevoPdto1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCheckBoxNuevoPdto1MouseMoved(evt);
            }
        });
        jCheckBoxNuevoPdto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxNuevoPdto1MouseExited(evt);
            }
        });
        jCheckBoxNuevoPdto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNuevoPdto1ActionPerformed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jCheckBoxNuevoPdto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextGananciaDeseada.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jTextGananciaDeseada.setForeground(new java.awt.Color(0, 0, 0));
        jTextGananciaDeseada.setText("% Ganancia deseada");
        jPanelRegistrarPDTO.add(jTextGananciaDeseada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 20));

        jTextFieldPorcGanan.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldPorcGanan.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldPorcGanan.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPorcGanan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPorcGanan.setText("15");
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

        jTextFieldPrecioUnd1.setEditable(false);
        jTextFieldPrecioUnd1.setBackground(new java.awt.Color(54, 33, 89));
        jTextFieldPrecioUnd1.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 14)); // NOI18N
        jTextFieldPrecioUnd1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPrecioUnd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrecioUnd1.setText("0");
        jTextFieldPrecioUnd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioUnd1ActionPerformed(evt);
            }
        });
        jPanelRegistrarPDTO.add(jTextFieldPrecioUnd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 180, -1));

        mainTabbedPane.addTab("tab3", jPanelRegistrarPDTO);

        jPanelGanancias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitleRegVenta2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jTitleRegVenta2.setForeground(new java.awt.Color(0, 0, 0));
        jTitleRegVenta2.setText("Consultar Ganancias");
        jPanelGanancias.add(jTitleRegVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLblCantPDTO13.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCantPDTO13.setForeground(new java.awt.Color(0, 0, 0));
        jLblCantPDTO13.setText("Ganancia Total");
        jPanelGanancias.add(jLblCantPDTO13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 20));

        jPaneValorTotalPdtos2.setBackground(new java.awt.Color(54, 33, 89));
        jPaneValorTotalPdtos2.setForeground(new java.awt.Color(255, 255, 255));
        jPaneValorTotalPdtos2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextValorTotal2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jTextValorTotal2.setForeground(new java.awt.Color(255, 255, 255));
        jTextValorTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextValorTotal2.setText("0");
        jPaneValorTotalPdtos2.add(jTextValorTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, -1));

        jLabeSignoPeso9.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 12)); // NOI18N
        jLabeSignoPeso9.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSignoPeso9.setText("$");
        jPaneValorTotalPdtos2.add(jLabeSignoPeso9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 12, -1));

        jPanelGanancias.add(jPaneValorTotalPdtos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 140, 20));

        jLblCliente2.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 0, 18)); // NOI18N
        jLblCliente2.setForeground(new java.awt.Color(0, 0, 0));
        jLblCliente2.setText("Fecha");
        jPanelGanancias.add(jLblCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jTableRegistroPagos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableRegistroPagos1);

        jPanelGanancias.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, 950, 360));

        jLabel15.setText("AGREGAR CALENDARIO");
        jPanelGanancias.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jButtonCreateVenta2.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta2MouseMoved(evt);
            }
        });
        jButtonCreateVenta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta2MouseExited(evt);
            }
        });
        jButtonCreateVenta2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("EXPORTAR EXCEL");
        jButtonCreateVenta2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jButtonCreateVenta8.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta8MouseMoved(evt);
            }
        });
        jButtonCreateVenta8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta8MouseExited(evt);
            }
        });
        jButtonCreateVenta8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("REGISTRAR VENTA");
        jButtonCreateVenta8.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta9.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta9MouseMoved(evt);
            }
        });
        jButtonCreateVenta9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta9MouseExited(evt);
            }
        });
        jButtonCreateVenta9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("REGISTRAR VENTA");
        jButtonCreateVenta9.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta9.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 31, 24));

        jButtonCreateVenta8.add(jButtonCreateVenta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jButtonCreateVenta2.add(jButtonCreateVenta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 31, 24));

        jPanelGanancias.add(jButtonCreateVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, 30));

        jButtonCreateVenta3.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCreateVenta3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta3MouseMoved(evt);
            }
        });
        jButtonCreateVenta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCreateVenta3MouseExited(evt);
            }
        });
        jButtonCreateVenta3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("CONSULTAR GANANCIAS");
        jButtonCreateVenta3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

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

        jButtonCreateVenta3.add(jButtonCreateVenta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 30));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/agregar-usuario.png"))); // NOI18N
        jButtonCreateVenta3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 31, 24));

        jPanelGanancias.add(jButtonCreateVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 300, 30));

        jLabel62.setText("consulta sql donde producto este diferente a fiado");
        jPanelGanancias.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        mainTabbedPane.addTab("tab5", jPanelGanancias);

        jPanelComprasPendientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitleRegVenta3.setFont(new java.awt.Font("Ricardo ALT ExtraBold", 1, 24)); // NOI18N
        jTitleRegVenta3.setForeground(new java.awt.Color(0, 0, 0));
        jTitleRegVenta3.setText("Compras Pendientes");
        jPanelComprasPendientes.add(jTitleRegVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel30.setText("VALIDAR SI MEJOR UNA TABLA DE CONSULTA SQL CON PRODUCTO DONDE SEA 0");
        jPanelComprasPendientes.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 20));

        jLabel32.setText("NO ME COMPLICO SERA UNA CONSULTA SQL QUE ARROJE ESE RESULTADO DE PRODUCTOS DE LA TABLA DE CONSULTA DONDE PRODUCTO SEA IGUAL A CERO");
        jPanelComprasPendientes.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        mainTabbedPane.addTab("tab6", jPanelComprasPendientes);

        mainPanel.add(mainTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 980, 560));

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

    private void btnCrearClienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearClienteMouseMoved

        btnCrearCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCrearCliente.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_btnCrearClienteMouseMoved

    private void btnCrearClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearClienteMouseExited
        btnCrearCliente.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCrearCliente.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btnCrearClienteMouseExited

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
                JOptionPane.showMessageDialog(null, "Cliente Creado!");
                int cantidadUsuarios = Integer.parseInt(String.valueOf(control.listaClientes.size()));
                SwingUtilities.invokeLater(() ->
                {jLabelUsuariosCreados.setText(String.valueOf(cantidadUsuarios+1));
                });

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al crear usuario:" + ex);
            }
        }


    }//GEN-LAST:event_jButtonCreateUserMouseClicked

    private void jButtonCreateUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateUserMouseMoved

        jButtonCreateUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButtonCreateUser.setBackground(new Color(146, 118, 193));
    }//GEN-LAST:event_jButtonCreateUserMouseMoved

    private void jButtonCreateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateUserMouseExited

        jButtonCreateUser.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        jButtonCreateUser.setBackground(new Color(54, 33, 89));

    }//GEN-LAST:event_jButtonCreateUserMouseExited

    private void jTextNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNombreMouseClicked
        jTextNombre.setText("");

    }//GEN-LAST:event_jTextNombreMouseClicked

    private void jButtonAddPdtoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddPdtoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddPdtoMouseMoved

    private void jButtonAddPdtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddPdtoMouseClicked
        //DEBE AGREGAR PRODUTOS NUEVO A LA COMPRA

        cantidadPdtoHabilitados++;
        System.out.println("cantidad habilitados " + cantidadPdtoHabilitados);

        switch (cantidadPdtoHabilitados) {
            //habilita segundo pdto
            case 2:
                if (cantidadPdtoHabilitados == 2) {
                    jButtonRemovePdto1.setVisible(true);
                    jLblPDTO1.setVisible(true);
                    jCmbPTO1.setVisible(true);
                    jLblCantPDTO1.setVisible(true);
                    jTextFieldCantidad1.setVisible(true);
                    jTextFieldCantidad1.setForeground(new Color(255, 255, 255));
                    jTextFieldValorPdto1.setVisible(true);
                    jPaneValorPdto1.setVisible(true);
                    valorTotal = valorTotal + Double.parseDouble(jTextValorPdto1.getText());
                    jTextValorTotal.setText(String.valueOf(valorTotal));
                    cantidadPdtoHabilitados = 2;

                }
                break;

            case 3:
                ////habilita tercer pdto
            if (cantidadPdtoHabilitados == 3) {
                    jButtonRemovePdto2.setVisible(true);
                    jLblPDTO2.setVisible(true);
                    jCmbPTO2.setVisible(true);
                    jLblCantPDTO2.setVisible(true);
                    jTextFieldCantidad2.setVisible(true);
                    jTextFieldCantidad2.setForeground(new Color(255, 255, 255));
                    jTextFieldValorPdto2.setVisible(true);
                    jPaneValorPdto2.setVisible(true);
                    valorTotal = valorTotal + Double.parseDouble(jTextValorPdto2.getText());
                    jTextValorTotal.setText(String.valueOf(valorTotal));
                    cantidadPdtoHabilitados = 3;
                }
                break;

            case 4:
                //habilita cuarto pdto
                if (cantidadPdtoHabilitados == 4) {
                    jButtonRemovePdto3.setVisible(true);
                    jLblPDTO3.setVisible(true);
                    jCmbPTO3.setVisible(true);
                    jLblCantPDTO3.setVisible(true);
                    jTextFieldCantidad3.setVisible(true);
                    jTextFieldCantidad3.setForeground(new Color(255, 255, 255));
                    jTextFieldValorPdto3.setVisible(true);
                    jPaneValorPdto3.setVisible(true);
                    valorTotal = valorTotal + Double.parseDouble(jTextValorPdto3.getText());
                    jTextValorTotal.setText(String.valueOf(valorTotal));
                    cantidadPdtoHabilitados = 4;
                }
                break;

            case 5:
                //habilita cuarto pdto
                if (cantidadPdtoHabilitados == 5) {
                    jButtonRemovePdto4.setVisible(true);
                    jLblPDTO4.setVisible(true);
                    jCmbPTO4.setVisible(true);
                    jLblCantPDTO4.setVisible(true);
                    jTextFieldCantidad4.setVisible(true);
                    jTextFieldCantidad4.setForeground(new Color(255, 255, 255));
                    jTextFieldValorPdto4.setVisible(true);
                    jPaneValorPdto4.setVisible(true);
                    valorTotal = valorTotal + Double.parseDouble(jTextValorPdto4.getText());
                    jTextValorTotal.setText(String.valueOf(valorTotal));
                    cantidadPdtoHabilitados = 5;
                }
                break;

            case 6:
                //habilita cuarto pdto
                if (cantidadPdtoHabilitados == 6) {
                    jButtonRemovePdto5.setVisible(true);
                    jLblPDTO5.setVisible(true);
                    jCmbPTO5.setVisible(true);
                    jLblCantPDTO5.setVisible(true);
                    jTextFieldCantidad5.setVisible(true);
                    jTextFieldCantidad5.setForeground(new Color(255, 255, 255));
                    jTextFieldValorPdto5.setVisible(true);
                    jPaneValorPdto5.setVisible(true);
                    valorTotal = valorTotal + Double.parseDouble(jTextValorPdto5.getText());
                    jTextValorTotal.setText(String.valueOf(valorTotal));
                    cantidadPdtoHabilitados = 6;
                }
                break;

            case 7:
                //habilita cuarto pdto
                if (cantidadPdtoHabilitados == 7) {
                    jButtonRemovePdto6.setVisible(true);
                    jLblPDTO6.setVisible(true);
                    jCmbPTO6.setVisible(true);
                    jLblCantPDTO6.setVisible(true);
                    jTextFieldCantidad6.setVisible(true);
                    jTextFieldCantidad6.setForeground(new Color(255, 255, 255));
                    jTextFieldValorPdto6.setVisible(true);
                    jPaneValorPdto6.setVisible(true);
                    valorTotal = valorTotal + Double.parseDouble(jTextValorPdto6.getText());
                    jTextValorTotal.setText(String.valueOf(valorTotal));
                    cantidadPdtoHabilitados = 7;
                }
                break;

            default:
                // Ya están todos habilitados
                if (cantidadPdtoHabilitados > 7) {
                    cantidadPdtoHabilitados--;
                }
                JOptionPane.showMessageDialog(null, "Ya has registrado todos los productos, ingresa la venta y adiciona nuevos.");
                System.out.println("cantidadPdtoHabilitados" + cantidadPdtoHabilitados);
                break;
        }

    }//GEN-LAST:event_jButtonAddPdtoMouseClicked

    private void jButtonAddPdtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddPdtoMouseExited

        jCheckBoxNuevoPdto.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        jCheckBoxNuevoPdto.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButtonAddPdtoMouseExited

    //VISUAL DE REGISTRO PRODUTOS

    private void jCheckBoxNuevoPdtoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdtoMouseMoved
        // TODO add your handling code here:
        jCheckBoxNuevoPdto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jCheckBoxNuevoPdto.setBackground(new Color(146, 118, 193));

    }//GEN-LAST:event_jCheckBoxNuevoPdtoMouseMoved

    private void jCheckBoxNuevoPdtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdtoActionPerformed
        if (jCheckBoxNuevoPdto.isSelected()) {
            //logica ventana nueva
            nuevoPdtoUI.setVisible(true);
            nuevoPdtoUI.setLocationRelativeTo(null);
        } else {
            //debe cerrar la ventana nueva

            System.out.println("cmb en false");
        }
    }//GEN-LAST:event_jCheckBoxNuevoPdtoActionPerformed

    private void jCheckBoxNuevoPdtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdtoMouseExited
        jCheckBoxNuevoPdto.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        jCheckBoxNuevoPdto.setBackground(new Color(255, 255, 255));
        jCheckBoxNuevoPdto.setForeground(new Color(60, 83, 65));


    }//GEN-LAST:event_jCheckBoxNuevoPdtoMouseExited

    private void panelCierreAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreAppMouseClicked
        int confirmacion = JOptionPane.showConfirmDialog(this, "Deseas salir del sistema?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_panelCierreAppMouseClicked

    private void jButtonCreatePdtosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreatePdtosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreatePdtosMouseMoved

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
            jButtonAbrirCalendario.setText(String.valueOf(precioPorUnidad));

            nuevoProducto.setNumeroFactura(jTextFieldNoFactura.getText());
            nuevoProducto.setInversor(String.valueOf(jCmbListInversor.getSelectedItem()));

            // Convertir porcentaje de ganancia a decimal
            double ganancia = Double.parseDouble(jTextFieldPorcGanan.getText()) / 100;
            nuevoProducto.setGananciaDeseada(ganancia);

            // Precio público
            double precioPublico = precioPorUnidad + (precioPorUnidad * ganancia);
            nuevoProducto.setPrecioPublico(precioPublico);
            jTextPrecioPublico.setText(String.valueOf(precioPublico));

            // Obtener proveedor
            Proveedor proveedor = control.traerProveedor(1); // Asegúrate que el proveedor con ID 1 exista
            if (proveedor == null) {
                JOptionPane.showMessageDialog(null, "Error: El proveedor con ID 1 no fue encontrado.");
                return;
            }

            // Asignar proveedor al producto
            nuevoProducto.setProveedor(proveedor);
            nuevoProducto.setFechaCompraProducto(LocalDate.of(2025, 1, 1));

            // Registrar el producto
            control.registrarProducto(nuevoProducto);
            JOptionPane.showMessageDialog(null, "Producto registrado con éxito.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato numérico. Verifica los campos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar producto: " + ex.getMessage());
            ex.printStackTrace();
        }

        cargarDashBoardRegistrarPdto();


    }//GEN-LAST:event_jButtonCreatePdtosMouseClicked

    private void jButtonCreatePdtosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreatePdtosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreatePdtosMouseExited

    private void jCheckBoxNuevoPdto1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdto1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNuevoPdto1MouseMoved

    private void jCheckBoxNuevoPdto1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdto1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNuevoPdto1MouseExited

    private void jCheckBoxNuevoPdto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoPdto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNuevoPdto1ActionPerformed

    private void jButtonAbrirCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirCalendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirCalendarioActionPerformed

    private void jButtonCreateVenta5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta5MouseMoved

    private void jButtonCreateVenta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta5MouseClicked

    private void jButtonCreateVenta5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta5MouseExited

    private void jButtonCreateVenta4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta4MouseMoved

    private void jButtonCreateVenta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta4MouseClicked

    private void jButtonCreateVenta4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta4MouseExited

    private void jButtonCreateVentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVentaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVentaMouseMoved

    private void jButtonCreateVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVentaMouseClicked
        //LOGICA CREACION VENTA
        //obtenerCliente

        Cliente cliente = new Cliente();
        String nameClient=control.traerNombreCliente(0);
        cliente= control.traerCliente(Integer.valueOf(nameClient));
        List<Venta> listaVentasCliente = new ArrayList<>();
        String formaPago = "FIADO";
        if (!hiddenPagado.equals("NO")) {
            formaPago = jRadioPagoContado.getText();
        }
        Venta ventas1 = new Venta();
        ventas1.setCliente(cliente);
        ventas1.setProducto(String.valueOf(jCmbPTO0.getSelectedItem()));
        ventas1.setCantidad((Integer.parseInt(jTextFieldCantidad0.getText())));
        ventas1.setFormaPago(formaPago);
        ventas1.setFechaPago(LocalDate.now());
        ventas1.setEstado("Fiado");
        ventas1.setObservacion("sin comentario 1");
        ventas1.setCliente(cliente);
        ventas1.setValor(Double.parseDouble(jTextValorTotal.getText()));
        //VENTAS2
        Venta ventas2 = new Venta();
        ventas2.setCliente(cliente);
        ventas2.setProducto(String.valueOf(jCmbPTO1.getSelectedItem()));
        ventas2.setCantidad((Integer.parseInt(jTextFieldCantidad1.getText())));
        ventas2.setFormaPago(formaPago);
        ventas2.setFechaPago(LocalDate.now());
        ventas2.setEstado("Fiado");
        ventas2.setObservacion("sin comentario 2");
        ventas2.setCliente(cliente);
        ventas2.setValor(Double.parseDouble(jTextValorTotal.getText()));
        //VENTAS 3
        Venta ventas3 = new Venta();
        ventas3.setCliente(cliente);
        ventas3.setProducto(String.valueOf(jCmbPTO2.getSelectedItem()));
        ventas3.setCantidad((Integer.parseInt(jTextFieldCantidad2.getText())));
        ventas3.setValor(Double.valueOf(String.valueOf(jTextValorTotal.getText())));
        ventas3.setFormaPago(formaPago);
        ventas3.setFechaPago(LocalDate.now());
        ventas3.setEstado("Fiado");
        ventas3.setObservacion("sin comentario 3");
        //VENTAS 4
        Venta ventas4 = new Venta();
        ventas4.setCliente(cliente);
        ventas4.setProducto(String.valueOf(jCmbPTO3.getSelectedItem()));
        ventas4.setCantidad((Integer.parseInt(jTextFieldCantidad3.getText())));
        ventas4.setValor(Double.valueOf(String.valueOf(jTextValorTotal.getText())));
        ventas4.setFormaPago(formaPago);
        ventas4.setFechaPago(LocalDate.now());
        ventas4.setEstado("Fiado");
        ventas4.setObservacion("sin comentario 4");
        //VENTAS 5
        Venta ventas5 = new Venta();
        ventas5.setCliente(cliente);
        ventas5.setProducto(String.valueOf(jCmbPTO4.getSelectedItem()));
        ventas5.setCantidad((Integer.parseInt(jTextFieldCantidad4.getText())));
        ventas5.setValor(Double.valueOf(String.valueOf(jTextValorTotal.getText())));
        ventas5.setFormaPago(formaPago);
        ventas5.setFechaPago(LocalDate.now());
        ventas5.setEstado("Fiado");
        ventas5.setObservacion("sin comentario 5");
        //VENTAS 6
        Venta ventas6 = new Venta();
        ventas6.setCliente(cliente);
        ventas6.setProducto(String.valueOf(jCmbPTO5.getSelectedItem()));
        ventas6.setCantidad((Integer.parseInt(jTextFieldCantidad5.getText())));
        ventas6.setValor(Double.valueOf(String.valueOf(jTextValorTotal.getText())));
        ventas6.setFormaPago(formaPago);
        ventas6.setFechaPago(LocalDate.now());
        ventas6.setEstado("Fiado");
        ventas6.setObservacion("sin comentario 6");
        //VENTAS 7
        Venta ventas7 = new Venta();
        ventas7.setCliente(cliente);
        ventas7.setProducto(String.valueOf(jCmbPTO6.getSelectedItem()));
        ventas7.setCantidad((Integer.parseInt(jTextFieldCantidad6.getText())));
        ventas7.setValor(Double.valueOf(String.valueOf(jTextValorTotal.getText())));
        ventas7.setFormaPago(formaPago);
        ventas7.setFechaPago(LocalDate.now());
        ventas7.setEstado("Fiado");
        ventas7.setObservacion("sin comentario 7");

        switch (cantidadPdtoHabilitados) {
            case 1:

                control.crearVenta(ventas1);
                System.out.println("creo una sola venta!");

                //ACA FALTA LA LOGICA PARA QUE REDUZCA CANTIDAD SEGUN NOMBRE PRODUCTO EN LA TABLA PRODUCTO
                break;

            //A PARTIR DE ACA AÑADIR A LISTA
            case 2:
                //obtenerVenta1
                listaVentasCliente.add(ventas1);

                listaVentasCliente.add(ventas2);
                //REGISTRAR VENTA 3        

                listaVentasCliente.add(ventas3);
                break;

            case 3:
                listaVentasCliente.add(ventas1);
                listaVentasCliente.add(ventas2);
                //REGISTRAR VENTA 2   

                listaVentasCliente.add(ventas3);
                break;

            case 4:
                listaVentasCliente.add(ventas1);
                listaVentasCliente.add(ventas2);
                listaVentasCliente.add(ventas3);

                listaVentasCliente.add(ventas4);
                break;

            case 5:

                listaVentasCliente.add(ventas1);
                listaVentasCliente.add(ventas2);
                listaVentasCliente.add(ventas3);
                listaVentasCliente.add(ventas4);

                //nuevoRegistro
                listaVentasCliente.add(ventas5);
                break;

            case 6:
                listaVentasCliente.add(ventas1);
                listaVentasCliente.add(ventas2);
                listaVentasCliente.add(ventas3);
                listaVentasCliente.add(ventas4);
                listaVentasCliente.add(ventas5);

                //nuevo registro
                listaVentasCliente.add(ventas6);

                break;
            case 7:
                listaVentasCliente.add(ventas1);
                listaVentasCliente.add(ventas2);
                listaVentasCliente.add(ventas3);
                listaVentasCliente.add(ventas4);
                listaVentasCliente.add(ventas5);
                listaVentasCliente.add(ventas6);

                listaVentasCliente.add(ventas7);
                break;

        }

        if (listaVentasCliente.size() >= 2) {
            System.out.println("tiene mas de un producto a registrar");

            //LOGICA REGISTRO VARIOS PRODUCTOS
            for (Venta venta : listaVentasCliente) {

                System.out.println("la lista vino con size de " + listaVentasCliente.size());
                control.crearVenta(venta);
                System.out.println("removio producto");
            }

        }
        listaVentasCliente.clear();
        System.out.println("nuevo tamaño lista " + listaVentasCliente.size());
        cargarDashBoardVentas();


    }//GEN-LAST:event_jButtonCreateVentaMouseClicked

    private void jButtonCreateVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVentaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVentaMouseExited

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

    private void jButtonCreateVenta7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta7MouseMoved

    private void jButtonCreateVenta7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta7MouseClicked

    private void jButtonCreateVenta7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta7MouseExited

    private void jButtonCreateVenta6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta6MouseMoved

    private void jButtonCreateVenta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta6MouseClicked

    private void jButtonCreateVenta6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta6MouseExited

    private void jButtonCreateVenta1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta1MouseMoved

    private void jButtonCreateVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta1MouseClicked

    private void jButtonCreateVenta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta1MouseExited

    private void jButtonCreateVenta9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta9MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta9MouseMoved

    private void jButtonCreateVenta9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta9MouseClicked

    private void jButtonCreateVenta9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta9MouseExited

    private void jButtonCreateVenta8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta8MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta8MouseMoved

    private void jButtonCreateVenta8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta8MouseClicked

    private void jButtonCreateVenta8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta8MouseExited

    private void jButtonCreateVenta2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta2MouseMoved

    private void jButtonCreateVenta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta2MouseClicked

    private void jButtonCreateVenta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta2MouseExited

    private void jButtonCreateVenta11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta11MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta11MouseMoved

    private void jButtonCreateVenta11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta11MouseClicked

    private void jButtonCreateVenta11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta11MouseExited

    private void jButtonCreateVenta10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta10MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta10MouseMoved

    private void jButtonCreateVenta10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta10MouseClicked

    private void jButtonCreateVenta10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta10MouseExited

    private void jButtonCreateVenta3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta3MouseMoved

    private void jButtonCreateVenta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta3MouseClicked

    private void jButtonCreateVenta3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateVenta3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateVenta3MouseExited

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

    private void jTextFieldPrecioUnd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioUnd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioUnd1ActionPerformed

    private void jRadioPagoContadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioPagoContadoStateChanged
        if (jRadioPagoContado.isSelected()) {
            Calendario calendario = new Calendario();
            calendario.setVisible(true);
            calendario.setLocationRelativeTo(this);
            hiddenPagado.setText(String.valueOf(calendario.devolverFecha()));
        }

    }//GEN-LAST:event_jRadioPagoContadoStateChanged

    private void jCmbPTO0PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCmbPTO0PropertyChange
        System.out.println("cambio de valor ");

        jTextValorPdto0.setText("25200");


    }//GEN-LAST:event_jCmbPTO0PropertyChange

    private void jTextFieldCantidad0PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextFieldCantidad0PropertyChange


    }//GEN-LAST:event_jTextFieldCantidad0PropertyChange

    private void jTextFieldCantidad0FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCantidad0FocusLost
        int cantidad = Integer.parseInt(jTextFieldCantidad0.getText());
        double valorPdto = Double.parseDouble(jTextValorPdto0.getText());

        Double valorTotalVenta = cantidad * valorPdto;

        jTextValorTotal.setText(String.valueOf(valorTotalVenta));
    }//GEN-LAST:event_jTextFieldCantidad0FocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCrearCliente;
    private javax.swing.JPanel btnRegistrarPdto;
    private javax.swing.JPanel btnRegistrarVenta;
    private javax.swing.JLabel hiddenPagado;
    private javax.swing.JTextField jButtonAbrirCalendario;
    private javax.swing.JPanel jButtonAddPdto;
    private javax.swing.JPanel jButtonCreatePdtos;
    private javax.swing.JPanel jButtonCreateUser;
    private javax.swing.JPanel jButtonCreateVenta;
    private javax.swing.JPanel jButtonCreateVenta1;
    private javax.swing.JPanel jButtonCreateVenta10;
    private javax.swing.JPanel jButtonCreateVenta11;
    private javax.swing.JPanel jButtonCreateVenta2;
    private javax.swing.JPanel jButtonCreateVenta3;
    private javax.swing.JPanel jButtonCreateVenta4;
    private javax.swing.JPanel jButtonCreateVenta5;
    private javax.swing.JPanel jButtonCreateVenta6;
    private javax.swing.JPanel jButtonCreateVenta7;
    private javax.swing.JPanel jButtonCreateVenta8;
    private javax.swing.JPanel jButtonCreateVenta9;
    private javax.swing.JLabel jButtonRemovePdto1;
    private javax.swing.JLabel jButtonRemovePdto2;
    private javax.swing.JLabel jButtonRemovePdto3;
    private javax.swing.JLabel jButtonRemovePdto4;
    private javax.swing.JLabel jButtonRemovePdto5;
    private javax.swing.JLabel jButtonRemovePdto6;
    private javax.swing.JCheckBox jCheckBoxNuevoPdto;
    private javax.swing.JCheckBox jCheckBoxNuevoPdto1;
    private javax.swing.JComboBox<String> jCmbCliente;
    private javax.swing.JComboBox<String> jCmbCliente1;
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
    private javax.swing.JLabel jLabeSignoPeso;
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
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUsuariosCreados;
    private javax.swing.JLabel jLblCantPDTO0;
    private javax.swing.JLabel jLblCantPDTO1;
    private javax.swing.JLabel jLblCantPDTO11;
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
    private javax.swing.JLabel jLblPDTO0;
    private javax.swing.JLabel jLblPDTO1;
    private javax.swing.JLabel jLblPDTO2;
    private javax.swing.JLabel jLblPDTO3;
    private javax.swing.JLabel jLblPDTO4;
    private javax.swing.JLabel jLblPDTO5;
    private javax.swing.JLabel jLblPDTO6;
    private javax.swing.JLabel jLblPDTO8;
    private javax.swing.JLabel jLblPDTO9;
    private javax.swing.JPanel jPaneValorPdto;
    private javax.swing.JPanel jPaneValorPdto1;
    private javax.swing.JPanel jPaneValorPdto2;
    private javax.swing.JPanel jPaneValorPdto3;
    private javax.swing.JPanel jPaneValorPdto4;
    private javax.swing.JPanel jPaneValorPdto5;
    private javax.swing.JPanel jPaneValorPdto6;
    private javax.swing.JPanel jPaneValorTotalPdtos;
    private javax.swing.JPanel jPaneValorTotalPdtos1;
    private javax.swing.JPanel jPaneValorTotalPdtos2;
    private javax.swing.JPanel jPanelComprasPendientes;
    private javax.swing.JPanel jPanelCrearCliente;
    private javax.swing.JPanel jPanelGanancias;
    private javax.swing.JPanel jPanelInternoRPTO;
    private javax.swing.JPanel jPanelRegistrarPDTO;
    private javax.swing.JPanel jPanelRegistrarPagos;
    private javax.swing.JPanel jPanelRegistrarVenta;
    private javax.swing.JRadioButton jRadioPagoContado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRegistroPagos;
    private javax.swing.JTable jTableRegistroPagos1;
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
    private javax.swing.JTextField jTextFieldPrecioUnd1;
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
    private javax.swing.JLabel jTextValorTotal;
    private javax.swing.JLabel jTextValorTotal1;
    private javax.swing.JLabel jTextValorTotal2;
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
        //OCULTO POR DEFECTO HASTA ADICIONAR PDTO
        //TEXTFIELD
        hiddenPagado.setVisible(false);
        jCmbPTO1.setVisible(false);
        jLblPDTO1.setVisible(false);
        jLblPDTO2.setVisible(false);
        jLblPDTO3.setVisible(false);
        jLblPDTO4.setVisible(false);
        jLblPDTO5.setVisible(false);
        jLblPDTO6.setVisible(false);

        //COMBOBOX
        jCmbPTO1.setVisible(false);
        jCmbPTO1.setVisible(false);
        jCmbPTO2.setVisible(false);
        jCmbPTO3.setVisible(false);
        jCmbPTO4.setVisible(false);
        jCmbPTO5.setVisible(false);
        jCmbPTO6.setVisible(false);
        if (jRadioPagoContado.isSelected()) {
            jRadioPagoContado.setEnabled(true);
        }

        //JPANEL CANTIDAD
        jLblCantPDTO1.setVisible(false);
        jLblCantPDTO2.setVisible(false);
        jLblCantPDTO3.setVisible(false);
        jLblCantPDTO4.setVisible(false);
        jLblCantPDTO4.setVisible(false);
        jLblCantPDTO5.setVisible(false);
        jLblCantPDTO6.setVisible(false);

        //JTEXT FIELDS 
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
        cargarListaProductosPanelPdtos();
        jCmbListPdto.setSelectedIndex(0);
        jCmbProveedor.setSelectedIndex(0);
        jCmbListInversor.setSelectedIndex(0);
        jTextFieldDescripcion.setText("");
        jTextFieldCantidad.setText("0");
        jTextFieldPrecioAdquirido.setText("0");
        jButtonAbrirCalendario.setText("0");
        jTextFieldPorcGanan.setText("15");
        jTextPrecioPublico.setText("0");
        jTextFieldNoFactura.setText("Sin numero");
    }

    private void cargarListaClientes() {
        //OBTENER CLIENTES REGISTRADOS
        List<Cliente> listaClientes = control.listaClientes;

        //LIMPIAR COMBO BOX
        jCmbCliente.removeAllItems();

        //RECORRER Y LLENAR COMBO BOX
        for (Cliente cliente : listaClientes) {
            String nombre = cliente.getNombre();
            jCmbCliente.addItem(nombre);

        }
    }

    private void cargarListaProductos() {
        //OBTENER CLIENTES REGISTRADOS
        List<Producto> listaProductos = control.listaProductos();

        //LIMPIAR COMBO BOXS
        jCmbPTO0.removeAllItems();

        //RECORRER Y LLENAR COMBO BOX
        for (Producto producto : listaProductos) {
            String nombre = producto.getNombreProducto();
            if (producto.getCantidad() > 0) {
                jCmbPTO0.addItem(nombre);
                jCmbPTO1.addItem(nombre);
                jCmbPTO2.addItem(nombre);
                jCmbPTO3.addItem(nombre);
                jCmbPTO4.addItem(nombre);
                jCmbPTO5.addItem(nombre);
                jCmbPTO6.addItem(nombre);
                ;
            }

        }
    }

    private void cargarListaProductosPanelPdtos() {
        //OBTENER CLIENTES REGISTRADOS
        List<Producto> listaProductos = control.listaProductos();

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
            String nombreProveedor = producto.getProveedor().getNombreProveedor();
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

            if (listaProveedores.contains(nombreProveedor)) {
                System.out.println("dice que ya tiene el proveedor " + nombreProveedor);
            } else {
                listaProveedores.add(nombreProveedor);
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
        for (String item : listaProveedores) {
            jCmbProveedor.addItem(item);
        }

    }

}
