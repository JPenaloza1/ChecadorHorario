package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.RegistrarAsistenciaModel;
import com.views.frmRegistrarAsistencia;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistrarAsistenciaController extends Controller {
    
    //Creamos la vista y el modelo que estaremos manejando
    private frmRegistrarAsistencia registrarAsistenciaV;
    private RegistrarAsistenciaModel registrarAsistenciaM;
    
    //Constantes
    private final static int ASISTENCIA_FUERA_DE_RANGO = 0;
    private final static int ASISTENCIA_CON_RETARDO = 1;
    private final static int ASISTENCIA_EXITOSA = 2;
    private final static int ASISTENCIA_ANTICIPADA = 3;
    private final static int ASISTENCIA_SALIDA_ERRONEA = 4;
    
    private final static int ID_VACIO  = 0;
    private final static int ID_INCOMPLETO = 1;
    private final static int ID_CORRECTO = 2;
    private final static int ID_INEXISTENTE = 3;
    
    public RegistrarAsistenciaController(frmRegistrarAsistencia registrarAsistenciaV, RegistrarAsistenciaModel registrarAsistenciaM){
        this.registrarAsistenciaV = registrarAsistenciaV;
        this.registrarAsistenciaM = registrarAsistenciaM;
        anadirMouseListener();
    }
    
    private void registrarAsistencia(){
        int comprobar = comprobarId();
        if( comprobar == ID_VACIO || comprobar == ID_INCOMPLETO || comprobar == ID_INEXISTENTE )
            return;
        
        registrarAsistenciaM.setDia(obtenerDia());
        if( registrarAsistenciaM.buscarHorario() != 1 )
            return;
        
        int temp = compararHora();
        if( temp == ASISTENCIA_FUERA_DE_RANGO )
            return;
        
        if( temp == ASISTENCIA_ANTICIPADA ) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, "Su registro de asistencia debe\n"
                        + "ser 10 minutos antes 0 10 minutos después de la hora.");
            return;
        }
        
        if( temp == ASISTENCIA_SALIDA_ERRONEA ) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, "Realice su registro de "
                    + "salida en su horario establecido.");
            return;
        }
        
        String registro = obtenerHora() + ":" + obtenerMinuto();
        
        if( temp == ASISTENCIA_CON_RETARDO ) 
            registro = ( obtenerHora() + 1) + ":" + 00;
            
        registrarAsistenciaM.setHoraRegistrada(registro);
        registrarAsistenciaM.setFecha(obtenerFecha());
        
        int filas;
        if( obtenerUltimoRegistro().equals("00:00:00") )
            filas = registrarAsistenciaM.registrarSalida();
        else
            filas = registrarAsistenciaM.registrarEntrada();
        
        if( filas == 1 && temp == ASISTENCIA_CON_RETARDO ) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, ""+registrarAsistenciaM.getNombreEmpleado()+" el límite de tolerancia"
                    + " ha sido superado. \n No se tomará la primer hora laborada.");
        } else if( filas == 1 ) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, 
                    ""+registrarAsistenciaM.getNombreEmpleado()+" su asistencia ha sido registrada.");
        } else {
            JOptionPane.showMessageDialog(registrarAsistenciaV, "Lo sentimos, ha ocurrido un problema"
                                                              + "\n al registrar su asistencia.");
        }
    }
    
    //Método para comprobar que haya un id en el txt y registrarlo
    private int comprobarId(){
        if(registrarAsistenciaV.idEmpleadoTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, "El ID del empleado está vacío."
                                                              + "\n Por favor ingrese uno.");
            return ID_VACIO;
        }
        
        if(registrarAsistenciaV.idEmpleadoTxt.getText().length() < 5) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, "El ID del empleado está incompleto.");
            return ID_INCOMPLETO;
        }
        
        registrarAsistenciaM.setIdEmpleado(Integer.parseInt(registrarAsistenciaV.idEmpleadoTxt.getText()));
        if( registrarAsistenciaM.buscarEmpleado() != 1 ) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, "El empleado con el ID que"
                                                              + "\n ingresaste no existe..");
            return ID_INEXISTENTE;
        }
        
        return ID_CORRECTO;
    }
    
    private int compararHora(){
        //Obtenemos todos los horarios de un dia y lo separamos por cada espacio
        //y el tamaño de este será del número de chequeos de entrada y salida
        //que tenga el empleado en ese día
        String[] horarioCompleto = registrarAsistenciaM.getHorario().split(" ");
        
        String[] horarioPorChequeos, horaMinuto =  null;
        int horaObtenida, minutoObtenido, horaGuardada;
                
        //Obtenemos el horario en la posición i (10:00-20:00) 
        for(int i=0 ; i<horarioCompleto.length ; i++){
            //Se divide el horario por cada "-" y lo guardamos en horarioIndividual
            //Horario individual siempre será de tamaño 2 porque uno hace
            //referencia a la entrada y otro a la salida
            horarioPorChequeos = horarioCompleto[i].split("-");
            
            for(int j=0 ; j<horarioPorChequeos.length ; j++){
                //Dividimos el horario por chequeos por ":" y lo guardamos en
                //el array, siempre deberá ser de tamaño 2 porque uno hace
                //referencia a la hora y otro a los minutos
                horaMinuto = horarioPorChequeos[j].split(":");
                
                //Guardamos la hora que obtuvimos de la BD
                horaGuardada = Integer.parseInt(horaMinuto[0]);
                
                //Guardamos la hora y el minuto local de nuestro chequeo
                horaObtenida = obtenerHora();
                minutoObtenido = obtenerMinuto();
                
                //Comprobamos si es hora de entrada o salida
                if( j == 0 ) {
                    int resultadoTemp = comprobarChequeoEntrada(horaGuardada, horaObtenida, minutoObtenido);
                    if( resultadoTemp == ASISTENCIA_EXITOSA )
                        return ASISTENCIA_EXITOSA;
                    else if (resultadoTemp == ASISTENCIA_CON_RETARDO) 
                        return ASISTENCIA_CON_RETARDO;
                    else if( resultadoTemp == ASISTENCIA_ANTICIPADA )
                        return ASISTENCIA_ANTICIPADA;
                } else if( j == 1 ) {
                    int resultadoTemp = comprobarChequeoSalida(horaGuardada, horaObtenida, minutoObtenido);
                
                    if( resultadoTemp == ASISTENCIA_EXITOSA )
                        return ASISTENCIA_EXITOSA;
                    else if( resultadoTemp == ASISTENCIA_SALIDA_ERRONEA ) {
                        return ASISTENCIA_SALIDA_ERRONEA;
                    }
                }
            }            
        }
        return ASISTENCIA_FUERA_DE_RANGO;
    }
    
    private int comprobarChequeoEntrada(int horaGuardada, int horaObtenida, int minutoObtenido){
        //Comprobamos que la hora de entrada sea con los 10 minutos
        //antes de la hora o los 10 minutos de retardo (margen de 20 min)
        if( horaObtenida == horaGuardada - 1 ) {
            
            //Comprobamos que sea entre 50 y 59
            if( minutoObtenido >= 50 && minutoObtenido <= 59 )
                return ASISTENCIA_EXITOSA;
            else if( minutoObtenido < 50 ) 
                return ASISTENCIA_ANTICIPADA;
            
        } else if( horaObtenida == horaGuardada ) {
            
            //Comprobamos que sea entre 00 y 10
            if( minutoObtenido >= 00 && minutoObtenido <= 10 ){
                //Se hace el registro de la asistencia
                //JOptionPane.showMessageDialog(registrarAsistenciaV, "Su asistencia ha sido registrada.");
                return ASISTENCIA_EXITOSA;
            } else {//Si se pasa que no tome la primer hora
                return ASISTENCIA_CON_RETARDO;
            }
        }
        return ASISTENCIA_FUERA_DE_RANGO;
    }
    
    private int comprobarChequeoSalida(int horaGuardada, int horaObtenida, int minutoObtenido){
        if( horaObtenida != horaGuardada ) 
            return ASISTENCIA_SALIDA_ERRONEA;

        //Comprobamos que los minutos se encuentren entre 00 y 15
        if( minutoObtenido >= 00 && minutoObtenido <= 15 ) {
            System.out.println("Jejeje");
            return ASISTENCIA_EXITOSA;
        } else if( minutoObtenido > 15 ) {
            System.out.println("Jojojojo");
            //Avisar que debido a que superó la tolerancia de  salida se anulará el 
            //registro de entrada porque no se sabe si realmente trabajó
            JOptionPane.showMessageDialog(registrarAsistenciaV, "Lo sentimos, el tiempo "
                    + "de tolerancia ha sido superado. "
                    + "\n Debido a esto su chequeo de entrada será anulado.");
            //Llamar al método para eliminar el chequeo de entrada
            if( obtenerUltimoRegistro().equals("00:00:00") ) 
                registrarAsistenciaM.eliminarChequeoEntrada();
            //No se hizo el chequeo de entrada
        }
        return ASISTENCIA_FUERA_DE_RANGO;
    }
    
    private String obtenerDia(){
        LocalDateTime fechaActual = LocalDateTime.now();
        String dia = fechaActual.getDayOfWeek().toString();
        
        switch(dia) {
            case "SUNDAY":
                dia = "domingo";
                break;
            
            case "MONDAY":
                dia = "lunes";
                break;
                
            case "TUESDAY":
                dia = "martes";
                break;
                
            case "WEDNESDAY":
                dia = "miercoles";
                break;
                
            case "THURSDAY":
                dia = "jueves";
                break;
                
            case "FRIDAY":
                dia = "viernes";
                break;
                
            case "SATURDAY":
                dia = "sabado";
                break;
        }
        return dia;
    }
    
    private int obtenerHora(){
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        return Integer.parseInt(dateFormat.format(date));
    }

    private int obtenerMinuto(){
        DateFormat dateFormat = new SimpleDateFormat("mm");
        Date date = new Date();
        return Integer.parseInt(dateFormat.format(date));
    }
    
    private String obtenerFecha() {
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
        Date date = new Date();
        
        String fecha = dateFormat.format(date);
        return fecha;
    }
    
    private String obtenerUltimoRegistro() {
        String[] filaAsistencia = registrarAsistenciaM.obtenerUltimoRegistro().split(" ");
        registrarAsistenciaM.setIdAsistencia(Integer.parseInt(filaAsistencia[0]));
        return filaAsistencia[4];
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(registrarAsistenciaV.opcion){
            case "administrador":
                registrarAsistenciaV.dispose();
                Template.abrirInicioSesion();
                break;
            
            case "registrar":
                registrarAsistencia();
                registrarAsistenciaV.reiniciarIdEmpleado();
                break;      
        }
    }
    
    private void anadirMouseListener(){
        registrarAsistenciaV.registrarLbl.addMouseListener(this);
        registrarAsistenciaV.administradorLbl.addMouseListener(this);
    }
    
}
