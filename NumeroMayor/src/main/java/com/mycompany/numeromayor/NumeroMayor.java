/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromayor;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class NumeroMayor {

    public static void main(String[] args) {
        System.out.println(" por favor ingrese tres numeros ");
        Scanner teclado  = new Scanner(System.in);
        int a =teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        
        if (a>b){
            if (a>c)
                
            System.out.println("el numero "+a+ " es mayor");
        }
        
            if (b>a){
                if (b>c)
                    System.out.println("el numero "+b+ " es mayor");

            }
                if (c>a){
                    if (c>b)
                        System.out.println("el numero "+c+ " es mayor");

                else{
                    System.out.println("Los numeros son iguales");
            
        }
        
    }
    
    }
}
