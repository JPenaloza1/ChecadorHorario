package com.views;

import java.awt.Color;

public class frmJustificarFalta extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmJustificarFalta() {
        initComponents();
        setLocationRelativeTo(this);
        fondoPan.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        asistenciasPan = new javax.swing.JPanel();
        asistenciasScp = new javax.swing.JScrollPane();
        asistenciasTbl = new javax.swing.JTable();
        justificarPan = new javax.swing.JPanel();
        justificarLbl = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fondoPan.setBackground(new java.awt.Color(255, 255, 255));
        fondoPan.setEnabled(false);
        fondoPan.setPreferredSize(new java.awt.Dimension(400, 400));
        fondoPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asistenciasPan.setBackground(new java.awt.Color(255, 255, 255));
        asistenciasPan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asistencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        asistenciasPan.setPreferredSize(new java.awt.Dimension(380, 330));
        asistenciasPan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                asistenciasPanMouseDragged(evt);
            }
        });
        asistenciasPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                asistenciasPanMousePressed(evt);
            }
        });

        asistenciasTbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        asistenciasTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        asistenciasScp.setViewportView(asistenciasTbl);
        if (asistenciasTbl.getColumnModel().getColumnCount() > 0) {
            asistenciasTbl.getColumnModel().getColumn(0).setResizable(false);
            asistenciasTbl.getColumnModel().getColumn(1).setResizable(false);
            asistenciasTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout asistenciasPanLayout = new javax.swing.GroupLayout(asistenciasPan);
        asistenciasPan.setLayout(asistenciasPanLayout);
        asistenciasPanLayout.setHorizontalGroup(
            asistenciasPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(asistenciasScp, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
        asistenciasPanLayout.setVerticalGroup(
            asistenciasPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asistenciasPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asistenciasScp, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fondoPan.add(asistenciasPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        justificarPan.setBackground(new java.awt.Color(3, 137, 206));
        justificarPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        justificarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        justificarLbl.setForeground(new java.awt.Color(255, 255, 255));
        justificarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        justificarLbl.setText("Justificar");
        justificarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        justificarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justificarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                justificarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                justificarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout justificarPanLayout = new javax.swing.GroupLayout(justificarPan);
        justificarPan.setLayout(justificarPanLayout);
        justificarPanLayout.setHorizontalGroup(
            justificarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(justificarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        justificarPanLayout.setVerticalGroup(
            justificarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(justificarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(justificarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, 30));

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

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asistenciasPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenciasPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_asistenciasPanMousePressed

    private void asistenciasPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenciasPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_asistenciasPanMouseDragged

    private void justificarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarLblMouseEntered
        justificarPan.setBackground(azulEntered);
    }//GEN-LAST:event_justificarLblMouseEntered

    private void justificarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarLblMouseExited
        justificarPan.setBackground(azulExcited);
    }//GEN-LAST:event_justificarLblMouseExited

    private void cancelarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseEntered
        cancelarPan.setBackground(Color.red);
    }//GEN-LAST:event_cancelarLblMouseEntered

    private void cancelarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseExited
        cancelarPan.setBackground(rojoExited);
    }//GEN-LAST:event_cancelarLblMouseExited

    private void justificarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justificarLblMouseClicked
        opcion = "justificar";
    }//GEN-LAST:event_justificarLblMouseClicked

    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        opcion = "cancelar";
    }//GEN-LAST:event_cancelarLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asistenciasPan;
    private javax.swing.JScrollPane asistenciasScp;
    public javax.swing.JTable asistenciasTbl;
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    private javax.swing.JPanel fondoPan;
    public javax.swing.JLabel justificarLbl;
    private javax.swing.JPanel justificarPan;
    // End of variables declaration//GEN-END:variables
}
