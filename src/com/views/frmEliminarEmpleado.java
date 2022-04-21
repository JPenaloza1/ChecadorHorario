package com.views;

import java.awt.Color;

public class frmEliminarEmpleado extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmEliminarEmpleado() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        preguntaLbl = new javax.swing.JLabel();
        avisoLbl = new javax.swing.JLabel();
        eliminarPan = new javax.swing.JPanel();
        eliminarLbl = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        preguntaLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        preguntaLbl.setText("¿Estás seguro de eliminar al empleado?");
        fondoPan.add(preguntaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        avisoLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        avisoLbl.setText("No podrás revertir la acción");
        fondoPan.add(avisoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        eliminarPan.setBackground(new java.awt.Color(3, 137, 206));

        eliminarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        eliminarLbl.setForeground(new java.awt.Color(255, 255, 255));
        eliminarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarLbl.setText("Eliminar");
        eliminarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout eliminarPanLayout = new javax.swing.GroupLayout(eliminarPan);
        eliminarPan.setLayout(eliminarPanLayout);
        eliminarPanLayout.setHorizontalGroup(
            eliminarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        eliminarPanLayout.setVerticalGroup(
            eliminarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(eliminarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

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
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarPanLayout.setVerticalGroup(
            cancelarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLblMouseEntered
        eliminarPan.setBackground(azulEntered);
    }//GEN-LAST:event_eliminarLblMouseEntered

    private void eliminarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLblMouseExited
        eliminarPan.setBackground(azulExcited);
    }//GEN-LAST:event_eliminarLblMouseExited

    private void cancelarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseEntered
        cancelarPan.setBackground(rojoEntered);
    }//GEN-LAST:event_cancelarLblMouseEntered

    private void cancelarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseExited
        cancelarPan.setBackground(rojoExited);
    }//GEN-LAST:event_cancelarLblMouseExited

    //Este método cancela la eliminación del empleado
    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        opcion = "cancelar";
    }//GEN-LAST:event_cancelarLblMouseClicked

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void eliminarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLblMouseClicked
        opcion = "eliminar";
    }//GEN-LAST:event_eliminarLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoLbl;
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    public javax.swing.JLabel eliminarLbl;
    private javax.swing.JPanel eliminarPan;
    private javax.swing.JPanel fondoPan;
    private javax.swing.JLabel preguntaLbl;
    // End of variables declaration//GEN-END:variables
}
