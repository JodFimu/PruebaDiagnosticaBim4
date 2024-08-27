
package org.pruebadiagnostica.model;

public class Tester extends Empleado{
    private String tipoDePruebas;

    public Tester() {
    }

    public Tester(String tipoPruebas, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.tipoDePruebas = tipoPruebas;
    }
    
    @Override
    public void trabajar() {
        System.out.println( this.getNombre() + " está realizando el tipo de pruebas: " + tipoDePruebas);
    }

    public void trabajar(String herramienta, String proyecto) {
        System.out.println( this.getNombre() + " está testeando el proyecto: " + proyecto + " usando la herramienta de: " + herramienta );
    }
}
