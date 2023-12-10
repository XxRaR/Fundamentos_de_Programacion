/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_p4;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U5_P4 {

    public static void main(String[] args) {
      Scanner L = new Scanner(System.in);
   System.out.print("Ingrese un número: ");
        int n = L.nextInt();

        if (Primo(n)) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }

    }

    public static boolean Primo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
