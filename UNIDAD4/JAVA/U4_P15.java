/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p15;

import java.util.Scanner;

/**
 *
 * @author fatim
 */
public class U4_P15 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
         int F = 0, C = 0, suma = 0;

        

        System.out.print("Ingrese el número de filas: ");
        F = L.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        C = L.nextInt();

        int[][] numeros = new int[F][C];

        for (int i = 0; i < F; i++) {
            for (int c = 0; c < C; c++) {
                System.out.print("Elemento [" + (i + 1) + "," + (c + 1) + "]: ");
                numeros[i][c] = L.nextInt();
            }
        }

        for (int i = 0; i < F; i++) {
           suma = 0;

            for (int c = 0; c < C; c++) {
                suma += numeros[i][c];
            }

            double m = (double) suma / C;
            System.out.println("Fila " + (i + 1) + ": " + m);
        }
    }
}