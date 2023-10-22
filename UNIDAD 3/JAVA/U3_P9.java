/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p9;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int hE,hS,TH;
        double TC;
        System.out.print("Ingresa la hora de entrada (En formato 24 hrs): ");
        hE = sc.nextInt();
        System.out.print("Ingresa la hora de salida (En formato 24 hrs): ");
        hS = sc.nextInt();
        TH = hS - hE;
        
        System.out.println("El total de horas es: " + TH);
        
        if (TH <= 2){
            TC=TH*5;
            System.out.println("El total a cobrar es de: $" + TC);
        } else if(TH <= 3 && TH > 2){
            TC=TH*4;
            System.out.println("El total a cobrar es de: $" + TC);
        } else if (TH <= 5 && TH > 3){
            TC=TH*3;
            System.out.println("El total a cobrar es de: $" + TC);
            
        } else if(TH <= 10 && TH > 5){
            TC=TH*2;
            System.out.println("El total a cobrar es de: $" + TC);
            
        }
        
        
    }
}
