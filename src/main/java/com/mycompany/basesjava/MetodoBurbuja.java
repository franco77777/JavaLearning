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
public class MetodoBurbuja {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numeros [] = new int [5];
        int numeroGuardado;
        for (int i = 0; i < 5; i++) {
        System.out.println("digite numero :");
        numeros[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if(numeros[j]>numeros[j+1]){
                    numeroGuardado=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=numeroGuardado;
                }
            }
        }
        System.out.println("resultado" + Arrays.toString(numeros));
    }
}
