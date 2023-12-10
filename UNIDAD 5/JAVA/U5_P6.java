/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_p6;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U5_P6 {

    public static void main(String[] args) {
    Scanner L = new Scanner(System.in);

       
        System.out.print("Ingrese la cantidad de numeros que desea en la secuencia Fibonacci: ");
        int NT = L.nextInt();

      
        System.out.println("Secuencia Fibonacci:");
        for (int i = 0; i < NT; i++) {
            System.out.print(Fibonacci(i) + " ");
        }

       
        
    }
  public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
    

