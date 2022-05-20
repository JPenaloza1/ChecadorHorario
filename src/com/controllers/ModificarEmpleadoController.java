package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.ModificarEmpleadoModel;
import com.toedter.calendar.JDateChooser;
import com.views.frmModificarEmpleado;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class ModificarEmpleadoController extends Controller {
    
    //Creamos la vista y el modelo que estaremos manejando
    frmModificarEmpleado modificarEmpleadoV = new frmModificarEmpleado();
    ModificarEmpleadoModel modificarEmpleadoM = new ModificarEmpleadoModel();
    
    private static final int MODIFICACION_EXITOSA = 1;
    
    //Constructor, inicializa los objetos crrados anteriormente  y ejecuta el
    //método obtenerInformación() del modelo y que toda esta info sea mostrada
    //en los campos de la frmModificarEmpleado
    public ModificarEmpleadoController(frmModificarEmpleado modificarEmpleadoV, ModificarEmpleadoModel modificarEmpleadoM){
        this.modificarEmpleadoV = modificarEmpleadoV;
        this.modificarEmpleadoM = modificarEmpleadoM;
        this.modificarEmpleadoV.guardarLbl.addMouseListener(this);
        modificarEmpleadoM.obtenerInformacionEmpleado();
        pasarInformacionVista();
    }
    
    //Este método se encarga de pasar todos los datos del modelo a la vista
    private void pasarInformacionVista(){
        modificarEmpleadoV.idEmpleadoLbl.setText(String.valueOf(modificarEmpleadoM.getIdEmpleado()));
        modificarEmpleadoV.nombreTf.setText(modificarEmpleadoM.getNombre());
        modificarEmpleadoV.aPaternoTf.setText(modificarEmpleadoM.getApellidoPaterno());
        modificarEmpleadoV.aMaternoTf.setText(modificarEmpleadoM.getApellidoMaterno());
        modificarEmpleadoV.rfcTf.setText(modificarEmpleadoM.getRfc());
        if(modificarEmpleadoM.getGenero().equals("Masculino")){
            modificarEmpleadoV.generoCbm.setSelectedIndex(1);
        }else{
            modificarEmpleadoV.generoCbm.setSelectedIndex(2);
        }
        modificarEmpleadoV.fNacimientoDc.setDate(convertirFechaDate(modificarEmpleadoM.getfNacimiento()));
        modificarEmpleadoV.fIngresoDc.setDate(convertirFechaDate(modificarEmpleadoM.getfIngreso()));
    }
    
    //Este método se encarga de pasar los datos de la vista al modelo (info ya modificada
    private void pasarInformacionModelo(){
        modificarEmpleadoM.setNombre(modificarEmpleadoV.nombreTf.getText());
        modificarEmpleadoM.setApellidoPaterno(modificarEmpleadoV.aPaternoTf.getText());
        modificarEmpleadoM.setApellidoMaterno(modificarEmpleadoV.aMaternoTf.getText());
        modificarEmpleadoM.setRfc(modificarEmpleadoV.rfcTf.getText());
        modificarEmpleadoM.setGenero(modificarEmpleadoV.generoCbm.getSelectedItem().toString());
        modificarEmpleadoM.setfNacimiento(convertirFechaString(modificarEmpleadoV.fNacimientoDc));
        modificarEmpleadoM.setfIngreso(convertirFechaString(modificarEmpleadoV.fIngresoDc));
    }
    
    //Método que convierte de Date a String
    private String convertirFechaString(JDateChooser fecha){
        int anio = fecha.getCalendar().get(Calendar.YEAR);
        int mes = fecha.getCalendar().get(Calendar.MONTH);
        mes++;
        int dia = fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fechaConvertida = (anio + "-" + mes + "-" + dia);
        return fechaConvertida;
    }
    
    private Date convertirFechaDate(String fecha){
        DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date dataformateada = new Date();
        try {
            dataformateada = formatoFecha.parse(fecha);
        } catch (ParseException e) {
            String mensaje = "ModificarEmpleadoController::convertirFechaDate -> " + e;
            anadirLog(mensaje);
        }
        
        return dataformateada;
    }
    
    //Este método se encarga de esperar a que se haga click en el botón "guardar"
    //para comenzar con todos los pasos que requiera el update
    @Override
    public void mouseClicked(MouseEvent e) {
        pasarInformacionModelo();
        int update = modificarEmpleadoM.actualizarEmpleado();
        if(update == MODIFICACION_EXITOSA){
            JOptionPane.showMessageDialog(modificarEmpleadoV, "¡Información de empleado actualizada con éxito!");
        }else{
            JOptionPane.showMessageDialog(modificarEmpleadoV, "¡Lo sentimos, ha ocurrido un problema al actualizar!");
        }
        modificarEmpleadoV.dispose();
        Template.abrirMenuPrincipal();
    }
    
}
