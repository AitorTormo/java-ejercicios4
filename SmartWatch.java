package com.java;

public class SmartWatch extends SmartDevice{

    // 1. atributos

    boolean GPS;
    boolean podometro;
    boolean monitorizacionSueño;


    // 2. constructores

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, double horasDuracionBateria, boolean bluetooth, boolean wifi, boolean GPS, boolean podometro, boolean monitorizacionSueño) {
        super(fabricante, modelo, horasDuracionBateria, bluetooth, wifi);
        this.GPS = GPS;
        this.podometro = podometro;
        this.monitorizacionSueño = monitorizacionSueño;
    }

    // 3. metodos

}
