package com.models;

import checadorhorarios.Model;

public class AnadirEmpleadoModel extends Model {
    private int idEmpleado;
    private String nombre;
    private String aMaterno;
    private String aPaterno;
    private String rfc;
    private String genero;
    private String fNacimiento;
    private String fIngreso;
    
    
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

    public String getaMaterno() {
        return aMaterno;
    }
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
    public String getaPaterno() {
        return aPaterno;
    }
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
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
