package com.andresmontoya.herencia2.domain;

public class Celular {
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private int memoriaRAM;
    private boolean wifi;
    private boolean pantallaTactil;


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
}
