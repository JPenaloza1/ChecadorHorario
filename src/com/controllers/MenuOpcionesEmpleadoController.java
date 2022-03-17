/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.MenuOpcionesEmpleadoModel;
import com.views.frmMenuOpcionesEmpleado;
import java.awt.event.MouseEvent;

/**
 *
 * @author Jonat
 */
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
        this.menuOpcionesEmpleadoV.modHorarioLbl.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        Template.abrirModificarHorario(menuOpcionesEmpleadoM.getIdEmpleado());
        menuOpcionesEmpleadoV.dispose();
    }
    
}
