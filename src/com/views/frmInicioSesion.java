package com.views;

import java.awt.Color;

public class frmInicioSesion extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmInicioSesion() {
        initComponents();
        setLocationRelativeTo(this);
        fondoPan.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        logoLbl = new javax.swing.JLabel();
        usuarioLbl = new javax.swing.JLabel();
        usuarioTf = new javax.swing.JTextField();
        usuarioSeparador = new javax.swing.JSeparator();
        contrasenaLbl = new javax.swing.JLabel();
        contrasenaTf = new javax.swing.JPasswordField();
        contrasenaSeparador = new javax.swing.JSeparator();
        cerrarPan = new javax.swing.JPanel();
        cerrarLbl = new javax.swing.JLabel();
        entrarPan = new javax.swing.JPanel();
        entrarLbl = new javax.swing.JLabel();
        registrarAsistenciaLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoPan.setBackground(new java.awt.Color(255, 255, 255));
        fondoPan.setPreferredSize(new java.awt.Dimension(350, 500));
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

        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/login.png"))); // NOI18N
        fondoPan.add(logoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        usuarioLbl.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        usuarioLbl.setText("Contraseña");
        fondoPan.add(usuarioLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 25));

        usuarioTf.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        usuarioTf.setForeground(new java.awt.Color(153, 153, 153));
        usuarioTf.setText("Ingrese su usuario");
        usuarioTf.setBorder(null);
        usuarioTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioTfMousePressed(evt);
            }
        });
        fondoPan.add(usuarioTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 238, 32));
        fondoPan.add(usuarioSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 238, 10));

        contrasenaLbl.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        contrasenaLbl.setText("Usuario");
        fondoPan.add(contrasenaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 25));

        contrasenaTf.setForeground(new java.awt.Color(153, 153, 153));
        contrasenaTf.setText("**********");
        contrasenaTf.setBorder(null);
        contrasenaTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasenaTfMousePressed(evt);
            }
        });
        fondoPan.add(contrasenaTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 238, 32));
        fondoPan.add(contrasenaSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 238, 10));

        cerrarPan.setBackground(new java.awt.Color(255, 255, 255));
        cerrarPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        cerrarPan.add(cerrarLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        fondoPan.add(cerrarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        entrarPan.setBackground(new java.awt.Color(3, 137, 206));
        entrarPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        entrarLbl.setForeground(new java.awt.Color(255, 255, 255));
        entrarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarLbl.setText("Entrar");
        entrarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarLblMouseExited(evt);
            }
        });
        entrarPan.add(entrarLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        fondoPan.add(entrarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 130, 30));

        registrarAsistenciaLbl.setBackground(new java.awt.Color(255, 255, 255));
        registrarAsistenciaLbl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        registrarAsistenciaLbl.setForeground(new java.awt.Color(153, 0, 0));
        registrarAsistenciaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarAsistenciaLbl.setText("¿Eres empleado?");
        registrarAsistenciaLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarAsistenciaLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarAsistenciaLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarAsistenciaLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarAsistenciaLblMouseExited(evt);
            }
        });
        fondoPan.add(registrarAsistenciaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 110, 20));

        getContentPane().add(fondoPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Obtenemos la posición del puntero en el panel (para poder mover la ventana)
    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    //Obtenemos la posición del puntero en la pantalla de la lap (para poder la ventana)
    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        //Restamos la posicón del puntero en el panel a la posición del puntero en la pantalla de la lap
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    private void cerrarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarLblMouseClicked

    //Cambiamos el color del panel cerrar y de la x al pasar el puntero encima del label
    private void cerrarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLblMouseEntered
        cerrarPan.setBackground(Color.red);
        cerrarLbl.setForeground(Color.white);
    }//GEN-LAST:event_cerrarLblMouseEntered

    //Cambiamos el color del panel cerrar y de la x al dejar de pasar el puntero encima del label
    private void cerrarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLblMouseExited
        cerrarPan.setBackground(Color.white);
        cerrarLbl.setForeground(Color.black);
    }//GEN-LAST:event_cerrarLblMouseExited

    private void entrarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLblMouseEntered
        entrarPan.setBackground(new Color(77, 195, 255));
    }//GEN-LAST:event_entrarLblMouseEntered

    private void entrarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLblMouseExited
        entrarPan.setBackground(new Color(3, 137, 206));
    }//GEN-LAST:event_entrarLblMouseExited

    private void usuarioTfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTfMousePressed
        if(usuarioTf.getText().equals("Ingrese su usuario")){
            usuarioTf.setText("");
            usuarioTf.setForeground(Color.black);
        }
        if(String.valueOf(contrasenaTf.getPassword()).isEmpty()){
            contrasenaTf.setText("**********");
            contrasenaTf.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_usuarioTfMousePressed

    private void contrasenaTfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaTfMousePressed
        if(String.valueOf(contrasenaTf.getPassword()).equals("**********")){
            contrasenaTf.setText("");
            contrasenaTf.setForeground(Color.black);
        }
        if(usuarioTf.getText().isEmpty()){
            usuarioTf.setText("Ingrese su usuario");
            usuarioTf.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_contrasenaTfMousePressed

    private void registrarAsistenciaLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarAsistenciaLblMouseEntered
        registrarAsistenciaLbl.setForeground(Color.red);
    }//GEN-LAST:event_registrarAsistenciaLblMouseEntered

    private void registrarAsistenciaLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarAsistenciaLblMouseExited
        registrarAsistenciaLbl.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_registrarAsistenciaLblMouseExited

    private void entrarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLblMouseClicked
        opcion = "entrar";
    }//GEN-LAST:event_entrarLblMouseClicked

    private void registrarAsistenciaLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarAsistenciaLblMouseClicked
        opcion = "asistencia";
    }//GEN-LAST:event_registrarAsistenciaLblMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrarLbl;
    private javax.swing.JPanel cerrarPan;
    private javax.swing.JLabel contrasenaLbl;
    private javax.swing.JSeparator contrasenaSeparador;
    public javax.swing.JPasswordField contrasenaTf;
    public javax.swing.JLabel entrarLbl;
    private javax.swing.JPanel entrarPan;
    private javax.swing.JPanel fondoPan;
    private javax.swing.JLabel logoLbl;
    public javax.swing.JLabel registrarAsistenciaLbl;
    private javax.swing.JLabel usuarioLbl;
    private javax.swing.JSeparator usuarioSeparador;
    public javax.swing.JTextField usuarioTf;
    // End of variables declaration//GEN-END:variables
}
