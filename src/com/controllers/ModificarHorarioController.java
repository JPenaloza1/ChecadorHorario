package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.ModificarHorarioModel;
import com.views.frmModificarHorario;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class ModificarHorarioController extends Controller {
    
    frmModificarHorario modificarHorarioV = new frmModificarHorario();
    ModificarHorarioModel modificarHorarioM = new ModificarHorarioModel();
    
    //Constructor, recibe la vista y el modelo que se manejarán aquí
    public ModificarHorarioController(frmModificarHorario modificarHorarioV, ModificarHorarioModel modificarHorarioM){
        this.modificarHorarioV = modificarHorarioV;
        this.modificarHorarioM = modificarHorarioM;
        pasarInformacionVista();
        this.modificarHorarioV.guardarLbl.addMouseListener(this);
    }
    
    private void pasarInformacionVista(){
        //Consultar horario
        int resultado = modificarHorarioM.consultarHorario();
        //Saber si encontró el horario
        if(resultado == 1){
            //Pasar los datos en el modelo a la vista
            modificarHorarioV.domingoTxt.setText(modificarHorarioM.getDomingo());
            modificarHorarioV.lunesTxt.setText(modificarHorarioM.getLunes());
            modificarHorarioV.martesTxt.setText(modificarHorarioM.getMartes());
            modificarHorarioV.miercolesTxt.setText(modificarHorarioM.getMiercoles());
            modificarHorarioV.juevesTxt.setText(modificarHorarioM.getJueves());
            modificarHorarioV.viernesTxt.setText(modificarHorarioM.getViernes());
            modificarHorarioV.sabadoTxt.setText(modificarHorarioM.getSabado());
        }
    }
    
    private void pasarInformacionModelo(){
        //Pasa los datos de la vista al modelo
        modificarHorarioM.setDomingo(modificarHorarioV.domingoTxt.getText());
        modificarHorarioM.setLunes(modificarHorarioV.lunesTxt.getText());
        modificarHorarioM.setMartes(modificarHorarioV.martesTxt.getText());
        modificarHorarioM.setMiercoles(modificarHorarioV.miercolesTxt.getText());
        modificarHorarioM.setJueves(modificarHorarioV.juevesTxt.getText());
        modificarHorarioM.setViernes(modificarHorarioV.viernesTxt.getText());
        modificarHorarioM.setSabado(modificarHorarioV.sabadoTxt.getText());
        
        //Guarda los cambios en la base de datos
        int resultado = modificarHorarioM.actualizarHorario();
        
        //Verifica si el horario fue actualizado
        if(resultado == 1){
            JOptionPane.showMessageDialog(modificarHorarioV, "Horario actualizado con éxito");
        }else{
            JOptionPane.showMessageDialog(modificarHorarioV, "Lo sentimos ha ocurrido un problema al actualizar el horario");
        }
        modificarHorarioV.dispose();
        Template.abrirMenuPrincipal();
    }
    
    private int confirmarNuevoHorario(){
        
        int opcion = JOptionPane.showOptionDialog(
            null,
            "¿Está seguro de añadir un nuevo empleado?"
                    + "\n  ",
            "¿Desea salir?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "Aceptar", "Cancelar" },
            "opcion 1");
        
        return opcion;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        pasarInformacionModelo();
    }
    
}
