
package org.pruebadiagnostica.model;

import java.util.Scanner;


/**
 *
 * @author informatica
 */
public class Triangulo extends Forma {
    
    private double base;
    private double altura;
    private double ajuste;
   Scanner sc = new Scanner(System.in);
    @Override
    public void calcularArea() {
        System.out.println("Hola, cual es el valor de la base");
        base = sc.nextDouble();
        System.out.println("Ahora, ingresa el valor de la altura");
        altura = sc.nextDouble();
        ajuste = (base*altura)/2;
        System.out.println("El area del triangulo es:" + ajuste);

    }
}
