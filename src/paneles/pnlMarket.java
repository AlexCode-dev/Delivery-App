/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.ControlComida;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import subPaneles.Registro_Comida_Nueva;

/**
 *
 * @author RojeruSan
 */
public class pnlMarket extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    public pnlMarket() {
        initComponents();
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
        inicio_lbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaComida = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rSButtonMaterialTwo2 = new RSMaterialComponent.RSButtonMaterialTwo();
        rSButtonMaterialTwo3 = new RSMaterialComponent.RSButtonMaterialTwo();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPostres = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaBebidas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Recurso 17.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        inicio_lbl3.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl3.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(inicio_lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("En este apartado podra gestionar la comida de los clientes.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        TablaComida.setBackground(new java.awt.Color(51, 51, 51));
        TablaComida.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TablaComida.setForeground(new java.awt.Color(255, 255, 255));
        TablaComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod_Pedido", "Nombre Emisor", "Nombre Destinatario", "Calle Origen", "Calle Destino", "Estado", "Descripcion"
            }
        ));
        TablaComida.setFillsViewportHeight(true);
        TablaComida.setFocusable(false);
        TablaComida.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaComida.setRowHeight(25);
        TablaComida.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaComida.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaComida);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1059, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("*Registro de todas las comidas disponibles");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        rSButtonMaterialTwo2.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonMaterialTwo2.setText("A??adir Comida Nueva");
        rSButtonMaterialTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo2ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 159, -1));

        rSButtonMaterialTwo3.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonMaterialTwo3.setText("Modificar Comida");
        rSButtonMaterialTwo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo3ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 159, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("*Registro de todos los postres disponibles");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        TablaPostres.setBackground(new java.awt.Color(51, 51, 51));
        TablaPostres.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TablaPostres.setForeground(new java.awt.Color(255, 255, 255));
        TablaPostres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod_Pedido", "Nombre Emisor", "Nombre Destinatario", "Calle Origen", "Calle Destino", "Estado", "Descripcion"
            }
        ));
        TablaPostres.setFillsViewportHeight(true);
        TablaPostres.setFocusable(false);
        TablaPostres.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaPostres.setRowHeight(25);
        TablaPostres.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaPostres.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaPostres);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1059, 150));

        TablaBebidas.setBackground(new java.awt.Color(51, 51, 51));
        TablaBebidas.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TablaBebidas.setForeground(new java.awt.Color(255, 255, 255));
        TablaBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod_Pedido", "Nombre Emisor", "Nombre Destinatario", "Calle Origen", "Calle Destino", "Estado", "Descripcion"
            }
        ));
        TablaBebidas.setFillsViewportHeight(true);
        TablaBebidas.setFocusable(false);
        TablaBebidas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaBebidas.setRowHeight(25);
        TablaBebidas.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaBebidas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TablaBebidas);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 1059, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("*Registro de todas las bebidas disponibles");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo2ActionPerformed
    Registro_Comida_Nueva x = new  Registro_Comida_Nueva();
    x.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialTwo2ActionPerformed

    private void rSButtonMaterialTwo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo3ActionPerformed
       
    }//GEN-LAST:event_rSButtonMaterialTwo3ActionPerformed

    public void  actualizartablas(){
    
        ControlComida  x=new ControlComida();
        try {
            x.actualizarTablaComida();
            x.actualizarTablaPostres();
            x.actualizarTablaBebidas();
        } catch (SQLException ex) {
            Logger.getLogger(pnlMarket.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaBebidas;
    public static javax.swing.JTable TablaComida;
    public static javax.swing.JTable TablaPostres;
    public javax.swing.JLabel inicio_lbl3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo2;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo3;
    // End of variables declaration//GEN-END:variables
}
