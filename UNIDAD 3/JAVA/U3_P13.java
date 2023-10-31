/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p13;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int c, num, CP=0, CN=0;//2
        
        for (c=1; c<=100; c++){ //5
            System.out.print("Ingresa un numero entero: ");
            num = sc.nextInt();
            
           if (num >= 0) //5c
               CP++;
               
           else 
               CN++;
           
        
        }
           System.out.println("La cantidad de numeros positivos es: " + CP );
           System.out.println("La cantidad de numeros positivos es: " + CN );

    }
}
