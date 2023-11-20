/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p2;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P2 {

    public static void main(String[] args) {
        Scanner L=new Scanner(System.in);
double suma = 0.0, prom;
            int t;
            //SOLICITANDO EL TAMAÑO DE ARREGLO, SE CREA EL ARREGLO CON ESE TAMAÑO
            System.out.println("Escribe las calificaciones a procesar: ");
            t = L.nextInt();
            int[] calif = new int[t];
            //SOLICITAR LOS VALORES 
            for(int x=0; x<calif.length; x++)
            {
                System.out.println("Escribe la calificacion " + x + " :");
                calif[x] = L.nextInt();
            }
            for (int i = 0; i < calif.length; i++)
            {
                suma += calif[i];
            }
            //CALCULAR EL PROMEDIO
            prom = suma / calif.length;
            System.out.println("El promedio es: " + prom);
        }
    }

