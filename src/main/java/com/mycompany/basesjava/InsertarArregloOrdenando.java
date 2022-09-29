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
public class InsertarArregloOrdenando {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int ingresados []=  new int[6];
        int insertar,j=0,sitio_num=0;
        boolean creciente = true;
        do{
            for(int i=0;i<5;i++){
            System.out.println(i + " digite su numero");
            ingresados[i]=input.nextInt();
            }
            
            for(int i = 0;i<4;i++){
                if(ingresados[i]<ingresados[i+1]){
                    creciente = true;
                }
            }
            
            for(int i = 0;i<4;i++){
                if(ingresados[i]>ingresados[i+1]){
                    creciente = false;
                   
                    break;
                }
            }
            if(creciente == false){
                 System.out.println("digite numeros crecientes");
            }
        
            
            
        }while(creciente==false);
        System.out.println("inserte numero");
        insertar = input.nextInt();
        
        while(ingresados[j]<insertar && j<5){
            sitio_num++;
            j++;
        }
        
        for(int i =4;i>=sitio_num;i--){
            ingresados[i+1]=ingresados[i];
        }
        ingresados[sitio_num]=insertar;
        System.out.println("soy resultado final" + Arrays.toString(ingresados));
    }
}
