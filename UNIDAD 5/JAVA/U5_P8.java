/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_p8;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U5_P8 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);

        
        System.out.print("Ingrese el número de lanzamientos: ");
        int nL = L.nextInt();

       
        for (int i = 0; i < nL; i++) {
            int RD1 = LanzarDado();
            int RD2 = LanzarDado();

            System.out.println("Lanzamiento " + (i + 1) + ": Dado 1 = " + RD1 + ", Dado 2 = " + RD2);
        }

      
    }

  
    public static int LanzarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
 