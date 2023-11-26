/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p18;

/**
 *
 * @author fatim
 */
public class U4_P18 {

    public static void main(String[] args) {
         int diag[][]={{1,2,3} , {4,5,6} , {7,8,9}};
          int sDP = 0, sDS = 0, sDI = 0;
      System.out.println(" \n Diagonal principal...");
      for(int c=0; c<diag.length; c++){
          
          System.out.println(diag[c][c] + " ");
          sDP += diag[c][c];
      }
      System.out.println("\n Diagonal inversa...");
     for(int i=0; i<3; i++){
          System.out.println(diag[i][diag.length - i - 1]  + " ");
          sDI += diag[i][diag.length - i - 1];
      }
     System.out.println("\n Diagonal secundaria...");
     for(int i=1; i<3; i++ ){
         
         System.out.println(diag[i][i - 1]  + " ");
          sDS += diag[i][i - 1];
     }
            System.out.println("La suma de los elementos de la diagonal principal es: " + sDP);
            System.out.println("La suma de los elementos de la diagonal inversa es: " + sDI);
            System.out.println("La suma de los elementos de la diagonal secundaria es: " + sDS);
    }
}
