/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.ControlCliente;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import subPaneles.Modificar_Cliente;
import subPaneles.Registro_Clientes;

/**
 *
 * @author RojeruSan
 */
public class pnlFeeBack extends javax.swing.JPanel {
    public DefaultTableModel model;
    /**
     * Creates new form pnlHome
     */
    public pnlFeeBack() {
        initComponents();
        tabla_clientes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tabla_clientes.getTableHeader().setOpaque(false);
        tabla_clientes.getTableHeader().setBackground(new Color(32, 136, 203));
        tabla_clientes.getTableHeader().setForeground(new Color(255,255,255));
        tabla_clientes.setRowHeight(25);
        
        actualizartablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        rSButtonMaterialTwo3 = new RSMaterialComponent.RSButtonMaterialTwo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        rSButtonMaterialTwo2 = new RSMaterialComponent.RSButtonMaterialTwo();
        inicio_lbl5 = new javax.swing.JLabel();
        rSButtonMaterialTwo4 = new RSMaterialComponent.RSButtonMaterialTwo();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Recurso 16.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, -1, -1));

        rSButtonMaterialTwo3.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonMaterialTwo3.setText("Modificar Cliente");
        rSButtonMaterialTwo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo3ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 159, -1));

        tabla_clientes.setBackground(new java.awt.Color(51, 51, 51));
        tabla_clientes.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tabla_clientes.setForeground(new java.awt.Color(255, 255, 255));
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod_Cliente", "Nombre ", "Apellido", "Telefono", "Ubicacion", "Barrio", "Zona"
            }
        ));
        tabla_clientes.setCellSelectionEnabled(true);
        tabla_clientes.setFillsViewportHeight(true);
        tabla_clientes.setFocusable(false);
        tabla_clientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabla_clientes.setRowHeight(25);
        tabla_clientes.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tabla_clientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_clientes);
        tabla_clientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabla_clientes.getColumnModel().getColumnCount() > 0) {
            tabla_clientes.getColumnModel().getColumn(4).setHeaderValue("Ubicacion");
            tabla_clientes.getColumnModel().getColumn(5).setHeaderValue("Barrio");
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1070, 460));

        rSButtonMaterialTwo2.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonMaterialTwo2.setText("A??adir nuevo Cliente");
        rSButtonMaterialTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo2ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 159, -1));

        inicio_lbl5.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl5.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(inicio_lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 18, -1, 40));

        rSButtonMaterialTwo4.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonMaterialTwo4.setText("Eliminar Cliente");
        rSButtonMaterialTwo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo4ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 159, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Listado de todos los clientes de la sucursal");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("*Listado de todos los clientes de la sucursal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo2ActionPerformed
        Registro_Clientes x = new Registro_Clientes();
        x.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialTwo2ActionPerformed

    private void rSButtonMaterialTwo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialTwo4ActionPerformed

    private void rSButtonMaterialTwo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo3ActionPerformed
        Modificar_Cliente x = new Modificar_Cliente();
        x.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialTwo3ActionPerformed

     public void actualizartablas(){
         ControlCliente x = new ControlCliente();
         
        try {
            x.actualizarTablaClientes();
        } catch (SQLException ex) {
            Logger.getLogger(pnlFeeBack.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel inicio_lbl5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo2;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo3;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo4;
    public static javax.swing.JTable tabla_clientes;
    // End of variables declaration//GEN-END:variables
}
