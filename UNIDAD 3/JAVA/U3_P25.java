/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p25;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U3_P25 {

    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        
        double n1, resultado=0;
        String operador;
        char opcion=1;
        do {
            System.out.println("Ingrese el operador (+, -, *, /) o 'q' para salir:");
            operador = A.next();
            if (operador.equals("q")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
             n1 = A.nextDouble();

            
            

            

            

            switch (operador) {
                case "+":
                    resultado = n1 + resultado;
                    break;
                case "-":
                    resultado = n1 - resultado;
                    break;
                case "*":
                    resultado = n1 * resultado;
                    break;
                case "/":
                    if (n1 != 0) {
                        resultado = n1 / resultado;
                    } else {
                        System.out.println("Error!! No se puede dividir entre cero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operador no válido. Por favor, presione +, -, *, o /");
                    continue; 
            }

            System.out.println("El resultado es: " + resultado);
            
            
                System.out.println("Presione 1 para continuar, presione 2 para salir....");
                opcion = A.next().charAt(0);
            

        } while (opcion == '1' );


        
    }
}
