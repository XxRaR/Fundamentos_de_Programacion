/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_6;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double p1, p2, p3, t, s, ivaT;
        final double i=0.16;
        System.out.print("Ingresa el precio del producto 1: ");
        p1 = sc.nextDouble();
        
        System.out.print("Ingresa el precio del producto 2: ");
        p2 = sc.nextDouble();
         
        System.out.print("Ingresa el precio del producto 3: ");
        p3 = sc.nextDouble();
         
         System.out.println("El precio del producto 1 es: $" + p1);
         System.out.println("El precio del producto 2 es: $" + p2); 
         System.out.println("El precio del producto 3 es: $" + p3);
        t = p1 + p2 + p3;
        ivaT = t * i;
        s = t - ivaT;
        System.out.println("El total es: $" + t);
        System.out.println("El iva incluido es: $" + ivaT);
        System.out.println("El subtotal es: $" + s);
    }
}
