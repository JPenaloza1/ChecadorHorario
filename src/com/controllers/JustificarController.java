package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.JustificarModel;
import com.views.frmJustificar;
import java.awt.event.MouseEvent;

public class JustificarController extends Controller {

    private frmJustificar justificarFaltaV;
    private JustificarModel justificarFaltaM;
    
    public JustificarController(frmJustificar justificarFaltaV, JustificarModel justificarFaltaM) {
        this.justificarFaltaV = justificarFaltaV;
        this.justificarFaltaM = justificarFaltaM;
        anadirMouseListener();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(justificarFaltaV.opcion){
            case "justificarIntervalo":
                justificarFaltaV.dispose();
                //Llamar al metodo de template y pasarle el string. Convertir el date
                //de ser necesario
                Template.abrirJustificarIntervalo(justificarFaltaV.desdeJdc.getDate(), justificarFaltaV.hastaJdc.getDate(), justificarFaltaM.getIdEmpleado());
                break;
            
            case "justificarDia":
                justificarFaltaV.dispose();
                //Llamar al metodo de template y pasarle el string. Convertir el date
                //de ser necesario
                Template.abrirJustificarDia(justificarFaltaV.fechaJdc.getDate(), justificarFaltaM.getIdEmpleado());
                break;
                
            case "cancelar":
                justificarFaltaV.dispose();
                Template.abrirMenuPrincipal();
                break;
        }
    }
    
    private void anadirMouseListener(){
        justificarFaltaV.justificarIntervaloLbl.addMouseListener(this);
        justificarFaltaV.justificarDiaLbl1.addMouseListener(this);
        justificarFaltaV.cancelarLbl.addMouseListener(this);
    }
    
}
