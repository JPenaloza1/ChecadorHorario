package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class InicioSesionModel extends Model {
    
    private String usuario;
    private String contrasena;
    
    //Método que se encarga de traer los usuarios con contraseñas para compararlas
    //con el usuario y contraseña que ya tenemos en estas variables locales 
    //de acceso privado
    public boolean consultarCredenciales(){
        boolean row = false;
        Model cn = new Model();
        
        try {
            statement = cn.connection.createStatement();
            String sql = "SELECT * FROM usuarios";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                if(resultSet.getString("usuario").equals(this.usuario) && resultSet.getString("contrasena").equals(this.contrasena)){
                    row = true;
                }
            }
            cn.connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        return row;
    }

    //Métodos Getter y Setter
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
