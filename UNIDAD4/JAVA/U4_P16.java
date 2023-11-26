/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p16;

/**
 *
 * @author fatim
 */
public class U4_P16 {

    public static void main(String[] args) {
           char[][] letras= {{ 'a','b','c' }, {'d', 'e', 'f'}};
            int fila = letras.length;
            int columna = letras[0].length;

            for (int f = 1; f >= 0; f--)
            {
                for (int c = 2; c >= 0; c--)
                {
                    System.out.print(letras[f][c] + ",");
                } //FIN FOR COLUMNA
                System.out.println();
            }//FIN FOR FILA

    }
}
