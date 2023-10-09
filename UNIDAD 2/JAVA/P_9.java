/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_9;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.print("Usted es mayor de edad");
        }
        else {
            System.out.print("Usted es menor de edad");
            
        }
       
        }
}
