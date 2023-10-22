/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p6;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingresa un numero entero positivo: ");
        num = sc.nextInt();
        if (num>=0){
            if (num % 2 == 0){
                System.out.println("El numero " + num +  " es par ");
                
            } else { 
                System.out.println("El numero " + num + " es impar");
                
            } 
            
                   
        } else {
                 System.out.println("Por favor ingresa un numero entero positivo");
               }
    }
}
