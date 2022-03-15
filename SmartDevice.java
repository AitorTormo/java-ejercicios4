package com.java;

public class SmartDevice {

    // 1. atributos

    protected String fabricante;
    protected String modelo;
    protected double horasDuracionBateria;
    protected boolean bluetooth;
    protected boolean wifi;

    // 2. constructores

    public SmartDevice(){
    }

    public SmartDevice(String fabricante, String modelo, double horasDuracionBateria, boolean bluetooth, boolean wifi) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.horasDuracionBateria = horasDuracionBateria;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }
}
