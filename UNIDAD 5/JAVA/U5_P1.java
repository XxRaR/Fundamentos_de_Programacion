/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_p1;

/**
 *
 * @author LaboratorioLTI2
 */
public class U5_P1 {

    public static void main(String[] args) {
         System.out.println( "suma = " + suma (7,8) );
         System.out.println( "resta = " + resta (3,25));
         System.out.println( "multiplicación = " + multiplicacion (4,3));
         System.out.println( "división = " + division (3, 21));

    }
//Método o función 
    public static int suma(int a, int b){

        int s = a + b;
        return s;
    }
    public static int resta(int a, int b){
        int r = a - b;
        return r;
    }
    public static int multiplicacion(int a, int b){
        int m = a * b;
        return m;
    }
    public static int division(int a, int b){
        int d  = a / b;
        return d;
    }
}