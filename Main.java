package com.java;

public class Main {

    public static void main(String[] args) {

        SmartWatch huaweiGT = new SmartWatch("Huawei", "GT", 336, true, true, true, true, true);

        SmartPhone galaxyS22 = new SmartPhone("Samsung", "GalaxyS22", 35.5, true, true, "UltraVJS", 3, true);

        System.out.println(huaweiGT.fabricante);
        System.out.println(huaweiGT.modelo);
        System.out.println(huaweiGT.horasDuracionBateria);
        System.out.println(huaweiGT.bluetooth);
        System.out.println(huaweiGT.wifi);
        System.out.println(huaweiGT.GPS);
        System.out.println(huaweiGT.podometro);
        System.out.println(huaweiGT.monitorizacionSueño);

        System.out.println();

        System.out.println(galaxyS22.fabricante);
        System.out.println(galaxyS22.modelo);
        System.out.println(galaxyS22.horasDuracionBateria);
        System.out.println(galaxyS22.bluetooth);
        System.out.println(galaxyS22.wifi);
        System.out.println(galaxyS22.camaraFotos);
        System.out.println(galaxyS22.numCamarasFotos);
        System.out.println(galaxyS22.juegos);




    }




}
