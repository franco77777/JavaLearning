/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava;

import java.util.Arrays;
import java.util.Scanner;


public class Sort {
    public static void main (String [] args){
        Scanner numeros = new Scanner(System.in);
        int input [] = new int[10];
        for(int i = 0; i<10;i++){
            System.out.print(i+ " ingrese numero");
            input[i] = numeros.nextInt();
        }
        Arrays.sort(input);
        System.out.println("jsoy " + Arrays.toString(input) );
    }
    
}
