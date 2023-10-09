/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_4;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float GC, GF;
        System.out.print("Ingresa los grados centigrados: ");
      
        GC = sc.nextFloat();
         System.out.println("Los grados centigrados son: " + GC + "°C");
        GF = (GC * 9 / 5) + 32;
        System.out.print("Los grados Fahrenheit son: " + GF + "°F");
    }
}
