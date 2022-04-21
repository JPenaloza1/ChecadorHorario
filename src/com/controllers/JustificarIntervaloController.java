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
    private JustificarIntervaloModel justificarM;
    
    public JustificarIntervaloController(frmJustificarFalta justificarV, JustificarIntervaloModel justificarM){
        this.justificarV = justificarV;
        this.justificarM = justificarM;
        anadirMouseListener();
        mostrarAsistencias();
    }
    
    //Metodo para mostrar todos los chequeos de ese día
    private void mostrarAsistencias() {
        justificarM.buscarIntervalo();
        acomodarTabla();
    }
    
    private void acomodarTabla() {
        Object[] fila = new Object[3];
        DefaultTableModel modelo = (DefaultTableModel) justificarV.asistenciasTbl.getModel();
        
        for( int i=0 ; i<justificarM.getAsistencias().size() ; i++ ) {
            fila[0] = justificarM.getAsistencias().get(i).split("/")[1];
            fila[1] = justificarM.getAsistencias().get(i).split("/")[2];
            fila[2] = justificarM.getAsistencias().get(i).split("/")[3];
            modelo.addRow(fila);
        }
        
        justificarV.asistenciasTbl.setModel(modelo);
    }
    
    private int guardarCambios() {
        int resultado = 0;
        DefaultTableModel modeloActualizado = (DefaultTableModel) justificarV.asistenciasTbl.getModel();
        for( int i=0 ; i<justificarM.getAsistencias().size() ; i++ ) {
            String idAsistencia = justificarM.getAsistencias().get(i).split("/")[0];
            String entrada = String.valueOf(modeloActualizado.getValueAt(i, 1));
            String salida = String.valueOf(modeloActualizado.getValueAt(i, 2));

            resultado = justificarM.guardarCambios(idAsistencia, entrada, salida);

            if( resultado == 0 ) {
                JOptionPane.showMessageDialog(justificarV, "Lo sentimos , ha ocurrido un problema al actualizar");
                return resultado;
            }
        }
        return resultado;
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
                if( confirmarJustificacion() == 0 ) {
                    if( guardarCambios() == 1 ) {
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
        }
    }
    
    private void anadirMouseListener(){
        justificarV.justificarLbl.addMouseListener(this);
        justificarV.cancelarLbl.addMouseListener(this);
    }
    
    
}
