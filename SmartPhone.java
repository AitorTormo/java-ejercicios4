package com.java;

public class SmartPhone extends SmartDevice{

    // 1. atributos

    String camaraFotos;
    int numCamarasFotos;
    boolean juegos;

    // 2. constructores

    public SmartPhone(){
    }

    public SmartPhone(String fabricante, String modelo, double horasDuracionBateria, boolean bluetooth, boolean wifi, String camaraFotos, int numCamarasFotos, boolean juegos) {
        super(fabricante, modelo, horasDuracionBateria, bluetooth, wifi);
        this.camaraFotos = camaraFotos;
        this.numCamarasFotos = numCamarasFotos;
        this.juegos = juegos;
    }

    // 3. metodos



}
