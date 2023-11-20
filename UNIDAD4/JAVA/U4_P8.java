/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p8;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P8 {

    public static void main(String[] args) {
       Scanner L = new Scanner(System.in);
       int CE;
       
        System.out.print("Escribe la cantidad de elementos en el arreglo: ");
        CE = L.nextInt();
        L.nextLine();
        int[] A = new int[CE];

        for (int i = 0; i < CE; i++) {
            System.out.print("Escribe el elemento #" + i +  ": ");
            A[i] = L.nextInt();
        }

    
        System.out.println("Elementos Pares:");
        for (int elemento : A) {
            if (elemento % 2 == 0) {
                System.out.println(elemento);
            }
        }

        System.out.println("Elementos Impares:");
        for (int elemento : A) {
            if (elemento % 2 != 0) {
                System.out.println(elemento);
            }
        }
    }
}
