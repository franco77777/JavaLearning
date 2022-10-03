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
public class OrdenamientoInsercion {
    public static void main (String[]args){
        
        Scanner input = new Scanner(System.in);
        int cantidad,pos,aux;
        
        System.out.println("digite cantidad");
        cantidad = input.nextInt();
        int array [] = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print(i + " digite numero: ");
            array[i] = input.nextInt();
        }
        System.out.println("soy los digitados: " + Arrays.toString(array));
        for (int i = 0; i < cantidad; i++) {
            pos = i;
            aux = array[i];
            while(pos>0 && (array[pos-1]>aux)){
                array[pos]= array[pos-1];
                pos--;
                        
            }
            array[pos]=aux;
        }
        System.out.println("resultado" + Arrays.toString(array));
    }
}
