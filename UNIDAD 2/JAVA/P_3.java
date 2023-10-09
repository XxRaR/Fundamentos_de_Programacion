/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_3;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b,h,L,A,P;
        System.out.print("Ingresa la base del triangulo: ");
        b = sc.nextFloat();
        System.out.print("Ingresa la altura del triangulo: ");
        h = sc.nextFloat();
        System.out.print("Ingresa el lado del triangulo: ");
        L = sc.nextFloat();
        A = (b * h) / 2;
        P = L * 3;
        System.out.println("El area del triangulo es: " + A);
        System.out.println("El perimetro del triangulo es: " + P);
        
    }
}
