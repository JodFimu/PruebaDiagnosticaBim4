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
        System.out.println("marca: " + marca + "modelo: " + modelo + "año: " + anio + " tamaño pantalla: " + tamanioPantalla);
    }    

    public void encender( int volumen){
        if(volumenTV==0){
            
        }
    }

}
