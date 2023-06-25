
package fatec.poo.view;

import fatec.poo.control.*;
import fatec.poo.model.*;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GuiEmitirPedido extends javax.swing.JFrame {
    public GuiEmitirPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        btnConsultarPedido = new javax.swing.JButton();
        ftxtDataPedido = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        rdbAPrazo = new javax.swing.JRadioButton();
        rdbAVista = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ftxtCpfCliente = new javax.swing.JFormattedTextField();
        btnConsultarCliente = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ftxtCpfVendedor = new javax.swing.JFormattedTextField();
        btnConsultarVendedor = new javax.swing.JButton();
        txtVendedor = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        btnConsultarProduto = new javax.swing.JButton();
        txtProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQtdeVendida = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnRemItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtValTot = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQtdeItens = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setName("jFrameCadastroCliente"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel1.setText("Numero do pedido:");

        btnConsultarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPedidoActionPerformed(evt);
            }
        });

        try {
            ftxtDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataPedido.setEnabled(false);
        ftxtDataPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ftxtDataPedidoKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de pagamento"));

        buttonGroup1.add(rdbAPrazo);
        rdbAPrazo.setText("A prazo");
        rdbAPrazo.setEnabled(false);

        buttonGroup1.add(rdbAVista);
        rdbAVista.setText("A vista");
        rdbAVista.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbAVista)
                .addGap(18, 18, 18)
                .addComponent(rdbAPrazo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbAPrazo)
                    .addComponent(rdbAVista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Data do pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ftxtDataPedido))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnConsultarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do cliente"));

        jLabel3.setText("CPF Cliente:");

        try {
            ftxtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpfCliente.setEnabled(false);

        btnConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarCliente.setEnabled(false);
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        txtCliente.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(ftxtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ftxtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do vendedor"));

        jLabel4.setText("CPF Vendedor:");

        try {
            ftxtCpfVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpfVendedor.setEnabled(false);

        btnConsultarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarVendedor.setEnabled(false);
        btnConsultarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVendedorActionPerformed(evt);
            }
        });

        txtVendedor.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtCpfVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ftxtCpfVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtVendedor)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens do pedido"));

        jLabel5.setText("Código do produto:");

        txtCodigoProduto.setEnabled(false);

        btnConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarProduto.setEnabled(false);
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });

        txtProduto.setEnabled(false);

        jLabel6.setText("Quantidade vendida:");

        txtQtdeVendida.setEnabled(false);

        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAddItem.setText("Adicionar item");
        btnAddItem.setActionCommand("Incluir ");
        btnAddItem.setEnabled(false);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnRemItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnRemItem.setText("Remover item");
        btnRemItem.setEnabled(false);
        btnRemItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemItemActionPerformed(evt);
            }
        });

        tbItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Prec. Unit.", "Qtde. Vend.", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbItens.setEnabled(false);
        jScrollPane1.setViewportView(tbItens);

        jLabel7.setText("Valor total do pedido:");

        txtValTot.setEnabled(false);

        jLabel8.setText("Quantidade de itens do pedido:");

        txtQtdeItens.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemItem))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValTot, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddItem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduto)
                            .addComponent(jLabel6)
                            .addComponent(txtQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemItem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtValTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtQtdeItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnIncluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexao = new Conexao("system","1234");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521:xe");
        daoPedido = new DaoPedido(conexao.conectar());     
        daoCliente = new DaoCliente(conexao.conectar());
        daoVendedor = new DaoVendedor(conexao.conectar());
        daoProduto = new DaoProduto(conexao.conectar());
        daoItemPedido = new DaoItemPedido(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
                
        double qtdeVendida = Double.parseDouble(txtQtdeVendida.getText());
       
        if(qtdeVendida == 0)
            JOptionPane.showMessageDialog(null, "Quantidade vendida não pode ser zero.");
        else{
            if(qtdeVendida > produto.getQtdeEstoque())
                JOptionPane.showMessageDialog(null, "Quantidade indisponível.");
            else{
                //o que fazer com "sequencia"?
                itemPedido = new ItemPedido(1, qtdeVendida, produto);
                
                if(itemPedido.getSubTotal() > cliente.getLimiteDisp())
                    JOptionPane.showMessageDialog(null, "Limite de crédito ultrapassado.");
                else{
                    tbItens.setEnabled(true);
                    
                    limpaJtable();
                    pedido.addItemPedido(itemPedido);
                    preencheJTable(pedido);                   
                    
                    if(btnAlterar.isEnabled())
                        btnIncluir.setEnabled(false);
                    else
                        btnIncluir.setEnabled(true);
                    
                    btnExcluir.setEnabled(true);
                    btnRemItem.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        //Apaga os itens pedidos pra depois criar
        daoItemPedido.excluir(pedido);
        pedido.limpaItensPedidos();
        pedido.getCliente().setLimiteDisponivel(pedido.getCliente().getLimiteDisp() + totalPedido);
        
        for(int linha=0; linha<modItensPedidos.getRowCount(); linha++){
            for(int coluna=0; coluna < 5; coluna++){
                
                switch (coluna){
                    case 0://codigo do produto
                        produto = daoProduto.consultar(modItensPedidos.getValueAt(linha, coluna).toString());
                        break;
                    case 3://qtdeVendida                        
                        double qtdeVendida = Double.parseDouble(modItensPedidos.getValueAt(linha, coluna).toString().replace(",", "."));
                        itemPedido = new ItemPedido(1,qtdeVendida, produto);
                        break;
                }                
            }
            pedido.addItemPedido(itemPedido);
            daoItemPedido.inserir(itemPedido);            
        }
        
        if(produto!=null)
            daoProduto.alterar(produto);
        
        daoPedido.alterar(pedido);
        daoCliente.alterar(pedido.getCliente());
        limpaGui();
        limpaJtable();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPedidoActionPerformed
        // TODO add your handling code here:
        pedido = null;
        pedido = daoPedido.consultar(txtNumeroPedido.getText());        
        
        modItensPedidos =  (DefaultTableModel) tbItens.getModel();
       
       if (pedido == null){//não encontrou o pedido no BD
            ftxtDataPedido.setEnabled(true);
            
            rdbAVista.setSelected(true);
            
            rdbAVista.setEnabled(true);
            rdbAPrazo.setEnabled(true);

            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnConsultarPedido.setEnabled(false);
       }
       else{ //encontrou o objeto na BD
            
           
            cliente = pedido.getCliente();
            
            ftxtDataPedido.setText(pedido.getDataEmissao());
            
            if(pedido.isFormatoPagto())
                rdbAVista.setSelected(true);
            else
                rdbAPrazo.setSelected(true);
           
            ftxtCpfCliente.setText(pedido.getCliente().getCpf());
            ftxtCpfVendedor.setText(pedido.getVendedor().getCpf()); 
            txtCliente.setText(pedido.getCliente().getNome());
            txtVendedor.setText(pedido.getVendedor().getNome());
            
            preencheJTable(pedido);
            
            if(pedido.getSituacao()){
                btnExcluir.setEnabled(true);
                return;
            }
            
            if(tbItens.getRowCount() != 0){
                btnRemItem.setEnabled(true);
                btnAddItem.setEnabled(true);
            }
                
            txtCodigoProduto.setEnabled(true);
            tbItens.setEnabled(true);
            
            btnConsultarPedido.setEnabled(false);
            btnConsultarProduto.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
       }
       
    }//GEN-LAST:event_btnConsultarPedidoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        
        if(rdbAVista.isSelected())
            pedido.setFormatoPagto(true);
        else
            pedido.setFormatoPagto(false);

        daoPedido.inserir(pedido);
        
        for(int i=0; i<pedido.getItensPedidos().size(); i++)
            daoItemPedido.inserir(pedido.getItensPedidos().get(i));
        
        daoCliente.alterar(cliente);
        
        limpaGui();
        limpaJtable();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnRemItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemItemActionPerformed
        // TODO add your handling code here:
        
        totalPedido -= pedido.getItensPedidos().get(tbItens.getSelectedRow()).getSubTotal();
        qtdeItens -= pedido.getItensPedidos().get(tbItens.getSelectedRow()).getQtdeVendida();
               
        //Recebendo novo estoque e nova qtdeVendida a partir das mudanças no jTable
        double qtdeEstoque = pedido.getItensPedidos().get(tbItens.getSelectedRow()).getProduto().getQtdeEstoque();
        double qtdeVendida = pedido.getItensPedidos().get(tbItens.getSelectedRow()).getQtdeVendida();
        
        //Setando o novo limite disponivel do cliente
                  
        cliente.setLimiteDisponivel(cliente.getLimiteDisp() + pedido.getItensPedidos().get(tbItens.getSelectedRow()).getSubTotal());
         System.out.println("Botao remover: "+cliente.getLimiteDisp());
        
        //Mostrando na gui
        txtValTot.setText(String.format("%.2f", totalPedido));
        txtQtdeItens.setText(Integer.toString(qtdeItens));
                
        //atualizando qtde de estoque da linha do itemPedido no produto
        pedido.getItensPedidos().get(tbItens.getSelectedRow()).getProduto().setQtdeEstoque(qtdeEstoque + qtdeVendida);
              
        pedido.getItensPedidos().remove(tbItens.getSelectedRow());
        modItensPedidos.removeRow(tbItens.getSelectedRow());
        
        if(tbItens.getRowCount() == 0)
            btnRemItem.setEnabled(false);
    }//GEN-LAST:event_btnRemItemActionPerformed

    private void ftxtDataPedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxtDataPedidoKeyReleased
        // TODO add your handling code here:
        String data = ftxtDataPedido.getText();
        String dataFormatada = data.replaceAll(" ", "");
        dataFormatada.toCharArray();
        
        //10 characteres
        if(dataFormatada.length() == 10){               
            if(validarData(data, "dd/MM/yyyy")){
                if(JOptionPane.showConfirmDialog(null, "Confirmar data?")==0){
                    pedido = new Pedido(txtNumeroPedido.getText(), ftxtDataPedido.getText()); 
                    ftxtDataPedido.setEnabled(false);
                    ftxtCpfCliente.setEnabled(true);
                    btnConsultarCliente.setEnabled(true);
                }
                else
                    ftxtDataPedido.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Data inválida, tente novamente.");
                ftxtDataPedido.setText("");
            }
        }
    }//GEN-LAST:event_ftxtDataPedidoKeyReleased

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        // TODO add your handling code here:
        //889.545.418-52
        cliente = null;
        cliente = daoCliente.consultar(ftxtCpfCliente.getText());
        
        if(cliente == null)
            txtCliente.setText("Cliente não encontrado.");        
        else{
            ftxtCpfCliente.setEnabled(false);
            btnConsultarCliente.setEnabled(false);
            
            ftxtCpfVendedor.setEnabled(true);
            btnConsultarVendedor.setEnabled(true);
            txtCliente.setText(cliente.getNome());
            
            pedido.setCliente(cliente);
        }        
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnConsultarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVendedorActionPerformed
        // TODO add your handling code here:
        //389.545.418-52
        vendedor = null;
        vendedor = daoVendedor.consultar(ftxtCpfVendedor.getText());
        
        if(vendedor == null)
            txtVendedor.setText("Vendedor não encontrado");
        else{
            ftxtCpfVendedor.setEnabled(false);
            btnConsultarVendedor.setEnabled(false);
            
            txtCodigoProduto.setEnabled(true);
            btnConsultarProduto.setEnabled(true);
            
            txtVendedor.setText(vendedor.getNome());
        
            pedido.setVendedor(vendedor);
        }
    }//GEN-LAST:event_btnConsultarVendedorActionPerformed

    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed
        // TODO add your handling code here:
        produto=null;
        produto = daoProduto.consultar(txtCodigoProduto.getText());
        
        if(produto == null)//showInputDialog
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        else{
            btnAddItem.setEnabled(true);
            btnRemItem.setEnabled(true);
            txtQtdeVendida.setEnabled(true);
            
            txtProduto.setText(produto.getDescricao());            
        }        
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
        if(JOptionPane.showConfirmDialog(null, "Deseja exluir este pedido?")==0){            
            daoPedido.excluir(pedido);
            limpaGui();
            btnConsultarPedido.setEnabled(true);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarPedido;
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnConsultarVendedor;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnRemItem;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFormattedTextField ftxtCpfCliente;
    private javax.swing.JFormattedTextField ftxtCpfVendedor;
    private javax.swing.JFormattedTextField ftxtDataPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbAPrazo;
    private javax.swing.JRadioButton rdbAVista;
    private javax.swing.JTable tbItens;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtdeItens;
    private javax.swing.JTextField txtQtdeVendida;
    private javax.swing.JTextField txtValTot;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao=null;
    private Pedido pedido=null;
    private Cliente cliente=null;
    private Vendedor vendedor=null;
    private Produto produto=null;
    private ItemPedido itemPedido=null;
    
    private DaoItemPedido daoItemPedido= null;
    private DaoPedido daoPedido=null;
    private DaoCliente daoCliente=null;
    private DaoVendedor daoVendedor=null;
    private DaoProduto daoProduto=null;
        
    private double totalPedido = 0;
    private int qtdeItens=0;
    private DefaultTableModel modItensPedidos;
    
    public static boolean validarData(String dataString, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        sdf.setLenient(false);
        try {
            sdf.parse(dataString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    public void limpaGui(){
        txtCliente.setText("");
        txtCodigoProduto.setText("");   
        txtNumeroPedido.setText("");
        txtProduto.setText("");
        txtQtdeItens.setText("");
        txtQtdeVendida.setText("");
        txtValTot.setText("");
        txtVendedor.setText("");
        ftxtCpfCliente.setText("");
        ftxtCpfVendedor.setText("");
        ftxtDataPedido.setText("");
    }
    
    public void limpaJtable(){
//        for(int i = 0; i < modItensPedidos.getRowCount()-1; i++)
//            modItensPedidos.removeRow(i);        
        modItensPedidos.setRowCount(0);
    }
    
    public void preencheJTable(Pedido pedido){
        totalPedido = 0;
        qtdeItens=0;
        
        for(int i = 0; i < pedido.getItensPedidos().size(); i++){                
            String[] vetString =    {  
                                        pedido.getItensPedidos().get(i).getProduto().getCodigo(), 
                                        pedido.getItensPedidos().get(i).getProduto().getDescricao(),
                                        String.format("%.2f", pedido.getItensPedidos().get(i).getProduto().getPreco()),
                                        String.format("%.2f", pedido.getItensPedidos().get(i).getQtdeVendida()),
                                        String.format("%.2f", pedido.getItensPedidos().get(i).getSubTotal())
                                    };
            
            totalPedido += pedido.getItensPedidos().get(i).getSubTotal();
            qtdeItens += pedido.getItensPedidos().get(i).getQtdeVendida();
            modItensPedidos.addRow(vetString);
        }   
        txtValTot.setText(String.format("%.2f", totalPedido));
        txtQtdeItens.setText(Integer.toString(qtdeItens));
    }
}
