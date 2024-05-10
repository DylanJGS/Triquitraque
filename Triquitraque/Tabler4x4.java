/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Triquitraque;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author LENOVO
 */
public class Tabler4x4 extends javax.swing.JFrame {

    Juego juego=new Juego();
    
    private Jugador jugador1;
    private Jugador jugador2;
    private String dato;
    boolean estado=true;
     
    String siguiente="O";
    String turno="X";
    JLabel lbs[]=new JLabel[16];
    int vs[][]={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16},
        {1,5,9,13},
        {2,6,10,14},
        {3,7,11,15},
        {4,8,12,16},
        {1,6,11,16},
        {4,7,10,13},
  
        
    };
    public void setJugador(Jugador jugador1, Jugador jugador2){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        
        lblJugador1.setText(jugador1.getNombre());
        lblJugador2.setText(jugador2.getNombre());
        
    }
    
    public Tabler4x4() {
        initComponents();
        
        setLocationRelativeTo(null);
        juego.setTurno("X");
        juego.setEnJuego(true);
        
        lbs[0]=jLabel1;
        lbs[1]=jLabel2;
        lbs[2]=jLabel3;
        lbs[3]=jLabel4;
        lbs[4]=jLabel5;
        lbs[5]=jLabel6;
        lbs[6]=jLabel7;
        lbs[7]=jLabel8;
        lbs[8]=jLabel9;
        lbs[9]=jLabelA;
        lbs[10]=jLabelB;
        lbs[11]=jLabelC;
        lbs[12]=jLabelD;
        lbs[13]=jLabelE;
        lbs[14]=jLabelF;
        lbs[15]=jLabelG;
        
    }
    

  
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jLabelE = new javax.swing.JLabel();
        jLabelF = new javax.swing.JLabel();
        jLabelG = new javax.swing.JLabel();
        lbTurno = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        lbPuntajex = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lbPuntajeO = new javax.swing.JLabel();
        jbIniciar = new javax.swing.JButton();
        jbReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
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

        jLabelB.setBackground(new java.awt.Color(255, 255, 255));
        jLabelB.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelB.setOpaque(true);
        jLabelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
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

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
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

        jLabelF.setBackground(new java.awt.Color(255, 255, 255));
        jLabelF.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelF.setOpaque(true);
        jLabelF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFMousePressed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbTurno.setText("Turno de X");

        lblJugador1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJugador1.setText("X =");

        lbPuntajex.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPuntajex.setText("0");

        lblJugador2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJugador2.setText("O =");

        lbPuntajeO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPuntajeO.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTurno)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJugador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPuntajex, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblJugador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPuntajeO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJugador1)
                    .addComponent(lbPuntajex))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJugador2)
                            .addComponent(lbPuntajeO))
                        .addGap(26, 26, 26))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbReiniciar)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIniciar)
                    .addComponent(jbReiniciar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
      if(juego.enJuego==true){
        presionar(1);
     }
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        if(juego.enJuego==true){
        presionar(2);
     }
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        if(juego.enJuego==true){
        presionar(3);
     }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        if(juego.enJuego==true){
        presionar(4);
     }
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
       if(juego.enJuego==true){
        presionar(5);
     }
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        if(juego.enJuego==true){
        presionar(6);
     }
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
       if(juego.enJuego==true){
        presionar(7);
     }
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
       if(juego.enJuego==true){
        presionar(8);
     }
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        if(juego.enJuego==true){
        presionar(9);
     }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabelAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAMousePressed
       if(juego.enJuego==true){
        presionar(10);
     }
    }//GEN-LAST:event_jLabelAMousePressed

    private void jLabelBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBMousePressed
        if(juego.enJuego==true){
        presionar(11);
     }
    }//GEN-LAST:event_jLabelBMousePressed

    private void jLabelCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCMousePressed
        if(juego.enJuego==true){
        presionar(12);
     }
    }//GEN-LAST:event_jLabelCMousePressed

    private void jLabelDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDMousePressed
       if(juego.enJuego==true){
        presionar(13);
     }
    }//GEN-LAST:event_jLabelDMousePressed

    private void jLabelEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEMousePressed
      if(juego.enJuego==true){
        presionar(14);
     }
    }//GEN-LAST:event_jLabelEMousePressed

    private void jLabelFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFMousePressed
        if(juego.enJuego==true){
        presionar(15);
     }
    }//GEN-LAST:event_jLabelFMousePressed

    private void jLabelGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGMousePressed
       if(juego.enJuego==true){
        presionar(16);
     }
    }//GEN-LAST:event_jLabelGMousePressed

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

    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarActionPerformed
        JuegoAmigo abri=new JuegoAmigo();
        abri.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbIniciarActionPerformed

    
    
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
                    lbs[vs[i][2]-1].getText().equals("X")&&
                    lbs[vs[i][3]-1].getText().equals("X")){
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
                lbs[vs[i][3]-1].setBackground(Color.red);
                
                lbPuntajex.setText(Integer.toString(Integer.parseInt(lbPuntajex.getText())+1));
                
                lbTurno.setText("Ha ganado X");
                estado=false;    
                    
        }
            if(lbs[vs[i][0]-1].getText().equals("O")&&
                    lbs[vs[i][1]-1].getText().equals("O")&&
                    lbs[vs[i][2]-1].getText().equals("O")&&
                    lbs[vs[i][3]-1].getText().equals("O")){
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
                lbs[vs[i][3]-1].setBackground(Color.red);
                
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
            java.util.logging.Logger.getLogger(Tabler4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabler4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabler4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabler4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabler4x4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelE;
    private javax.swing.JLabel jLabelF;
    private javax.swing.JLabel jLabelG;
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
