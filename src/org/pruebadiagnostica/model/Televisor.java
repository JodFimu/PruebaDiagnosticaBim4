package org.pruebadiagnostica.model;

public class Televisor extends Dispositivo{

    int volumen;

    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    public void mostrarInformacion(){
        System.out.println("marca: " + marca + "modelo: " + modelo + "año: " + anio);
    }    
}
