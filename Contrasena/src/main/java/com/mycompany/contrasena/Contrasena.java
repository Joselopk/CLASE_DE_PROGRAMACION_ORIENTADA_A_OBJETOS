/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contrasena;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Contrasena {

    public static void main(String[] args) {
        String a="contraseña";
        Scanner teclado=new Scanner(System.in);
         
        System.out.println("Por favor ingrese la contraseña");
        String validar=teclado.next();
        String realidad=validar.toLowerCase();
        System.out.println(""+realidad);
        if (realidad.equals(a)){
            System.out.println("Su contraseña es correcta");
        }
        else {
            System.out.println("Su contraseña es incorrecta");
        }
    }
}
