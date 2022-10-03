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
public class MatrizIntroduccion {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int filas,columnas;
        System.out.println("digite cantidad de filas");
        filas= input.nextInt();
        System.out.println("digite cantidad de columnas");
        columnas= input.nextInt();
        int matriz[][]= new int [filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(j+1 +" digite numero :");
                matriz[i][j]= input.nextInt();
            }
        }
        System.out.println("soy resultado " + Arrays.deepToString(matriz));
    }
}
