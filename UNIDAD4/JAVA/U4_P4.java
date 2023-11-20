/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p4;

import java.util.Scanner;

/**
 *
 * @author fatim
 */
public class U4_P4 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de numeros a procesar: ");
        int CN = L.nextInt();
        L.nextLine();

                int[] numeros = new int[CN];

       
        int TN = 0;
for (int c = 0; c < CN; c++) {
            System.out.print("Ingrese el numero #" + (c + 1) + ": ");
            numeros[c] = L.nextInt();
        }
       

      
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                TN++;
            }
        }

       
        System.out.println("Total de números negativos: " + TN);
    }

    }
    