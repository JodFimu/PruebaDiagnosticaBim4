package org.pruebadiagnostica.model;

public abstract class Dispositivo {

    String marca;
    String modelo;
    int anio;

    public abstract void encender();

    public void encender(int voltaje){
        
    }

    public void mostrarInformacion(){

        System.out.println("marca: " + marca + "modelo: " + modelo + "año: " + anio);
    }
}
