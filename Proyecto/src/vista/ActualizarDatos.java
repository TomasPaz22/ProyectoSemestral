package vista;

import java.awt.Color;

public class ActualizarDatos extends javax.swing.JFrame {

    int xMouse, yMouse; //variables para cada eje
    
    public ActualizarDatos() {
        initComponents();
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
        jP_Barra = new javax.swing.JPanel();
        jP_CerrarX = new javax.swing.JPanel();
        jL_exit = new javax.swing.JLabel();
        jB_Regresar = new javax.swing.JButton();
        jL_FondoMorado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_Barra.setBackground(new java.awt.Color(204, 204, 204));
        jP_Barra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jP_Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jP_BarraMouseDragged(evt);
            }
        });
        jP_Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jP_BarraMousePressed(evt);
            }
        });

        jP_CerrarX.setBackground(new java.awt.Color(255, 0, 153));
        jP_CerrarX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jP_CerrarXMouseEntered(evt);
            }
        });

        jL_exit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jL_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_exit.setText("X");
        jL_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jL_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jL_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jP_CerrarXLayout = new javax.swing.GroupLayout(jP_CerrarX);
        jP_CerrarX.setLayout(jP_CerrarXLayout);
        jP_CerrarXLayout.setHorizontalGroup(
            jP_CerrarXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        jP_CerrarXLayout.setVerticalGroup(
            jP_CerrarXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jB_Regresar.setBackground(new java.awt.Color(255, 153, 255));
        jB_Regresar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jB_Regresar.setText("Volver");
        jB_Regresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jB_Regresar.setContentAreaFilled(false);
        jB_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_BarraLayout = new javax.swing.GroupLayout(jP_Barra);
        jP_Barra.setLayout(jP_BarraLayout);
        jP_BarraLayout.setHorizontalGroup(
            jP_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BarraLayout.createSequentialGroup()
                .addComponent(jP_CerrarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 706, Short.MAX_VALUE)
                .addComponent(jB_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_BarraLayout.setVerticalGroup(
            jP_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_CerrarX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jB_Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jP_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        jL_FondoMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inci.jpg"))); // NOI18N
        jL_FondoMorado.setText("jLabel1");
        jL_FondoMorado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jL_FondoMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 70, 510));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Contraseña", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jL_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jL_exitMouseClicked

    private void jL_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseEntered
        jP_CerrarX.setBackground(Color.red);
    }//GEN-LAST:event_jL_exitMouseEntered

    private void jL_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseExited
        jP_CerrarX.setBackground(new Color(255,0,153));
    }//GEN-LAST:event_jL_exitMouseExited

    private void jP_CerrarXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_CerrarXMouseEntered
        //ME EQUIVOQUÉ
    }//GEN-LAST:event_jP_CerrarXMouseEntered

    private void jB_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RegresarActionPerformed
        Inicio newframe = new Inicio();
        newframe.setVisible(true);
        this.dispose();
        newframe.setLocationRelativeTo(null);
    }//GEN-LAST:event_jB_RegresarActionPerformed

    private void jP_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y- yMouse);
    }//GEN-LAST:event_jP_BarraMouseDragged

    private void jP_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jP_BarraMousePressed

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
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Regresar;
    private javax.swing.JLabel jL_FondoMorado;
    private javax.swing.JLabel jL_exit;
    private javax.swing.JPanel jP_Barra;
    private javax.swing.JPanel jP_CerrarX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
