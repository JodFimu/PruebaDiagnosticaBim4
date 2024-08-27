
package org.pruebadiagnostica.model;

public class Desarrollador extends Empleado{
    private String lenguajeDeProgramacion;

    public Desarrollador() {
    }


    public Desarrollador(String lenguajeDeProgramacion, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }
    
    
    @Override
    public void trabajar() {
        System.out.println( this.getNombre() + " utiliza el lenguaje " + lenguajeDeProgramacion);
    }

    public void trabajar(String proyecto) {
        System.out.println( this.getNombre() + " se ncuentra trabajando en el proyecto de: " + proyecto);
    }
}

