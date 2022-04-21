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
            System.err.println("Error: " + e);
        }
    }
    
    private void obtenerPropiedades() {
        try {
            InputStream entrada = new FileInputStream("C://Users//Jonat//Documents//NetBeansProjects//ChecadorHorarios//src//checadorhorarios//Propiedades.properties");
            propiedades.load(entrada);
        } catch (FileNotFoundException ex) {
            System.out.println("No jalaaa: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public Properties getPropiedades() {
        return propiedades;
    }
    public void setPropiedades(Properties propiedades) {
        this.propiedades = propiedades;
    }
    
}
