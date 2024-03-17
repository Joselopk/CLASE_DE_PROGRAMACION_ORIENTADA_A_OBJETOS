/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.indicepesocorporal;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class IndicePesoCorporal {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor indica tu peso en kilogramos");
        float peso=teclado.nextFloat();
        System.out.println("Por favor indica tu estatura en metros");
        float estatura=teclado.nextFloat();
        float imc=(peso/(estatura*estatura));
        if(imc<16){
            System.out.println("Resultado:Delgadez severa. Su IMC es: "+imc);
        }
        else{
            if(imc<17 & imc>16){
                System.out.println("Resultado:Delgadez moderada. Su IMC es: "+imc);
            }
            else{
                if(imc<18.5 & imc>17){
                    System.out.println("Resultado:Delgadez leve. Su IMC es: "+imc);
                }
                else{
                    if(imc<25 & imc>18.5){
                        System.out.println("Resultado: Peso normal. Su IMC es: "+imc);
                    }
                    else{
                        if(imc<30 & imc>25){
                            System.out.println("Resultado:Sobrepeso. Su IMC es: "+imc);
                        }
                        else{
                            if(imc<35 & imc>30){
                                System.out.println("Resultado:Obesidad leve. Su IMC es: "+imc);
                            }
                            else{
                                if(imc<40 & imc>35){
                                    System.out.println("Resultado:Obesidad moderada. Su IMC es: "+imc);
                                }
                                else{
                                    if(imc>=45){
                                        System.out.println("Resultado:Obesidad morbida. Su IMC es: "+imc);
                                    }
                                }
                            }
                        }
                        
                    }
                   
                }
            }
        }
    }
}
