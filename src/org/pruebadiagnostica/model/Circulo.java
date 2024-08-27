
package org.pruebadiagnostica.model;
import java.util.Scanner;
/**
 *
 * @author informatica
 */
public class Circulo extends Forma {

    private double ajuste1;
    private double radio;
    Scanner sc = new Scanner(System.in);
    @Override
    public void calcularArea() {
        System.out.println("Hola, ingresa el valor del radio del circulo");
        radio = sc.nextDouble();
        ajuste1 = Math.PI * (radio*radio);
        System.out.println("el resultado es: " + ajuste1);
    }
    
}
