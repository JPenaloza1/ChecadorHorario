package com.views;

import java.awt.Color;

public class frmGenerarReporte extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmGenerarReporte() {
        initComponents();
        setLocationRelativeTo(this);
        idEmpleado.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generoBtg = new javax.swing.ButtonGroup();
        idEmpleado = new javax.swing.JPanel();
        nombreEmpleadoLbl = new javax.swing.JLabel();
        generarReporteLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();
        general1Lbl = new javax.swing.JLabel();
        generalPan = new javax.swing.JPanel();
        generalLbl = new javax.swing.JLabel();
        generalSp = new javax.swing.JSeparator();
        genero1Lbl = new javax.swing.JLabel();
        femeninoJrb = new javax.swing.JRadioButton();
        masculinoJrb = new javax.swing.JRadioButton();
        generoPan = new javax.swing.JPanel();
        generoLbl = new javax.swing.JLabel();
        generoSp = new javax.swing.JSeparator();
        individual1Lbl = new javax.swing.JLabel();
        individualPan = new javax.swing.JPanel();
        individualLbl2 = new javax.swing.JLabel();
        nombreEmpleadoTxt = new javax.swing.JTextField();
        idEmpleadoSp = new javax.swing.JSeparator();
        buscarPan = new javax.swing.JPanel();
        buscarLbl = new javax.swing.JLabel();
        idEmpleadoTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        idEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        idEmpleado.setPreferredSize(new java.awt.Dimension(800, 500));
        idEmpleado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                idEmpleadoMouseDragged(evt);
            }
        });
        idEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idEmpleadoMousePressed(evt);
            }
        });
        idEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEmpleadoLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreEmpleadoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idEmpleado.add(nombreEmpleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 330, -1));

        generarReporteLbl.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        generarReporteLbl.setText("Generar Reportes");
        idEmpleado.add(generarReporteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        fechaLbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        fechaLbl.setText("00-00-0000 a 00-00-0000");
        idEmpleado.add(fechaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 29, -1, 30));

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

        idEmpleado.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, 30));

        general1Lbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        general1Lbl.setText("General");
        idEmpleado.add(general1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        generalPan.setBackground(new java.awt.Color(3, 137, 206));
        generalPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        generalLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        generalLbl.setForeground(new java.awt.Color(255, 255, 255));
        generalLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalLbl.setText("Generar");
        generalLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generalLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generalLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout generalPanLayout = new javax.swing.GroupLayout(generalPan);
        generalPan.setLayout(generalPanLayout);
        generalPanLayout.setHorizontalGroup(
            generalPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        generalPanLayout.setVerticalGroup(
            generalPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        idEmpleado.add(generalPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, 30));
        idEmpleado.add(generalSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 660, 10));

        genero1Lbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        genero1Lbl.setText("Género");
        idEmpleado.add(genero1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        femeninoJrb.setBackground(new java.awt.Color(255, 255, 255));
        generoBtg.add(femeninoJrb);
        femeninoJrb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        femeninoJrb.setText("Femenino");
        idEmpleado.add(femeninoJrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        masculinoJrb.setBackground(new java.awt.Color(255, 255, 255));
        generoBtg.add(masculinoJrb);
        masculinoJrb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        masculinoJrb.setText("Masculino");
        idEmpleado.add(masculinoJrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        generoPan.setBackground(new java.awt.Color(3, 137, 206));
        generoPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        generoLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        generoLbl.setForeground(new java.awt.Color(255, 255, 255));
        generoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generoLbl.setText("Generar");
        generoLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generoLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generoLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generoLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout generoPanLayout = new javax.swing.GroupLayout(generoPan);
        generoPan.setLayout(generoPanLayout);
        generoPanLayout.setHorizontalGroup(
            generoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        generoPanLayout.setVerticalGroup(
            generoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        idEmpleado.add(generoPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, 30));
        idEmpleado.add(generoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 660, 10));

        individual1Lbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        individual1Lbl.setText("Individual");
        idEmpleado.add(individual1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        individualPan.setBackground(new java.awt.Color(3, 137, 206));
        individualPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        individualLbl2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        individualLbl2.setForeground(new java.awt.Color(255, 255, 255));
        individualLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        individualLbl2.setText("Generar");
        individualLbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        individualLbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                individualLbl2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                individualLbl2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                individualLbl2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout individualPanLayout = new javax.swing.GroupLayout(individualPan);
        individualPan.setLayout(individualPanLayout);
        individualPanLayout.setHorizontalGroup(
            individualPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(individualLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        individualPanLayout.setVerticalGroup(
            individualPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(individualLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        idEmpleado.add(individualPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, 30));

        nombreEmpleadoTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreEmpleadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreEmpleadoTxt.setBorder(null);
        idEmpleado.add(nombreEmpleadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 430, 30));
        idEmpleado.add(idEmpleadoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 90, 20));

        buscarPan.setBackground(new java.awt.Color(3, 137, 206));
        buscarPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buscarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        buscarLbl.setForeground(new java.awt.Color(255, 255, 255));
        buscarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarLbl.setText("Buscar");
        buscarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarPanLayout = new javax.swing.GroupLayout(buscarPan);
        buscarPan.setLayout(buscarPanLayout);
        buscarPanLayout.setHorizontalGroup(
            buscarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        buscarPanLayout.setVerticalGroup(
            buscarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        idEmpleado.add(buscarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 90, 30));

        idEmpleadoTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        idEmpleadoTxt.setForeground(new java.awt.Color(204, 204, 204));
        idEmpleadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idEmpleadoTxt.setText("00000");
        idEmpleadoTxt.setBorder(null);
        idEmpleadoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idEmpleadoTxtMousePressed(evt);
            }
        });
        idEmpleadoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idEmpleadoTxtKeyTyped(evt);
            }
        });
        idEmpleado.add(idEmpleadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(idEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idEmpleadoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_idEmpleadoMousePressed

    private void idEmpleadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idEmpleadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_idEmpleadoMouseDragged

    private void generalLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalLblMouseEntered
        generalPan.setBackground(azulEntered);
    }//GEN-LAST:event_generalLblMouseEntered

    private void generalLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalLblMouseExited
        generalPan.setBackground(azulExcited);
    }//GEN-LAST:event_generalLblMouseExited

    private void generoLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoLblMouseEntered
        generoPan.setBackground(azulEntered);
    }//GEN-LAST:event_generoLblMouseEntered

    private void generoLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoLblMouseExited
        generoPan.setBackground(azulExcited);
    }//GEN-LAST:event_generoLblMouseExited

    private void buscarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseEntered
        buscarPan.setBackground(azulEntered);
    }//GEN-LAST:event_buscarLblMouseEntered

    private void buscarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseExited
        buscarPan.setBackground(azulExcited);
    }//GEN-LAST:event_buscarLblMouseExited

    private void individualLbl2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualLbl2MouseEntered
        individualPan.setBackground(azulEntered);
    }//GEN-LAST:event_individualLbl2MouseEntered

    private void individualLbl2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualLbl2MouseExited
        individualPan.setBackground(azulExcited);
    }//GEN-LAST:event_individualLbl2MouseExited

    private void cancelarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseEntered
        cancelarPan.setBackground(Color.red);
    }//GEN-LAST:event_cancelarLblMouseEntered

    private void cancelarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseExited
        cancelarPan.setBackground(rojoExited);
    }//GEN-LAST:event_cancelarLblMouseExited

    private void generalLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalLblMouseClicked
        opcion = "general";
    }//GEN-LAST:event_generalLblMouseClicked

    private void generoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoLblMouseClicked
        opcion = "genero";
    }//GEN-LAST:event_generoLblMouseClicked

    private void individualLbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualLbl2MouseClicked
        opcion = "individual";
    }//GEN-LAST:event_individualLbl2MouseClicked

    private void buscarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseClicked
        opcion = "buscar";
    }//GEN-LAST:event_buscarLblMouseClicked

    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        opcion = "cancelar";
    }//GEN-LAST:event_cancelarLblMouseClicked

    private void idEmpleadoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idEmpleadoTxtKeyTyped
        int tecla = evt.getKeyChar();
        boolean numeros = tecla >= 48 && tecla <= 57;
        if(!numeros){
            evt.consume();
        }
        if(idEmpleadoTxt.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_idEmpleadoTxtKeyTyped

    private void idEmpleadoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idEmpleadoTxtMousePressed
        if(idEmpleadoTxt.getText().equals("00000")){
            idEmpleadoTxt.setText("");
            idEmpleadoTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_idEmpleadoTxtMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel buscarLbl;
    private javax.swing.JPanel buscarPan;
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    public javax.swing.JLabel fechaLbl;
    public javax.swing.JRadioButton femeninoJrb;
    private javax.swing.JLabel general1Lbl;
    public javax.swing.JLabel generalLbl;
    private javax.swing.JPanel generalPan;
    private javax.swing.JSeparator generalSp;
    private javax.swing.JLabel generarReporteLbl;
    private javax.swing.JLabel genero1Lbl;
    private javax.swing.ButtonGroup generoBtg;
    public javax.swing.JLabel generoLbl;
    private javax.swing.JPanel generoPan;
    private javax.swing.JSeparator generoSp;
    private javax.swing.JPanel idEmpleado;
    private javax.swing.JSeparator idEmpleadoSp;
    public javax.swing.JTextField idEmpleadoTxt;
    private javax.swing.JLabel individual1Lbl;
    public javax.swing.JLabel individualLbl2;
    private javax.swing.JPanel individualPan;
    public javax.swing.JRadioButton masculinoJrb;
    private javax.swing.JLabel nombreEmpleadoLbl;
    public javax.swing.JTextField nombreEmpleadoTxt;
    // End of variables declaration//GEN-END:variables
}
