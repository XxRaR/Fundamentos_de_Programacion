/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p10;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P10 {

    public static void main(String[] args) {
       Scanner L = new Scanner(System.in);
       int CP;
       double Lp,Tc=0;
   System.out.print("Ingrese la cantidad de países: ");
        CP = L.nextInt();
        L.nextLine();
        

        
       String[] P = new String[CP];

       for (int i = 0; i < CP; i++) {
            System.out.print("Ingrese el nombre del país #" + (i + 1) + ": ");
            P[i] = L.nextLine();
        }


        
        for (String palabra : P) {
            Tc += palabra.length();
        }

    
         Lp = Tc / P.length;

        
        System.out.println("La longitud promedio de las palabras de los países es: " + Lp);
    }
}
