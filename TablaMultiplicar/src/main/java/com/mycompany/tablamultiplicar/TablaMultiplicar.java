/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class TablaMultiplicar {

    public static void main(String[] args) {
        int Numero,resultado; // Variables 
        
        Scanner teclado=new Scanner (System.in);// Lectura de teclado 
        
        System.out.println("Por favor escriba la el numero de la tabla de multiplicaciÃ³n que desea conocer:"); // Mensaje de pantalla
        
        Numero= teclado.nextInt(); // Numero del lector
            
        for (int i = 0; i <= 10; i++) {  // Opereciones para repeticion 
            
            resultado=i*Numero; // Multiplicacion 
            
            System.out.println(Numero + " x " + i + " = " + resultado); //Resultado en pantalla 
            
          
        }
    }
}
