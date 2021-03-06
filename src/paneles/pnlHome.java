/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.ControlCaja;
import controladores.ControlPedido;
import efectos.Roboto;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import subPaneles.Eliminar_Pedido;
import subPaneles.Listado_Notificaciones;
import subPaneles.Listado_Pedidos;
import subPaneles.Modificar_Pedido;
import subPaneles.Monto_Final;
import subPaneles.Monto_Inicial;
import subPaneles.Registro_Notificaciones;
import subPaneles.Registro_Pedido_Nuevo;
import subPaneles.Registro_Pedido_Nuevo_otro;

/**
 *
 * @author RojeruSan
 */
public class pnlHome extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    public pnlHome() {
         
        initComponents();
        Tabla_pro.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
       Tabla_pro.getTableHeader().setOpaque(false);
        Tabla_pro.getTableHeader().setBackground(new Color(102,51,255));
       Tabla_pro.getTableHeader().setForeground(new Color(255,255,255));
        Tabla_pro.setRowHeight(25);
       
      
        ControlPedido t = new ControlPedido();
        ControlCaja c= new ControlCaja();
        
        try {
            t.actualizarTablaPedidos(this);
            c.obtenerMontocaja();
            c.obtenerMontocajaF();
           
        } catch (SQLException ex) {
            Logger.getLogger(pnlHome.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicio_lbl = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        abrircaja_txt = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Ganancia_diarias = new javax.swing.JLabel();
        rSButtonMaterialTwo7 = new RSMaterialComponent.RSButtonMaterialTwo();
        rSButtonMaterialTwo8 = new RSMaterialComponent.RSButtonMaterialTwo();
        rSButtonMaterialTwo4 = new RSMaterialComponent.RSButtonMaterialTwo();
        abrir_caja_btn = new RSMaterialComponent.RSButtonMaterialTwo();
        rSButtonMaterialTwo12 = new RSMaterialComponent.RSButtonMaterialTwo();
        inicio_lbl1 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        rSButtonMaterialTwo9 = new RSMaterialComponent.RSButtonMaterialTwo();
        jLabel60 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        inicio_lbl2 = new javax.swing.JLabel();
        inicio_lbl3 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        inicio_lbl4 = new javax.swing.JLabel();
        inicio_lbl5 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        abrircaja_txt2 = new javax.swing.JLabel();
        rSButtonMaterialTwo14 = new RSMaterialComponent.RSButtonMaterialTwo();
        jLabel87 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_pro = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        rSButtonMaterialTwo10 = new RSMaterialComponent.RSButtonMaterialTwo();
        jLabel91 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Ganancia_diarias1 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Ganan_32.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/mas(2).png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 70, 70));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Pedido.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Abrir_Caja.png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliveryapp/Imagenes/Barra blanca.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 172, 280, 0));

        inicio_lbl.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Pedidos_Pend.png"))); // NOI18N
        add(inicio_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("    A??adir un pedido");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 140, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("   Ver Cliente/Pedidos");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 140, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("        Listar pedidos");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 140, 20));

        abrircaja_txt.setBackground(new java.awt.Color(255, 255, 255));
        abrircaja_txt.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        abrircaja_txt.setForeground(new java.awt.Color(255, 255, 255));
        abrircaja_txt.setText("          Abrir Caja");
        abrircaja_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abrircaja_txt.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        add(abrircaja_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, -1));

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Monto Inicial");
        add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliveryapp/Imagenes/Barra blanca.png"))); // NOI18N
        add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 282, 1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Not.png"))); // NOI18N
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText(" A??adir Gasto Extra");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 120, 20));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/List_not.png"))); // NOI18N
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 60, -1));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("            Gastos");
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 140, -1));

        Ganancia_diarias.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Ganancia_diarias.setForeground(new java.awt.Color(255, 255, 255));
        Ganancia_diarias.setText("0.00");
        add(Ganancia_diarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, -1, -1));

        rSButtonMaterialTwo7.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonMaterialTwo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo7.setBackgroundHover(new java.awt.Color(102, 51, 255));
        rSButtonMaterialTwo7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo7ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 140, 100));

        rSButtonMaterialTwo8.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonMaterialTwo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo8.setBackgroundHover(new java.awt.Color(102, 51, 255));
        rSButtonMaterialTwo8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo8ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 140, 100));

        rSButtonMaterialTwo4.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonMaterialTwo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo4.setBackgroundHover(new java.awt.Color(102, 51, 255));
        rSButtonMaterialTwo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonMaterialTwo4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo4ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 140, 100));

        abrir_caja_btn.setBackground(new java.awt.Color(204, 255, 204));
        abrir_caja_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        abrir_caja_btn.setBackgroundHover(new java.awt.Color(102, 51, 255));
        abrir_caja_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        abrir_caja_btn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        abrir_caja_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        abrir_caja_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_caja_btnActionPerformed(evt);
            }
        });
        add(abrir_caja_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 100));

        rSButtonMaterialTwo12.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonMaterialTwo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo12.setBackgroundHover(new java.awt.Color(102, 51, 255));
        rSButtonMaterialTwo12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo12ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 140, 100));

        inicio_lbl1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl1.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Acceso directo.png"))); // NOI18N
        add(inicio_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Modificar_Pedido.png"))); // NOI18N
        jLabel90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, -1));

        rSButtonMaterialTwo9.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonMaterialTwo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo9.setBackgroundHover(new java.awt.Color(102, 51, 255));
        rSButtonMaterialTwo9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo9ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 140, 100));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("$ ");
        add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("     Modificar Estado");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 140, -1));

        inicio_lbl2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl2.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Recurso 13.png"))); // NOI18N
        add(inicio_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        inicio_lbl3.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl3.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(inicio_lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 40));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, 90));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, 90));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 120, 90));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 120, 90));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 120, 90));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 130, 90));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado2.png"))); // NOI18N
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 302, 98));

        jLabel94.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 20, 40));

        jLabel95.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 20, 40));

        jLabel96.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 20, 40));

        jLabel98.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 20, 40));

        inicio_lbl4.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl4.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Recurso 13.png"))); // NOI18N
        add(inicio_lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        inicio_lbl5.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        inicio_lbl5.setForeground(new java.awt.Color(128, 128, 131));
        inicio_lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(inicio_lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, 40));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Cuadrado4.png"))); // NOI18N
        add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 290, 90));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Abrir_Caja.png"))); // NOI18N
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        abrircaja_txt2.setBackground(new java.awt.Color(255, 255, 255));
        abrircaja_txt2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        abrircaja_txt2.setForeground(new java.awt.Color(255, 255, 255));
        abrircaja_txt2.setText("          Cerrar Caja");
        abrircaja_txt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abrircaja_txt2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        add(abrircaja_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, -1));

        rSButtonMaterialTwo14.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonMaterialTwo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo14.setBackgroundHover(new java.awt.Color(102, 51, 255));
        rSButtonMaterialTwo14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo14.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo14ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 140, 100));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, 90));

        jLabel101.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 20, 40));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 1070, 170));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/List_not.png"))); // NOI18N
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 60, -1));

        rSButtonMaterialTwo10.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonMaterialTwo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo10.setBackgroundHover(new java.awt.Color(102, 51, 255));
        rSButtonMaterialTwo10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo10.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/A??adir_Cadete.png"))); // NOI18N
        rSButtonMaterialTwo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo10ActionPerformed(evt);
            }
        });
        add(rSButtonMaterialTwo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 140, 100));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado3.png"))); // NOI18N
        add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 130, 90));

        jLabel100.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/flecha-correcta(1).png"))); // NOI18N
        add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 20, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Ganan_32.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, -1, -1));

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Ganancias Del Dia");
        add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliveryapp/Imagenes/Barra blanca.png"))); // NOI18N
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 282, 1));

        Ganancia_diarias1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Ganancia_diarias1.setForeground(new java.awt.Color(255, 255, 255));
        Ganancia_diarias1.setText("0.00");
        add(Ganancia_diarias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("$ ");
        add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Img/Cuadrado2.png"))); // NOI18N
        add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 302, 98));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Home/Cuadrado4.png"))); // NOI18N
        add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 290, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialTwo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo4ActionPerformed
       Registro_Pedido_Nuevo_otro x = new Registro_Pedido_Nuevo_otro();
       x.setVisible(true);
       
    }//GEN-LAST:event_rSButtonMaterialTwo4ActionPerformed

    private void rSButtonMaterialTwo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo9ActionPerformed
        Modificar_Pedido x = new Modificar_Pedido();
        x.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialTwo9ActionPerformed

    private void rSButtonMaterialTwo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo12ActionPerformed
               
        Registro_Notificaciones x = new Registro_Notificaciones();
          x.setVisible(true);
          
    }//GEN-LAST:event_rSButtonMaterialTwo12ActionPerformed

    private void rSButtonMaterialTwo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo7ActionPerformed
        Listado_Notificaciones x = new Listado_Notificaciones();
        x.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialTwo7ActionPerformed

    private void rSButtonMaterialTwo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo8ActionPerformed
       Listado_Pedidos x = new Listado_Pedidos();
       x.setVisible(true);
       
    }//GEN-LAST:event_rSButtonMaterialTwo8ActionPerformed

    private void rSButtonMaterialTwo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo14ActionPerformed
       try {
            
            Monto_Final CC = new  Monto_Final ();
            CC.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger( Monto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSButtonMaterialTwo14ActionPerformed

    private void abrir_caja_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_caja_btnActionPerformed
        Monto_Inicial AC;
        try {
            AC = new Monto_Inicial();
            AC.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_abrir_caja_btnActionPerformed

    private void rSButtonMaterialTwo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo10ActionPerformed
       Eliminar_Pedido x = new Eliminar_Pedido();
       x.setVisible(true);
       
    }//GEN-LAST:event_rSButtonMaterialTwo10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Ganancia_diarias;
    public static javax.swing.JLabel Ganancia_diarias1;
    public static javax.swing.JTable Tabla_pro;
    public RSMaterialComponent.RSButtonMaterialTwo abrir_caja_btn;
    private javax.swing.JLabel abrircaja_txt;
    private javax.swing.JLabel abrircaja_txt2;
    public javax.swing.JLabel inicio_lbl;
    public javax.swing.JLabel inicio_lbl1;
    public javax.swing.JLabel inicio_lbl2;
    public javax.swing.JLabel inicio_lbl3;
    public javax.swing.JLabel inicio_lbl4;
    public javax.swing.JLabel inicio_lbl5;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo10;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo12;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo14;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo4;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo7;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo8;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo9;
    // End of variables declaration//GEN-END:variables
}
