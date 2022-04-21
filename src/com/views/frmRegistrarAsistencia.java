package com.views;

import java.awt.Color;

public class frmRegistrarAsistencia extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    int xMouse, yMouse;
    public String opcion = "";
    Color rojoExited = new Color(153,0,0);
    
    public frmRegistrarAsistencia() {
        initComponents();
        fondoPan.setFocusable(true);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        idEmpleadoLbl = new javax.swing.JLabel();
        idEmpleadoTxt = new javax.swing.JTextField();
        idEmpleadoSp = new javax.swing.JSeparator();
        registrarPan = new javax.swing.JPanel();
        registrarLbl = new javax.swing.JLabel();
        administradorLbl = new javax.swing.JLabel();
        cerrarPan = new javax.swing.JPanel();
        cerrarLbl = new javax.swing.JLabel();

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

        idEmpleadoLbl.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        idEmpleadoLbl.setText("Ingresa tu ID");
        fondoPan.add(idEmpleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        idEmpleadoTxt.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
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
        fondoPan.add(idEmpleadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, -1));
        fondoPan.add(idEmpleadoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 140, 10));

        registrarPan.setBackground(new java.awt.Color(3, 137, 206));
        registrarPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        registrarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        registrarLbl.setForeground(new java.awt.Color(255, 255, 255));
        registrarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarLbl.setText("Registrar");
        registrarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registrarPanLayout = new javax.swing.GroupLayout(registrarPan);
        registrarPan.setLayout(registrarPanLayout);
        registrarPanLayout.setHorizontalGroup(
            registrarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        registrarPanLayout.setVerticalGroup(
            registrarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(registrarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 30));

        administradorLbl.setBackground(new java.awt.Color(255, 255, 255));
        administradorLbl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        administradorLbl.setForeground(new java.awt.Color(153, 0, 0));
        administradorLbl.setText("¿Eres administrador?");
        administradorLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        administradorLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administradorLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                administradorLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                administradorLblMouseExited(evt);
            }
        });
        fondoPan.add(administradorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, 20));

        cerrarPan.setBackground(new java.awt.Color(255, 255, 255));
        cerrarPan.setPreferredSize(new java.awt.Dimension(30, 30));

        cerrarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cerrarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarLbl.setText("X");
        cerrarLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarPanLayout = new javax.swing.GroupLayout(cerrarPan);
        cerrarPan.setLayout(cerrarPanLayout);
        cerrarPanLayout.setHorizontalGroup(
            cerrarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cerrarPanLayout.setVerticalGroup(
            cerrarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(cerrarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarLblMouseClicked

    private void cerrarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLblMouseEntered
        cerrarPan.setBackground(Color.red);
        cerrarLbl.setForeground(Color.white);
    }//GEN-LAST:event_cerrarLblMouseEntered

    private void cerrarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLblMouseExited
        cerrarPan.setBackground(Color.white);
        cerrarLbl.setForeground(Color.black);
    }//GEN-LAST:event_cerrarLblMouseExited

    private void administradorLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administradorLblMouseEntered
        administradorLbl.setForeground(Color.red);
    }//GEN-LAST:event_administradorLblMouseEntered

    private void administradorLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administradorLblMouseExited
        administradorLbl.setForeground(rojoExited);
    }//GEN-LAST:event_administradorLblMouseExited

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    private void idEmpleadoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idEmpleadoTxtMousePressed
        if(idEmpleadoTxt.getText().equals("00000")){
            idEmpleadoTxt.setText("");
            idEmpleadoTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_idEmpleadoTxtMousePressed

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

    private void registrarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarLblMouseEntered
        registrarLbl.setBackground(azulEntered);
    }//GEN-LAST:event_registrarLblMouseEntered

    private void registrarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarLblMouseExited
        registrarLbl.setBackground(azulExcited);
    }//GEN-LAST:event_registrarLblMouseExited

    private void administradorLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administradorLblMouseClicked
        opcion = "administrador";
    }//GEN-LAST:event_administradorLblMouseClicked

    private void registrarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarLblMouseClicked
        opcion = "registrar";
    }//GEN-LAST:event_registrarLblMouseClicked

    public void reiniciarIdEmpleado(){
        idEmpleadoTxt.setText("00000");
        idEmpleadoTxt.setForeground(new Color(204,204,204));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel administradorLbl;
    private javax.swing.JLabel cerrarLbl;
    private javax.swing.JPanel cerrarPan;
    private javax.swing.JPanel fondoPan;
    private javax.swing.JLabel idEmpleadoLbl;
    private javax.swing.JSeparator idEmpleadoSp;
    public javax.swing.JTextField idEmpleadoTxt;
    public javax.swing.JLabel registrarLbl;
    private javax.swing.JPanel registrarPan;
    // End of variables declaration//GEN-END:variables
}
