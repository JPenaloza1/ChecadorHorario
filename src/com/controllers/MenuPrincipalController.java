package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.MenuPrincipalModel;
import com.views.frmMenuPrincipal;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class MenuPrincipalController extends Controller {
    //Creamos la vista y el modelo que estaremos manejando
    private frmMenuPrincipal menuPrincipalV = new frmMenuPrincipal();
    private MenuPrincipalModel menuPrincipalM = new MenuPrincipalModel();
    
    //Constructor, inicializamos los objetos creados anteriormente
    public MenuPrincipalController(frmMenuPrincipal menuPrincipalV, MenuPrincipalModel menuPrincipalModelM){
        this.menuPrincipalV = menuPrincipalV;
        this.menuPrincipalM = menuPrincipalM;
        anadirMouseListener();
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
        switch(menuPrincipalV.opcion) {
            case "anadir":
                menuPrincipalV.dispose();
                Template.abrirAnadirEmpleado();
                break;
                
            case "buscar":
                if( menuPrincipalV.idEmpleadoTf.getText().isEmpty() || menuPrincipalV.idEmpleadoTf.getText().equals("  ID Empleado") ) {
                    JOptionPane.showMessageDialog(menuPrincipalV, "Primero ingrese un id.");
                } else if( menuPrincipalV.idEmpleadoTf.getText().length() < 5 ){
                    JOptionPane.showMessageDialog(menuPrincipalV, "El id ingresado está incompleto.");
                } else {
                    buscarEmpleado();
                }
                break;
                
            case "generar":
                if(menuPrincipalV.desdeDC.getDate() == null || menuPrincipalV.hastaDC.getDate() == null) {
                    JOptionPane.showMessageDialog(menuPrincipalV, "Primero seleccione las fechas.");
                } else {
                    menuPrincipalV.dispose();
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                Template.abrirGenerarReporte(formato.format(menuPrincipalV.desdeDC.getDate()), formato.format(menuPrincipalV.hastaDC.getDate()));
                }
                break;
                
            case "tolerancia":
                Template.abrirModificarTolerancia();
                break;
                
            case "salir":
                int opcion = JOptionPane.showOptionDialog(
                    menuPrincipalV,
                    "¿Desea salir?", 
                    "Cerrar sesión",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[] { "Salir", "Permanecer" },
                    "opcion 1");

                if(opcion == 0){
                    menuPrincipalV.dispose();
                    Template.abrirInicioSesion();
                }
                break;
        }
    }
    
    private void anadirMouseListener(){
        this.menuPrincipalV.anadirEmpleadoLbl.addMouseListener(this);
        this.menuPrincipalV.buscarLbl.addMouseListener(this);
        this.menuPrincipalV.generarReporteLbl.addMouseListener(this);
        this.menuPrincipalV.toleranciaLbl.addMouseListener(this);
        this.menuPrincipalV.salirLbl.addMouseListener(this);
    }
    
}
