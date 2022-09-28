/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava;

//leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0

import javax.swing.JOptionPane;

public class while2 {
    public static void main (String[] args){
    int numero;
    
      //hola
    numero = Integer.parseInt(JOptionPane.showInputDialog("introduzca numero"));
    
    while(numero!=0){
        if(numero<0){
            //JOptionPane.showMessageDialog(null,"el numero es positivo");
            System.out.println("el numero es negativo");
            numero = Integer.parseInt(JOptionPane.showInputDialog("introduzca numero nuevamente"));
        } else {
             //JOptionPane.showMessageDialog(null,"el numero es negativo");
             System.out.println("el numero es positivo");
             numero = Integer.parseInt(JOptionPane.showInputDialog("introduzca numero nuevamente"));
        }
        
        }
    
    
}
    
    
}
