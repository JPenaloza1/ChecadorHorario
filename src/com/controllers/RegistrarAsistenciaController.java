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
    
    public RegistrarAsistenciaController(frmRegistrarAsistencia registrarAsistenciaV, RegistrarAsistenciaModel registrarAsistenciaM){
        this.registrarAsistenciaV = registrarAsistenciaV;
        this.registrarAsistenciaM = registrarAsistenciaM;
        anadirMouseListener();
    }
    
    private void registrarAsistencia(){
        if( comprobarId() ) {
            int filas = registrarAsistenciaM.buscarEmpleado();
            if( filas == 1 ) {
                registrarAsistenciaM.setDia(obtenerDia());
                if( registrarAsistenciaM.buscarHorario() == 1 ){
                    //Falta obtener la hora actual y buscarla en el horario 
                    //obtenido anteriormente
                    if( compararHora() ){
                        //filas = registrarAsistenciaM.registrarAsistencia();
                        if( filas == 1 ){
                            JOptionPane.showMessageDialog(registrarAsistenciaV, "Su asistencia ha sido registrada.");
                        } else {
                            JOptionPane.showMessageDialog(registrarAsistenciaV, "Lo sentimos, ha ocurrido un problema al registrar su asistencia.");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(registrarAsistenciaV, "Lo sentimos, no hemos encontrado ningún empleado con este ID");
            }
        }
    }
    
    //Método para comprobar que haya un id en el txt y registrarlo
    private boolean comprobarId(){
        boolean estado = false;
        if(registrarAsistenciaV.idEmpleadoTxt.getText().equals("")){
            JOptionPane.showMessageDialog(registrarAsistenciaV, "El ID del empleado está vacío. Por favor ingrese uno.");
        } else if(registrarAsistenciaV.idEmpleadoTxt.getText().length() < 5) {
            JOptionPane.showMessageDialog(registrarAsistenciaV, "El ID del empleado está incompleto.");
        } else {
            registrarAsistenciaM.setIdEmpleado(Integer.parseInt(registrarAsistenciaV.idEmpleadoTxt.getText()));
            System.out.println("Controllers/RegistrarAsistenciaController::ComprobarId() " + registrarAsistenciaV.idEmpleadoTxt.getText());
            estado = true;
        }
        return estado;
    }
    
    private boolean compararHora(){
        //Obtenemos todos el horario de un dia y lo separamos por cada espacio
        //y el tamaño de este será del número de chequeos de entrada y salida
        //que tenga el empleado en ese día
        String[] horarioCompleto = registrarAsistenciaM.getHorario().split(" ");
        
        String[] horarioIndividual, chequeo = null;
        int horaObtenida, minutoObtenido, horaGuardada;
        DateFormat formatoFecha = new SimpleDateFormat("yy-MM-dd");
        Date fecha = new Date();
        boolean resultado = false;
        
        for(int i=0 ; i<horarioCompleto.length ; i++){
            //Obtenemos el horario en la posición i (10:00-20:00, lo 
            //dividimos por cada "-" y lo guardamos en horarioIndividual
            //Horario individual siempre será de tamaño 2 porque uno hace
            //referencia a la entrada y otro a la salida
            horarioIndividual = horarioCompleto[i].split("-");
            
            for(int j=0 ; i<horarioIndividual.length ; i++){
                //Dividimos el horario individual por ":" y lo guardamos en
                //el array, siempre deberá ser de tamaño 2 porque uno hace
                //referencia a la hora y otro a los minutos
                chequeo = horarioIndividual[i].split(":");
                
                //Guardamos la hora que obtuvimos de la BD
                horaGuardada = Integer.parseInt(chequeo[0]);
                horaObtenida = obtenerHora();
                minutoObtenido = obtenerMinuto();
                
                //Comprobamos si es hora de entrada o salida
                if( j == 0 ) {
                    resultado = comprobarChequeoEntrada(horaGuardada, horaObtenida, minutoObtenido);
                } else if( j == 1 ) {
                    registrarAsistenciaM.setEntrada(horarioIndividual[0]);
                    
                    registrarAsistenciaM.setFecha(formatoFecha.format(fecha));
                    resultado = comprobarChequeoSalida(horaGuardada, horaObtenida, minutoObtenido);
                }
            }            
        }
        
        return resultado;
    }
    
    private boolean comprobarChequeoEntrada(int horaGuardada, int horaObtenida, int minutoObtenido){
        boolean resultado = false;
                    //Comprobamos que la hora de entrada sea con los 10 minutos
                    //antes de la hora o los 10 minutos de retardo (margen de 20 min)
                    if( horaObtenida == horaGuardada - 1 ) {
                        //Comprobamos que sea entre 50 y 59
                        if( minutoObtenido >= 50 && minutoObtenido <= 59 ){
                            resultado = true;
                        }
                    } else if( horaObtenida == horaGuardada ) {
                        //Comprobamos que sea entre 00 y 10
                        if( minutoObtenido >= 00 && minutoObtenido <= 10 ){
                            //Se hace el registro de la asistencia
                            JOptionPane.showMessageDialog(registrarAsistenciaV, "Su asistencia ha sido registrada.");
                            resultado = true;
                        }
                    } else {
                        System.out.println("ERROR: Hay un problema con la comprobación de la entrada y salida");
                    }
                    return resultado;
    }
    
    private boolean comprobarChequeoSalida(int horaGuardada, int horaObtenida, int minutoObtenido){
                    boolean resultado = false;
                    //Comprobar que el chequeo de entrada fue registrado
                    //previamente.
                    
                    
                    if( registrarAsistenciaM.buscarChequeoEntrada() == 1 ){
                        if( horaObtenida == horaGuardada ) {
                            //Comprobamos que los minutos se encuentren entre
                            //00 y 15
                            if( minutoObtenido >= 00 && minutoObtenido <= 15 ) {
                                resultado = true;
                            } else if( minutoObtenido > 15 ) {
                                //Avisar que debido a que superó la tolerancia de 
                                //salida se anulará el registro de entrada porque no
                                //se sabe si realmente trabajó
                                JOptionPane.showMessageDialog(registrarAsistenciaV, "Lo sentimos, el tiempo "
                                        + "de tolerancia ha sido superado. Debido a esto su chequeo de entrada será anulado.");
                                //Llamar al método para eliminar el chequeo de entrada
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(registrarAsistenciaV, "Lo sentimos, no se ha podido encontar el registro de su chequeo de entrada.");
                    }
                    return resultado;
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
        //System.out.println("hora: " + dateFormat.format(date));
        return Integer.parseInt(dateFormat.format(date));
   }
   
   private int obtenerMinuto(){
        DateFormat dateFormat = new SimpleDateFormat("mm");
        Date date = new Date();
        //System.out.println("Minutos: " + dateFormat.format(date));
        return Integer.parseInt(dateFormat.format(date));
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
                obtenerDia();
                registrarAsistenciaV.reiniciarIdEmpleado();
                break;      
        }
    }
    
    private void anadirMouseListener(){
        registrarAsistenciaV.registrarLbl.addMouseListener(this);
        registrarAsistenciaV.administradorLbl.addMouseListener(this);
    }
    
}
