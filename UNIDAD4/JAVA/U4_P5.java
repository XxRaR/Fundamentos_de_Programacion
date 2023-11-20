/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p5;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P5 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de frutas a procesar: ");
        int CF = L.nextInt();
        L.nextLine();

    
        String[] FO = new String[CF];
        String[] FI = new String[CF];

        for (int i = 0; i < CF; i++) {
            System.out.print("Ingrese la fruta #" + (i + 1) + ": ");
            FO[i] = L.nextLine();
        }
        for (int c = 0; c < FO.length; c++) {
          FI[c] = FO[FO.length - 1 - c];
        }
        //Impresion de arreglo 1
 for (String elemento1 : FO) {
            System.out.print(elemento1 + ", ");
        }
 System.out.println();
        //Impresion de arreglo inverso
        for (String elemento : FI) {
            System.out.print(elemento + ", ");
        }
        System.out.println();
    }
}
      