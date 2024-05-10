
package Triquitraque;

import java.awt.Color;
import javax.swing.JLabel;


public class Tablero5x5 extends javax.swing.JFrame {

    Juego juego=new Juego();
    
    private Jugador jugador1;
    private Jugador jugador2;
    private String dato;
    boolean estado=true;
     
    String siguiente="O";
    String turno="X";
    JLabel lbs[]=new JLabel[25];
    int vs[][]={
        {1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
        {16,17,18,19,20},
        {21,22,23,24,25},
        {1,6,11,16,21},
        {2,7,12,17,22},
        {3,8,13,18,23},
        {4,9,14,19,24},
        {5,10,15,20,25},
        {1,7,13,19,25},
        {5,9,13,17,21},

        
    };
    public void setJugador(Jugador jugador1, Jugador jugador2){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        
        lblJugador1.setText(jugador1.getNombre());
        lblJugador2.setText(jugador2.getNombre());
        
    }
    public Tablero5x5() {
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
        lbs[9]=jLabelJ;
        lbs[10]=jLabelK;
        lbs[11]=jLabelL;
        lbs[12]=jLabelM;
        lbs[13]=jLabelN;
        lbs[14]=jLabelO;
        lbs[15]=jLabelP;
        lbs[16]=jLabelQ;
        lbs[17]=jLabelS;
        lbs[18]=jLabelT;
        lbs[19]=jLabelU;
        lbs[20]=jLabelV;
        lbs[21]=jLabelX;
        lbs[22]=jLabelW;
        lbs[23]=jLabelY;
        lbs[24]=jLabelZ;
              
           
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelB = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        jLabelE = new javax.swing.JLabel();
        jLabelF = new javax.swing.JLabel();
        jLabelG = new javax.swing.JLabel();
        jLabelH = new javax.swing.JLabel();
        jLabelI = new javax.swing.JLabel();
        jLabelJ = new javax.swing.JLabel();
        jLabelK = new javax.swing.JLabel();
        jLabelL = new javax.swing.JLabel();
        jLabelM = new javax.swing.JLabel();
        jLabelN = new javax.swing.JLabel();
        jLabelO = new javax.swing.JLabel();
        jLabelP = new javax.swing.JLabel();
        jLabelQ = new javax.swing.JLabel();
        jLabelS = new javax.swing.JLabel();
        jLabelT = new javax.swing.JLabel();
        jLabelU = new javax.swing.JLabel();
        jLabelV = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabelW = new javax.swing.JLabel();
        jLabelY = new javax.swing.JLabel();
        jLabelZ = new javax.swing.JLabel();
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

        jLabelB.setBackground(new java.awt.Color(255, 255, 255));
        jLabelB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelB.setOpaque(true);
        jLabelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBMousePressed(evt);
            }
        });

        jLabelD.setBackground(new java.awt.Color(255, 255, 255));
        jLabelD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelD.setOpaque(true);
        jLabelD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelDMousePressed(evt);
            }
        });

        jLabelC.setBackground(new java.awt.Color(255, 255, 255));
        jLabelC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelC.setOpaque(true);
        jLabelC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCMousePressed(evt);
            }
        });

        jLabelA.setBackground(new java.awt.Color(255, 255, 255));
        jLabelA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA.setOpaque(true);
        jLabelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAMousePressed(evt);
            }
        });

        jLabelE.setBackground(new java.awt.Color(255, 255, 255));
        jLabelE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE.setOpaque(true);
        jLabelE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelEMousePressed(evt);
            }
        });

        jLabelF.setBackground(new java.awt.Color(255, 255, 255));
        jLabelF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelF.setOpaque(true);
        jLabelF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFMousePressed(evt);
            }
        });

        jLabelG.setBackground(new java.awt.Color(255, 255, 255));
        jLabelG.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelG.setOpaque(true);
        jLabelG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelGMousePressed(evt);
            }
        });

        jLabelH.setBackground(new java.awt.Color(255, 255, 255));
        jLabelH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH.setOpaque(true);
        jLabelH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelHMousePressed(evt);
            }
        });

        jLabelI.setBackground(new java.awt.Color(255, 255, 255));
        jLabelI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelI.setOpaque(true);
        jLabelI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelIMousePressed(evt);
            }
        });

        jLabelJ.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJ.setOpaque(true);
        jLabelJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelJMousePressed(evt);
            }
        });

        jLabelK.setBackground(new java.awt.Color(255, 255, 255));
        jLabelK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelK.setOpaque(true);
        jLabelK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelKMousePressed(evt);
            }
        });

        jLabelL.setBackground(new java.awt.Color(255, 255, 255));
        jLabelL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelL.setOpaque(true);
        jLabelL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelLMousePressed(evt);
            }
        });

        jLabelM.setBackground(new java.awt.Color(255, 255, 255));
        jLabelM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM.setOpaque(true);
        jLabelM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMMousePressed(evt);
            }
        });

        jLabelN.setBackground(new java.awt.Color(255, 255, 255));
        jLabelN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelN.setOpaque(true);
        jLabelN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelNMousePressed(evt);
            }
        });

        jLabelO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelO.setOpaque(true);
        jLabelO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelOMousePressed(evt);
            }
        });

        jLabelP.setBackground(new java.awt.Color(255, 255, 255));
        jLabelP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP.setOpaque(true);
        jLabelP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPMousePressed(evt);
            }
        });

        jLabelQ.setBackground(new java.awt.Color(255, 255, 255));
        jLabelQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQ.setOpaque(true);
        jLabelQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelQMousePressed(evt);
            }
        });

        jLabelS.setBackground(new java.awt.Color(255, 255, 255));
        jLabelS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelS.setOpaque(true);
        jLabelS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSMousePressed(evt);
            }
        });

        jLabelT.setBackground(new java.awt.Color(255, 255, 255));
        jLabelT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelT.setOpaque(true);
        jLabelT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelTMousePressed(evt);
            }
        });

        jLabelU.setBackground(new java.awt.Color(255, 255, 255));
        jLabelU.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelU.setOpaque(true);
        jLabelU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelUMousePressed(evt);
            }
        });

        jLabelV.setBackground(new java.awt.Color(255, 255, 255));
        jLabelV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelV.setOpaque(true);
        jLabelV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVMousePressed(evt);
            }
        });

        jLabelX.setBackground(new java.awt.Color(255, 255, 255));
        jLabelX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelX.setOpaque(true);
        jLabelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelXMousePressed(evt);
            }
        });

        jLabelW.setBackground(new java.awt.Color(255, 255, 255));
        jLabelW.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelW.setOpaque(true);
        jLabelW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelWMousePressed(evt);
            }
        });

        jLabelY.setBackground(new java.awt.Color(255, 255, 255));
        jLabelY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelY.setOpaque(true);
        jLabelY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelYMousePressed(evt);
            }
        });

        jLabelZ.setBackground(new java.awt.Color(255, 255, 255));
        jLabelZ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelZ.setOpaque(true);
        jLabelZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelZMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabelK, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelM, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelO, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelG, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelH, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelI, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelJ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabelV, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelW, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelY, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelZ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabelP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelQ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelT, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelU, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelH, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelU, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelW, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelZ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbTurno.setText("Turno de X");

        lblJugador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJugador1.setText("X =");

        lbPuntajex.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPuntajex.setText("0");

        lblJugador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJugador2.setText("O =");

        lbPuntajeO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPuntajeO.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTurno)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJugador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPuntajex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJugador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPuntajeO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbTurno)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJugador1)
                    .addComponent(lbPuntajex))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJugador2)
                    .addComponent(lbPuntajeO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbIniciar.setText("INICIAR PARTIDA");
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
                .addContainerGap()
                .addComponent(jbIniciar)
                .addGap(195, 195, 195)
                .addComponent(jbReiniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIniciar)
                    .addComponent(jbReiniciar))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabelJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelJMousePressed
        if(juego.enJuego==true){
        presionar(10);
     }
    }//GEN-LAST:event_jLabelJMousePressed

    private void jLabelKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKMousePressed
       if(juego.enJuego==true){
        presionar(11);
     }
    }//GEN-LAST:event_jLabelKMousePressed

    private void jLabelLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLMousePressed
        if(juego.enJuego==true){
        presionar(12);
     }
    }//GEN-LAST:event_jLabelLMousePressed

    private void jLabelMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMMousePressed
        if(juego.enJuego==true){
        presionar(13);
     }
    }//GEN-LAST:event_jLabelMMousePressed

    private void jLabelNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNMousePressed
       if(juego.enJuego==true){
        presionar(14);
     }
    }//GEN-LAST:event_jLabelNMousePressed

    private void jLabelOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOMousePressed
        if(juego.enJuego==true){
        presionar(15);
     }
    }//GEN-LAST:event_jLabelOMousePressed

    private void jLabelPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPMousePressed
        if(juego.enJuego==true){
        presionar(16);
     }
    }//GEN-LAST:event_jLabelPMousePressed

    private void jLabelQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQMousePressed
         if(juego.enJuego==true){
        presionar(17);
     }
    }//GEN-LAST:event_jLabelQMousePressed

    private void jLabelSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSMousePressed
        if(juego.enJuego==true){
        presionar(18);
     }
    }//GEN-LAST:event_jLabelSMousePressed

    private void jLabelTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTMousePressed
         if(juego.enJuego==true){
        presionar(19);
     }
    }//GEN-LAST:event_jLabelTMousePressed

    private void jLabelUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUMousePressed
        if(juego.enJuego==true){
        presionar(20);
     }
    }//GEN-LAST:event_jLabelUMousePressed

    private void jLabelVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVMousePressed
         if(juego.enJuego==true){
        presionar(21);
     }
    }//GEN-LAST:event_jLabelVMousePressed

    private void jLabelXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelXMousePressed
        if(juego.enJuego==true){
        presionar(22);
     }
    }//GEN-LAST:event_jLabelXMousePressed

    private void jLabelWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWMousePressed
      if(juego.enJuego==true){
        presionar(23);
     }
    }//GEN-LAST:event_jLabelWMousePressed

    private void jLabelYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelYMousePressed
         if(juego.enJuego==true){
        presionar(24);
     }
    }//GEN-LAST:event_jLabelYMousePressed

    private void jLabelZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelZMousePressed
        if(juego.enJuego==true){
        presionar(25);
     }
    }//GEN-LAST:event_jLabelZMousePressed

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
                    lbs[vs[i][3]-1].getText().equals("X")&&
                    lbs[vs[i][4]-1].getText().equals("X")){
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
                lbs[vs[i][3]-1].setBackground(Color.red);
                lbs[vs[i][4]-1].setBackground(Color.red);
                
                lbPuntajex.setText(Integer.toString(Integer.parseInt(lbPuntajex.getText())+1));
                
                lbTurno.setText("Ha ganado X");
                estado=false;    
                    
        }
            if(lbs[vs[i][0]-1].getText().equals("O")&&
                    lbs[vs[i][1]-1].getText().equals("O")&&
                    lbs[vs[i][2]-1].getText().equals("O")&&
                    lbs[vs[i][3]-1].getText().equals("O")&&
                    lbs[vs[i][4]-1].getText().equals("O")){
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
                lbs[vs[i][3]-1].setBackground(Color.red);
                lbs[vs[i][4]-1].setBackground(Color.red);
                
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
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero5x5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelE;
    private javax.swing.JLabel jLabelF;
    private javax.swing.JLabel jLabelG;
    private javax.swing.JLabel jLabelH;
    private javax.swing.JLabel jLabelI;
    private javax.swing.JLabel jLabelJ;
    private javax.swing.JLabel jLabelK;
    private javax.swing.JLabel jLabelL;
    private javax.swing.JLabel jLabelM;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JLabel jLabelO;
    private javax.swing.JLabel jLabelP;
    private javax.swing.JLabel jLabelQ;
    private javax.swing.JLabel jLabelS;
    private javax.swing.JLabel jLabelT;
    private javax.swing.JLabel jLabelU;
    private javax.swing.JLabel jLabelV;
    private javax.swing.JLabel jLabelW;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLabel jLabelY;
    private javax.swing.JLabel jLabelZ;
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
