/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_7;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class P_7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a,b,s,r,d,m;
        System.out.print("Ingresa un numero: ");
        a = sc.nextDouble();
        System.out.print("Ingresa otro numero: ");
        b = sc.nextDouble();
        s = a + b;
        r = a - b;
        m = a * b;
        d = a / b;
        System.out.println("El resultado de la suma es: " + s);
        System.out.println("El resultado de la resta es: " + r);
        System.out.println("El resultado de la multiplicacion es: " + m);
        System.out.println("El resultado de la division es: " + d);
    }
}
