/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.basesjava;

import javax.swing.JOptionPane;

/**
 *
 * @author 4R3S
 */
public class While {

    public static void main(String[] args) {
        int numero,cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero,2);
            JOptionPane.showMessageDialog(null, "el numero " + numero + "elevado al cuadrado es " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        }
        System.out.println("Hello World!");
    }
}
