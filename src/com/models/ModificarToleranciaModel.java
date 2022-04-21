package com.models;

import checadorhorarios.Model;
import java.io.FileWriter;
import java.io.IOException;

public class ModificarToleranciaModel extends Model {
    
    public ModificarToleranciaModel() {
        super();
    }
    
    public void guardarCambios(String entrada, String salida) {
        
        try {
            getPropiedades().setProperty("TOLERANCIAENTRADA", entrada);
            getPropiedades().setProperty("TOLERANCIASALIDA", salida);
            
            getPropiedades().store(new FileWriter("C://Users//Jonat//Documents//NetBeansProjects//ChecadorHorarios//src//checadorhorarios//Propiedades.properties"), "");
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
}
