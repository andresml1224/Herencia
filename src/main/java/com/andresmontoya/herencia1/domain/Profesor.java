package com.andresmontoya.herencia1.domain;

import java.util.List;

public class Profesor extends Persona{
    private String materia;
    private byte aniosExperiencia;
    private List<Estudiante> estudiantes;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public byte getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(byte aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
