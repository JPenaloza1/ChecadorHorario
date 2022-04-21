package com.controllers;

import checadorhorarios.Controller;
import com.models.ModificarToleranciaModel;
import com.views.frmModificarTolerancia;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class ModificarToleranciaController extends Controller {
    
    private frmModificarTolerancia modificarToleranciaV;
    private ModificarToleranciaModel modificarToleranciaM;
    
    public ModificarToleranciaController(frmModificarTolerancia modificarToleranciaV, ModificarToleranciaModel modificarToleranciaM) {
        this.modificarToleranciaV = modificarToleranciaV;
        this.modificarToleranciaM = modificarToleranciaM;
        anadirMouseListener();
        pasarValoresVista();
    }
    
    private void pasarValoresVista() {
        modificarToleranciaV.entradaTxt.setText(modificarToleranciaM.getPropiedades().getProperty("TOLERANCIAENTRADA"));
        modificarToleranciaV.salidaTxt.setText(modificarToleranciaM.getPropiedades().getProperty("TOLERANCIASALIDA"));
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(modificarToleranciaV.opcion){
            case "guardar":
                modificarToleranciaM.guardarCambios(modificarToleranciaV.entradaTxt.getText(), modificarToleranciaV.salidaTxt.getText());
                JOptionPane.showMessageDialog(modificarToleranciaV, "¡Modificación exitosa!");
                modificarToleranciaV.dispose();
                break;
            
            case "cancelar":
                modificarToleranciaV.dispose();
                break;
        }
    }
    
    private void anadirMouseListener(){
        modificarToleranciaV.guardarLbl.addMouseListener(this);
        modificarToleranciaV.cancelarLbl.addMouseListener(this);
    }
    
}
