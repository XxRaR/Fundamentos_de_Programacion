/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p7;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P7 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        double mediana, media, suma=0;
        
        System.out.print("Escribe la cantidad de números: ");
        int CN = L.nextInt();
       L.nextLine(); 
        double[] num = new double[CN];

      
        for (int i = 0; i < CN; i++) {
            System.out.print("Escribe el numero #" + i + ": ");
            num[i] = L.nextDouble();
        }

     
     
        for (double numero : num) {
            suma += numero;
        }
      media = suma / CN;

      


        if (CN % 2 == 0) {
        
            mediana = (num[CN / 2 - 1] + num[CN / 2]) / 2.0;
        } else {
            
            mediana = num[CN / 2];
        }

       
        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
    }
}
