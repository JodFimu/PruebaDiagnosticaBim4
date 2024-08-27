package org.pruebadiagnostica.system;

import java.util.Scanner;

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


}
