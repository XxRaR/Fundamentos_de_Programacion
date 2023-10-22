/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p10;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hT, hE,hM=40;
        double ph, sueldo,phE,phM;
        System.out.println("Ingresa las horas trabajadas (en formato 24hrs): ");
        hT = sc.nextInt();
        System.out.print("Ingresa el pago por hora: $");
        ph = sc.nextInt();
         hE=hT-40;
       
        
        
        if(hT<=40){
            sueldo = hT*ph;
            System.out.println("El sueldo del trabajador a la semana por trabajar " + hT + " hrs es: $" + sueldo);
        }
        else if(hT > 40){
         phE = (ph * 2) * hE; phM=hM*ph;  
         sueldo = phE+phM;
         System.out.println("El sueldo del trabajador a la semana por trabajar " + hT + " hrs es: $" + sueldo);
        }
    }
}
