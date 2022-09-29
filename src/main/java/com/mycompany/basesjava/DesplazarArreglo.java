/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 4R3S
 */
public class DesplazarArreglo {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int numeros [] = new int [10];
        
     int posicion,ultimo;
     for(int i = 0; i<10;i++){
            System.out.println(i+" digite numero");
            numeros[i] = input.nextInt();
        }
        System.out.println("digite posicion");
        posicion = input.nextInt();
        for(int j=1;j<=posicion;j++){
            ultimo = numeros[9];
             for(int i=8;i>=0;i--){
            
            numeros[i+1]=numeros[i];
            
                    }
             numeros[0]=ultimo;
        }
        //12345678910
        System.out.println("soy resultado" + Arrays.toString(numeros));
    }
}
