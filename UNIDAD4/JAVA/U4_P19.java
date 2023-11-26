/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p19;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P19 {

    public static void main(String[] args) {
        int EI = 0, EP = 0, F=0, C=0; 
           Scanner L = new Scanner(System.in);
                System.out.print("Ingrese el numero de filas: ");
                F = L.nextInt();
                System.out.print("Ingrese el numero de columnas: ");
                C = L.nextInt();

            int[][] numeros = new int[F][C];

            for (int i = 0; i<F; i++)
            {
                for(int c = 0; c<C; c++)
                {
                    System.out.print("Elemento [" + (i+1) + ": "  + (c+1) + "]: ");
                    numeros[i][c]=L.nextInt();
                }
            }



            System.out.println("Elementos Pares:");
            for (int i=0; i<F; i++)
            {
                for(int c=0; c<C; c++)
                {
                   
                
                if (numeros[i][c] % 2 == 0)
                {
                    
                    EP++;
                    System.out.println(numeros[i][c]);
                }
            }
            }
            System.out.println("Elementos Impares:");
             for (int i=0; i<F; i++)
            {
                for(int c=0; c<C; c++)
                {
                   
                
                if (numeros[i][c] % 2 != 0)
                {
                    
                    EI++;
                    System.out.println(numeros[i][c]);
                }
            }
            }

            System.out.println("Total de números pares: " + EP);
            System.out.println("Total de números impares: " + EI);

       
    }
}
