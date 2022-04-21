package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class MenuPrincipalModel extends Model {
    
    private int idEmpleado;

    //Este método se encarga de realizar la consulta del empleado, devuelve
    //0 si no se encontró, devuelve 1 si sí se encontró
    public int buscarEmpleado(){
        String sql = "SELECT id_empleado "
                   + "FROM empleados "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"' ";
        
        Model conexion = new Model();
        
        int filas = 0;
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                filas++;
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        //System.out.println("Empleado: " + nombreCompleto + "\nID Empleado: " + id);
        return filas;
    }
    
    //Métodos Getter y Setter
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
}
