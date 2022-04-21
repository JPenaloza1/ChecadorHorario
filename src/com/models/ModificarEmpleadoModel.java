package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class ModificarEmpleadoModel extends Model {
    private int idEmpleado;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rfc;
    private String genero;
    private String fNacimiento;
    private String fIngreso;
    
    //Método que se encarga de buscar al empleado y asignarlo a las variables 
    //locales que están acá
    public String obtenerInformacionEmpleado(){
        String sql = "SELECT nombre, apellido_paterno, apellido_materno, rfc, genero, fecha_nacimiento, fecha_ingreso "
                   + "FROM empleados "
                   + "WHERE id_empleado = '"+getIdEmpleado()+"' ";
        
        Model conexion = new Model();
        
        String nombreCompleto = "";
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                setNombre(conexion.resultSet.getString("nombre"));
                setApellidoPaterno(conexion.resultSet.getString("apellido_paterno"));
                setApellidoMaterno(conexion.resultSet.getString("apellido_materno"));
                setRfc(conexion.resultSet.getString("rfc"));
                setGenero(conexion.resultSet.getString("genero"));
                setfNacimiento(conexion.resultSet.getString("fecha_nacimiento"));
                setfIngreso(conexion.resultSet.getString("fecha_ingreso"));
            }
            conexion.connection.close();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        //System.out.println("Empleado: " + nombreCompleto + "\nID Empleado: " + id);
        return nombreCompleto;
    }
    
    //Método que se encarga de realizar el update a la base de datos y
    //devuelve el int para saber si se insertó (0=no y 1=si)
    public int actualizarEmpleado(){
        String sql = "UPDATE empleados SET nombre = '"+getNombre()+"'"
                                 + " , apellido_paterno = '"+getApellidoPaterno()+"'"
                                 + " , apellido_materno = '"+getApellidoMaterno()+"'"
                                 + " , rfc = '"+getRfc()+"'"
                                 + " , genero = '"+getGenero()+"'"
                                 + " , fecha_nacimiento = '"+getfNacimiento()+"'"
                                 + " , fecha_ingreso = '"+getfIngreso()+"'"
                   + " WHERE id_empleado = "+getIdEmpleado()+"";
        
        System.out.println("SQL: " + sql);
        
        Model conexion = new Model();
        
        int filas = 0;
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
        } catch(SQLException e){
            System.out.println("ModificarEmpleadoModel - actualizarEmpleado " + e);
        }
        return filas; //Regresar el 1 o 0 que devuelva el insert
    }
    
    //Metodos Getter y Setter
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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }
    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getfIngreso() {
        return fIngreso;
    }
    public void setfIngreso(String fIngreso) {
        this.fIngreso = fIngreso;
    }
    
}
