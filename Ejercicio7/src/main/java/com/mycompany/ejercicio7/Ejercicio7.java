/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int r=0;
        
        while(5!=r){
            System.out.println("Por favor ingrese dos numeros diferentes de cero: ");
            int a=teclado.nextInt();
            int b=teclado.nextInt();
            
            System.out.println("Indique la opción entre 1 y 5 que desea realizar: ");
            System.out.println(" 1. suma ");
            System.out.println(" 2. resta ");
            System.out.println(" 3. multiplicaón ");
            System.out.println(" 4. divición ");
            System.out.println(" 5. salir ");
            
            r=teclado.nextInt();
             
            switch (r) {
            case 1:
                int c=a+b;
                System.out.println("La suma de los numeros es: "+c);
                break;
            case 2:
                int d=a-b;
                System.out.println("La resta de los numeros es: "+d);
                break;
            case 3:
                int f=a*b;
                System.out.println("La multiplicación de los numeros es: "+f);
                break;
            case 4:
                double g=a/b;
                System.out.println("La división de los numeros es: "+g);
                break;
            default:
                System.out.println("Disculpa, esta no es una opcion por favor elige una opcion entre 1 y 5");
                        
            }
        }
      
    }
}
