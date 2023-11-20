/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p22;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P22 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
         int suma = 0, num;
    do
    {
    System.out.println("Escribe el numero: ");
    num = L.nextInt();
    suma = suma + num;

    }  while (num != 0);
       System.out.println("El resultado es: " + suma);
        
   
    }
}
