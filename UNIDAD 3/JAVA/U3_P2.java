/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p2;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P2 {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int c1,c2,c3,c4,c5,c6;
      float prom;
      System.out.print("Escribe calificacion 1: ");
      c1 = sc.nextInt();
      System.out.print("Escribe calificacion 2: ");
      c2 = sc.nextInt();
      System.out.print("Escribe calificacion 3: ");
      c3 = sc.nextInt();
      System.out.print("Escribe calificacion 4: ");
      c4 = sc.nextInt();
      System.out.print("Escribe calificacion 5: ");
      c5 = sc.nextInt();
      System.out.print("Escribe calificacion 6: ");
      c6 = sc.nextInt();
      prom = (c1 + c2 + c3 + c4 + c5 + c6) / 6; 
      System.out.println("Tu promedio es: " + prom);
      if (prom >=70){
          System.out.println("Pasaste la materia");
      } else {
          System.out.println("No pasaste la materia");
      }
      
    }
}
