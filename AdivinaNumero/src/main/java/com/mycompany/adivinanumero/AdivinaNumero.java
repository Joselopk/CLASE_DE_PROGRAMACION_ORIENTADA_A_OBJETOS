/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinanumero;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author josel
 */
public class AdivinaNumero {

    public static void main(String[] args) {
        Random rand=new Random();
          int aleatorio=rand.nextInt(5)+1;
          int num = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero que estoy pensando entre (1 y 5) y digita 0 para salir"));
          while (num!=aleatorio){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ese no es el numero digita otro numero (1 y 5) y digita 0 para salir"));
            if ( num==0){
                    break;
            }
            aleatorio=rand.nextInt(5)+1;
          }
          if (num!=0){ 
                JOptionPane.showMessageDialog(null,"Bien jugado");
          }
          else{
                JOptionPane.showMessageDialog(null,"El numero era "+aleatorio);
          }
    }
}
