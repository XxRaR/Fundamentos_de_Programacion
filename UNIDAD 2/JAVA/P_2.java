/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_2;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,a;
        System.out.println("Ingresa un valor para Y: ");
        y = sc.nextInt();
        System.out.println("Ingresa un valor para A: ");
        a = sc.nextInt();
        //Se realiza la formula x= y+a+3
        x = y + a + 3;
        System.out.print("El resultado de la formula es: " + x);
        
        
    }
}
