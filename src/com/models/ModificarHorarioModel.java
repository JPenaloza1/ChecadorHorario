package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class ModificarHorarioModel {
    private int idEmpleado;
    private String domingo;
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;
    private String sabado;
    
    public int consultarHorario(){
        String sql = "SELECT domingo, lunes, martes, miercoles, jueves, viernes, sabado "
                   + "FROM horarios "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"'";
        
        Model conexion = new Model();
        int filas = 0;
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                setDomingo(conexion.resultSet.getString("domingo"));
                setLunes(conexion.resultSet.getString("lunes"));
                setMartes(conexion.resultSet.getString("martes"));
                setMiercoles(conexion.resultSet.getString("miercoles"));
                setJueves(conexion.resultSet.getString("jueves"));
                setViernes(conexion.resultSet.getString("viernes"));
                setSabado(conexion.resultSet.getString("sabado"));
                filas++;
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return filas;
    }
    
    public int actualizarHorario(){
        String sql = "UPDATE horarios SET domingo = '"+getDomingo()+"'"
                                 + " , lunes = '"+getLunes()+"'"
                                 + " , martes = '"+getMartes()+"'"
                                 + " , miercoles = '"+getMiercoles()+"'"
                                 + " , jueves = '"+getJueves()+"'"
                                 + " , viernes = '"+getViernes()+"'"
                                 + " , sabado = '"+getSabado()+"'"
                   + " WHERE id_empleado = "+getIdEmpleado()+"";
        
        System.out.println("SQL: " + sql);
        
        Model conexion = new Model();
        
        int filas = 0;
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
        } catch(SQLException e){
            System.out.println("ModificarHorariooModel - actualizarHorario " + e);
        }
        return filas; 
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDomingo() {
        return domingo;
    }
    public void setDomingo(String domingo) {
        this.domingo = domingo;
    }

    public String getLunes() {
        return lunes;
    }
    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }
    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }
    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }
    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }
    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public String getSabado() {
        return sabado;
    }
    public void setSabado(String sabado) {
        this.sabado = sabado;
    }
    
    
}
