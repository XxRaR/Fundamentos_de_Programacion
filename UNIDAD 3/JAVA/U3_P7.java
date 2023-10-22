/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p7;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float temp;
        System.out.print("Ingresa la temperatura actual: ");
        temp = sc.nextFloat();
        if (temp > 27){
            System.out.println("Hace calor " + temp + "°C");
        } else if(temp > 20 && temp < 27 ) {
                System.out.println("Clima Agradable " + temp + "°C");
                } else if ( temp <20){
                    System.out.println("Hace frio " + temp + "°C");
                } 
    }
}
