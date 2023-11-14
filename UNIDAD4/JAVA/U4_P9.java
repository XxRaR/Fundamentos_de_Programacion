/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p9;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P9 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de nombres y apellidos: ");
        int C = L.nextInt();
        L.nextLine();

    
        String[] nombres = new String[C];
        String[] apellidos = new String[C];

        for (int i = 0; i < C; i++) {
            System.out.print("Ingrese el nombre #" + (i + 1) + ": ");
            nombres[i] = L.nextLine();
        }

        
        for (int i = 0; i < C; i++) {
            System.out.print("Ingrese el apellido #" + (i + 1) + ": ");
            apellidos[i] = L.nextLine();
        }

       
        String[] NC = new String[C];

       
        for (int i = 0; i < C; i++) {
           NC[i] = nombres[i] + " " + apellidos[i];
        }

       
        System.out.println("Nombres completos:");
        for (String nombreCom : NC) {
            System.out.println(nombreCom);
        }
    }
}
 