package com.andresmontoya.herencia1.domain;

public class Persona {
    private short identificacion;
    private String nombre;
    private String apellido;
    private String genero;
    private byte edad;


    public void caminar(){

    }

    public void frenar(){

    }

    public short getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
