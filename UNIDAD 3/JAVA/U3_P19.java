/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p19;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int c=1, num, MC=0,CMC=0, N=0,n;//2
         System.out.print("Ingresa LA CANTIDAD OBTENER: ");
            num = sc.nextInt();
        while (c<=num){ //5
           System.out.print("Ingresa un numero natural: ");
            n = sc.nextInt();
            
           if (n > 0) //5c
               MC++;
               
           else if (n < 0)
               CMC++;
           else 
               N++;
        c++;   
        
        }
           System.out.println("La cantidad de numeros mayores a cero son: " + MC );
           System.out.println("La cantidad de numeros menores a cero son: " + CMC );
           System.out.println("La cantidad de numeros iguales a cero son: " + N );

    }
}

    
