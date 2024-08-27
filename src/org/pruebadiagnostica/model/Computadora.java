package org.pruebadiagnostica.model;

public class Computadora extends Dispositivo {
    String clavePC= "123456";
    String sistemaOperativo;

    @Override
    public void encender() {
        System.out.println("Computadora encendida");
    }
    
    public void encender(String clave){
        if(clave.equals(clavePC)){
            System.out.println("computadora encendida");
        }else{
            System.out.println("clave incorrecta");
        }
    }

    public void mostrarInformacion(){

        System.out.println("marca: " + marca + " modelo: " + modelo + " año: " + anio + " Sistema operativo: " + sistemaOperativo);
    }
}
