package org.pruebadiagnostica.system;

import java.util.Scanner;

import org.pruebadiagnostica.model.Circulo;
import org.pruebadiagnostica.model.Cuadrado;
import org.pruebadiagnostica.model.Desarrollador;
import org.pruebadiagnostica.model.Empleado;
import org.pruebadiagnostica.model.Rectangulo;
import org.pruebadiagnostica.model.Tester;
import org.pruebadiagnostica.model.Triangulo;

import javafx.scene.shape.TriangleMesh;

public class Main {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);

        boolean flag=true;
        byte op;

        while(flag=true){
            System.out.println("que ejercicio quiere probar");
            System.out.println("1: ejercicio 1");
            System.out.println("2: ejercicio 2");
            System.out.println("3: ejercicio 3");
            System.out.println("4. salir");
            op=sc.nextByte();

            switch (op) {
                case 1:
                
                    break;
                case 2:
                    
                    break; 
                case 3:
                    
                    break;          
                case 4:
                    System.exit(0);
                    break;
            }

        }
    }

    public static void probarInstancias(){
        Desarrollador desa = new Desarrollador("Java", "Eduardo", 17, 5000.00);
        Tester tester = new Tester("Pruebas unitarias", "Mario", 25, 2000.00);
        Empleado empleado = new Empleado("Daniel", 17, 5000.00) {
          @Override
          public void trabajar() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };
      // Empleado  
      empleado.trabajar(8);   
      System.out.println(empleado);
      System.out.println("-------------------------------------------------------------------");
      //Desarrollador
      System.out.println(desa);
      desa.trabajar();
      desa.trabajar("Sistema Bancario");
      System.out.println("--------------------------------------------------------------------");
      // Tester
      System.out.println(tester);
      tester.trabajar();
      tester.trabajar("JUnit", "Sistema Bancario");
      System.out.println("--------------------------------------------------------------------");
      // Polimorfismo por sustitucion
      Empleado miEmpleado = new Desarrollador("Javascript","Javier", 20, 6000.00);
      System.out.println(miEmpleado);
      Empleado miEmpleado2 = new Tester("Nunit", "Roberto", 18, 5000.00);
      System.out.println(miEmpleado2);
        }

        public void menuEjercicio2(){
            Circulo c = new Circulo();
            Triangulo tr = new Triangulo();
            Cuadrado cr = new Cuadrado();
            Rectangulo rc = new Rectangulo();

            Scanner sc = new Scanner(System.in);

            System.out.println("que quieres hacer?");
            System.out.println("1. circulo");
            System.out.println("2. triangulo");
            System.out.println("3. cuadrado");
            System.out.println("4. recctangulo");
            byte op = sc.nextByte();

            switch (op) {
                case 1:
                    c.calcularArea();
                    break;
                case 2:
                    tr.calcularArea();
                    break;
                case 3:
                    cr.calcularArea();
                     break;
                
                case 4:
                    rc.calcularArea();
                    break;
            
                default:
                    break;
            }
        }
}
