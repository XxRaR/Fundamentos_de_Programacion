/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Conte el codigo como si el salario hubiese sido anual
package com.mycompany.u3_p18;

/**
 *
 * @author fatim
 */
public class U3_P18 {

    public static void main(String[] args) {
        double S= 1500, I=0.10,i, s = 0;
        int años=6;
        for (i=1; i<=años && años>0; i++){
        S = (S*I) + S;
        System.out.println("El salario anual" + i + " es de: $" + S);        
        s=s+S;    
    }
        System.out.println("El salario a los 6 años es: $" + s);
         

         
        
        
    }
}
