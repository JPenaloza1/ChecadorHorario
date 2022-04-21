package com.views;

import java.awt.Color;

public class frmModificarTolerancia extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmModificarTolerancia() {
        initComponents();
        setLocationRelativeTo(this);
        fondoPan.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        entradaLbl = new javax.swing.JLabel();
        entradaTxt = new javax.swing.JTextField();
        entradaSp = new javax.swing.JSeparator();
        salidaLbl = new javax.swing.JLabel();
        salidaTxt = new javax.swing.JTextField();
        salidaSp = new javax.swing.JSeparator();
        guardarPan = new javax.swing.JPanel();
        guardarLbl = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();
        entradaLbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 250));
        setResizable(false);

        fondoPan.setBackground(new java.awt.Color(255, 255, 255));
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

        entradaLbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        entradaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entradaLbl.setText("Ajustar Tolerancia");
        fondoPan.add(entradaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        entradaTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        entradaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entradaTxt.setText("10");
        entradaTxt.setBorder(null);
        fondoPan.add(entradaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));
        fondoPan.add(entradaSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 20));

        salidaLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        salidaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salidaLbl.setText("Salida:");
        fondoPan.add(salidaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        salidaTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        salidaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        salidaTxt.setText("15");
        salidaTxt.setBorder(null);
        fondoPan.add(salidaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 50, -1));
        fondoPan.add(salidaSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, 20));

        guardarPan.setBackground(new java.awt.Color(3, 137, 206));

        guardarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        guardarLbl.setForeground(new java.awt.Color(255, 255, 255));
        guardarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarLbl.setText("Guardar");
        guardarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout guardarPanLayout = new javax.swing.GroupLayout(guardarPan);
        guardarPan.setLayout(guardarPanLayout);
        guardarPanLayout.setHorizontalGroup(
            guardarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        guardarPanLayout.setVerticalGroup(
            guardarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(guardarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 30));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarPanLayout.setVerticalGroup(
            cancelarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, 30));

        entradaLbl1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        entradaLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entradaLbl1.setText("Entrada:");
        fondoPan.add(entradaLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void guardarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLblMouseEntered
        guardarPan.setBackground(azulEntered);
    }//GEN-LAST:event_guardarLblMouseEntered

    private void guardarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLblMouseExited
        guardarPan.setBackground(azulExcited);
    }//GEN-LAST:event_guardarLblMouseExited

    private void cancelarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseEntered
        cancelarPan.setBackground(rojoEntered);
    }//GEN-LAST:event_cancelarLblMouseEntered

    private void cancelarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseExited
        cancelarPan.setBackground(rojoExited);
    }//GEN-LAST:event_cancelarLblMouseExited

    private void guardarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLblMouseClicked
        opcion = "guardar";
    }//GEN-LAST:event_guardarLblMouseClicked

    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        opcion = "cancelar";
    }//GEN-LAST:event_cancelarLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    private javax.swing.JLabel entradaLbl;
    private javax.swing.JLabel entradaLbl1;
    private javax.swing.JSeparator entradaSp;
    public javax.swing.JTextField entradaTxt;
    private javax.swing.JPanel fondoPan;
    public javax.swing.JLabel guardarLbl;
    private javax.swing.JPanel guardarPan;
    private javax.swing.JLabel salidaLbl;
    private javax.swing.JSeparator salidaSp;
    public javax.swing.JTextField salidaTxt;
    // End of variables declaration//GEN-END:variables
}
