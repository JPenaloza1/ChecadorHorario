package com.views;

import java.awt.Color;


public class frmGenerarReporteSeleccion extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmGenerarReporteSeleccion() {
        initComponents();
        setLocationRelativeTo(this);
        fondoPan.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        exportarPan = new javax.swing.JPanel();
        exportarLbl = new javax.swing.JLabel();
        salirPan = new javax.swing.JPanel();
        salirLbl = new javax.swing.JLabel();
        individualPan = new javax.swing.JPanel();
        individualScp = new javax.swing.JScrollPane();
        individualTbl = new javax.swing.JTable();
        generalPan = new javax.swing.JPanel();
        generalScp = new javax.swing.JScrollPane();
        generalTbl = new javax.swing.JTable();
        generoPan = new javax.swing.JPanel();
        generoScp = new javax.swing.JScrollPane();
        generoTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fondoPan.setBackground(new java.awt.Color(255, 255, 255));
        fondoPan.setPreferredSize(new java.awt.Dimension(400, 400));
        fondoPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exportarPan.setBackground(new java.awt.Color(3, 137, 206));
        exportarPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        exportarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        exportarLbl.setForeground(new java.awt.Color(255, 255, 255));
        exportarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exportarLbl.setText("Exportar");
        exportarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exportarPanLayout = new javax.swing.GroupLayout(exportarPan);
        exportarPan.setLayout(exportarPanLayout);
        exportarPanLayout.setHorizontalGroup(
            exportarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        exportarPanLayout.setVerticalGroup(
            exportarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(exportarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, 30));

        salirPan.setBackground(new java.awt.Color(255, 55, 98));

        salirLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        salirLbl.setForeground(new java.awt.Color(255, 255, 255));
        salirLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirLbl.setText("Salir");
        salirLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirPanLayout = new javax.swing.GroupLayout(salirPan);
        salirPan.setLayout(salirPanLayout);
        salirPanLayout.setHorizontalGroup(
            salirPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        salirPanLayout.setVerticalGroup(
            salirPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(salirPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, 30));

        individualPan.setBackground(new java.awt.Color(255, 255, 255));
        individualPan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte Individual", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        individualPan.setPreferredSize(new java.awt.Dimension(380, 330));
        individualPan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                individualPanMouseDragged(evt);
            }
        });
        individualPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                individualPanMousePressed(evt);
            }
        });

        individualTbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        individualTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        individualScp.setViewportView(individualTbl);
        if (individualTbl.getColumnModel().getColumnCount() > 0) {
            individualTbl.getColumnModel().getColumn(0).setResizable(false);
            individualTbl.getColumnModel().getColumn(1).setResizable(false);
            individualTbl.getColumnModel().getColumn(2).setResizable(false);
            individualTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout individualPanLayout = new javax.swing.GroupLayout(individualPan);
        individualPan.setLayout(individualPanLayout);
        individualPanLayout.setHorizontalGroup(
            individualPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(individualScp, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
        individualPanLayout.setVerticalGroup(
            individualPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(individualPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(individualScp, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fondoPan.add(individualPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        generalPan.setBackground(new java.awt.Color(255, 255, 255));
        generalPan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte General", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        generalPan.setPreferredSize(new java.awt.Dimension(380, 330));
        generalPan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                generalPanMouseDragged(evt);
            }
        });
        generalPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generalPanMousePressed(evt);
            }
        });

        generalTbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        generalTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Empleado", "Fecha", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        generalScp.setViewportView(generalTbl);
        if (generalTbl.getColumnModel().getColumnCount() > 0) {
            generalTbl.getColumnModel().getColumn(0).setResizable(false);
            generalTbl.getColumnModel().getColumn(1).setResizable(false);
            generalTbl.getColumnModel().getColumn(2).setResizable(false);
            generalTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout generalPanLayout = new javax.swing.GroupLayout(generalPan);
        generalPan.setLayout(generalPanLayout);
        generalPanLayout.setHorizontalGroup(
            generalPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generalScp, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
        generalPanLayout.setVerticalGroup(
            generalPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generalScp, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fondoPan.add(generalPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        generoPan.setBackground(new java.awt.Color(255, 255, 255));
        generoPan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte Por Género", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        generoPan.setPreferredSize(new java.awt.Dimension(380, 330));
        generoPan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                generoPanMouseDragged(evt);
            }
        });
        generoPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generoPanMousePressed(evt);
            }
        });

        generoTbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        generoTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Género", "Fecha", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        generoScp.setViewportView(generoTbl);
        if (generoTbl.getColumnModel().getColumnCount() > 0) {
            generoTbl.getColumnModel().getColumn(0).setResizable(false);
            generoTbl.getColumnModel().getColumn(1).setResizable(false);
            generoTbl.getColumnModel().getColumn(2).setResizable(false);
            generoTbl.getColumnModel().getColumn(3).setResizable(false);
            generoTbl.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout generoPanLayout = new javax.swing.GroupLayout(generoPan);
        generoPan.setLayout(generoPanLayout);
        generoPanLayout.setHorizontalGroup(
            generoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generoScp, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
        generoPanLayout.setVerticalGroup(
            generoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generoPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generoScp, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fondoPan.add(generoPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

    private void exportarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportarLblMouseEntered
        exportarPan.setBackground(azulEntered);
    }//GEN-LAST:event_exportarLblMouseEntered

    private void exportarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportarLblMouseExited
        exportarPan.setBackground(azulExcited);
    }//GEN-LAST:event_exportarLblMouseExited

    private void salirLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLblMouseEntered
        salirPan.setBackground(Color.red);
    }//GEN-LAST:event_salirLblMouseEntered

    private void salirLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLblMouseExited
        salirPan.setBackground(rojoExited);
    }//GEN-LAST:event_salirLblMouseExited

    private void exportarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportarLblMouseClicked
        opcion = "exportar";
    }//GEN-LAST:event_exportarLblMouseClicked

    private void salirLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLblMouseClicked
        opcion = "salir";
    }//GEN-LAST:event_salirLblMouseClicked

    private void generalPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalPanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_generalPanMousePressed

    private void generoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoPanMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_generoPanMouseDragged

    private void generoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoPanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoPanMousePressed

    private void individualPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualPanMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_individualPanMouseDragged

    private void individualPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualPanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_individualPanMousePressed

    private void generalPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalPanMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_generalPanMouseDragged

    public void activarGeneral(){
        generalPan.setVisible(true);
        generoPan.setVisible(false);
        individualPan.setVisible(false);
    }
    
    public void activarGenero(){
        generoPan.setVisible(true);
        generalPan.setVisible(false);
        individualPan.setVisible(false);
    }
    
    public void activarIndividual(){
        individualPan.setVisible(true);
        generalPan.setVisible(false);
        generoPan.setVisible(false);
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel exportarLbl;
    private javax.swing.JPanel exportarPan;
    private javax.swing.JPanel fondoPan;
    private javax.swing.JPanel generalPan;
    private javax.swing.JScrollPane generalScp;
    public javax.swing.JTable generalTbl;
    private javax.swing.JPanel generoPan;
    private javax.swing.JScrollPane generoScp;
    public javax.swing.JTable generoTbl;
    private javax.swing.JPanel individualPan;
    private javax.swing.JScrollPane individualScp;
    public javax.swing.JTable individualTbl;
    public javax.swing.JLabel salirLbl;
    private javax.swing.JPanel salirPan;
    // End of variables declaration//GEN-END:variables
}
