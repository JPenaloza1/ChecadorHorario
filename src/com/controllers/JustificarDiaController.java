package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.JustificarDiaModel;
import com.views.frmJustificarFalta;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JustificarDiaController extends Controller {
    
    private frmJustificarFalta justificarFaltaV;
    private JustificarDiaModel justificarDiaM;
    
    private static final int JUSTIFICACION_ACEPTADA = 0;
    private static final int CAMBIOS_GUARDADOS_CON_EXITO = 1;
    
    public JustificarDiaController(frmJustificarFalta justificarV, JustificarDiaModel justificarM){
        this.justificarFaltaV = justificarV;
        this.justificarDiaM = justificarM;
        anadirMouseListener();
        mostrarAsistencias();
    }
    
    //Metodo para mostrar todos los chequeos de ese día
    private void mostrarAsistencias() {
        justificarDiaM.buscarDia();
        acomodarTabla();
    }
    
    private void acomodarTabla() {
        Object[] fila = new Object[3];
        DefaultTableModel modelo = (DefaultTableModel) justificarFaltaV.asistenciasTbl.getModel();
        
        for( int i=0 ; i<justificarDiaM.getAsistencias().size() ; i++ ) {
            fila[0] = justificarDiaM.getAsistencias().get(i).split("/")[1];
            fila[1] = justificarDiaM.getAsistencias().get(i).split("/")[2];
            fila[2] = justificarDiaM.getAsistencias().get(i).split("/")[3];
            modelo.addRow(fila);
        }
        
        justificarFaltaV.asistenciasTbl.setModel(modelo);
    }
    
    private int guardarCambios() {
        int resultado = 0;
        DefaultTableModel modeloActualizado = (DefaultTableModel) justificarFaltaV.asistenciasTbl.getModel();
        for( int i=0 ; i<justificarFaltaV.asistenciasTbl.getRowCount() ; i++ ) {
            String idAsistencia = "0";
            if( i < justificarDiaM.getAsistencias().size() ) {
                idAsistencia = justificarDiaM.getAsistencias().get(i).split("/")[0];
            }
            String fecha = String.valueOf(modeloActualizado.getValueAt(i, 0));
            String entrada = String.valueOf(modeloActualizado.getValueAt(i, 1));
            String salida = String.valueOf(modeloActualizado.getValueAt(i, 2));
            
            if(!estaVacio(fecha, entrada, salida)) {
                if( idAsistencia.equals("0") ) {
                    resultado = justificarDiaM.nuevaAsistencia(justificarDiaM.getIdEmpleado(), fecha, entrada, salida);
                } else
                    resultado = justificarDiaM.guardarCambios(idAsistencia, entrada, salida);
                
                if( resultado == 0 ) {
                    JOptionPane.showMessageDialog(justificarFaltaV, "Lo sentimos , ha ocurrido un problema al actualizar");
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
        switch(justificarFaltaV.opcion){
            case "justificar":
                if( confirmarJustificacion() == JUSTIFICACION_ACEPTADA ) {
                    if( guardarCambios() == CAMBIOS_GUARDADOS_CON_EXITO ) {
                        JOptionPane.showMessageDialog(justificarFaltaV, "¡Justificación exitosa!");
                        justificarFaltaV.dispose();
                        Template.abrirMenuPrincipal();
                    } else {
                        JOptionPane.showMessageDialog(justificarFaltaV, "Lo sentimos, ha ocurrido un problema al guardar los cambios. Inténtelo de nuevo");
                    }
                }
                break;
            
            case "cancelar":
                justificarFaltaV.dispose();
                //Ir al menu principal pq canceló la operación
                Template.abrirMenuPrincipal();
                break;
                
            case "agregar":
                DefaultTableModel modelo = (DefaultTableModel) justificarFaltaV.asistenciasTbl.getModel();
                modelo.addRow(new Object[]{"" , "" , ""});
                justificarFaltaV.asistenciasTbl.setModel(modelo);
                break;
        }
    }
    
    private void anadirMouseListener(){
        justificarFaltaV.justificarLbl.addMouseListener(this);
        justificarFaltaV.cancelarLbl.addMouseListener(this);
        justificarFaltaV.agregarLbl.addMouseListener(this);
    }
    
    
}
