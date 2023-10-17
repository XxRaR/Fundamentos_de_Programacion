/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p4;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3_P4 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); //1
        int mes; //2
        System.out.print("Escrible el mes del año numerico: "); //3
        mes = sc.nextInt(); //4
        switch (mes){ //5
        case 1:
        System.out.println("Enero");
        break;
        case 2:
        System.out.println("Febrero");
        break;
        case 3:
        System.out.println("Marzo");
        break;
        case 4:
        System.out.println("Abril");
        break;
        case 5:
        System.out.println("Mayo");
        break;
        case 6:
        System.out.println("Junio");
        break;
        case 7:
        System.out.println("Julio");
        break;
        case 8:
        System.out.println("Agosto");
        break;
        case 9:
        System.out.println("Septiembre");
        break;
        case 10:
        System.out.println("Octubre");
        break;
        case 11:
        System.out.println("Noviembre");
        break;
        case 12:
        System.out.println("Diciembre");
        break;
        
        
        default:
            System.out.println(" Erorr!! No existe el mes ingresado");
    }
}
}
