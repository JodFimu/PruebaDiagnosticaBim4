
package org.pruebadiagnostica.model;

import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Cuadrado extends Forma {
    private double lado;
    private double ajuste;
    Scanner sc = new Scanner(System.in);

    @Override
    public void calcularArea() {
        System.out.println("Hola, ingresa el valor del lado");
        lado = sc.nextDouble();
        ajuste = lado*lado;
        System.out.println("El valor del area del cuadrado es: " + ajuste);
    }
    
    
}
