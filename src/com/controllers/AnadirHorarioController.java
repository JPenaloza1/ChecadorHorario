package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.AnadirEmpleadoModel;
import com.models.AnadirHorarioModel;
import com.views.frmAnadirHorario;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class AnadirHorarioController extends Controller {
    
    //Creamos la vista y los modelos que que utilizaremos
    private frmAnadirHorario anadirHorarioV;
    private AnadirHorarioModel anadirHorarioM;
    
    //Constructor, inicializamos todos los objetos privados que hemos creado antes
    public AnadirHorarioController(frmAnadirHorario anadirHorarioV, AnadirHorarioModel anadirHorarioModel){
        this.anadirHorarioV = anadirHorarioV;
        this.anadirHorarioM = anadirHorarioModel;
        anadirMouseListener();
    }
    
    //Se encarga de coordinar los demás métodos para el finalizar la inserción
    //del empleado y el horario
    private void guardarEmpleado(){
        //Llama al método mostrarHorario para confirmar que el horario ingresado
        //es el horario correcto
        int respuesta = mostrarHorario();
        //Comprobamos si la respuesta fue "si"
        if(respuesta == 0){
            //Pasa la información del horario de la vista al modelo
            actualizarInfoModelo();
            //Llama al método para hacer la inserción en el modelo
            int empleado = anadirHorarioM.insertarEmpleado();
            //Comprueba si se agregó la info del empleado
            if(empleado == 1){
                anadirHorarioM.buscarEmpleado();
                int horario = anadirHorarioM.insertarHorario();
                //Comprueba si no se agregó el horario del horario
                if(horario == 0){
                    anadirHorarioM.eliminarEmpleado();
                    JOptionPane.showMessageDialog(anadirHorarioV, "Lo sentimos, ha ocurrido un error. Inténtelo de nuevo");
                    Template.abrirMenuPrincipal();
                    return;
                }
                
                //El empleado y el horario han sido agregados con éxito y se 
                //hace una consulta para mostrar el id en un JOptionPane
                JOptionPane.showMessageDialog(anadirHorarioV, "¡El empleado ha sido añadido con éxito!"
                                                            + "\n     Su ID generado es: " + String.valueOf(anadirHorarioM.getIdEmpleado()));
                
                anadirHorarioV.dispose();
                
                Template.abrirMenuPrincipal();
            }  
        }
    }
    
    //Este método se encarga de pasar la información que contiene el modelo
    //del empleado al modelo del horario que extiende a AnadirHorarioModel
    private void pasarInfoModelo(AnadirEmpleadoModel anadirEmpleadoM){
        anadirHorarioM.setNombre(anadirEmpleadoM.getNombre());
        anadirHorarioM.setaPaterno(anadirEmpleadoM.getaPaterno());
        anadirHorarioM.setaMaterno(anadirEmpleadoM.getaMaterno());
        anadirHorarioM.setRfc(anadirEmpleadoM.getRfc());
        anadirHorarioM.setGenero(anadirEmpleadoM.getGenero());
        anadirHorarioM.setfNacimiento(anadirEmpleadoM.getfNacimiento());
        anadirHorarioM.setfIngreso(anadirEmpleadoM.getfIngreso());
    }
    
   private void actualizarInfoModelo(){
        anadirHorarioM.setDomingo(anadirHorarioV.domingoTf.getText());
        anadirHorarioM.setLunes(anadirHorarioV.lunesTf.getText());
        anadirHorarioM.setMartes(anadirHorarioV.martesTf.getText());
        anadirHorarioM.setMiercoles(anadirHorarioV.miercolesTf.getText());
        anadirHorarioM.setJueves(anadirHorarioV.juevesTf.getText());
        anadirHorarioM.setViernes(anadirHorarioV.viernesTf.getText());
        anadirHorarioM.setSabado(anadirHorarioV.sabadoTf.getText());
   }
    
    //Este método se encarga de mostrar el horario al administrador para 
    //confirmar que todo está correcto
    private int mostrarHorario(){
        int opcion = JOptionPane.showOptionDialog(
            null,
            "¿Está seguro del horario ingresado?"
                    + "\n  Domingo: " + anadirHorarioV.domingoTf.getText()
                    + "\n  Lunes:: " + anadirHorarioV.lunesTf.getText()
                    + "\n  Martes: " + anadirHorarioV.martesTf.getText()
                    + "\n  Miercoles: " + anadirHorarioV.miercolesTf.getText()
                    + "\n  Jueves: " + anadirHorarioV.juevesTf.getText()
                    + "\n  Viernes: " + anadirHorarioV.viernesTf.getText()
                    + "\n  Sabado: " + anadirHorarioV.sabadoTf.getText(),
            "¿Desea guardar?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "Aceptar", "Cancelar" },
            "opcion 1");
        
        return opcion;
    }
    
    //Método que está a la espera de que se le haga click al boton "guardar" de la vista
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(anadirHorarioV.opcion){
            case "guardar":
                guardarEmpleado();
                anadirHorarioM.imprimirInformacion();
                break;
            
            case "cancelar":
                anadirHorarioV.dispose();
                Template.abrirMenuPrincipal();
                break;      
        }
    }
    
    private void anadirMouseListener(){
        anadirHorarioV.guardarLbl.addMouseListener(this);
        anadirHorarioV.cancelarLbl.addMouseListener(this);
    }
    
}
