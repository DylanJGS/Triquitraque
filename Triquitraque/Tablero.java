
package Triquitraque;

import java.awt.Color;
import javax.swing.JLabel;


public class Tablero extends javax.swing.JFrame {
    
    Juego juego=new Juego();
    
    private Jugador jugador1;
    private Jugador jugador2;
    private String dato;
    boolean estado=true;
     
    String siguiente="O";
    String turno="X";
    JLabel lbs[]=new JLabel[9];
    int vs[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {3,5,7},
        {1,5,9},
    };
    public void setJugador(Jugador jugador1, Jugador jugador2){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        
        lblJugador1.setText(jugador1.getNombre());
        lblJugador2.setText(jugador2.getNombre());
        
    }
    public Tablero() {
        initComponents();
 
        setLocationRelativeTo(null);
        
        juego.setTurno("X");
        juego.setEnJuego(true);

        lbs[0]=jLabelA;
        lbs[1]=jLabelB;
        lbs[2]=jLabelC;
        lbs[3]=jLabelD;
        lbs[4]=jLabelE;
        lbs[5]=jLabelF;
        lbs[6]=jLabelG;
        lbs[7]=jLabelH;
        lbs[8]=jLabelI;
        
        
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelB = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        jLabelF = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jLabelE = new javax.swing.JLabel();
        jLabelG = new javax.swing.JLabel();
        jLabelH = new javax.swing.JLabel();
        jLabelI = new javax.swing.JLabel();
        lbTurno = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lbPuntajex = new javax.swing.JLabel();
        lbPuntajeO = new javax.swing.JLabel();
        jbIniciar = new javax.swing.JButton();
        jbReiniciar = new javax.swing.JButton();

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablero");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabelB.setBackground(new java.awt.Color(255, 255, 255));
        jLabelB.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelB.setOpaque(true);
        jLabelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBMousePressed(evt);
            }
        });

        jLabelC.setBackground(new java.awt.Color(255, 255, 255));
        jLabelC.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelC.setOpaque(true);
        jLabelC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCMousePressed(evt);
            }
        });

        jLabelA.setBackground(new java.awt.Color(255, 255, 255));
        jLabelA.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA.setOpaque(true);
        jLabelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAMousePressed(evt);
            }
        });

        jLabelF.setBackground(new java.awt.Color(255, 255, 255));
        jLabelF.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelF.setOpaque(true);
        jLabelF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFMousePressed(evt);
            }
        });

        jLabelD.setBackground(new java.awt.Color(255, 255, 255));
        jLabelD.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelD.setOpaque(true);
        jLabelD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelDMousePressed(evt);
            }
        });

        jLabelE.setBackground(new java.awt.Color(255, 255, 255));
        jLabelE.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE.setOpaque(true);
        jLabelE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelEMousePressed(evt);
            }
        });

        jLabelG.setBackground(new java.awt.Color(255, 255, 255));
        jLabelG.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelG.setOpaque(true);
        jLabelG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelGMousePressed(evt);
            }
        });

        jLabelH.setBackground(new java.awt.Color(255, 255, 255));
        jLabelH.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH.setOpaque(true);
        jLabelH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelHMousePressed(evt);
            }
        });

        jLabelI.setBackground(new java.awt.Color(255, 255, 255));
        jLabelI.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelI.setOpaque(true);
        jLabelI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelIMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelH, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabelD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelH, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        lbTurno.setText("Turno de X");

        lblJugador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJugador1.setText("Jugador =");

        lblJugador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJugador2.setText("Jugador =");

        lbPuntajex.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPuntajex.setText("0");

        lbPuntajeO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPuntajeO.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblJugador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbPuntajex, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblJugador2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPuntajeO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJugador1)
                    .addComponent(lblJugador2)
                    .addComponent(lbPuntajex)
                    .addComponent(lbPuntajeO))
                .addGap(53, 53, 53))
        );

        jbIniciar.setText("INICIAR JUEGO");
        jbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarActionPerformed(evt);
            }
        });

        jbReiniciar.setText("REINICIAR");
        jbReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbReiniciar)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIniciar)
                    .addComponent(jbReiniciar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarActionPerformed
        JuegoAmigo abri=new JuegoAmigo();
        abri.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbIniciarActionPerformed

    private void jbReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReiniciarActionPerformed
        for(int i = 0; i<lbs.length;i++){
        lbs[i].setText("");
        lbs[i].setBackground(Color.white);
        }
        
        turno=siguiente;
        if(siguiente.equals("O")){
        siguiente="X";
        }else{
        siguiente="O";
        }
        
        lbTurno.setText("Turno de "+turno);
        estado=true;
    }//GEN-LAST:event_jbReiniciarActionPerformed

    private void jLabelAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAMousePressed
        if(juego.enJuego==true){
        presionar(1);
     }
    }//GEN-LAST:event_jLabelAMousePressed

    private void jLabelBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBMousePressed
        if(juego.enJuego==true){
        presionar(2);
     }
    }//GEN-LAST:event_jLabelBMousePressed

    private void jLabelCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCMousePressed
         if(juego.enJuego==true){
        presionar(3);
     }
    }//GEN-LAST:event_jLabelCMousePressed

    private void jLabelDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDMousePressed
         if(juego.enJuego==true){
        presionar(4);
     }
    }//GEN-LAST:event_jLabelDMousePressed

    private void jLabelEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEMousePressed
        if(juego.enJuego==true){
        presionar(5);
     }
    }//GEN-LAST:event_jLabelEMousePressed

    private void jLabelFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFMousePressed
         if(juego.enJuego==true){
        presionar(6);
     }
    }//GEN-LAST:event_jLabelFMousePressed

    private void jLabelGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGMousePressed
      if(juego.enJuego==true){
        presionar(7);
     }
    }//GEN-LAST:event_jLabelGMousePressed

    private void jLabelHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHMousePressed
         if(juego.enJuego==true){
        presionar(8);
     }
    }//GEN-LAST:event_jLabelHMousePressed

    private void jLabelIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIMousePressed
         if(juego.enJuego==true){
        presionar(9);
     }
    }//GEN-LAST:event_jLabelIMousePressed

    public void presionar(int casilla){
        if(lbs[casilla-1].getText().equals("")&& estado){
        lbs[casilla-1].setText(turno);
        
        cambiarTurno();
        comprobarGanador();
    
    }
    
    }
    
    public void cambiarTurno(){
      
       if(turno.equals("X")){
        turno="O";
        }else{
        turno="X";
        }
        lbTurno.setText("Turno de "+turno);
    
    }
    public void comprobarGanador(){
        
        for (int i=0 ; i <vs.length; i++){
            if(lbs[vs[i][0]-1].getText().equals("X")&&
                    lbs[vs[i][1]-1].getText().equals("X")&&
                    lbs[vs[i][2]-1].getText().equals("X")){
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
                
                lbPuntajex.setText(Integer.toString(Integer.parseInt(lbPuntajex.getText())+1));
                
                lbTurno.setText("Ha ganado X");
                estado=false;    
                    
        }
            if(lbs[vs[i][0]-1].getText().equals("O")&&
                    lbs[vs[i][1]-1].getText().equals("O")&&
                    lbs[vs[i][2]-1].getText().equals("O")){
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
                
                lbPuntajeO.setText(Integer.toString(Integer.parseInt(lbPuntajeO.getText())+1));
        
                lbTurno.setText("Ha ganado O");
                estado=false;
        }
        }
    
    }
   
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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelE;
    private javax.swing.JLabel jLabelF;
    private javax.swing.JLabel jLabelG;
    private javax.swing.JLabel jLabelH;
    private javax.swing.JLabel jLabelI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbIniciar;
    private javax.swing.JButton jbReiniciar;
    private javax.swing.JLabel lbPuntajeO;
    private javax.swing.JLabel lbPuntajex;
    private javax.swing.JLabel lbTurno;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    // End of variables declaration//GEN-END:variables
}
