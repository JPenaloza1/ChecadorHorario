/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checadorhorarios;

import com.controllers.InicioSesionController;
import com.models.InicioSesionModel;
import com.views.frmInicioSesion;

/**
 *
 * @author Jonat
 */
public class App {
    public static void main(String[] args) {
        iniciar();
    }
    
    public static void iniciar(){
        InicioSesionModel inicioSesionM = new InicioSesionModel();
        frmInicioSesion inicioSesionV = new frmInicioSesion();
        
        InicioSesionController inicioSesionC = new InicioSesionController(inicioSesionV, inicioSesionM);

        inicioSesionV.setVisible(true);
    }
}
