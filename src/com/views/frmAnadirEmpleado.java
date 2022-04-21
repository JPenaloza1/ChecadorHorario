package com.views;

import java.awt.Color;
import javax.swing.JOptionPane;

public class frmAnadirEmpleado extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    Color grisTexto = new Color(135,135,135);
    int xMouse, yMouse;
    public String opcion;
    
    public frmAnadirEmpleado() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        anadirEmpleadoLbl = new javax.swing.JLabel();
        anadirEmpleadoSp = new javax.swing.JSeparator();
        nombreTf = new javax.swing.JTextField();
        nombreSp = new javax.swing.JSeparator();
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
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();
        minimizarPan = new javax.swing.JPanel();
        minimizarLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
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

        anadirEmpleadoLbl.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        anadirEmpleadoLbl.setText("Añadir Empleado");
        fondoPan.add(anadirEmpleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        fondoPan.add(anadirEmpleadoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 610, -1));

        nombreTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreTf.setForeground(new java.awt.Color(153, 153, 153));
        nombreTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreTf.setText("Nombre");
        nombreTf.setBorder(null);
        nombreTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTfMousePressed(evt);
            }
        });
        fondoPan.add(nombreTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 310, 30));
        fondoPan.add(nombreSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 330, -1));

        aPaternoTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        aPaternoTf.setForeground(new java.awt.Color(153, 153, 153));
        aPaternoTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aPaternoTf.setText("Apellido paterno");
        aPaternoTf.setBorder(null);
        aPaternoTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aPaternoTfMousePressed(evt);
            }
        });
        fondoPan.add(aPaternoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 310, 30));
        fondoPan.add(aPaternoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, -1));

        aMaternoTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        aMaternoTf.setForeground(new java.awt.Color(153, 153, 153));
        aMaternoTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aMaternoTf.setText("Apellido materno");
        aMaternoTf.setBorder(null);
        aMaternoTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aMaternoTfMousePressed(evt);
            }
        });
        fondoPan.add(aMaternoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 310, 30));
        fondoPan.add(aMaternoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 320, -1));

        rfcTf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rfcTf.setForeground(new java.awt.Color(153, 153, 153));
        rfcTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rfcTf.setText("RFC");
        rfcTf.setBorder(null);
        rfcTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rfcTfMousePressed(evt);
            }
        });
        fondoPan.add(rfcTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 310, 30));
        fondoPan.add(rfcSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 320, -1));

        generoLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        generoLbl.setText("Género:");
        fondoPan.add(generoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        generoCbm.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        generoCbm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige uno", "Masculino", "Femenino" }));
        fondoPan.add(generoCbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 330, -1));

        fNacimientoLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fNacimientoLbl.setText("Fecha de nacimiento:");
        fondoPan.add(fNacimientoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        fNacimientoDc.setDateFormatString("yyyy-MM-dd");
        fondoPan.add(fNacimientoDc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 240, 30));

        fIngresoLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fIngresoLbl.setText("Fecha de ingreso:");
        fondoPan.add(fIngresoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        fIngresoDc.setDateFormatString("yyyy-MM-dd");
        fondoPan.add(fIngresoDc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 240, 30));

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
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        guardarPanLayout.setVerticalGroup(
            guardarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(guardarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 170, 40));

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

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

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

        getContentPane().add(fondoPan, java.awt.BorderLayout.CENTER);

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

    //Este método se encarga de pedirle al administrador que confirme la 
    //cancelación de añadir empleado
    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        int opcion = JOptionPane.showOptionDialog(
            rootPane,
            "¿Cancelar añadir empleado?", 
            "Cancelar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "Salir", "Permanecer" },
            "opcion 1");
        
        if(opcion == 0){
            this.opcion = "cancelar";
        }
    }//GEN-LAST:event_cancelarLblMouseClicked

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y-yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    private void guardarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLblMouseClicked
        opcion = "guardar";
    }//GEN-LAST:event_guardarLblMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator aMaternoSp;
    public javax.swing.JTextField aMaternoTf;
    private javax.swing.JSeparator aPaternoSp;
    public javax.swing.JTextField aPaternoTf;
    private javax.swing.JLabel anadirEmpleadoLbl;
    private javax.swing.JSeparator anadirEmpleadoSp;
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    public com.toedter.calendar.JDateChooser fIngresoDc;
    private javax.swing.JLabel fIngresoLbl;
    public com.toedter.calendar.JDateChooser fNacimientoDc;
    private javax.swing.JLabel fNacimientoLbl;
    private javax.swing.JPanel fondoPan;
    public javax.swing.JComboBox<String> generoCbm;
    private javax.swing.JLabel generoLbl;
    public javax.swing.JLabel guardarLbl;
    private javax.swing.JPanel guardarPan;
    private javax.swing.JLabel minimizarLbl;
    private javax.swing.JPanel minimizarPan;
    private javax.swing.JSeparator nombreSp;
    public javax.swing.JTextField nombreTf;
    private javax.swing.JSeparator rfcSp;
    public javax.swing.JTextField rfcTf;
    // End of variables declaration//GEN-END:variables
}
