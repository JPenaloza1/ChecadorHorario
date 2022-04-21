package com.models;

import checadorhorarios.Model;
import static checadorhorarios.Model.statement;
import java.sql.SQLException;


public class AnadirHorarioModel extends AnadirEmpleadoModel {
    private String domingo;
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;
    private String sabado;

    //Metodo que realiza el insert del nuevo empleado en la bd
    public int insertarEmpleado(){
        String sql = "INSERT INTO empleados(nombre, apellido_paterno, apellido_materno, rfc, genero, fecha_nacimiento, fecha_ingreso) "
                   + "VALUES( '"+ getNombre() +"' , '"+ getaPaterno() +"' , '"+ getaMaterno() +"' , '"+ getRfc() +"' , '"+getGenero()+"' , '"+ getfNacimiento() +"' , '"+ getfIngreso() +"')";
        int filas = 0;
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
            conexion.connection.close();
        } catch (SQLException e) {
            System.err.println("Insertar empleado ERROR: " + e);
        }
        
        return filas;
    }
    
    //Método que devuelve el id del empleado que se acaba de registrar
    public void buscarEmpleado(){
        String sql = "SELECT id_empleado FROM empleados "
                   + "WHERE rfc = '"+getRfc()+"'";
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                setIdEmpleado(resultSet.getInt("id_empleado"));
            }
            connection.close();
        } catch(SQLException e){
            System.out.println("Buscar empleado ERROR: " + e);
        }
    }
    
    //Método que inserta el horario y devuelve un 1 si se insertó con éxito
    public int insertarHorario(){
        String sql = "INSERT INTO horarios(id_empleado, domingo, lunes, martes, miercoles, jueves, viernes, sabado) "
                   + "VALUES('"+getIdEmpleado()+"', '"+getDomingo()+"' , '"+getLunes()+"' , '"+getMartes()+"' , '"+getMiercoles()+"', '"+getJueves()+"' , '"+getViernes()+"', '"+getSabado()+"')";
        int filas = 0;
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
            conexion.statement.close();
        } catch (SQLException e) {
            System.out.println("Insertar horario ERROR: " + e);
        }
        
        return filas;
    }
    
    //Método que elimina el empleado pq hubo un error con el horario
    public void eliminarEmpleado(){
        String sql = "DELETE FROM empleados WHERE id_empleado = '"+ getIdEmpleado()+ "';";
        int filas = 0;
        Model conexion = new Model();
        
        try { 
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
            conexion.connection.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("Filas: " + filas);
    }
    
    //Métodos Getter y Setter
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
    
    public void imprimirInformacion(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido paterno: " + this.getaPaterno());
        System.out.println("Apellido materno: " + this.getaMaterno());
        System.out.println("Rfc: " + this.getRfc());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Fecha nacimiento: " + this.getfNacimiento());
        System.out.println("Fecha ingresp: " + this.getfIngreso());
        
        System.out.println("\n\nDomingo: " + this.getDomingo());
        System.out.println("Lunes: " + this.getLunes());
        System.out.println("Martes: " + this.getMartes());
        System.out.println("Miercoles: " + this.getMiercoles());
        System.out.println("Jueves: " + this.getJueves());
        System.out.println("Viernes: " + this.getViernes());
        System.out.println("Sabado: " + this.getSabado());
    }
    
    
}
