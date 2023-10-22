/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p1;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3_P1 { //1

    public static void main(String[] args) { //1
        Scanner sc = new Scanner(System.in); //1
        int edad; //2
        System.out.print("Escribe tu edad: "); //3
        edad = sc.nextInt(); //4
        if (edad >=18) //5 
            
            System.out.println("Eres mayor de edad!"); //5
        else //6
            System.out.println("Eres menor de edad!"); //6
    } //7
} //7
