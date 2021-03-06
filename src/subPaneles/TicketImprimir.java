/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subPaneles;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;

import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.*;
import java.awt.print.*;
/**
 *
 * @author alex1
 */
public class TicketImprimir extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form TicketImprimir
     */
    public TicketImprimir() {
        initComponents();
       this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Ticket = new javax.swing.JPanel();
        NombRes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NumbPed = new javax.swing.JLabel();
        DirCli = new javax.swing.JLabel();
        IdCli = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NombPed1 = new javax.swing.JLabel();
        Cant1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        Cant2 = new javax.swing.JLabel();
        NombPed2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        Cant3 = new javax.swing.JLabel();
        NombPed3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        zonat = new javax.swing.JLabel();
        DeliveryCost = new javax.swing.JLabel();
        TotalCost = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Cerrar_btn1 = new necesario.MaterialButton();
        Cerrar_btn4 = new necesario.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Ticket.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Ticket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombRes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NombRes.setText("Restaurante");
        Panel_Ticket.add(NombRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Pedido");
        Panel_Ticket.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 56, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("#");
        Panel_Ticket.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 84, -1, -1));

        NumbPed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NumbPed.setText("1");
        Panel_Ticket.add(NumbPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 84, -1, -1));

        DirCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DirCli.setText("Direccion");
        Panel_Ticket.add(DirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 20));

        IdCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IdCli.setText("2030");
        Panel_Ticket.add(IdCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 147, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Precio");
        Panel_Ticket.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ID:");
        Panel_Ticket.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));

        precio1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precio1.setText("Item#!");
        Panel_Ticket.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cant");
        Panel_Ticket.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Nombre");
        Panel_Ticket.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        NombPed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombPed1.setText("Item#!");
        Panel_Ticket.add(NombPed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        Cant1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cant1.setText("0");
        Panel_Ticket.add(Cant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 10, -1));

        precio2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precio2.setText("Item#!");
        Panel_Ticket.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        Cant2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cant2.setText("0");
        Panel_Ticket.add(Cant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 10, -1));

        NombPed2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombPed2.setText("Item#!");
        Panel_Ticket.add(NombPed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        precio3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precio3.setText("Item#!");
        Panel_Ticket.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        Cant3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cant3.setText("0");
        Panel_Ticket.add(Cant3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 10, -1));

        NombPed3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombPed3.setText("Item#!");
        Panel_Ticket.add(NombPed3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("--------");
        Panel_Ticket.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 50, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Efectivo");
        Panel_Ticket.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Pago:");
        Panel_Ticket.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        zonat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zonat.setText("Centro");
        Panel_Ticket.add(zonat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        DeliveryCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeliveryCost.setText("0");
        Panel_Ticket.add(DeliveryCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 60, -1));

        TotalCost.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TotalCost.setText("100");
        Panel_Ticket.add(TotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 120, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Pedido Ok, Comprobante.");
        Panel_Ticket.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, -1));

        Fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fecha.setText("DD/MM/AAAA");
        Panel_Ticket.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Delivery/Zona:  $");
        Panel_Ticket.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 130, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Zona: ");
        Panel_Ticket.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel31.setText("Total: $");
        Panel_Ticket.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 160, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("-------------");
        Panel_Ticket.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, -1));

        getContentPane().add(Panel_Ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Cerrar_btn1.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar_btn1.setText("Volver");
        Cerrar_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_btn1ActionPerformed(evt);
            }
        });

        Cerrar_btn4.setBackground(new java.awt.Color(0, 102, 51));
        Cerrar_btn4.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar_btn4.setText("Imprimir");
        Cerrar_btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cerrar_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Cerrar_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 290, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cerrar_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_btn1ActionPerformed

        dispose();
    }//GEN-LAST:event_Cerrar_btn1ActionPerformed

    private void Cerrar_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_btn4ActionPerformed
        try {
             PrinterJob g= PrinterJob.getPrinterJob();
             g.setPrintable(this);
             boolean g1= g.printDialog();
        if(g1){
            g.print();
        }
    
        } catch (PrinterException pex) {
            System.out.println(pex);
        }
        

    }//GEN-LAST:event_Cerrar_btn4ActionPerformed
    
    /**
     *
     * @param graf
     * @param pagefor
     * @param Index
     * @return
     */
    public int print(Graphics graf, PageFormat pagefor, int Index){
        if (Index>0){
            return NO_SUCH_PAGE;
        }
        Graphics2D ar=(Graphics2D) graf;
        ar.translate(pagefor.getImageableX()*20, pagefor.getImageableY()*40);
        ar.scale(2.0, 1.5);
        Panel_Ticket.printAll(graf);
        
        
        return PAGE_EXISTS;
    }
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(TicketImprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketImprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketImprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketImprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketImprimir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Cant1;
    public javax.swing.JLabel Cant2;
    public javax.swing.JLabel Cant3;
    private necesario.MaterialButton Cerrar_btn1;
    private necesario.MaterialButton Cerrar_btn4;
    public javax.swing.JLabel DeliveryCost;
    public javax.swing.JLabel DirCli;
    public javax.swing.JLabel Fecha;
    public javax.swing.JLabel IdCli;
    public javax.swing.JLabel NombPed1;
    public javax.swing.JLabel NombPed2;
    public javax.swing.JLabel NombPed3;
    public javax.swing.JLabel NombRes;
    public javax.swing.JLabel NumbPed;
    private javax.swing.JPanel Panel_Ticket;
    public javax.swing.JLabel TotalCost;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel precio1;
    public javax.swing.JLabel precio2;
    public javax.swing.JLabel precio3;
    public javax.swing.JLabel zonat;
    // End of variables declaration//GEN-END:variables
}
