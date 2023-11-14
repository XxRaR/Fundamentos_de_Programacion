/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p3;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P3 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
                double F, K;
            int t;
            
            //SOLICITANDO EL TAMAÑO DE ARREGLO, SE CREA EL ARREGLO CON ESE TAMAÑO
            System.out.println("Escribe las temperaturas a procesar: ");
            t = L.nextInt();
            double[] C = new double[t];
            //SOLICITAR LOS VALORES 
            for ( int x = 0; x < C.length; x++)
            {
                System.out.println("Ingresa la temperatura " + x );
                C[x] = L.nextInt();
            }
            //Operacion
            for (int i = 0; i < C.length; i++)
            {
                
                K = C[i]+273.15;
                System.out.println("La temperatura de grados celsius " + C[i] + "°C" + " a grados kelvin es de: " + K + "°K");
                F = ((K-273.15)* 9/5) + 32;
                //F = (C[i]*9/5)+32; 
                System.out.println("La temperatura de " + K + "°K a grados Fahrenheit es de: " + F + "°F");
            }
           
             
        }
    }

