/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p5;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3_P5 {

    public static void main(String[] args) { //1
        Scanner sc = new Scanner(System.in); //1
        double p1,p2,p3,total; //2
        System.out.print("Escribe precio 1: $"); //3
        p1 = sc.nextDouble(); //4
        System.out.print("Escribe precio 2: $"); //3
        p2 = sc.nextDouble(); //4
        System.out.print("Escribe precio 3: $"); //3
        p3 = sc.nextDouble(); //4
        total = p1 + p2 + p3; //5
        if(total >= 1500){ //6
            total = total - (total * 0.30); 
            System.out.println("El total (30%desc): $" + total); 
        } else if (total < 1500 && total >= 1000){ //7
            total = total - (total * 0.20);
            System.out.println("El total (20%desc): $" + total); 
        } else if (total < 1000 && total >= 700){ //8
            total = total - (total * 0.10);
            System.out.println("El total (10%desc): $" + total);
        } else { //9
            System.out.println("El total es: $" + total);
        }
         
    } //10
} //10
