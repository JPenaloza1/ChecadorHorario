package com.views;

import java.awt.Color;

public class frmMenuOpcionesEmpleado extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    private String opcion = "";
    
    public frmMenuOpcionesEmpleado() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        empleadoLbl = new javax.swing.JLabel();
        modEmpleadoPan = new javax.swing.JPanel();
        modEmpleadoLbl = new javax.swing.JLabel();
        modHorarioPan = new javax.swing.JPanel();
        modHorarioLbl = new javax.swing.JLabel();
        justFaltaPan = new javax.swing.JPanel();
        justFaltaLbl = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        minimizarPan = new javax.swing.JPanel();
        minimizarLbl = new javax.swing.JLabel();
        idEmpleadoLbl = new javax.swing.JLabel();

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

        empleadoLbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        empleadoLbl.setText("Jonathan Alexis Peñaloza Sanchez");
        fondoPan.add(empleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 570, -1));

        modEmpleadoPan.setBackground(new java.awt.Color(3, 137, 206));

        modEmpleadoLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        modEmpleadoLbl.setForeground(new java.awt.Color(255, 255, 255));
        modEmpleadoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modEmpleadoLbl.setText("Modificar empleado");
        modEmpleadoLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modEmpleadoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modEmpleadoLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modEmpleadoLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modEmpleadoLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modEmpleadoPanLayout = new javax.swing.GroupLayout(modEmpleadoPan);
        modEmpleadoPan.setLayout(modEmpleadoPanLayout);
        modEmpleadoPanLayout.setHorizontalGroup(
            modEmpleadoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modEmpleadoPanLayout.createSequentialGroup()
                .addComponent(modEmpleadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        modEmpleadoPanLayout.setVerticalGroup(
            modEmpleadoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modEmpleadoPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modEmpleadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(modEmpleadoPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 40));

        modHorarioPan.setBackground(new java.awt.Color(3, 137, 206));

        modHorarioLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        modHorarioLbl.setForeground(new java.awt.Color(255, 255, 255));
        modHorarioLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modHorarioLbl.setText("Modificar horario");
        modHorarioLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modHorarioLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modHorarioLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modHorarioLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modHorarioLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modHorarioPanLayout = new javax.swing.GroupLayout(modHorarioPan);
        modHorarioPan.setLayout(modHorarioPanLayout);
        modHorarioPanLayout.setHorizontalGroup(
            modHorarioPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modHorarioPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modHorarioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        modHorarioPanLayout.setVerticalGroup(
            modHorarioPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modHorarioPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modHorarioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(modHorarioPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 310, 40));

        justFaltaPan.setBackground(new java.awt.Color(3, 137, 206));

        justFaltaLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        justFaltaLbl.setForeground(new java.awt.Color(255, 255, 255));
        justFaltaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        justFaltaLbl.setText("Justificar Falta");
        justFaltaLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        justFaltaLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justFaltaLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                justFaltaLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                justFaltaLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout justFaltaPanLayout = new javax.swing.GroupLayout(justFaltaPan);
        justFaltaPan.setLayout(justFaltaPanLayout);
        justFaltaPanLayout.setHorizontalGroup(
            justFaltaPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, justFaltaPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(justFaltaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        justFaltaPanLayout.setVerticalGroup(
            justFaltaPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, justFaltaPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(justFaltaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(justFaltaPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 310, 40));

        cancelarPan.setBackground(new java.awt.Color(255, 55, 98));

        cancelarLbl.setBackground(new java.awt.Color(255, 110, 99));
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
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarPanLayout.setVerticalGroup(
            cancelarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 40));
        fondoPan.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));
        fondoPan.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 630, 10));

        minimizarPan.setBackground(new java.awt.Color(255, 255, 255));

        minimizarLbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        minimizarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizarLbl.setText("-");
        minimizarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimizarPanLayout = new javax.swing.GroupLayout(minimizarPan);
        minimizarPan.setLayout(minimizarPanLayout);
        minimizarPanLayout.setHorizontalGroup(
            minimizarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        minimizarPanLayout.setVerticalGroup(
            minimizarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(minimizarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));

        idEmpleadoLbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        idEmpleadoLbl.setText("00000");
        fondoPan.add(idEmpleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarLblMouseClicked

    private void minimizarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseEntered
        minimizarPan.setBackground(Color.gray);
    }//GEN-LAST:event_minimizarLblMouseEntered

    private void minimizarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseExited
        minimizarPan.setBackground(Color.white);
    }//GEN-LAST:event_minimizarLblMouseExited

    private void modEmpleadoLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modEmpleadoLblMouseEntered
        modEmpleadoPan.setBackground(azulEntered);
    }//GEN-LAST:event_modEmpleadoLblMouseEntered

    private void modEmpleadoLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modEmpleadoLblMouseExited
        modEmpleadoPan.setBackground(azulExcited);
    }//GEN-LAST:event_modEmpleadoLblMouseExited

    private void modHorarioLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modHorarioLblMouseEntered
        modHorarioPan.setBackground(azulEntered);
    }//GEN-LAST:event_modHorarioLblMouseEntered

    private void modHorarioLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modHorarioLblMouseExited
        modHorarioPan.setBackground(azulExcited);
    }//GEN-LAST:event_modHorarioLblMouseExited

    private void justFaltaLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justFaltaLblMouseEntered
        justFaltaPan.setBackground(azulEntered);
    }//GEN-LAST:event_justFaltaLblMouseEntered

    private void justFaltaLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justFaltaLblMouseExited
        justFaltaPan.setBackground(azulExcited);
    }//GEN-LAST:event_justFaltaLblMouseExited

    private void cancelarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseEntered
        cancelarPan.setBackground(rojoEntered);
    }//GEN-LAST:event_cancelarLblMouseEntered

    private void cancelarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseExited
        cancelarPan.setBackground(rojoExited);
    }//GEN-LAST:event_cancelarLblMouseExited

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    //Este método se encarga de llamar al modificarEmpleado que está en el template
    private void modEmpleadoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modEmpleadoLblMouseClicked
        opcion = "Modificar empleado";
    }//GEN-LAST:event_modEmpleadoLblMouseClicked

    //Este método se encarga de cerrar la ventana opcionesEmpleado y abre
    //el menú principal
    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        opcion = "Cancelar";
    }//GEN-LAST:event_cancelarLblMouseClicked

    private void modHorarioLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modHorarioLblMouseClicked
        opcion = "Modificar horario";
    }//GEN-LAST:event_modHorarioLblMouseClicked

    private void justFaltaLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justFaltaLblMouseClicked
        opcion = "Justificar falta";
    }//GEN-LAST:event_justFaltaLblMouseClicked

    public String getOpcion() {
        return opcion;
    }
    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    public javax.swing.JLabel empleadoLbl;
    private javax.swing.JPanel fondoPan;
    public javax.swing.JLabel idEmpleadoLbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel justFaltaLbl;
    private javax.swing.JPanel justFaltaPan;
    private javax.swing.JLabel minimizarLbl;
    private javax.swing.JPanel minimizarPan;
    public javax.swing.JLabel modEmpleadoLbl;
    private javax.swing.JPanel modEmpleadoPan;
    public javax.swing.JLabel modHorarioLbl;
    private javax.swing.JPanel modHorarioPan;
    // End of variables declaration//GEN-END:variables
}
