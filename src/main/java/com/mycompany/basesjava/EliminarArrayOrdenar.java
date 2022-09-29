/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava;

//eliminar un elemento del array y ordenar

import java.util.Arrays;
import java.util.Scanner;

public class EliminarArrayOrdenar {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int array [] = new int[10];
    int nuevoArray[]=new int[9];
    int posicion,j=0;
    for(int i=0;i<10;i++){
        System.out.println(i + " ingrese su numero: ");
        array[i]= input.nextInt();
    }
      do{
            System.out.println("seleccion posicion");
        posicion = input.nextInt();
      }while(posicion<0 || posicion > 9);
        
        for(int i=0;i<9;i++){
            if(posicion != j){
                nuevoArray[i]=array[j];
                j++;
            } else {
                nuevoArray[i]=array[j+1];
                j+=2;
            }
        }
        System.out.println("resultaod" + Arrays.toString(nuevoArray));
        
}
}
