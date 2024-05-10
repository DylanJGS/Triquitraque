
package Triquitraque;

public class JuegoAmigo extends javax.swing.JFrame {

 
    public JuegoAmigo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jb3x3 = new javax.swing.JButton();
        jb4x4 = new javax.swing.JButton();
        jb5x5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUGAR CON UN AMIGO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("TAMAÑO DEL TABLERO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE DEL PRIMER JUGADOR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE DEL SEGUNDO JUGADOR");

        jb3x3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb3x3.setText("3x3");
        jb3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3x3ActionPerformed(evt);
            }
        });

        jb4x4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb4x4.setText("4x4");
        jb4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4x4ActionPerformed(evt);
            }
        });

        jb5x5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb5x5.setText("5x5");
        jb5x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5x5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb4x4)
                        .addGap(18, 18, 18)
                        .addComponent(jb5x5)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb3x3)
                    .addComponent(jb4x4)
                    .addComponent(jb5x5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3x3ActionPerformed
      
        String nombre1 = (String) txtNombre1.getText();
        String nombre2 = (String) txtNombre2.getText();
        
        Jugador jugador1=new Jugador(nombre1);
        Jugador jugador2=new Jugador(nombre2);
        
        Tablero abrir=new Tablero();
        
        abrir.setJugador(jugador1, jugador2);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb3x3ActionPerformed

    private void jb4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4x4ActionPerformed
        String nombre1 = (String) txtNombre1.getText();
        String nombre2 = (String) txtNombre2.getText();

        
        Jugador jugador1=new Jugador(nombre1);
        Jugador jugador2=new Jugador(nombre2);
        
        Tabler4x4 abri=new Tabler4x4();
        abri.setJugador(jugador1, jugador2);
        abri.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb4x4ActionPerformed

    private void jb5x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5x5ActionPerformed
        String nombre1 = (String) txtNombre1.getText();
        String nombre2 = (String) txtNombre2.getText();
        
        Jugador jugador1=new Jugador(nombre1);
        Jugador jugador2=new Jugador(nombre2);
        
        Tablero5x5 abri=new Tablero5x5();
        abri.setJugador(jugador1, jugador2);
        abri.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb5x5ActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb3x3;
    private javax.swing.JButton jb4x4;
    private javax.swing.JButton jb5x5;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}
