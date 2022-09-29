/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava;

import java.util.Arrays;
import java.util.Scanner;

//obtener dos arreglos y luego fusionarlos en uno ordenados
public class Ordenar2ArreglosEn1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int array1 [] = new int[5];
        int array2 [] = new int[5];
        int arrayFinal[]=new int[10];
        
        
        
        for (int i = 0; i < 5; i++) {
             System.out.println(i+" ingrese numero array1: ");
             array1[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
             System.out.println(i+" ingrese numero array2: ");
             array2[i] = input.nextInt();
        }
       Arrays.sort(array1);
       Arrays.sort(array2);
        System.out.println("array1" + Arrays.toString(array1));
        System.out.println("array2" + Arrays.toString(array2));
               
        int i=0,j=0,k=0;
        while(i<5 && j<5){
          if(array1[i] < array2[j]){
                arrayFinal[k]= array1[i];
                i++;
            } else {
              arrayFinal[k]=array2[j];
              j++;
            }  
          k++;
        }
        
        if(i==5){
            while(j<5){
                arrayFinal[k]=array2[j];
                j++;
                k++;
            }
        } else{
           while(i<5){
                arrayFinal[k]=array1[i];
                i++;
                k++;
            } 
        }
        
        
        
          System.out.println("soy resultado " + Arrays.toString(arrayFinal));   
    }
}
