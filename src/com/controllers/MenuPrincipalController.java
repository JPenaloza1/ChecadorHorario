/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.MenuPrincipalModel;
import com.views.frmMenuPrincipal;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonat
 */
public class MenuPrincipalController extends Controller {
    //Creamos la vista y el modelo que estaremos manejando
    private frmMenuPrincipal menuPrincipalV = new frmMenuPrincipal();
    private MenuPrincipalModel menuPrincipalM = new MenuPrincipalModel();
    
    //Constructor, inicializamos los objetos creados anteriormente
    public MenuPrincipalController(frmMenuPrincipal menuPrincipalV, MenuPrincipalModel menuPrincipalModelM){
        this.menuPrincipalV = menuPrincipalV;
        this.menuPrincipalM = menuPrincipalM;
        this.menuPrincipalV.buscarLbl.addMouseListener(this);
    }
    
    //Este método se encarga de coordinar todo para poder llevar a cabo la
    //busqueda del id ingresado
    private void buscarEmpleado(){
        //Toma el id del JTextField y lo pasa al modelo
        menuPrincipalM.setIdEmpleado(Integer.parseInt(menuPrincipalV.idEmpleadoTf.getText()));
        //Llama al método buscarEmpleado() del modelo y guarda el valor que regrese (0=No y 1=Si)
        int resultado = menuPrincipalM.buscarEmpleado();
        //Verificamos si el resultado es 1 entonces abrirmos 
        //frmMenuOpcionesEmpleado y cerramos la pantalla principal
        if(resultado == 1){
            Template.abrirMenuOpcionesEmpleado(menuPrincipalM.getIdEmpleado());
            menuPrincipalV.dispose();
        }else{
            JOptionPane.showMessageDialog(menuPrincipalV, "Lo sentimos, el id no coincide con ningún empleado.");
        }
    }
    
    //Este método queda a la espera de que se seleccione el botón "buscar" que
    //se encuentra en la ventana principal para comenzar con la búsqueda del empleado
    @Override
    public void mouseClicked(MouseEvent e) {
        if(menuPrincipalV.idEmpleadoTf.getText().isEmpty() || menuPrincipalV.idEmpleadoTf.getText().equals("  ID Empleado")){
            JOptionPane.showMessageDialog(menuPrincipalV, "Primero ingrese un id.");
        } else {
            buscarEmpleado();
        }
    }
    
}
