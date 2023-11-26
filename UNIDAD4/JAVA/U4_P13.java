/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p13;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U4_P13 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        //ALMACENA °C ESCRITOS POR EL USUARIO
        float [][] temp = new float [5][7];
        for(int f=0; f<5;f++){
            for(int c=0; c<7; c++){
                System.out.println("Escribe temperatura en (" + f + ", " + c + ")");
                temp [f][c] = L.nextFloat();
            }
        } //ALAMCENA LA CONVERSION A °F
        float [][] tempF = new float[5][7];
         for(int f=0; f<5;f++){
            for(int c=0; c<7; c++){
                tempF [f][c] = (temp[f][c] * 9/5) + 32;
                System.out.print("°F en (" + f + ", " + c + ")" + "= "+ tempF[f][c] + " ") ;
            }
            System.out.println();
        }
         
    }
    
}
