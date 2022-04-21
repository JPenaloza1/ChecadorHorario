package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class RegistrarAsistenciaModel extends Model {
    private int idEmpleado;
    private String nombreEmpleado;
    private String dia;
    private String horario;
    private String entrada;
    private String fecha;

    public int buscarEmpleado(){
        //Variable que almacenará el número de empleados encontrados con ese id
        int filas = 0;
        
        String sql = "SELECT CONCAT_WS(' ', nombre, apellido_paterno, apellido_materno) AS nombre_completo "
                   + "FROM empleados "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"' ";
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                setNombreEmpleado( conexion.resultSet.getString("nombre_completo") );
                filas++;
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        
        return filas;
    }
    
    public int buscarHorario(){
        //Variable que almacenará el número de empleados encontrados con ese id
        int filas = 0;
        
        String sql = "SELECT "+ getDia() +" "
                   + "FROM horarios "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"' ";
        
        Model conexion = new Model();
        String horario = "";
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                setHorario(conexion.resultSet.getString(getDia()));
                filas++;
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        
        return filas;
    }
    
    public int buscarChequeoEntrada(){
        int filas = 0;
        
        String sql = "SELECT entrada "
                   + "FROM asistencias "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"' "
                   + "AND fecha = '"+getFecha()+"'";
        
        Model conexion = new Model();
        String horario = "";
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                System.out.println("CHEQUEO: " + conexion.resultSet.getString("entrada"));
                filas++;
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        
        return filas;
    }
    
    public int eliminarChequeoEntrada(){
        return 0;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEntrada() {
        return entrada;
    }
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
