package com.views;

import checadorhorarios.Template;
import java.awt.Color;

public class frmModificarEmpleado extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    Color grisTexto = new Color(135,135,135);
    int xMouse, yMouse;
    
    public frmModificarEmpleado() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        modificarEmpleadoLbl = new javax.swing.JLabel();
        idEmpleadoLbl = new javax.swing.JLabel();
        modEmpleadoSp = new javax.swing.JSeparator();
        nombreTf = new javax.swing.JTextField();
        nombreEmpleadoSp = new javax.swing.JSeparator();
        aPaternoTf = new javax.swing.JTextField();
        aPaternoSp = new javax.swing.JSeparator();
        aMaternoTf = new javax.swing.JTextField();
        aMaternoSp = new javax.swing.JSeparator();
        rfcTf = new javax.swing.JTextField();
        rfcSp = new javax.swing.JSeparator();
        generoLbl = new javax.swing.JLabel();
        generoCbm = new javax.swing.JComboBox<>();
        fNacimientoLbl = new javax.swing.JLabel();
        fNacimientoDc = new com.toedter.calendar.JDateChooser();
        fIngresoLbl = new javax.swing.JLabel();
        fIngresoDc = new com.toedter.calendar.JDateChooser();
        guardarPan = new javax.swing.JPanel();
        guardarLbl = new javax.swing.JLabel();
        eliminarPan = new javax.swing.JPanel();
        eliminarLbl = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();
        minimizarPan = new javax.swing.JPanel();
        minimizarLbl = new javax.swing.JLabel();

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

        modificarEmpleadoLbl.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        modificarEmpleadoLbl.setText("Modificar Empleado - ");
        fondoPan.add(modificarEmpleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        idEmpleadoLbl.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        idEmpleadoLbl.setText("00000");
        fondoPan.add(idEmpleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));
        fondoPan.add(modEmpleadoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 660, 10));

        nombreTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreTf.setForeground(new java.awt.Color(135, 135, 135));
        nombreTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreTf.setText("Nombre");
        nombreTf.setBorder(null);
        nombreTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTfMousePressed(evt);
            }
        });
        fondoPan.add(nombreTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 310, 30));
        fondoPan.add(nombreEmpleadoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 290, -1));

        aPaternoTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        aPaternoTf.setForeground(new java.awt.Color(135, 135, 135));
        aPaternoTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aPaternoTf.setText("Apellido paterno");
        aPaternoTf.setBorder(null);
        aPaternoTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aPaternoTfMousePressed(evt);
            }
        });
        fondoPan.add(aPaternoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 310, 30));
        fondoPan.add(aPaternoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 290, -1));

        aMaternoTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        aMaternoTf.setForeground(new java.awt.Color(135, 135, 135));
        aMaternoTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aMaternoTf.setText("Apellido materno");
        aMaternoTf.setBorder(null);
        aMaternoTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aMaternoTfMousePressed(evt);
            }
        });
        fondoPan.add(aMaternoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 310, 30));
        fondoPan.add(aMaternoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 290, 10));

        rfcTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rfcTf.setForeground(new java.awt.Color(135, 135, 135));
        rfcTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rfcTf.setText("RFC");
        rfcTf.setBorder(null);
        rfcTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rfcTfMousePressed(evt);
            }
        });
        fondoPan.add(rfcTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 310, 30));
        fondoPan.add(rfcSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 290, 10));

        generoLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        generoLbl.setText("Género:");
        fondoPan.add(generoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        generoCbm.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        generoCbm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige uno", "Masculino", "Femenino" }));
        fondoPan.add(generoCbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 310, 30));

        fNacimientoLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fNacimientoLbl.setText("Fecha de nacimiento:");
        fondoPan.add(fNacimientoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        fNacimientoDc.setDateFormatString("yyyy-MM-dd");
        fondoPan.add(fNacimientoDc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 220, 30));

        fIngresoLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fIngresoLbl.setText("Fecha de ingreso:");
        fondoPan.add(fIngresoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        fIngresoDc.setDateFormatString("yyyy-MM-dd");
        fondoPan.add(fIngresoDc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 220, 30));

        guardarPan.setBackground(new java.awt.Color(3, 137, 206));

        guardarLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        guardarLbl.setForeground(new java.awt.Color(255, 255, 255));
        guardarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarLbl.setText("Guardar");
        guardarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
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
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        guardarPanLayout.setVerticalGroup(
            guardarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(guardarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 170, 40));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        eliminarPanLayout.setVerticalGroup(
            eliminarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(eliminarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 40));

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
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarPanLayout.setVerticalGroup(
            cancelarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void nombreTfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTfMousePressed
        if(nombreTf.getText().equals("Nombre")){
            nombreTf.setText("");
            nombreTf.setForeground(Color.black);
        }
        if(aPaternoTf.getText().isEmpty()){
            aPaternoTf.setText("Apellido paterno");
            aPaternoTf.setForeground(grisTexto);
        }
        if(aMaternoTf.getText().isEmpty()){
            aMaternoTf.setText("Apellido materno");
            aMaternoTf.setForeground(grisTexto);
        }
        if(rfcTf.getText().isEmpty()){
            rfcTf.setText("RFC");
            rfcTf.setForeground(grisTexto);
        }
    }//GEN-LAST:event_nombreTfMousePressed

    private void aPaternoTfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aPaternoTfMousePressed
        if(aPaternoTf.getText().equals("Apellido paterno")){
            aPaternoTf.setText("");
            aPaternoTf.setForeground(Color.black);
        }
        if(nombreTf.getText().isEmpty()){
            nombreTf.setText("Nombre");
            nombreTf.setForeground(grisTexto);
        }
        if(aMaternoTf.getText().isEmpty()){
            aMaternoTf.setText("Apellido materno");
            aMaternoTf.setForeground(grisTexto);
        }
        if(rfcTf.getText().isEmpty()){
            rfcTf.setText("RFC");
            rfcTf.setForeground(grisTexto);
        }
    }//GEN-LAST:event_aPaternoTfMousePressed

    private void aMaternoTfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMaternoTfMousePressed
        if(aMaternoTf.getText().equals("Apellido materno")){
            aMaternoTf.setText("");
            aMaternoTf.setForeground(Color.black);
        }
        if(nombreTf.getText().isEmpty()){
            nombreTf.setText("Nombre");
            nombreTf.setForeground(Color.black);
        }
        if(aPaternoTf.getText().isEmpty()){
            aPaternoTf.setText("Apellido paterno");
            aPaternoTf.setForeground(grisTexto);
        }
        if(rfcTf.getText().isEmpty()){
            rfcTf.setText("RFC");
            rfcTf.setForeground(grisTexto);
        }
    }//GEN-LAST:event_aMaternoTfMousePressed

    private void rfcTfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rfcTfMousePressed
        if(rfcTf.getText().equals("RFC")){
            rfcTf.setText("");
            rfcTf.setForeground(Color.black);
        }
        if(nombreTf.getText().isEmpty()){
            nombreTf.setText("Nombre");
            nombreTf.setForeground(Color.black);
        }
        if(aPaternoTf.getText().isEmpty()){
            aPaternoTf.setText("Apellido paterno");
            aPaternoTf.setForeground(grisTexto);
        }
        if(aMaternoTf.getText().isEmpty()){
            aMaternoTf.setText("Apellido materno");
            aMaternoTf.setForeground(grisTexto);
        }
    }//GEN-LAST:event_rfcTfMousePressed

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    private void eliminarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLblMouseEntered
        eliminarPan.setBackground(rojoEntered);
    }//GEN-LAST:event_eliminarLblMouseEntered

    private void eliminarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLblMouseExited
        eliminarPan.setBackground(azulExcited);
    }//GEN-LAST:event_eliminarLblMouseExited

    //Este método se encarga de esperar a que se dé click para llamar al método
    //que abre eliminarEmpleado desde el template
    private void eliminarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLblMouseClicked
        this.dispose();
        Template.abrirEliminarEmpleado(Integer.parseInt(idEmpleadoLbl.getText()));
    }//GEN-LAST:event_eliminarLblMouseClicked

    //Este método se encarga de esperar a que se dé click para cerrar la 
    //ventana de modificar y se abra el menú principal
    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        this.dispose();
        Template.abrirMenuPrincipal();
    }//GEN-LAST:event_cancelarLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator aMaternoSp;
    public javax.swing.JTextField aMaternoTf;
    private javax.swing.JSeparator aPaternoSp;
    public javax.swing.JTextField aPaternoTf;
    private javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    public javax.swing.JLabel eliminarLbl;
    private javax.swing.JPanel eliminarPan;
    public com.toedter.calendar.JDateChooser fIngresoDc;
    private javax.swing.JLabel fIngresoLbl;
    public com.toedter.calendar.JDateChooser fNacimientoDc;
    private javax.swing.JLabel fNacimientoLbl;
    private javax.swing.JPanel fondoPan;
    public javax.swing.JComboBox<String> generoCbm;
    private javax.swing.JLabel generoLbl;
    public javax.swing.JLabel guardarLbl;
    private javax.swing.JPanel guardarPan;
    public javax.swing.JLabel idEmpleadoLbl;
    private javax.swing.JLabel minimizarLbl;
    private javax.swing.JPanel minimizarPan;
    private javax.swing.JSeparator modEmpleadoSp;
    private javax.swing.JLabel modificarEmpleadoLbl;
    private javax.swing.JSeparator nombreEmpleadoSp;
    public javax.swing.JTextField nombreTf;
    private javax.swing.JSeparator rfcSp;
    public javax.swing.JTextField rfcTf;
    // End of variables declaration//GEN-END:variables
}
