/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_p9;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U5_P9 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        double SD, F;
        int DT,DA;
   
        System.out.print("Ingrese el sueldo diario del trabajador: ");
        SD = L.nextDouble();

        
        System.out.print("Ingrese el tiempo laborado en días: ");
        DT = L.nextInt();
      
       F= CalcularFiniquito(SD, DT);

        
        System.out.println("El finiquito del trabajador es: $" + F);
 
    }

    public static double CalcularFiniquito(double SD, int DT) {
       
        return SD * DT;
    }
}
 