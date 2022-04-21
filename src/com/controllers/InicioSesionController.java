package com.controllers;

import checadorhorarios.Controller;
import checadorhorarios.Template;
import com.models.InicioSesionModel;
import com.views.frmInicioSesion;
import java.awt.event.MouseEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JOptionPane;

public class InicioSesionController extends Controller /*implements MouseListener*/ {
    
    //Creamos la vista y el modelo que estaremos manejando
    private frmInicioSesion inicioSesionV;
    private InicioSesionModel inicioSesionM;
    
    //Constructor que recibe una vista y un modelo
    public InicioSesionController(frmInicioSesion inicioSesionV, InicioSesionModel inicioSesionM){
        //Inicializamos la vista y el modelo que estaremos manejando
        this.inicioSesionV = inicioSesionV;
        this.inicioSesionM = inicioSesionM;
        //Agregamos un mouseListener al botón "entrar" para que cuando haga clic
        //llame al método "iniciarSesion()"
        anadirMouseListener();
    }
    
    //Método que se encarga de coordinar los demás métodos para el inicio de sesión
    public void iniciarSesion(){
        pasarValores();
                
        if(inicioSesionM.consultarCredenciales()){
            inicioSesionV.dispose();
            Template.abrirMenuPrincipal();
        }else{
            JOptionPane.showMessageDialog(inicioSesionV, "Lo sentimos, usuario o contraseña incorrecta");
        }
        
    }
    
    //Este método se encarga de pasar los valores que tenemos en la vista al modelo
    private void pasarValores(){
        inicioSesionM.setUsuario(inicioSesionV.usuarioTf.getText());
        String contrasena = encriptarContrasena();
        inicioSesionM.setContrasena(contrasena);
    }
    
    //Este método se encarga de cifrar con un sha512 la contraseña
    private String encriptarContrasena(){
        String encriptado = "";
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(String.valueOf(inicioSesionV.contrasenaTf.getPassword()).getBytes("utf8"));
            encriptado = String.format("%0128x", new BigInteger(1, digest.digest()));
        }catch(Exception e){
            System.err.println("Error: " + e);
        }   
        return encriptado;
    }

    //Método que está a la espera de que se le haga click al boton "entrar" de la vista
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(inicioSesionV.opcion){
            case "entrar":
                iniciarSesion();
                break;
                
            case "asistencia":
                inicioSesionV.dispose();
                Template.abrirRegistrarAsistencia();
                break;
        }
        
    }
    
    private void anadirMouseListener(){
        inicioSesionV.entrarLbl.addMouseListener(this);
        inicioSesionV.registrarAsistenciaLbl.addMouseListener(this);
    }
    
}
