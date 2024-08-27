
package org.pruebadiagnostica.model;

import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Rectangulo extends Forma {
    private double largo;
    private double ancho;
    private double ajuste;
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void calcularArea() {
        System.out.println("Ingresa el largo del rectangulo");
        largo = sc.nextDouble();
        System.out.println("Ingresa el ancho del rectangulo");
        ancho = sc.nextDouble();
        ajuste = largo*ancho;
        System.out.println("El area del rectangulo es:" + ajuste);
    }
    
    
}
