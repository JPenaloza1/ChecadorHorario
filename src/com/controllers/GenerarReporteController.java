package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.GenerarReporteModel;
import com.views.frmGenerarReporte;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class GenerarReporteController extends Controller {
    private frmGenerarReporte generarReporteV;
    private GenerarReporteModel generarReporteM;
    
    public GenerarReporteController(frmGenerarReporte generarReporteV, GenerarReporteModel generarReporteM){
        this.generarReporteV = generarReporteV;
        this.generarReporteM = generarReporteM;
        asignarFecha();
        anadirMouseListener();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(generarReporteV.opcion){
            case "general":
                generarReporteV.dispose();
                Template.abrirGenerarReporteSeleccion(generarReporteM.getIdEmpleado(), generarReporteV.opcion, generarReporteM.getFechaDesde(), generarReporteM.getFechaHasta(), "");
                break;
            
            case "genero":
                if( generarReporteV.femeninoJrb.isSelected() ) {
                    generarReporteV.dispose();
                    Template.abrirGenerarReporteSeleccion(generarReporteM.getIdEmpleado(), generarReporteV.opcion, generarReporteM.getFechaDesde(), generarReporteM.getFechaHasta(), generarReporteV.femeninoJrb.getText());
                } else if( generarReporteV.masculinoJrb.isSelected() ) {
                    generarReporteV.dispose();
                    Template.abrirGenerarReporteSeleccion(generarReporteM.getIdEmpleado(), generarReporteV.opcion, generarReporteM.getFechaDesde(), generarReporteM.getFechaHasta(), generarReporteV.masculinoJrb.getText());
                } else { 
                    JOptionPane.showMessageDialog(generarReporteV, "Seleccione una opción por favor.");
                }
                break;
                
            case "individual":
                if( generarReporteV.idEmpleadoTxt.getText().equals("00000") || generarReporteV.idEmpleadoTxt.getText().equals("")) {
                    JOptionPane.showMessageDialog(generarReporteV, "Primero ingrese un id.");
                } else if( generarReporteV.idEmpleadoTxt.getText().length() < 5 ) {
                    JOptionPane.showMessageDialog(generarReporteV, "El ID está incompleto.");
                } else {
                    generarReporteV.dispose();
                    Template.abrirGenerarReporteSeleccion(generarReporteM.getIdEmpleado(), generarReporteV.opcion, generarReporteM.getFechaDesde(), generarReporteM.getFechaHasta(), "");
                }
                break;
                
            case "buscar":
                comprobarId();
                break;
                
            case "cancelar":
                generarReporteV.dispose();
                Template.abrirMenuPrincipal();
                break;
        }
    }
    
    //Método para comprobar que haya un id en el txt
    private void comprobarId(){
        if(generarReporteV.idEmpleadoTxt.getText().equals("")){
            JOptionPane.showMessageDialog(generarReporteV, "El ID del empleado está vacío. Por favor ingrese uno.");
        } else if(generarReporteV.idEmpleadoTxt.getText().length() < 5) {
            JOptionPane.showMessageDialog(generarReporteV, "El ID del empleado está incompleto.");
        } else {
            generarReporteM.setIdEmpleado(Integer.parseInt(generarReporteV.idEmpleadoTxt.getText()));
            if( generarReporteM.buscarEmpleado() ) {
                generarReporteV.nombreEmpleadoTxt.setText(generarReporteM.getNombreEmpleado());
            } else {
                JOptionPane.showMessageDialog(generarReporteV, "Lo sentimos, el empleado no ha sido encontrado.");
            }
        }
    }
    
    private void anadirMouseListener(){
        generarReporteV.generalLbl.addMouseListener(this);
        generarReporteV.generoLbl.addMouseListener(this);
        generarReporteV.individualLbl2.addMouseListener(this);
        generarReporteV.buscarLbl.addMouseListener(this);
        generarReporteV.cancelarLbl.addMouseListener(this);
    }
    
    private void asignarFecha(){
        generarReporteV.fechaLbl.setText(generarReporteM.getFechaDesde() + " al " + generarReporteM.getFechaHasta());
    }
}
