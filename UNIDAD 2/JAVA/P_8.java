/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_8;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double P,a,A;
        System.out.print("Ingresa el permitro del hexagono: ");
        P = sc.nextDouble();
        System.out.print("Ingresa el apotema del hexagono: ");
        a = sc.nextDouble();
        A = (P * a) / 2;
        System.out.println("El area del hexagono es de: " + A);
        
    }
}
