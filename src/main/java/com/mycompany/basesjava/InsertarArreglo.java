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
public class InsertarArreglo {
    public static void main (String[] args){
        Scanner numeros = new Scanner (System.in);
        int numeroUsuario, posicion;
        int digitados [] = new int[9];
        
        
        for(int i = 0 ; i<8;i++){
            System.out.println("digite numero");
            digitados[i]= numeros.nextInt();
        }
        System.out.println("digite numero final");
        numeroUsuario = numeros.nextInt();
        System.out.println("digite posicion");
        posicion = numeros.nextInt();
        
        for(int i=7;i>= posicion;i--){
            digitados[i+1] = digitados[i];
        }
        digitados[posicion] = numeroUsuario;
        
        
        
        System.out.println("soy digitados" + Arrays.toString(digitados));
    }
}
