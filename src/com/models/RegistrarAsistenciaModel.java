package com.models;

import checadorhorarios.Model;
import java.sql.SQLException;

public class RegistrarAsistenciaModel extends Model {
    private int idEmpleado;
    private String nombreEmpleado;
    private int idAsistencia;
    private String dia;
    private String horario;
    private String horaRegistrada;
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
            String mensaje = "RegistrarAsistenciaModel::buscarEmpleado -> " + e;
            anadirLog(mensaje);
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
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()){
                setHorario(conexion.resultSet.getString(getDia()));
                filas++;
            }
            conexion.connection.close();
        } catch(SQLException e){
            String mensaje = "RegistrarAsistenciaModel::buscarHorario -> " + e;
            anadirLog(mensaje);
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
            String mensaje = "RegistrarAsistenciaModel::buscarChequeoEntrada -> " + e;
            anadirLog(mensaje);
        }
        
        return filas;
    }
    
    public int eliminarChequeoEntrada(){
        String sql = "DELETE FROM asistencias  "
                   + "WHERE id_asistencia = '"+getIdAsistencia()+"'";
        
        Model conexion = new Model();
        int filas = 0;
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
        } catch(SQLException e){
            String mensaje = "RegistrarAsistenciaModel::eliminarChequeoEntrada -> " + e;
            anadirLog(mensaje);
        }
        return filas;
    }
    
    public int registrarEntrada() {
        String sql = "INSERT INTO asistencias(id_empleado, fecha, entrada, salida) "
                   + "VALUES( '"+ getIdEmpleado() +"' , '"+ getFecha()+"' , '"+ getHoraRegistrada()+"' , '"+ "00:00" +"' )";
        int filas = 0;
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
            conexion.connection.close();
        } catch (SQLException e) {
            String mensaje = "RegistrarAsistenciaModel::registrarEntrada -> " + e;
            anadirLog(mensaje);
        }
        
        return filas;
    }
    
    public int registrarSalida() {
        String sql = "UPDATE asistencias "
                   + "SET salida = '"+ getHoraRegistrada()+"' "
                   + "WHERE id_asistencia = "+ getIdAsistencia() +" ";
        
        int filas = 0;
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            filas = conexion.statement.executeUpdate(sql);
            conexion.connection.close();
        } catch (SQLException e) {
            String mensaje = "RegistrarAsistenciaModel::registrarSalida -> " + e;
            anadirLog(mensaje);
        }
        
        return filas;
    }
    
    
    public String obtenerUltimoRegistro() {
        String sql = "SELECT CONCAT_WS(' ', id_asistencia, id_empleado, fecha, entrada, salida) AS ultimo_registro "
                   + "FROM asistencias "
                   + "WHERE id_empleado = "+ getIdEmpleado()+" "
                   + "ORDER BY id_asistencia ASC";
        
        String ultimoRegistro = "";
        
        Model conexion = new Model();
        
        try {
            conexion.statement = conexion.connection.createStatement();
            conexion.resultSet = conexion.statement.executeQuery(sql);
            while(conexion.resultSet.next()) {
                ultimoRegistro = conexion.resultSet.getString("ultimo_registro");
            }
            conexion.connection.close();
        } catch (SQLException e) {
            String mensaje = "RegistrarAsistenciaModel::obtenerUltimoRegistro -> " + e;
            anadirLog(mensaje);
        }
        
        return ultimoRegistro;
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

    public int getIdAsistencia() {
        return idAsistencia;
    }
    public void setIdAsistencia(int id_asistencia) {
        this.idAsistencia = id_asistencia;
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

    public String getHoraRegistrada() {
        return horaRegistrada;
    }
    public void setHoraRegistrada(String entrada) {
        this.horaRegistrada = entrada;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
