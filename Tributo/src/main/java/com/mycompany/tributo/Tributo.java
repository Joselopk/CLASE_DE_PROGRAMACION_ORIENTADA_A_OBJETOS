/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tributo;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Tributo {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor ingrese su edad");
        int edad=teclado.nextInt();
        System.out.println("Por favor indique sus ingresos al mes");
        int ingresos=teclado.nextInt();
        if (edad>=16&&ingresos>=1000){
            System.out.println("Usted tiene que tributar");
        }
        else{
            System.out.println("Usted no tiene que tributar");
        }
    }
}
