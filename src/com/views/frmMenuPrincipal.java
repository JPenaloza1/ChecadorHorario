package com.views;

import java.awt.Color;

public class frmMenuPrincipal extends javax.swing.JFrame {

    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        fondoPan.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        logoLbl = new javax.swing.JLabel();
        empleadoLbl = new javax.swing.JLabel();
        anadirEmpleadoPan = new javax.swing.JPanel();
        anadirEmpleadoLbl = new javax.swing.JLabel();
        idEmpleadoTf = new javax.swing.JTextField();
        buscarPan = new javax.swing.JPanel();
        buscarLbl = new javax.swing.JLabel();
        reporteLbl = new javax.swing.JLabel();
        desdeLbl = new javax.swing.JLabel();
        desdeDC = new com.toedter.calendar.JDateChooser();
        hastaLbl = new javax.swing.JLabel();
        hastaDC = new com.toedter.calendar.JDateChooser();
        generarReportePan = new javax.swing.JPanel();
        generarReporteLbl = new javax.swing.JLabel();
        menuSeparador = new javax.swing.JSeparator();
        salirPan = new javax.swing.JPanel();
        salirLbl = new javax.swing.JLabel();
        minimizarPan = new javax.swing.JPanel();
        minimizarLbl = new javax.swing.JLabel();
        toleranciaLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));

        fondoPan.setBackground(new java.awt.Color(255, 255, 255));
        fondoPan.setMinimumSize(new java.awt.Dimension(800, 500));
        fondoPan.setPreferredSize(new java.awt.Dimension(800, 500));
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
        fondoPan.add(logoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        empleadoLbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        empleadoLbl.setText("Empleado");
        fondoPan.add(empleadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        anadirEmpleadoPan.setBackground(new java.awt.Color(3, 137, 206));

        anadirEmpleadoLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        anadirEmpleadoLbl.setForeground(new java.awt.Color(255, 255, 255));
        anadirEmpleadoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anadirEmpleadoLbl.setText("Añadir");
        anadirEmpleadoLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anadirEmpleadoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anadirEmpleadoLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                anadirEmpleadoLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                anadirEmpleadoLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout anadirEmpleadoPanLayout = new javax.swing.GroupLayout(anadirEmpleadoPan);
        anadirEmpleadoPan.setLayout(anadirEmpleadoPanLayout);
        anadirEmpleadoPanLayout.setHorizontalGroup(
            anadirEmpleadoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anadirEmpleadoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        anadirEmpleadoPanLayout.setVerticalGroup(
            anadirEmpleadoPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anadirEmpleadoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(anadirEmpleadoPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 110, 30));

        idEmpleadoTf.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        idEmpleadoTf.setForeground(new java.awt.Color(153, 153, 153));
        idEmpleadoTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idEmpleadoTf.setText("  ID Empleado");
        idEmpleadoTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 137, 206)));
        idEmpleadoTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idEmpleadoTfMousePressed(evt);
            }
        });
        idEmpleadoTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idEmpleadoTfKeyTyped(evt);
            }
        });
        fondoPan.add(idEmpleadoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 140, 30));

        buscarPan.setBackground(new java.awt.Color(3, 137, 206));

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
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        buscarPanLayout.setVerticalGroup(
            buscarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(buscarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 110, 30));

        reporteLbl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        reporteLbl.setText("Generar reporte");
        fondoPan.add(reporteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        desdeLbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        desdeLbl.setText("Desde:");
        fondoPan.add(desdeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));
        fondoPan.add(desdeDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 220, 30));

        hastaLbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        hastaLbl.setText("Hasta:");
        fondoPan.add(hastaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));
        fondoPan.add(hastaDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 220, 30));

        generarReportePan.setBackground(new java.awt.Color(3, 137, 206));

        generarReporteLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        generarReporteLbl.setForeground(new java.awt.Color(255, 255, 255));
        generarReporteLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generarReporteLbl.setText("Generar");
        generarReporteLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generarReporteLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarReporteLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generarReporteLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generarReporteLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout generarReportePanLayout = new javax.swing.GroupLayout(generarReportePan);
        generarReportePan.setLayout(generarReportePanLayout);
        generarReportePanLayout.setHorizontalGroup(
            generarReportePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generarReporteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        generarReportePanLayout.setVerticalGroup(
            generarReportePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generarReporteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(generarReportePan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 110, 30));

        menuSeparador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondoPan.add(menuSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 10, 440));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salirPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salirLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        salirPanLayout.setVerticalGroup(
            salirPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salirPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salirLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(salirPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

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

        toleranciaLbl.setBackground(new java.awt.Color(255, 255, 255));
        toleranciaLbl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        toleranciaLbl.setForeground(new java.awt.Color(153, 0, 0));
        toleranciaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toleranciaLbl.setText("Ajustar límite de tolerancia");
        toleranciaLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toleranciaLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toleranciaLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toleranciaLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toleranciaLblMouseExited(evt);
            }
        });
        fondoPan.add(toleranciaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 150, 20));

        getContentPane().add(fondoPan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anadirEmpleadoLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anadirEmpleadoLblMouseEntered
        anadirEmpleadoPan.setBackground(azulEntered);
    }//GEN-LAST:event_anadirEmpleadoLblMouseEntered

    private void anadirEmpleadoLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anadirEmpleadoLblMouseExited
        anadirEmpleadoPan.setBackground(azulExcited);
    }//GEN-LAST:event_anadirEmpleadoLblMouseExited

    private void buscarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseEntered
        buscarPan.setBackground(azulEntered);
    }//GEN-LAST:event_buscarLblMouseEntered

    private void buscarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseExited
        buscarPan.setBackground(azulExcited);
    }//GEN-LAST:event_buscarLblMouseExited

    private void salirLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLblMouseEntered
        salirPan.setBackground(rojoEntered);
    }//GEN-LAST:event_salirLblMouseEntered

    private void salirLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLblMouseExited
        salirPan.setBackground(rojoExited);
    }//GEN-LAST:event_salirLblMouseExited

    private void generarReporteLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarReporteLblMouseEntered
        generarReportePan.setBackground(azulEntered);
    }//GEN-LAST:event_generarReporteLblMouseEntered

    private void generarReporteLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarReporteLblMouseExited
        generarReportePan.setBackground(azulExcited);
    }//GEN-LAST:event_generarReporteLblMouseExited

    private void salirLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLblMouseClicked
        opcion = "salir";
    }//GEN-LAST:event_salirLblMouseClicked

    private void minimizarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseEntered
        minimizarPan.setBackground(Color.gray);
    }//GEN-LAST:event_minimizarLblMouseEntered

    private void minimizarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseExited
        minimizarPan.setBackground(Color.white);
    }//GEN-LAST:event_minimizarLblMouseExited

    private void minimizarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarLblMouseClicked

    //Este método se encarga de esperar a que el botón "añadir" sea seleccionado
    private void anadirEmpleadoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anadirEmpleadoLblMouseClicked
        opcion = "anadir";
    }//GEN-LAST:event_anadirEmpleadoLblMouseClicked

    //Este método se encarga de esperar a que el botón "generar" sea seleccionado
    private void generarReporteLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarReporteLblMouseClicked
        opcion = "generar";
    }//GEN-LAST:event_generarReporteLblMouseClicked

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    //Este método se encarga de vaciar y poner un color de fuente negra al 
    //JTextField del idEmpleado en el apartado buscar. Lo mismo aplica para 
    //todos los JTextField y su evento MousePressed que existan en el sistema
    private void idEmpleadoTfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idEmpleadoTfMousePressed
        if(idEmpleadoTf.getText().equals("  ID Empleado")){
            idEmpleadoTf.setText("");
            idEmpleadoTf.setForeground(Color.black);
        }
    }//GEN-LAST:event_idEmpleadoTfMousePressed

    private void idEmpleadoTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idEmpleadoTfKeyTyped
        int tecla = evt.getKeyChar();
        boolean numeros = tecla >= 48 && tecla <= 57;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_idEmpleadoTfKeyTyped

    private void toleranciaLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toleranciaLblMouseEntered
        toleranciaLbl.setForeground(Color.red);
    }//GEN-LAST:event_toleranciaLblMouseEntered

    private void toleranciaLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toleranciaLblMouseExited
        toleranciaLbl.setForeground(rojoExited);
    }//GEN-LAST:event_toleranciaLblMouseExited

    private void buscarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseClicked
        opcion = "buscar";
    }//GEN-LAST:event_buscarLblMouseClicked

    private void toleranciaLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toleranciaLblMouseClicked
        opcion = "tolerancia";
    }//GEN-LAST:event_toleranciaLblMouseClicked
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel anadirEmpleadoLbl;
    private javax.swing.JPanel anadirEmpleadoPan;
    public javax.swing.JLabel buscarLbl;
    private javax.swing.JPanel buscarPan;
    public com.toedter.calendar.JDateChooser desdeDC;
    private javax.swing.JLabel desdeLbl;
    private javax.swing.JLabel empleadoLbl;
    private javax.swing.JPanel fondoPan;
    public javax.swing.JLabel generarReporteLbl;
    private javax.swing.JPanel generarReportePan;
    public com.toedter.calendar.JDateChooser hastaDC;
    private javax.swing.JLabel hastaLbl;
    public javax.swing.JTextField idEmpleadoTf;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JSeparator menuSeparador;
    private javax.swing.JLabel minimizarLbl;
    private javax.swing.JPanel minimizarPan;
    private javax.swing.JLabel reporteLbl;
    public javax.swing.JLabel salirLbl;
    private javax.swing.JPanel salirPan;
    public javax.swing.JLabel toleranciaLbl;
    // End of variables declaration//GEN-END:variables
}
