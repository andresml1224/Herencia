package com.andresmontoya.herencia1.domain;

import java.util.List;

public class Estudiante extends Persona{
    private List<Double> notas;

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
