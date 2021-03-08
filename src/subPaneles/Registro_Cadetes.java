/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subPaneles;

import Login.*;
import controladores.ControlCliente;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import principal.Principal.*;
import static principal.Principal.Sucursal_ID;


/**
 *
 * @author alex1
 */
public class Registro_Cadetes extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Login
     */
    public Registro_Cadetes() {
        initComponents();
        this.setLocationRelativeTo(this);
          setIconImage(new ImageIcon(getClass().getResource("probar.png")).getImage());
        ID_SUCURSAL_CLIENTE.setText(Sucursal_ID.getText());
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
        Nombre_cadete = new RSMaterialComponent.RSTextFieldMaterial();
        Apellido_cadete = new RSMaterialComponent.RSTextFieldMaterial();
        Tel_cadete = new RSMaterialComponent.RSTextFieldMaterial();
        Cerrar_btn = new necesario.MaterialButton();
        Entrar_btn = new necesario.MaterialButton();
        jLabel2 = new javax.swing.JLabel();
        Tipo_estado = new RSMaterialComponent.RSComboBoxMaterial();
        ID_SUCURSAL_CLIENTE = new javax.swing.JLabel();
        Tipo_vehiculo = new RSMaterialComponent.RSComboBoxMaterial();
        Tipo_carnet = new RSMaterialComponent.RSComboBoxMaterial();
        Sucursal_Cadete = new RSMaterialComponent.RSTextFieldMaterial();
        Cuit_cadete = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jPanel1.setFocusCycleRoot(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_subPaneles/Registro_Clientes.png"))); // NOI18N

        Nombre_cadete.setForeground(new java.awt.Color(51, 51, 51));
        Nombre_cadete.setColorMaterial(new java.awt.Color(153, 102, 255));
        Nombre_cadete.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Nombre_cadete.setPhColor(new java.awt.Color(0, 0, 0));
        Nombre_cadete.setPlaceholder("Ingrese Nombre");

        Apellido_cadete.setForeground(new java.awt.Color(51, 51, 51));
        Apellido_cadete.setColorMaterial(new java.awt.Color(153, 102, 255));
        Apellido_cadete.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Apellido_cadete.setPhColor(new java.awt.Color(0, 0, 0));
        Apellido_cadete.setPlaceholder("Ingrese Apellido");

        Tel_cadete.setForeground(new java.awt.Color(51, 51, 51));
        Tel_cadete.setColorMaterial(new java.awt.Color(153, 102, 255));
        Tel_cadete.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Tel_cadete.setPhColor(new java.awt.Color(0, 0, 0));
        Tel_cadete.setPlaceholder("Ingrese Telefono");

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
        Entrar_btn.setText("Registrar");
        Entrar_btn.setContentAreaFilled(false);
        Entrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrar_btnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta.png"))); // NOI18N

        Tipo_estado.setForeground(new java.awt.Color(102, 102, 102));
        Tipo_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estado", "Disponible", "No Disponible" }));

        ID_SUCURSAL_CLIENTE.setText("0");

        Tipo_vehiculo.setForeground(new java.awt.Color(102, 102, 102));
        Tipo_vehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vehiculo", "1", "2" }));

        Tipo_carnet.setForeground(new java.awt.Color(102, 102, 102));
        Tipo_carnet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estado Carnet", "Activo", "En Tramite", "Vencido" }));

        Sucursal_Cadete.setForeground(new java.awt.Color(51, 51, 51));
        Sucursal_Cadete.setColorMaterial(new java.awt.Color(153, 102, 255));
        Sucursal_Cadete.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Sucursal_Cadete.setPhColor(new java.awt.Color(0, 0, 0));
        Sucursal_Cadete.setPlaceholder("Ingrese numero de sucursal");

        Cuit_cadete.setForeground(new java.awt.Color(51, 51, 51));
        Cuit_cadete.setColorMaterial(new java.awt.Color(153, 102, 255));
        Cuit_cadete.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Cuit_cadete.setPhColor(new java.awt.Color(0, 0, 0));
        Cuit_cadete.setPlaceholder("Ingrese Cuit/Dni");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(Cerrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Entrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tipo_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(Cuit_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ID_SUCURSAL_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Tipo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Tipo_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Nombre_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(Apellido_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tel_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(Sucursal_Cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ID_SUCURSAL_CLIENTE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuit_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tipo_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipo_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sucursal_Cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tel_cadete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
      /*ControlCliente Agregar = new ControlCliente();
        try {
            Agregar.agregarCliente(this);
        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage());
        }*/
    }//GEN-LAST:event_Entrar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Cadetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Cadetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Cadetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Cadetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Registro_Cadetes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSTextFieldMaterial Apellido_cadete;
    private necesario.MaterialButton Cerrar_btn;
    public RSMaterialComponent.RSTextFieldMaterial Cuit_cadete;
    private necesario.MaterialButton Entrar_btn;
    public static javax.swing.JLabel ID_SUCURSAL_CLIENTE;
    public RSMaterialComponent.RSTextFieldMaterial Nombre_cadete;
    public RSMaterialComponent.RSTextFieldMaterial Sucursal_Cadete;
    public RSMaterialComponent.RSTextFieldMaterial Tel_cadete;
    public RSMaterialComponent.RSComboBoxMaterial Tipo_carnet;
    public RSMaterialComponent.RSComboBoxMaterial Tipo_estado;
    public RSMaterialComponent.RSComboBoxMaterial Tipo_vehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}