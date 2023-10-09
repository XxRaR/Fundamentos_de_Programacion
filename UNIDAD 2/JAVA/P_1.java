/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_1;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float c1,c2,c3,c4,c5,c6, prom;
        System.out.println("Ingresa una calificacion: ");
        c1 = sc.nextFloat();
        System.out.println("Ingresa una calificacion: ");
        c2 = sc.nextFloat();
        System.out.println("Ingresa una calificacion: ");
        c3 = sc.nextFloat();
        System.out.println("Ingresa una calificacion: ");
        c4 = sc.nextFloat();
        System.out.println("Ingresa una calificacion: ");
        c5 = sc.nextFloat();
        System.out.println("Ingresa una calificacion: ");
        c6 = sc.nextFloat();
        prom = (c1 + c2  + c3 + c4 + c5 + c6) / 6;
        System.out.print("El promedio del estudiantes es de: " + prom);
    }
}
