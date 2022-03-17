/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

/**
 *
 * @author Jonat
 */
public class EliminarEmpleadoModel extends Model {
    private int idEmpleado;
    
    public int eliminarEmpleado(){
        String sql = "DELETE e, h "
                   + "FROM empleados e "
                   + "INNER JOIN horarios h "
                   + "ON e.id_empleado = h.id_empleado "
                   + "WHERE e.id_empleado = '"+getIdEmpleado()+"'";
        
        Model conexion = new Model();
        int filas = 0;
        
        System.out.println("Consulta: " + sql);
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
        } catch(SQLException e){
            System.out.println("EliminarEmpleadoModel ERROR: " + e);
        }
        System.out.println("Filas: " + filas);
        return filas;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
