/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consultanumeros;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class ConsultaNumeros {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de numeros que desea consultar");
        int consulta=teclado.nextInt();
        int a = 0,b=0,c=0;
        for (int i = 0; i < consulta; i++) {
            System.out.println("Por favor ingrese la cantidad de numeros");
            int numero=teclado.nextInt();
            if (numero>0){
               a=a+1;
            }
            else{
                if(numero<0){
                    b=b+1;
                }
            
                else{
                c=c+1;
                }
            }
        }
        System.out.println("La cantidad de numeros mayores a cero es: "+a);
        System.out.println("La cantidad de numeros menores a cero es: "+b);
        System.out.println("La cantidad de numeros iguales a cero es: "+c);
    }
}
