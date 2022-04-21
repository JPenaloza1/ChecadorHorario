package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class JustificarIntervaloModel extends Model {

    private Date fechaInicio;
    private Date fechaFin;
    private int idEmpleado;
    
    private ArrayList<String> asistencias = new ArrayList<String>();
    
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
    
    //Método para hacer el select y obtener todos los días
    public void buscarIntervalo() {
        String sql = "SELECT id_asistencia, id_empleado, fecha, entrada, salida "
                   + "FROM asistencias "
                   + "WHERE fecha BETWEEN '"+formatoFecha.format(getFechaInicio())+"' AND '"+formatoFecha.format(getFechaFin())+"' "
                   + "AND id_empleado = '"+getIdEmpleado()+"' "
                   + "ORDER BY fecha, entrada ASC";
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                asistencias.add(  Integer.toString(conexion.resultSet.getInt("id_asistencia"))
                                + "/" + formatoFecha.format(conexion.resultSet.getDate("fecha"))
                                + "/" + formatoHora.format(conexion.resultSet.getTime("entrada"))
                                + "/" + formatoHora.format(conexion.resultSet.getTime("salida")) + "\n");
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    
    public int guardarCambios(String idAsistencia, String entrada, String salida) {
        String sql =    "UPDATE asistencias SET entrada = '"+entrada+"'"
                                       + " , salida = '"+salida+"'"
                    + " WHERE id_asistencia = "+idAsistencia+"";
        
        System.out.println("SQL: " + sql);
        
        Model conexion = new Model();
        
        int filas = 0;
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
        } catch(SQLException e){
            System.out.println("Error " + e);
        }
        return filas; //Regresar el 1 o 0 que devuelva el insert*/
    }
    
    //GETTERS Y SETTERS
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public ArrayList<String> getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(ArrayList<String> asistencias) {
        this.asistencias = asistencias;
    }
    
}
