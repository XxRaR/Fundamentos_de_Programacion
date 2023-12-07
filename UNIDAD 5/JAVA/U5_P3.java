/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_p3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U5_P3 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        double x,y;
        System.out.println("Escribe el valor para x: ");
        x = L.nextDouble();
        System.out.println("Escribe el valor para y: ");
        y = L.nextDouble();
        System.out.println("Resultado ecuacion1: " + ecuacion1(x,y));
        System.out.println("Resultado ecuacion2: " + ecuacion2(x,y));
        
    }
    public static double ecuacion1(double x, double y){
        double r;
        r = Math.pow(x,y) + (2*Math.pow(y, 4)); 
        return r;
    }
    public static double ecuacion2(double x, double y){
        double r;
        r = Math.sqrt(Math.pow(x, 4) + 5*y);
        return r;
    }
}
