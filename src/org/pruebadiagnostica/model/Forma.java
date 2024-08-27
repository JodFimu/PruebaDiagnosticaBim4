
package org.pruebadiagnostica.model;

/**
 *
 * @author informatica
 */
public abstract class Forma {

    private String color;

    public Forma() {
    }

    public Forma(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void calcularArea();
    
    public void calcularArea(String mensaje){
    
    }
    
}
