package org.pruebadiagnostica.model;

import java.util.Scanner;

public class Televisor extends Dispositivo{

    int volumenTV=0;
    double tamanioPantalla;
    Scanner sc = new Scanner(System.in);

    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    public void mostrarInformacion(){   
        System.out.println("marca: " + marca + "modelo: " + modelo + "año: " + anio + " tamaño pantalla: " + tamanioPantalla + "volumen: " + volumenTV);
    }    

    public void encender( int volumen){
        System.out.println("volumen en: " + volumenTV);
        System.out.println("1. subir volumen");
        System.out.println("2. bajar volumen");
        byte op = sc.nextByte();

        switch (op) {
            case 1:
                volumen=subirVol(volumen);
                break;
            case 2:
                volumen=bajarVol(volumen);
                break;
        }

        volumenTV= volumen;
    }

    public int subirVol(int volumen){
        return volumen++;
    }

    public int bajarVol(int volumen){
        return volumen--;
    }
}
