/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p1;

/**
 *
 * @author LaboratorioLTI2
 */
public class U4_P1 {

    public static void main(String[] args) {
       //DECLARAR ARREGLOS Y ASIGNAR VALORES
            int[] edades = new int[] {17,19,18,18,17};
            //SINTAXIS SIMPLIFICADA
            int[] edades2 = new int[] { 17, 19, 18, 18, 18 };
            //IMPRESION EL CONTADOR ME AYUDA A INDICAR EL INDICE
            for (int i = 0; i < edades.length; i++)
            {
               
                System.out.println("Indice: " + i + " es: " + edades[i]);
                if (edades[i] >= 18)
                    System.out.println("Eres mayor!!!.");
                else
                    System.out.println("Eres menor!!!.");
            }
    }
}
