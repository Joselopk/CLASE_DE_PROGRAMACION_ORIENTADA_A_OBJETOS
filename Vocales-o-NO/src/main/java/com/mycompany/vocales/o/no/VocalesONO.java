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
        String a,e,i,o;
        System.out.println("Por favor ingrese una letra del abecedario");
        Scanner teclado=new Scanner(System.in);
        String letra=teclado.next();
        if (letra == null ? a == null : letra.equals(a)){
            System.out.println("NO es vocal");
        }
        else{
            System.out.println("Es una vocal");
        }
        
    }
}
