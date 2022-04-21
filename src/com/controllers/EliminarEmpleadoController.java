package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.EliminarEmpleadoModel;
import com.views.frmEliminarEmpleado;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class EliminarEmpleadoController extends Controller {
    
    //Creamos la vista y el modelo que estaremos manejando
    frmEliminarEmpleado eliminarEmpleadoV = new frmEliminarEmpleado();
    EliminarEmpleadoModel eliminarEmpleadoM = new EliminarEmpleadoModel();
    
    //Constructor, se encarga de inicializar los objetos creados antes
    public EliminarEmpleadoController(frmEliminarEmpleado eliminarEmpleadoV, EliminarEmpleadoModel eliminarEmpleadoM){
        this.eliminarEmpleadoV = eliminarEmpleadoV;
        this.eliminarEmpleadoM = eliminarEmpleadoM;
        anadirMouseListener();
    }
    
    //Este método coordina todo para la eliminación del empleado
    private void eliminarEmpleado(){
        int estadoEliminacion = eliminarEmpleadoM.eliminarEmpleado();
        if(estadoEliminacion == 2){
            JOptionPane.showMessageDialog(eliminarEmpleadoV, "El empleado ha sido eliminado con éxito");
        }else{
            JOptionPane.showMessageDialog(eliminarEmpleadoV, "Ha ocurrio un problema al eliminarlo,inténtelo de nuevo");
        }
    }
    
    //Método que está a la espera de que el adminitrador seleccione el botón
    //eliminar para llamar al método eliminarEmpleado y coordinar todo.
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(eliminarEmpleadoV.opcion){
            case "eliminar":
                eliminarEmpleado();
                eliminarEmpleadoV.dispose();
                Template.abrirMenuPrincipal();
                break;
            
            case "cancelar":
                eliminarEmpleadoV.dispose();
                break;      
        }
    }
    
    private void anadirMouseListener(){
        eliminarEmpleadoV.eliminarLbl.addMouseListener(this);
        eliminarEmpleadoV.cancelarLbl.addMouseListener(this);
    }
    
}
