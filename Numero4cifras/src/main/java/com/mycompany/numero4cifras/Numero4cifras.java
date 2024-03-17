/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numero4cifras;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Numero4cifras {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero de hasta 4 cifras");
        Scanner teclado=new Scanner(System.in);
        int numero=teclado.nextInt();
        if (numero>=0 & numero<10){
            System.out.println("El numero es de una cifra");
        }
        if (numero>=10 & numero<100){
            System.out.println("El numero es de dos cifras");
        }
        if (numero>=100 & numero<1000){
            System.out.println("El numero es de tres cifras");
        }
        if (numero>=1000 & numero<10000){
            System.out.println("El numero es de cuatro cifras");
        }
    }
}
