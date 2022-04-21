package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class MenuOpcionesEmpleadoModel extends Model {
    private int idEmpleado;
    private String nombre;

    //Este método se encarga de realizar la búsqueda del id en la bbdd y 
    //si lo encuentra concatena el nombre para mostrarlo en la vista
    public String buscarEmpleado(){
        String sql = "SELECT id_empleado, CONCAT_WS(' ', nombre, apellido_paterno, apellido_materno) AS nombre_completo "
                   + "FROM empleados "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"' ";
        
        Model conexion = new Model();
        
        String nombreCompleto = "";
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                nombreCompleto = conexion.resultSet.getString("nombre_completo");
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        //System.out.println("Empleado: " + nombreCompleto + "\nID Empleado: " + id);
        return nombreCompleto;
    }
    
    //Métodos Getter y Setter
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    
}
