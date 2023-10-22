/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p8;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P8 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.print("Escribe numero 1: ");
        a = sc.nextInt();
        System.out.print("Escribe numero 2: ");
        b = sc.nextInt();
        if (a>b){
            System.out.println("El numero " + a + " Es mayor que " + b);
        } else if (b>a) {
            System.out.println("El numero " + b + " Es mayor que " + a);
        } 
    }
}