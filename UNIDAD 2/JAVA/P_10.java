/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_10;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author fatim
 */
public class P_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos;
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Bienvenid@ " + nombre + " " + apellidos + " " + ";)");
    }
}
