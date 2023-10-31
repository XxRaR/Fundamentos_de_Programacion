/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p20;

/**
 *
 * @author fatim
 */
public class U3_P20 {

    public static void main(String[] args) {
        int i;
        double A=0;
        for(i=1; i<=365; i++){
            double x=Math.pow(3,i);
            A= A + x;
            System.out.println("El ahorro en el dia " + i + " es: $" + x);
            
        }
        System.out.println("El ahorro en un año es: $" + A);
    }
}
