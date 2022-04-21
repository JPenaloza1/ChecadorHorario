package com.views;

import java.awt.Color;

public class frmAnadirHorario extends javax.swing.JFrame {
    
    Color azulEntered = new Color(77, 195, 255);
    Color azulExcited = new Color(3,137,206);
    Color rojoEntered = new Color(247, 49, 165);
    Color rojoExited = new Color(255, 55, 98);
    int xMouse, yMouse;
    public String opcion = "";
    
    public frmAnadirHorario() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPan = new javax.swing.JPanel();
        anadirHorarioLbl = new javax.swing.JLabel();
        guardarPan = new javax.swing.JPanel();
        guardarLbl = new javax.swing.JLabel();
        cancelarPan = new javax.swing.JPanel();
        cancelarLbl = new javax.swing.JLabel();
        horarioLbl = new javax.swing.JLabel();
        domingoLbl = new javax.swing.JLabel();
        domingoSp = new javax.swing.JSeparator();
        domingoTf = new javax.swing.JTextField();
        lunesLbl = new javax.swing.JLabel();
        lunesSp = new javax.swing.JSeparator();
        lunesTf = new javax.swing.JTextField();
        martesLbl = new javax.swing.JLabel();
        martesSp = new javax.swing.JSeparator();
        martesTf = new javax.swing.JTextField();
        miercolesLbl = new javax.swing.JLabel();
        miercolesSp = new javax.swing.JSeparator();
        miercolesTf = new javax.swing.JTextField();
        juevesLbl = new javax.swing.JLabel();
        juevesSp = new javax.swing.JSeparator();
        juevesTf = new javax.swing.JTextField();
        viernesLbl = new javax.swing.JLabel();
        viernesSp = new javax.swing.JSeparator();
        viernesTf = new javax.swing.JTextField();
        sabadoLbl = new javax.swing.JLabel();
        sabadoSp = new javax.swing.JSeparator();
        sabadoTf = new javax.swing.JTextField();
        anadirHorarioSp = new javax.swing.JSeparator();
        minimizarPan = new javax.swing.JPanel();
        minimizarLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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

        anadirHorarioLbl.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        anadirHorarioLbl.setText("Añadir Horario");
        fondoPan.add(anadirHorarioLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

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
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        guardarPanLayout.setVerticalGroup(
            guardarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(guardarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 120, 30));

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
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarPanLayout.setVerticalGroup(
            cancelarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPan.add(cancelarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 120, 30));

        horarioLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        horarioLbl.setText("Horario");
        fondoPan.add(horarioLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        domingoLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        domingoLbl.setText("Domingo");
        fondoPan.add(domingoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));
        fondoPan.add(domingoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 320, 10));

        domingoTf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        domingoTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        domingoTf.setAutoscrolls(false);
        domingoTf.setBorder(null);
        domingoTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                domingoTfKeyTyped(evt);
            }
        });
        fondoPan.add(domingoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 430, 30));

        lunesLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lunesLbl.setText("Lunes");
        fondoPan.add(lunesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        fondoPan.add(lunesSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 320, 10));

        lunesTf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lunesTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lunesTf.setBorder(null);
        lunesTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lunesTfKeyTyped(evt);
            }
        });
        fondoPan.add(lunesTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 430, 30));

        martesLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        martesLbl.setText("Martes");
        fondoPan.add(martesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));
        fondoPan.add(martesSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 320, 10));

        martesTf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        martesTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        martesTf.setBorder(null);
        martesTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                martesTfKeyTyped(evt);
            }
        });
        fondoPan.add(martesTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 430, 30));

        miercolesLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miercolesLbl.setText("Miercoles");
        fondoPan.add(miercolesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));
        fondoPan.add(miercolesSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 320, 10));

        miercolesTf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        miercolesTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        miercolesTf.setBorder(null);
        miercolesTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                miercolesTfKeyTyped(evt);
            }
        });
        fondoPan.add(miercolesTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 430, 30));

        juevesLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        juevesLbl.setText("Jueves");
        fondoPan.add(juevesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));
        fondoPan.add(juevesSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 320, 10));

        juevesTf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        juevesTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        juevesTf.setBorder(null);
        juevesTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                juevesTfKeyTyped(evt);
            }
        });
        fondoPan.add(juevesTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 430, 30));

        viernesLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        viernesLbl.setText("Viernes");
        fondoPan.add(viernesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));
        fondoPan.add(viernesSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 320, 10));

        viernesTf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        viernesTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        viernesTf.setBorder(null);
        viernesTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                viernesTfKeyTyped(evt);
            }
        });
        fondoPan.add(viernesTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 430, 30));

        sabadoLbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        sabadoLbl.setText("Sábado");
        fondoPan.add(sabadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));
        fondoPan.add(sabadoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 320, 10));

        sabadoTf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        sabadoTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sabadoTf.setBorder(null);
        sabadoTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sabadoTfKeyTyped(evt);
            }
        });
        fondoPan.add(sabadoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 430, 30));
        fondoPan.add(anadirHorarioSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 690, 10));

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
            .addComponent(minimizarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        minimizarPanLayout.setVerticalGroup(
            minimizarPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondoPan.add(minimizarPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Nota: Ingrese la hora de entrada y salida \nseparadas por un espacio. Si tiene 2 o más continue separandolas de la misma forma.\nEjemplo: 10:00-12:00 13:00-16:00");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        fondoPan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 190, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPan, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void fondoPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoPanMousePressed

    private void fondoPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoPanMouseDragged

    private void minimizarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarLblMouseClicked

    private void minimizarLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseEntered
        minimizarPan.setBackground(Color.gray);
    }//GEN-LAST:event_minimizarLblMouseEntered

    private void minimizarLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarLblMouseExited
        minimizarPan.setBackground(Color.white);
    }//GEN-LAST:event_minimizarLblMouseExited

    private void domingoTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domingoTfKeyTyped
        restringirTeclas(evt);
    }//GEN-LAST:event_domingoTfKeyTyped

    private void lunesTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lunesTfKeyTyped
        restringirTeclas(evt);
    }//GEN-LAST:event_lunesTfKeyTyped

    private void martesTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_martesTfKeyTyped
        restringirTeclas(evt);
    }//GEN-LAST:event_martesTfKeyTyped

    private void miercolesTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miercolesTfKeyTyped
        restringirTeclas(evt);
    }//GEN-LAST:event_miercolesTfKeyTyped

    private void juevesTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_juevesTfKeyTyped
        restringirTeclas(evt);
    }//GEN-LAST:event_juevesTfKeyTyped

    private void viernesTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viernesTfKeyTyped
        restringirTeclas(evt);
    }//GEN-LAST:event_viernesTfKeyTyped

    private void sabadoTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sabadoTfKeyTyped
        restringirTeclas(evt);
    }//GEN-LAST:event_sabadoTfKeyTyped

    private void cancelarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLblMouseClicked
        opcion = "cancelar";
    }//GEN-LAST:event_cancelarLblMouseClicked

    private void guardarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLblMouseClicked
        opcion = "guardar";
    }//GEN-LAST:event_guardarLblMouseClicked

    private void restringirTeclas(java.awt.event.KeyEvent evt){
        int tecla = evt.getKeyChar();
        boolean numeros = tecla >= 48 && tecla <= 58 || tecla == 32 || tecla == 45;
        if(!numeros){
            evt.consume();
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anadirHorarioLbl;
    private javax.swing.JSeparator anadirHorarioSp;
    public javax.swing.JLabel cancelarLbl;
    private javax.swing.JPanel cancelarPan;
    private javax.swing.JLabel domingoLbl;
    private javax.swing.JSeparator domingoSp;
    public javax.swing.JTextField domingoTf;
    private javax.swing.JPanel fondoPan;
    public javax.swing.JLabel guardarLbl;
    private javax.swing.JPanel guardarPan;
    private javax.swing.JLabel horarioLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel juevesLbl;
    private javax.swing.JSeparator juevesSp;
    public javax.swing.JTextField juevesTf;
    private javax.swing.JLabel lunesLbl;
    private javax.swing.JSeparator lunesSp;
    public javax.swing.JTextField lunesTf;
    private javax.swing.JLabel martesLbl;
    private javax.swing.JSeparator martesSp;
    public javax.swing.JTextField martesTf;
    private javax.swing.JLabel miercolesLbl;
    private javax.swing.JSeparator miercolesSp;
    public javax.swing.JTextField miercolesTf;
    private javax.swing.JLabel minimizarLbl;
    private javax.swing.JPanel minimizarPan;
    private javax.swing.JLabel sabadoLbl;
    private javax.swing.JSeparator sabadoSp;
    public javax.swing.JTextField sabadoTf;
    private javax.swing.JLabel viernesLbl;
    private javax.swing.JSeparator viernesSp;
    public javax.swing.JTextField viernesTf;
    // End of variables declaration//GEN-END:variables
}
