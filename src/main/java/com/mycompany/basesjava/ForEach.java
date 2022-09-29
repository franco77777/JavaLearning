/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava;
// leer 5 numeros y guardarlos en un arreglo y luego mostrarlos

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ForEach {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float[5];
        
        for(int i = 0;i<5;i++){
            
            numeros[i]= Float.parseFloat(JOptionPane.showInputDialog(null,(i+1) +" digite numero"));
        }
        
        for(float i:numeros){
            System.out.println("soy el numero " + i);
        }
    
    }
}
