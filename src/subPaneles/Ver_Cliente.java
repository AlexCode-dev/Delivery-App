/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subPaneles;

import Login.*;
import conexion.Conectar;
import java.awt.Color;
import java.awt.Font;
import principal.Principal;
import conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex1
 */
public class Ver_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Login
     */
    public Ver_Cliente() {
        initComponents();
        
         Tabla_pro.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Tabla_pro.getTableHeader().setOpaque(false);
        Tabla_pro.getTableHeader().setBackground(new Color(32, 136, 203));
        Tabla_pro.getTableHeader().setForeground(new Color(255,255,255));
        Tabla_pro.setRowHeight(25);
        this.setLocationRelativeTo(this);
          setIconImage(new ImageIcon(getClass().getResource("probar.png")).getImage());
        //TABLA PEDIDOS
        
      
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cerrar_btn = new necesario.MaterialButton();
        Entrar_btn = new necesario.MaterialButton();
        Modificar_Tel = new RSMaterialComponent.RSTextFieldMaterial();
        Modificar_Nombre = new RSMaterialComponent.RSTextFieldMaterial();
        Modificar_Zona = new RSMaterialComponent.RSTextFieldMaterial();
        Modificar_Tipo = new RSMaterialComponent.RSComboBoxMaterial();
        Modificar_Apellido = new RSMaterialComponent.RSTextFieldMaterial();
        Modificar_Direccion = new RSMaterialComponent.RSTextFieldMaterial();
        Modificar_Barrio = new RSMaterialComponent.RSTextFieldMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_pro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Modificar_IDCLIENTE = new RSMaterialComponent.RSTextFieldMaterial();
        cliente_id = new javax.swing.JLabel();
        Entrar_btn1 = new necesario.MaterialButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jPanel1.setFocusCycleRoot(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Modificar_Pedido.png"))); // NOI18N

        Cerrar_btn.setBackground(new java.awt.Color(153, 153, 255));
        Cerrar_btn.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar_btn.setText("Volver");
        Cerrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_btnActionPerformed(evt);
            }
        });

        Entrar_btn.setBackground(new java.awt.Color(51, 51, 51));
        Entrar_btn.setForeground(new java.awt.Color(255, 255, 255));
        Entrar_btn.setText("Actualizar");
        Entrar_btn.setContentAreaFilled(false);
        Entrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrar_btnActionPerformed(evt);
            }
        });

        Modificar_Tel.setEditable(false);
        Modificar_Tel.setForeground(new java.awt.Color(51, 51, 51));
        Modificar_Tel.setColorMaterial(new java.awt.Color(153, 102, 255));
        Modificar_Tel.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Modificar_Tel.setPhColor(new java.awt.Color(0, 0, 0));
        Modificar_Tel.setPlaceholder("Telefono");

        Modificar_Nombre.setEditable(false);
        Modificar_Nombre.setForeground(new java.awt.Color(51, 51, 51));
        Modificar_Nombre.setColorMaterial(new java.awt.Color(153, 102, 255));
        Modificar_Nombre.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Modificar_Nombre.setPhColor(new java.awt.Color(0, 0, 0));
        Modificar_Nombre.setPlaceholder("Nombre");
        Modificar_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_NombreActionPerformed(evt);
            }
        });

        Modificar_Zona.setEditable(false);
        Modificar_Zona.setForeground(new java.awt.Color(51, 51, 51));
        Modificar_Zona.setColorMaterial(new java.awt.Color(153, 102, 255));
        Modificar_Zona.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Modificar_Zona.setPhColor(new java.awt.Color(0, 0, 0));
        Modificar_Zona.setPlaceholder("Zona");

        Modificar_Tipo.setForeground(new java.awt.Color(102, 102, 102));
        Modificar_Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo", "ClienteH", "ClienteN" }));
        Modificar_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_TipoActionPerformed(evt);
            }
        });

        Modificar_Apellido.setEditable(false);
        Modificar_Apellido.setForeground(new java.awt.Color(51, 51, 51));
        Modificar_Apellido.setColorMaterial(new java.awt.Color(153, 102, 255));
        Modificar_Apellido.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Modificar_Apellido.setPhColor(new java.awt.Color(0, 0, 0));
        Modificar_Apellido.setPlaceholder("Apellido");
        Modificar_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_ApellidoActionPerformed(evt);
            }
        });

        Modificar_Direccion.setEditable(false);
        Modificar_Direccion.setForeground(new java.awt.Color(51, 51, 51));
        Modificar_Direccion.setColorMaterial(new java.awt.Color(153, 102, 255));
        Modificar_Direccion.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Modificar_Direccion.setPhColor(new java.awt.Color(0, 0, 0));
        Modificar_Direccion.setPlaceholder("Direccion");
        Modificar_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_DireccionActionPerformed(evt);
            }
        });

        Modificar_Barrio.setEditable(false);
        Modificar_Barrio.setForeground(new java.awt.Color(51, 51, 51));
        Modificar_Barrio.setColorMaterial(new java.awt.Color(153, 102, 255));
        Modificar_Barrio.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Modificar_Barrio.setPhColor(new java.awt.Color(0, 0, 0));
        Modificar_Barrio.setPlaceholder("Barrio");

        Tabla_pro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Tabla_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod_pedido", "Fecha Entrega", "Hora Entrega", "Estado", "Precio", "Cadete", "Descripcion                    "
            }
        ));
        Tabla_pro.setCellSelectionEnabled(true);
        Tabla_pro.setFillsViewportHeight(true);
        Tabla_pro.setFocusable(false);
        Tabla_pro.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Tabla_pro.setRowHeight(25);
        Tabla_pro.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Tabla_pro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_pro);
        Tabla_pro.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Informacion del Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Pedidos del Cliente");

        Modificar_IDCLIENTE.setEditable(false);
        Modificar_IDCLIENTE.setForeground(new java.awt.Color(51, 51, 51));
        Modificar_IDCLIENTE.setColorMaterial(new java.awt.Color(153, 102, 255));
        Modificar_IDCLIENTE.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Modificar_IDCLIENTE.setPhColor(new java.awt.Color(0, 0, 0));
        Modificar_IDCLIENTE.setPlaceholder("ID_Cliente");
        Modificar_IDCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_IDCLIENTEActionPerformed(evt);
            }
        });

        cliente_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cliente_id.setForeground(new java.awt.Color(204, 204, 204));
        cliente_id.setText("1");

        Entrar_btn1.setBackground(new java.awt.Color(51, 51, 51));
        Entrar_btn1.setForeground(new java.awt.Color(255, 255, 255));
        Entrar_btn1.setText("Registrar");
        Entrar_btn1.setContentAreaFilled(false);
        Entrar_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrar_btn1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Barrio");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Zona");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Direccion");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Apellido");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("ID cliente");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Tipo de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Modificar_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modificar_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Modificar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(Modificar_Barrio, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Modificar_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(Modificar_IDCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Modificar_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modificar_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(Entrar_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cerrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cliente_id))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Entrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cliente_id))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar_Barrio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Modificar_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Modificar_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Modificar_IDCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Modificar_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Entrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrar_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cerrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_btnActionPerformed
       
        dispose();
    }//GEN-LAST:event_Cerrar_btnActionPerformed

    private void Entrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entrar_btnActionPerformed
        Conectar con = new Conectar();
       Connection conexion= con.conexion();
       //Aqui Problema
       String id_cliente= cliente_id.getText().trim();
       int id_cliente1=Integer.parseInt(id_cliente);
       
       String sql= "select * from pedido where id_cliente="+id_cliente1+"";
       
       Statement st;
       
       //Columnas
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("id Pedido");
       model.addColumn("Fecha Retiro");
       model.addColumn("Fecha Entrega ");
       model.addColumn("Hora Retiro");
       model.addColumn("Hora Entrega");
       model.addColumn("Estado");
       model.addColumn("Precio");
       model.addColumn("Cuit Cadete");
       
       //le pasamos las propiedades de model
       Tabla_pro.setModel(model);
       //Arrelo para almacenar los datos de una fila
       String[] dato= new String [8];
       
        try {
            //Ejecutemos la query
            st= conexion.createStatement();
            ResultSet result = st.executeQuery(sql);
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(result.next()){
                dato[0]=result.getString(1);
                dato[1]=result.getString(4);
                dato[2]=result.getString(5);
                dato[3]=result.getString(6);
                dato[4]=result.getString(7);
                dato[5]=result.getString(9);
                dato[6]=result.getString(10);
                dato[7]=result.getString(11);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_Entrar_btnActionPerformed

    private void Modificar_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_NombreActionPerformed

    private void Modificar_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_ApellidoActionPerformed

    private void Modificar_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_DireccionActionPerformed

    private void Modificar_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_TipoActionPerformed

    private void Modificar_IDCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_IDCLIENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_IDCLIENTEActionPerformed

    private void Entrar_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entrar_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Entrar_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ver_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton Cerrar_btn;
    private necesario.MaterialButton Entrar_btn;
    private necesario.MaterialButton Entrar_btn1;
    public RSMaterialComponent.RSTextFieldMaterial Modificar_Apellido;
    public RSMaterialComponent.RSTextFieldMaterial Modificar_Barrio;
    public RSMaterialComponent.RSTextFieldMaterial Modificar_Direccion;
    public RSMaterialComponent.RSTextFieldMaterial Modificar_IDCLIENTE;
    public RSMaterialComponent.RSTextFieldMaterial Modificar_Nombre;
    public RSMaterialComponent.RSTextFieldMaterial Modificar_Tel;
    public RSMaterialComponent.RSComboBoxMaterial Modificar_Tipo;
    public RSMaterialComponent.RSTextFieldMaterial Modificar_Zona;
    public javax.swing.JTable Tabla_pro;
    public static javax.swing.JLabel cliente_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}