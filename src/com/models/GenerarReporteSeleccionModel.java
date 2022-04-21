package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class GenerarReporteSeleccionModel extends Model {
    private int idEmpleado;
    private String desde;
    private String hasta;
    private String genero;
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

    public ArrayList<String> buscarGeneral(){
        String sql = "SELECT id_empleado, fecha, entrada, salida "
                   + "FROM asistencias "
                   + "WHERE fecha BETWEEN '"+getDesde()+"' AND '"+getHasta()+"'"
                   + "ORDER BY fecha ASC";
        
        ArrayList<String> asistencias = new ArrayList<String>();
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                asistencias.add(Integer.toString(conexion.resultSet.getInt("id_empleado"))
                                + "/" + formatoFecha.format(conexion.resultSet.getDate("fecha"))
                                + "/" + formatoHora.format(conexion.resultSet.getTime("entrada"))
                                + "/" + formatoHora.format(conexion.resultSet.getTime("salida")) + "\n");
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return asistencias;
    }
    
    public ArrayList<String> buscarGenero(){
        String sql = "SELECT e.id_empleado, e.genero, a.fecha, a.entrada, a.salida "
                   + "FROM empleados e "
                   + "INNER JOIN asistencias a "
                   + "WHERE a.fecha BETWEEN '"+getDesde()+"' AND '"+getHasta()+"' "
                   + "AND e.genero LIKE '"+getGenero()+"' "
                   + "AND e.id_empleado = a.id_empleado "
                   + "ORDER BY a.fecha ASC";
        
        ArrayList<String> asistencias = new ArrayList<String>();
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                asistencias.add(    Integer.toString(conexion.resultSet.getInt("e.id_empleado"))
                            + "/" + conexion.resultSet.getString("e.genero")
                            + "/" + formatoFecha.format(conexion.resultSet.getDate("a.fecha"))
                            + "/" + formatoHora.format(conexion.resultSet.getTime("a.entrada"))
                            + "/" + formatoHora.format(conexion.resultSet.getTime("a.salida")));
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return asistencias;
    }
    
    public ArrayList<String> buscarIndividual(){
        String sql = "SELECT CONCAT_WS(' ', e.nombre, e.apellido_paterno, e.apellido_materno) AS nombre_completo, a.fecha, a.entrada, a.salida "
                   + "FROM empleados e "
                   + "INNER JOIN asistencias a "
                   + "WHERE a.fecha BETWEEN '"+getDesde()+"' AND '"+getHasta()+"' "
                   + "AND e.id_empleado = a.id_empleado "
                   + "AND a.id_empleado = '"+getIdEmpleado()+"'"
                   + "ORDER BY a.fecha ASC";
        
        ArrayList<String> asistencias = new ArrayList<String>();
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                asistencias.add(    conexion.resultSet.getString("nombre_completo")
                            + "/" + formatoFecha.format(conexion.resultSet.getDate("a.fecha"))
                            + "/" + formatoHora.format(conexion.resultSet.getTime("a.entrada"))
                            + "/" + formatoHora.format(conexion.resultSet.getTime("a.salida")));
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return asistencias;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDesde() {
        return desde;
    }
    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }
    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
