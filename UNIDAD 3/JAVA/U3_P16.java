/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Progrma 14
*Algoritmo que determine el sueldo semanal de 20 empleados
*solicitando la cantidad de horas trabajadas
 y su respectivo pago por hora */
package com.mycompany.u3_p16;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=1, horas;
        double pago, sueldo;
        while (c<=20){
            System.out.print("Escribe la cantidad de horas trabajadas: ");
            horas = sc.nextInt();
            System.out.print("Escribe el sueldo por hora: $");
            pago = sc.nextDouble();
            sueldo = horas * pago;
            System.out.println("El sueldo del trabajador -" + c + "- es: $" + sueldo);
            c++;
        }
    }
}
