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
public class OrdenamientoSeleccion {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int cantidad,aux,min;
        System.out.println("digite cantidad");
        cantidad = input.nextInt();
        int array [] = new int [cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print(i+1 +" digite numero: " );
            array[i]= input.nextInt();
        }
        
        for (int j = 0; j < cantidad ;j++) {
            min = j;
            for (int i = j+1; i < cantidad; i++) {
                if(array[i]<array[min]){
              min=i;
                }
                
            }
            aux = array[j];
            array[j]=array[min];
            array[min]=aux;
        }
        System.out.println("resultado" + Arrays.toString(array));
    }
}
