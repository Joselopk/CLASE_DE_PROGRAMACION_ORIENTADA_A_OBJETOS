/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumanumeros;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class SumaNumeros {

    public static void main(String[] args) {
         // Declarar las variables a usar durante el programa
        int a,b,c;
        System.out.println("Ingrese los sumandos: ");
        //Leer las variables de ingreso
        Scanner leer=new Scanner(System.in);
        a=leer.nextInt();
        b=leer.nextInt();  
        //Realizamos el cálculo
        c=a+b;
        System.out.println("El resultado de la suma es: "+c);
        
        
        if(c%2==0){
            if (c<0){
                    
                    System.out.println(" El resultado es par y negativo ");
            }       
            else {
            
                    System.out.println(" El resultado es par y negativo ");
            }          
     
        }
        else{
            if (c<0) {
                
            System.out.println(" El resultado es impar y negativo ");
            }
            else {
                System.out.println(" El resultado es impar y positivo ");
            } 
                
        }
        System.out.println("Adiós!");
    }
}
