/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedionumerosnaturales;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class PromedioNumerosNaturales {

    public static void main(String[] args) {
        float n,suma=0;
        float promedio;
        
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS NATURALES A PROMEDIAR");
        
        Scanner entrada=new Scanner(System.in);
        
        n = entrada.nextInt();
        
        for (int i=1; i<=n; i++){
        
            suma=suma+i;        
  
        }
        promedio=suma/n;
                
                System.out.println("El promedio de los primeros "+n+" numeros naturales es: "+promedio);
    }
}
