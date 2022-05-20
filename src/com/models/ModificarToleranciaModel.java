package com.models;

import checadorhorarios.Model;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class ModificarToleranciaModel extends Model {
        
    public void guardarCambios(String entrada, String salida) {
        
        try {
            getPropiedades().setProperty("TOLERANCIAENTRADA", entrada);
            getPropiedades().setProperty("TOLERANCIASALIDA", salida);
            
            String ruta = System.getProperty("user.dir");
            String separador = "\\";
            String[] rutaDividida = ruta.split(Pattern.quote(separador));
            String rutaFinal = "C:";
            
            for( int i=1 ; i<rutaDividida.length-1 ; i++ ) {
                ruta = separador + rutaDividida[i];
                rutaFinal += ruta;
            }
            
            getPropiedades().store(new FileWriter(rutaFinal + "\\Propiedades.properties"), "");
        } catch (IOException e) {
            String mensaje = "ModificarToleranciaModel::guardarCambios -> " + e;
            anadirLog(mensaje);
        }
    }
    
}
