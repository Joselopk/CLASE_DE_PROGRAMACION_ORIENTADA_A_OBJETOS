/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vocales.o.no;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class VocalesONO {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese una letra del abecedario");
        Scanner teclado=new Scanner(System.in);
        String letra=teclado.next();
        if ('e' == letra || 'a' == letra || 'i' == letra || 'o' == letra || 'u' == letra){
            System.out.println("Es una vocal");
        }
        else{
            System.out.println("No es una vocal");
        }
        
    }
}
