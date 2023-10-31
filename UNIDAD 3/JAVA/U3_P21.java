/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p21;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, NT,I=1;
        System.out.print("Ingresa el total de numeros: ");
        NT = sc.nextInt();
        while (I<=NT){
            System.out.print("Ingresa un numero: ");
            num = sc.nextInt();
                        
            if (num > 0)
                System.out.println("El numero " + num + " elevado al cubo es: " + (num*num*num));
            I++;

        }
    }
}
