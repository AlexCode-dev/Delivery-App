/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subPaneles;

import Login.*;
import controladores.ControlCaja;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import principal.Principal;

/**
 *
 * @author alex1
 */
public class Monto_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Login
     */
    public Monto_Inicial() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(this);
          setIconImage(new ImageIcon(getClass().getResource("probar.png")).getImage());
          ControlCaja CC = new ControlCaja();
        CC.mostrarAbrirCaja(this);
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
        Registrar_Caja_inicial = new necesario.MaterialButton();
        M_Final = new javax.swing.JLabel();
        Mont_Final = new javax.swing.JLabel();
        ValorActual = new javax.swing.JLabel();
        M_Final1 = new javax.swing.JLabel();
        Ingreso_Mont_Inicial = new RSMaterialComponent.RSTextFieldMaterial();
        M_Final2 = new javax.swing.JLabel();
        Ingreso_cod_sucursal_IM = new RSMaterialComponent.RSTextFieldMaterial();
        M_Final3 = new javax.swing.JLabel();
        M_Final4 = new javax.swing.JLabel();
        M_Final5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jPanel1.setFocusCycleRoot(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_subPaneles/Registro_Notificaciones.png"))); // NOI18N

        Cerrar_btn.setBackground(new java.awt.Color(153, 153, 255));
        Cerrar_btn.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar_btn.setText("Volver");
        Cerrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_btnActionPerformed(evt);
            }
        });

        Registrar_Caja_inicial.setBackground(new java.awt.Color(51, 51, 51));
        Registrar_Caja_inicial.setForeground(new java.awt.Color(255, 255, 255));
        Registrar_Caja_inicial.setText("Registrar Caja");
        Registrar_Caja_inicial.setContentAreaFilled(false);
        Registrar_Caja_inicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar_Caja_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_Caja_inicialActionPerformed(evt);
            }
        });

        M_Final.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        M_Final.setForeground(new java.awt.Color(153, 153, 153));
        M_Final.setText("Monto Final:    $");

        Mont_Final.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Mont_Final.setForeground(new java.awt.Color(51, 51, 51));
        Mont_Final.setText("10000");

        ValorActual.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ValorActual.setForeground(new java.awt.Color(51, 51, 51));
        ValorActual.setText("0,00");

        M_Final1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        M_Final1.setForeground(new java.awt.Color(153, 153, 153));
        M_Final1.setText("Monto Inicial:  $");

        Ingreso_Mont_Inicial.setForeground(new java.awt.Color(51, 51, 51));
        Ingreso_Mont_Inicial.setColorMaterial(new java.awt.Color(102, 102, 255));
        Ingreso_Mont_Inicial.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Ingreso_Mont_Inicial.setPhColor(new java.awt.Color(51, 51, 51));
        Ingreso_Mont_Inicial.setPlaceholder("Ingrese Monto Inicial..");
        Ingreso_Mont_Inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingreso_Mont_InicialActionPerformed(evt);
            }
        });

        M_Final2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        M_Final2.setForeground(new java.awt.Color(102, 153, 255));
        M_Final2.setText("Ingrese Monto Inicial");

        Ingreso_cod_sucursal_IM.setForeground(new java.awt.Color(51, 51, 51));
        Ingreso_cod_sucursal_IM.setColorMaterial(new java.awt.Color(102, 102, 255));
        Ingreso_cod_sucursal_IM.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Ingreso_cod_sucursal_IM.setPhColor(new java.awt.Color(51, 51, 51));
        Ingreso_cod_sucursal_IM.setPlaceholder("Ingrese ID Sucursal..");
        Ingreso_cod_sucursal_IM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingreso_cod_sucursal_IMActionPerformed(evt);
            }
        });

        M_Final3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        M_Final3.setForeground(new java.awt.Color(102, 153, 255));
        M_Final3.setText("Ingrese Cod Sucursal");

        M_Final4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        M_Final4.setForeground(new java.awt.Color(153, 153, 153));
        M_Final4.setText("#");

        M_Final5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        M_Final5.setForeground(new java.awt.Color(153, 153, 153));
        M_Final5.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(M_Final1)
                                .addGap(18, 18, 18)
                                .addComponent(ValorActual))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(M_Final)
                                .addGap(14, 14, 14)
                                .addComponent(Mont_Final)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(M_Final5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Ingreso_Mont_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(M_Final4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Ingreso_cod_sucursal_IM, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Registrar_Caja_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Cerrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M_Final2)
                            .addComponent(M_Final3))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M_Final)
                    .addComponent(Mont_Final))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M_Final1)
                    .addComponent(ValorActual))
                .addGap(28, 28, 28)
                .addComponent(M_Final2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingreso_Mont_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_Final5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(M_Final3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingreso_cod_sucursal_IM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_Final4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(Registrar_Caja_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cerrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
     
        this.dispose();
    }//GEN-LAST:event_Cerrar_btnActionPerformed

    private void Registrar_Caja_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_Caja_inicialActionPerformed
      ControlCaja cc = new ControlCaja();
        try {
            cc.abrirCaja(this);
        } catch (SQLException ex) {
            Logger.getLogger(Monto_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Registrar_Caja_inicialActionPerformed

    private void Ingreso_Mont_InicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingreso_Mont_InicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingreso_Mont_InicialActionPerformed

    private void Ingreso_cod_sucursal_IMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingreso_cod_sucursal_IMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingreso_cod_sucursal_IMActionPerformed

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
            java.util.logging.Logger.getLogger(Monto_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monto_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monto_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monto_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new Monto_Inicial().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Monto_Inicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton Cerrar_btn;
    public static RSMaterialComponent.RSTextFieldMaterial Ingreso_Mont_Inicial;
    public static RSMaterialComponent.RSTextFieldMaterial Ingreso_cod_sucursal_IM;
    private javax.swing.JLabel M_Final;
    private javax.swing.JLabel M_Final1;
    private javax.swing.JLabel M_Final2;
    private javax.swing.JLabel M_Final3;
    private javax.swing.JLabel M_Final4;
    private javax.swing.JLabel M_Final5;
    public static javax.swing.JLabel Mont_Final;
    public necesario.MaterialButton Registrar_Caja_inicial;
    public static javax.swing.JLabel ValorActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
