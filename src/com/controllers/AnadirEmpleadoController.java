package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.AnadirEmpleadoModel;
import com.toedter.calendar.JDateChooser;
import com.views.frmAnadirEmpleado;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class AnadirEmpleadoController extends Controller {
    
    //Creamos la vista y el modelo que estaremos manejando
    private frmAnadirEmpleado anadirEmpleadoV;
    private AnadirEmpleadoModel anadirEmpleadoM;
    
    //Constructor que recibe una vista y un modelo
    public AnadirEmpleadoController(frmAnadirEmpleado anadirEmpleadoV, AnadirEmpleadoModel anadirEmpleadoM){
        this.anadirEmpleadoV = anadirEmpleadoV;
        this.anadirEmpleadoM = anadirEmpleadoM;
        agregarMouseListener();
    }
    
    //Este método se encarga de coordinar todos los métodos para realizar
    //la inserción del nuevo empleado
    public void anadir(){
        //Comprobar si no falta ningún dato del empleado
        if(!comprobarDatos()){
            int confirmar = mostrarInformacion();
            //Del OptionPane verifica si la respuesta fue el primer botón 
            //(YES_OPTION u opción 0) entonces pasa toda la información al modelo
            if(confirmar == 0){
                pasarInfoEmpleado();
                anadirEmpleadoV.dispose();
                //Llama a anadirHorario y le pasa el este modelo al modelo de 
                //anadirHorario para inyectar ambos en la bbdd
                Template.abrirAnadirHorario(anadirEmpleadoM);
            }
        }else{
            JOptionPane.showMessageDialog(anadirEmpleadoV, "Rellene todos los campos por favor");
            return;
        }
    }
    
    //Este método se encarga de pasar toda la información que tenemos en 
    //la vista al modelo
    private void pasarInfoEmpleado(){        
        anadirEmpleadoM.setNombre(anadirEmpleadoV.nombreTf.getText());
        anadirEmpleadoM.setaPaterno(anadirEmpleadoV.aPaternoTf.getText());
        anadirEmpleadoM.setaMaterno(anadirEmpleadoV.aMaternoTf.getText());
        anadirEmpleadoM.setRfc(anadirEmpleadoV.rfcTf.getText());
        anadirEmpleadoM.setGenero(String.valueOf(anadirEmpleadoV.generoCbm.getSelectedItem().toString()));
        anadirEmpleadoM.setfNacimiento(convertirFecha(anadirEmpleadoV.fNacimientoDc));
        anadirEmpleadoM.setfIngreso(convertirFecha(anadirEmpleadoV.fIngresoDc));
    }
    
    //Este método se encarga de comprobar que ningún campo esté vacío o que
    //ninguno tenga valor por defecto
    private boolean comprobarDatos(){
        boolean vacio = false;
        if(anadirEmpleadoV.nombreTf.getText().equals("") || anadirEmpleadoV.nombreTf.getText().equals("Nombre")
                ||anadirEmpleadoV.aPaternoTf.getText().equals("") ||anadirEmpleadoV.aPaternoTf.getText().equals("Apellido paterno")
                || anadirEmpleadoV.aMaternoTf.getText().equals("") || anadirEmpleadoV.aMaternoTf.getText().equals("Apellido materno") 
                || anadirEmpleadoV.rfcTf.getText().equals("") || anadirEmpleadoV.rfcTf.getText().equals("RFC")
                || anadirEmpleadoV.generoCbm.getSelectedItem().toString().equals("Elige uno")
                || anadirEmpleadoV.fNacimientoDc.getDate() == null || anadirEmpleadoV.fIngresoDc.getDate() == null){
            vacio = true;
        }
        return vacio;
    }
    
    //Este método se encarga de mostrar la información que el administrador ha
    //ingresado a la vista y preguntar si está seguro de que la info es correcta
    private int mostrarInformacion(){
        //java.util.Date fNacimiento = convertirFecha(anadirEmpleadoV.fNacimientoDc);
        //Date dFNacimiento = convertirFecha((Date) anadirEmpleadoV.fNacimientoDc.getDate());
        
        java.util.Date fIngreso = anadirEmpleadoV.fIngresoDc.getDate();
        Date dFIngreso = new Date(fIngreso.getDate());
        
        int opcion = JOptionPane.showOptionDialog(
            null,
            "¿Está seguro de añadir un nuevo empleado?"
                    + "\n  Nombre: " + anadirEmpleadoV.nombreTf.getText()
                    + "\n  Apellido paterno:: " + anadirEmpleadoV.aPaternoTf.getText()
                    + "\n  Apellido materno: " + anadirEmpleadoV.aMaternoTf.getText()
                    + "\n  RFC: " + anadirEmpleadoV.rfcTf.getText()
                    + "\n  Género: " + anadirEmpleadoV.generoCbm.getSelectedItem().toString()
                    + "\n  Fecha de nacimiento: " + convertirFecha(anadirEmpleadoV.fNacimientoDc)
                    + "\n  Fecha de ingreso: " + convertirFecha(anadirEmpleadoV.fIngresoDc),
            "¿Desea salir?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "Aceptar", "Cancelar" },
            "opcion 1");
        
        return opcion;
    }
    
    //Este método se encarga guardar sólo la fecha yyyy-mm-dd sin la hora    
    private String convertirFecha(JDateChooser fecha){
        int anio = fecha.getCalendar().get(Calendar.YEAR);
        int mes = fecha.getCalendar().get(Calendar.MONTH);
        if(mes == 0){
            mes = 01;
        }
        int dia = fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fechaConvertida = (anio + "-" + mes + "-" + dia);
        return fechaConvertida;
    }

    //Este método sirve para que cuando al botón "guardar" le den clic comience
    //todo el proceso de añadir el empleado
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(anadirEmpleadoV.opcion){
            case "guardar":
                anadir();
                break;
            
            case "cancelar":
                anadirEmpleadoV.dispose();
                Template.abrirMenuPrincipal();
                break;      
        }
    }
    
    private void agregarMouseListener(){
        this.anadirEmpleadoV.guardarLbl.addMouseListener(this);
        this.anadirEmpleadoV.cancelarLbl.addMouseListener(this);
    }
}
