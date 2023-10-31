/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p12;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3_P12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //1
        int c, total, num;//2
        System.out.print("Escribe el total de numeros a procesar: ");//3
        total = sc.nextInt();//4
        for (c=1; c<=total; c++){ //5
            System.out.println("Escribe numero: "); //5a
            num = sc.nextInt(); //5b
           if (num % 2 == 0) //5c
               System.out.println("Par");
           else //5d
               System.out.println("Impar");
        
        }
    }
}
