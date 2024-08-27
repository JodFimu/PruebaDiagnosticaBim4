package org.pruebadiagnostica.model;

public class Telefono extends Dispositivo {
    String codigoTelefono = "kinal";
    String tipo;

    @Override
    public void encender() {
        System.out.println("telefono encendido");
    }

    public void encender(String codigo){
        if(codigo.equals(codigoTelefono)){
            System.out.println("telefono encendido");
        }else{
            System.out.println("codigo incorrecto");
        }
    }

    public void mostrarInformacion(){
        System.out.println("marca: " + marca + " modelo: " + modelo + " año: " + anio + " tipo: " + tipo);
    }
    
}
