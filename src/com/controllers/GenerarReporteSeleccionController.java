package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.GenerarReporteSeleccionModel;
import com.views.frmGenerarReporteSeleccion;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GenerarReporteSeleccionController extends Controller {
    
    private frmGenerarReporteSeleccion generarReporteSeleccionV;
    private GenerarReporteSeleccionModel generarReporteSeleccionM;
    ArrayList<String> asistencias;
    
    public GenerarReporteSeleccionController(frmGenerarReporteSeleccion generarReporteSeleccionV, GenerarReporteSeleccionModel generarReporteSeleccionM){
        this.generarReporteSeleccionV = generarReporteSeleccionV;
        this.generarReporteSeleccionM = generarReporteSeleccionM;
        seleccionarTipoReporte();
        anadirMouseListener();
    }
    
    private void seleccionarTipoReporte(){
        if(generarReporteSeleccionV.opcion.equals("general")){
            mostrarGeneral();
            generarReporteSeleccionV.activarGeneral();
        } else if(generarReporteSeleccionV.opcion.equals("genero")) {
            mostrarGenero();
            generarReporteSeleccionV.activarGenero();
        } else if(generarReporteSeleccionV.opcion.equals("individual")) {
            mostrarIndividual();
            generarReporteSeleccionV.activarIndividual();
        }
    }
    
    private void mostrarGeneral(){
        asistencias = generarReporteSeleccionM.buscarGeneral();
        acomodarTablaGeneral();
    }
    
    private void mostrarGenero(){
        asistencias = generarReporteSeleccionM.buscarGenero();
        acomodarTablaGenero();
    }
    
    private void mostrarIndividual(){
        asistencias = generarReporteSeleccionM.buscarIndividual();
        acomodarTablaIndividual();
    }
    
    private void acomodarTablaGeneral(){
        Object[] fila = new Object[4];
        DefaultTableModel modelo = (DefaultTableModel) generarReporteSeleccionV.generalTbl.getModel();
        
        for( int i=0 ; i<asistencias.size() ; i++ ) {
            fila[0] = asistencias.get(i).split("/")[0];
            fila[1] = asistencias.get(i).split("/")[1];
            fila[2] = asistencias.get(i).split("/")[2];
            fila[3] = asistencias.get(i).split("/")[3];
            modelo.addRow(fila);
        }
        
        generarReporteSeleccionV.generalTbl.setModel(modelo);
    }
    
    private void acomodarTablaGenero(){
        Object[] fila = new Object[5];
        DefaultTableModel modelo = (DefaultTableModel) generarReporteSeleccionV.generalTbl.getModel();
        
        for( int i=0 ; i<asistencias.size() ; i++ ) {
            fila[0] = asistencias.get(i).split("/")[0];
            fila[1] = asistencias.get(i).split("/")[1];
            fila[2] = asistencias.get(i).split("/")[2];
            fila[3] = asistencias.get(i).split("/")[3];
            fila[4] = asistencias.get(i).split("/")[4];
            modelo.addRow(fila);
        }
        
        generarReporteSeleccionV.generoTbl.setModel(modelo);
    }
    
    private void acomodarTablaIndividual(){
        Object[] fila = new Object[4];
        DefaultTableModel modelo = (DefaultTableModel) generarReporteSeleccionV.individualTbl.getModel();
        
        for( int i=0 ; i<asistencias.size() ; i++ ) {
            fila[0] = asistencias.get(i).split("/")[0];
            fila[1] = asistencias.get(i).split("/")[1];
            fila[2] = asistencias.get(i).split("/")[2];
            fila[3] = asistencias.get(i).split("/")[3];
            modelo.addRow(fila);
        }
        
        generarReporteSeleccionV.individualTbl.setModel(modelo);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(generarReporteSeleccionV.opcion){
            case "exportar":
                //generarReporteSeleccionV.dispose();
                //Template.abrirGenerarReporteSeleccion(generarReporteM.getIdEmpleado(), generarReporteV.opcion);
                break;
            
            case "salir":
                generarReporteSeleccionV.dispose();
                Template.abrirMenuPrincipal();
                break;
        }
    }
    
    private void anadirMouseListener(){
        generarReporteSeleccionV.exportarLbl.addMouseListener(this);
        generarReporteSeleccionV.salirLbl.addMouseListener(this);
    }
}
