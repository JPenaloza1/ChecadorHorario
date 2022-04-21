package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.MenuOpcionesEmpleadoModel;
import com.views.frmMenuOpcionesEmpleado;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class MenuOpcionesEmpleadoController extends Controller {
    
    //Creamos los objetos que estaremos manejando
    private frmMenuOpcionesEmpleado menuOpcionesEmpleadoV = new frmMenuOpcionesEmpleado();
    private MenuOpcionesEmpleadoModel menuOpcionesEmpleadoM = new MenuOpcionesEmpleadoModel();
    
    //Constructor, inicializamos los objetos creados anteriormente
    public MenuOpcionesEmpleadoController(frmMenuOpcionesEmpleado menuOpcionesEmpleadoV, MenuOpcionesEmpleadoModel menuOpcionesEmpleadoM){
        this.menuOpcionesEmpleadoV = menuOpcionesEmpleadoV;
        //Pasamos la info del modelo que recibimos al nuestro modelo local
        this.menuOpcionesEmpleadoM = menuOpcionesEmpleadoM;
        //Buscamos al empleado para obtener su nombre y ponerlo en la vista
        menuOpcionesEmpleadoM.setNombre(menuOpcionesEmpleadoM.buscarEmpleado());
        //Pasamos el idEmpleado y el nombre completo a las lbl encabezado de la pantalla
        this.menuOpcionesEmpleadoV.idEmpleadoLbl.setText(String.valueOf(menuOpcionesEmpleadoM.getIdEmpleado()));
        this.menuOpcionesEmpleadoV.empleadoLbl.setText(menuOpcionesEmpleadoM.getNombre());
        anadirMouseListener();
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        menuOpcionesEmpleadoV.dispose();
        switch(menuOpcionesEmpleadoV.getOpcion()){
            case "Modificar empleado":
                Template.abrirModificarEmpleado(menuOpcionesEmpleadoM.getIdEmpleado());
                break;
            
            case "Modificar horario":
                Template.abrirModificarHorario(menuOpcionesEmpleadoM.getIdEmpleado());
                break;
                
            case "Justificar falta":
                Template.abrirJustificar(menuOpcionesEmpleadoM.getIdEmpleado());
                break;
             
            case "Cancelar":
                Template.abrirMenuPrincipal();
                break;
                
            default:
                JOptionPane.showMessageDialog(menuOpcionesEmpleadoV, "Seleccione una opción válida");
                break;
        }
    }
    
    private void anadirMouseListener(){
        this.menuOpcionesEmpleadoV.modEmpleadoLbl.addMouseListener(this);
        this.menuOpcionesEmpleadoV.modHorarioLbl.addMouseListener(this);
        this.menuOpcionesEmpleadoV.justFaltaLbl.addMouseListener(this);
        this.menuOpcionesEmpleadoV.cancelarLbl.addMouseListener(this);
    }
    
}
