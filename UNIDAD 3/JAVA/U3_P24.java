/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p24;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P24 {

    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Ingrese un numero (ingrese un número negativo para detenerse): ");
            n = A.nextInt();
            
            if (n < 0) {
                break;
            }
            
            if (n % 2 == 0) {
                System.out.println("El numero " + n + " es un numero par.");
            } else {
                System.out.println("El numero " + n + " es un numero impar.");
            }
        } while (true);
        
        System.out.println("El programa ha finalizado.");
    }
}
