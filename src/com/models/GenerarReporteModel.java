package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class GenerarReporteModel extends Model {
    private int idEmpleado = 00000;
    private String fechaDesde;
    private String fechaHasta; 
    private String nombreEmpleado;

    public boolean buscarEmpleado(){
        String sql = "SELECT CONCAT_WS(' ', nombre, apellido_paterno, apellido_materno) AS nombre_completo "
                   + "FROM empleados "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"'";
        boolean resultado = false;
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                resultado = true;
                setNombreEmpleado(conexion.resultSet.getString("nombre_completo"));
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return resultado;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }
    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }
    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
}
