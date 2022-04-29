package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.GenerarReporteSeleccionModel;
import com.views.frmGenerarReporteSeleccion;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
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
        if(generarReporteSeleccionV.tipo.equals("general")){
            mostrarGeneral();
            generarReporteSeleccionV.activarGeneral();
        } else if(generarReporteSeleccionV.tipo.equals("genero")) {
            mostrarGenero();
            generarReporteSeleccionV.activarGenero();
        } else if(generarReporteSeleccionV.tipo.equals("individual")) {
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
    
    private void exportarReporteGeneral() {
        //Validar que el JTable tenga filas
        if( generarReporteSeleccionV.generalTbl.getRowCount() == 0 ) {
            JOptionPane.showMessageDialog(generarReporteSeleccionV, "Lo sentimos, no se ha encontrado información para exportar");
        } else {
            
            //Creamos un JFileChooser para elegir la ubicación del XLS
            JFileChooser seleccionar = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("xls", ".xls");
            seleccionar.setFileFilter(filtro);
            seleccionar.setDialogTitle("Guardar reporte");
            seleccionar.setMultiSelectionEnabled(false);
            seleccionar.setAcceptAllFileFilterUsed(false);

            if( seleccionar.showSaveDialog(null) == JFileChooser.APPROVE_OPTION ) {
                List<JTable> tabla = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tabla.add(generarReporteSeleccionV.generalTbl);
                nom.add("Reporte General");
                String archivo = seleccionar.getSelectedFile().toString().concat(".xls");

                //Se llama al método para guardar de ExportarReporteController
                try {
                    ExportarReporteController exportar = new ExportarReporteController(new File(archivo), tabla, nom);
                    if( exportar.exportarReporte() ) {
                        JOptionPane.showMessageDialog(generarReporteSeleccionV, "¡El reporte fue exportado con éxito!");
                    }
                } catch (HeadlessException e) {
                    System.out.println("Error: " + e);
                }
            }
            
        }
    }
    
    private void exportarReporteGenero() {
        //Validar que el JTable tenga filas
        if( generarReporteSeleccionV.generoTbl.getRowCount() == 0 ) {
            JOptionPane.showMessageDialog(generarReporteSeleccionV, "Lo sentimos, no se ha encontrado información para exportar");
        } else {
            
            //Creamos un JFileChooser para elegir la ubicación del XLS
            JFileChooser seleccionar = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("xls", ".xls");
            seleccionar.setFileFilter(filtro);
            seleccionar.setDialogTitle("Guardar reporte");
            seleccionar.setMultiSelectionEnabled(false);
            seleccionar.setAcceptAllFileFilterUsed(false);

            if( seleccionar.showSaveDialog(null) == JFileChooser.APPROVE_OPTION ) {
                List<JTable> tabla = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tabla.add(generarReporteSeleccionV.generoTbl);
                nom.add("Reporte Por Genero");
                String archivo = seleccionar.getSelectedFile().toString().concat(".xls");

                //Se llama al método para guardar de ExportarReporteController
                try {
                    ExportarReporteController exportar = new ExportarReporteController(new File(archivo), tabla, nom);
                    if( exportar.exportarReporte() ) {
                        JOptionPane.showMessageDialog(generarReporteSeleccionV, "¡El reporte fue exportado con éxito!");
                    }
                } catch (HeadlessException e) {
                    System.out.println("Error: " + e);
                }
            }
            
        }
    }
    
    private void exportarReporteIndividual() {
        //Validar que el JTable tenga filas
        if( generarReporteSeleccionV.individualTbl.getRowCount() == 0 ) {
            JOptionPane.showMessageDialog(generarReporteSeleccionV, "Lo sentimos, no se ha encontrado información para exportar");
        } else {
            
            //Creamos un JFileChooser para elegir la ubicación del XLS
            JFileChooser seleccionar = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("xls", ".xls");
            seleccionar.setFileFilter(filtro);
            seleccionar.setDialogTitle("Guardar reporte");
            seleccionar.setMultiSelectionEnabled(false);
            seleccionar.setAcceptAllFileFilterUsed(false);

            if( seleccionar.showSaveDialog(null) == JFileChooser.APPROVE_OPTION ) {
                List<JTable> tabla = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tabla.add(generarReporteSeleccionV.individualTbl);
                nom.add("Reporte Individual");
                String archivo = seleccionar.getSelectedFile().toString().concat(".xls");

                //Se llama al método para guardar de ExportarReporteController
                try {
                    ExportarReporteController exportar = new ExportarReporteController(new File(archivo), tabla, nom);
                    if( exportar.exportarReporte() ) {
                        JOptionPane.showMessageDialog(generarReporteSeleccionV, "¡El reporte fue exportado con éxito!");
                    }
                } catch (HeadlessException e) {
                    System.out.println("Error: " + e);
                }
            }
            
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(generarReporteSeleccionV.opcion){
            case "exportar":
                if( generarReporteSeleccionV.tipo.equals("general") ) {
                    exportarReporteGeneral();
                } else if( generarReporteSeleccionV.tipo.equals("genero") ) {
                    exportarReporteGenero();
                } else if( generarReporteSeleccionV.tipo.equals("individual") ) {
                    exportarReporteIndividual();
                }
                
                generarReporteSeleccionV.dispose();
                Template.abrirMenuPrincipal();
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
