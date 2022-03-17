/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checadorhorarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jonat
 */

//Esta clase se encarga de establecer los valores de la base de datos y crear 
//los objetos que serán utilizados en las consultas.
//La heredarán todos los modelos que existan.
public class Model {
    
    public Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;
    //public static int resultadoInt;
    
    final String SERVIDOR = "localhost:3306";
    final String BD = "checador_usuarios";
    final String USUARIO = "root";
    final String CONTRASENA = "";
    
    public Model(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + "/" + BD , "root" , "");
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("Error: " + e);
        }
    }    
}
