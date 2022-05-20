package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.JustificarIntervaloModel;
import com.views.frmJustificarFalta;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JustificarIntervaloController extends Controller {
    
    private frmJustificarFalta justificarV;
    private JustificarIntervaloModel justificarIntervaloM;
    
    private static final int JUSTIFICACION_ACEPTADA = 0;
    private static final int CAMBIOS_GUARDADOS_CON_EXITO = 1;
    
    public JustificarIntervaloController(frmJustificarFalta justificarV, JustificarIntervaloModel justificarM){
        this.justificarV = justificarV;
        this.justificarIntervaloM = justificarM;
        anadirMouseListener();
        mostrarAsistencias();
    }
    
    //Metodo para mostrar todos los chequeos de ese día
    private void mostrarAsistencias() {
        justificarIntervaloM.buscarIntervalo();
        acomodarTabla();
    }
    
    private void acomodarTabla() {
        Object[] fila = new Object[3];
        DefaultTableModel modelo = (DefaultTableModel) justificarV.asistenciasTbl.getModel();
        
        for( int i=0 ; i<justificarIntervaloM.getAsistencias().size() ; i++ ) {
            fila[0] = justificarIntervaloM.getAsistencias().get(i).split("/")[1];
            fila[1] = justificarIntervaloM.getAsistencias().get(i).split("/")[2];
            fila[2] = justificarIntervaloM.getAsistencias().get(i).split("/")[3];
            modelo.addRow(fila);
        }
        
        justificarV.asistenciasTbl.setModel(modelo);
    }
    
    private int guardarCambios() {
        int resultado = 0;
        DefaultTableModel modeloActualizado = (DefaultTableModel) justificarV.asistenciasTbl.getModel();
        for( int i=0 ; i<justificarV.asistenciasTbl.getRowCount() ; i++ ) {
            String idAsistencia = "0";
            if( i < justificarIntervaloM.getAsistencias().size() ) {
                idAsistencia = justificarIntervaloM.getAsistencias().get(i).split("/")[0];
            }
            String fecha = String.valueOf(modeloActualizado.getValueAt(i, 0));
            String entrada = String.valueOf(modeloActualizado.getValueAt(i, 1));
            String salida = String.valueOf(modeloActualizado.getValueAt(i, 2));
            
            if(!estaVacio(fecha, entrada, salida)) {
                if( idAsistencia.equals("0") ) {
                    resultado = justificarIntervaloM.nuevaAsistencia(justificarIntervaloM.getIdEmpleado(), fecha, entrada, salida);
                } else
                    resultado = justificarIntervaloM.guardarCambios(idAsistencia, entrada, salida);
                
                if( resultado == 0 ) {
                    JOptionPane.showMessageDialog(justificarV, "Lo sentimos , ha ocurrido un problema al actualizar");
                }
            } 
        }
        return resultado;
    }
    
    private boolean estaVacio(String fecha, String entrada, String salida) {
        if( fecha.equals("") || entrada.equals("") || salida.equals("") )
            return true;
        
        return false;
    }
    
    private int confirmarJustificacion() {
        int opcion = JOptionPane.showOptionDialog(
            null,
            "¿Está seguro de realizar la justificación?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "Aceptar", "Cancelar" },
            "opcion 1");
         return opcion;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(justificarV.opcion){
            case "justificar":
                if( confirmarJustificacion() == JUSTIFICACION_ACEPTADA ) {
                    if( guardarCambios() == CAMBIOS_GUARDADOS_CON_EXITO ) {
                        JOptionPane.showMessageDialog(justificarV, "¡Justificación exitosa!");
                        justificarV.dispose();
                        Template.abrirMenuPrincipal();
                    } else {
                        JOptionPane.showMessageDialog(justificarV, "Lo sentimos, ha ocurrido un problema al guardar los cambios. Inténtelo de nuevo");
                    }
                }
                break;
            
            case "cancelar":
                justificarV.dispose();
                //Ir al menu principal pq canceló la operación
                Template.abrirMenuPrincipal();
                break;
                
            case "agregar":
                DefaultTableModel modelo = (DefaultTableModel) justificarV.asistenciasTbl.getModel();
                modelo.addRow(new Object[]{"" , "" , ""});
                justificarV.asistenciasTbl.setModel(modelo);
                break;
                
        }
    }
    
    private void anadirMouseListener(){
        justificarV.justificarLbl.addMouseListener(this);
        justificarV.cancelarLbl.addMouseListener(this);
        justificarV.agregarLbl.addMouseListener(this);
    }
    
    
}
