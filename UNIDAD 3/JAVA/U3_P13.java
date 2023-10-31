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
          int c,num;//2
        
        for (c=1; c<=100; c++){ //5
            System.out.print("Ingresa un numero entero: ");
            num = sc.nextInt();
            
           if (num >= 0) //5c
               System.out.println("EL NUMERO " + num + " ES Positivo");
           else 
               System.out.println("El numero" + num + " Es negativo");
           
        
        }
    }
}
