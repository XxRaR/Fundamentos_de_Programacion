/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_5;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double P,M; 
        System.out.print("Ingresa una medida en metros: ");
        M = sc.nextDouble();
        System.out.println("Los metros son: " + M + "m");
        P = (M * 3.281);
        System.out.println("Los pies son: " + P + "ft");
    }
}
