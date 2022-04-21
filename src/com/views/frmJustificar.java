package com.views;

import java.awt.Color;

public class frmJustificar extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmJustificar() {
        initComponents();
        setLocationRelativeTo(this);
        fondoPan.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        justificarIntervalo1 = new javax.swing.JLabel();
        desdeLbl = new javax.swing.JLabel();
        desdeJdc = new com.toedter.calendar.JDateChooser();
        hastaLbl = new javax.swing.JLabel();
        hastaJdc = new com.toedter.calendar.JDateChooser();
        justificarIntervaloPan = new javax.swing.JPanel();
        justificarIntervaloLbl = new javax.swing.JLabel();
        justificarSp = new javax.swing.JSeparator();
        justificarDiaLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        fechaJdc = new com.toedter.calendar.JDateChooser();
        justificarDiaPan1 = new javax.swing.JPanel();
        justificarDiaLbl1 = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fondoPan.setBackground(new java.awt.Color(255, 255, 255));
        fondoPan.setPreferredSize(new java.awt.Dimension(500, 350));
        fondoPan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoPanMouseDragged(evt);
            }
        });
        fondoPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoPanMousePressed(evt);
            }
        });
        fondoPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        justificarIntervalo1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        justificarIntervalo1.setText("Justificar Intervalo");
        fondoPan.add(justificarIntervalo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        desdeLbl.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        desdeLbl.setText("Desde:");
        fondoPan.add(desdeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        fondoPan.add(desdeJdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 120, 20));

        hastaLbl.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        hastaLbl.setText("Hasta:");
        fondoPan.add(hastaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        fondoPan.add(hastaJdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 20));

        justificarIntervaloPan.setBackground(new java.awt.Color(3, 137, 206));
        justificarIntervaloPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        justificarIntervaloLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        justificarIntervaloLbl.setForeground(new java.awt.Color(255, 255, 255));
        justificarIntervaloLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        justificarIntervaloLbl.setText("Justificar");
        justificarIntervaloLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        justificarIntervaloLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justificarIntervaloLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                justificarIntervaloLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                justificarIntervaloLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout justificarIntervaloPanLayout = new javax.swing.GroupLayout(justificarIntervaloPan);
        justificarIntervaloPan.setLayout(justificarIntervaloPanLayout);
        justificarIntervaloPanLayout.setHorizontalGroup(
            justificarIntervaloPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(justificarIntervaloLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        justificarIntervaloPanLayout.setVerticalGroup(
            justificarIntervaloPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(justificarIntervaloLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(justificarIntervaloPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 30));

        justificarSp.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondoPan.add(justificarSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 10, 230));

        justificarDiaLbl.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        justificarDiaLbl.setText("Justificar Día");
        fondoPan.add(justificarDiaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        fechaLbl.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        fechaLbl.setText("Fecha:");
        fondoPan.add(fechaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));
        fondoPan.add(fechaJdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 20));

        justificarDiaPan1.setBackground(new java.awt.Color(3, 137, 206));

        justificarDiaLbl1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        justificarDiaLbl1.setForeground(new java.awt.Color(255, 255, 255));
        justificarDiaLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        justificarDiaLbl1.setText("Justificar");
        justificarDiaLbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        justificarDiaLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justificarDiaLbl1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                justificarDiaLbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                justificarDiaLbl1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout justificarDiaPan1Layout = new javax.swing.GroupLayout(justificarDiaPan1);
        justificarDiaPan1.setLayout(justificarDiaPan1Layout);
        justificarDiaPan1Layout.setHorizontalGroup(
            justificarDiaPan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(justificarDiaLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        justificarDiaPan1Layout.setVerticalGroup(
            justificarDiaPan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(justificarDiaLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(justificarDiaPan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 30));

        cancelarPan.setBackground(new java.awt.Color(255, 55, 98));

        cancelarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cancelarLbl.setForeground(new java.awt.Color(255, 255, 255));
        cancelarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarLbl.setText("Cancelar");
        cancelarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cancelarPanLayout = new javax.swing.GroupLayout(cancelarPan);
        cancelarPan.setLayout(cancelarPanLayout);
        cancelarPanLayout.setHorizontalGroup(
            cancelarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        cancelarPanLayout.setVerticalGroup(
            cancelarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    private void justificarIntervaloLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarIntervaloLblMouseEntered
        justificarIntervaloPan.setBackground(azulEntered);
    }//GEN-LAST:event_justificarIntervaloLblMouseEntered

    private void justificarIntervaloLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarIntervaloLblMouseExited
        justificarIntervaloPan.setBackground(azulExcited);
    }//GEN-LAST:event_justificarIntervaloLblMouseExited

    private void justificarDiaLbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarDiaLbl1MouseEntered
        justificarDiaPan1.setBackground(azulEntered);
    }//GEN-LAST:event_justificarDiaLbl1MouseEntered

    private void justificarDiaLbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarDiaLbl1MouseExited
        justificarDiaPan1.setBackground(azulExcited);
    }//GEN-LAST:event_justificarDiaLbl1MouseExited

    private void cancelarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseEntered
        cancelarPan.setBackground(Color.red);
    }//GEN-LAST:event_cancelarLblMouseEntered

    private void cancelarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseExited
        cancelarPan.setBackground(rojoExited);
    }//GEN-LAST:event_cancelarLblMouseExited

    private void justificarIntervaloLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarIntervaloLblMouseClicked
        opcion = "justificarIntervalo";
    }//GEN-LAST:event_justificarIntervaloLblMouseClicked

    private void justificarDiaLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarDiaLbl1MouseClicked
        opcion = "justificarDia";
    }//GEN-LAST:event_justificarDiaLbl1MouseClicked

    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        opcion = "cancelar";
    }//GEN-LAST:event_cancelarLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    public com.toedter.calendar.JDateChooser desdeJdc;
    private javax.swing.JLabel desdeLbl;
    public com.toedter.calendar.JDateChooser fechaJdc;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JPanel fondoPan;
    public com.toedter.calendar.JDateChooser hastaJdc;
    private javax.swing.JLabel hastaLbl;
    private javax.swing.JLabel justificarDiaLbl;
    public javax.swing.JLabel justificarDiaLbl1;
    private javax.swing.JPanel justificarDiaPan1;
    private javax.swing.JLabel justificarIntervalo1;
    public javax.swing.JLabel justificarIntervaloLbl;
    private javax.swing.JPanel justificarIntervaloPan;
    private javax.swing.JSeparator justificarSp;
    // End of variables declaration//GEN-END:variables
}
