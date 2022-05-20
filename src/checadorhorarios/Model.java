package checadorhorarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.regex.Pattern;

//Esta clase se encarga de establecer los valores de la base de datos y crear 
//los objetos que serán utilizados en las consultas.
//La heredarán todos los modelos que existan.
public class Model {
    
    public Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;
    
    private Properties propiedades = new Properties();
    
    public Model(){
        obtenerPropiedades();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + propiedades.getProperty("SERVIDOR") + "/" 
                                                                     + propiedades.getProperty("BD") , 
                                                                       propiedades.getProperty("USUARIO") , 
                                                                       propiedades.getProperty("CONTRASENA"));
        }catch(ClassNotFoundException | SQLException e){
            String mensaje = "Model::Model -> " + e;
            anadirLog(mensaje);
        }
    }
    
    private void obtenerPropiedades() {
        try {
            String ruta = System.getProperty("user.dir");
            String separador = "\\";
            String[] rutaDividida = ruta.split(Pattern.quote(separador));
            String rutaFinal = "C:";
            
            for( int i=1 ; i<rutaDividida.length-1 ; i++ ) {
                ruta = separador + rutaDividida[i];
                rutaFinal += ruta;
            }
            
            InputStream entrada = new FileInputStream(rutaFinal +  "\\Propiedades.properties");
            propiedades.load(entrada);
        } catch (FileNotFoundException e) {
            String mensaje = "Model::obtenerPropiedades -> " + e;
            anadirLog(mensaje);
        } catch (IOException e) {
            String mensaje = "Model::obtenerPropiedades -> " + e;
            anadirLog(mensaje);
        }
    }
    
    protected void anadirLog(String mensaje) {
        Log log = new Log("./log.log");
        log.addLine(mensaje);
    }

    public Properties getPropiedades() {
        return propiedades;
    }
    public void setPropiedades(Properties propiedades) {
        this.propiedades = propiedades;
    }
    
}
