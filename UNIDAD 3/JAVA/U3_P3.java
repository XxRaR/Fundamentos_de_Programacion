/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_p3; //1
import java.util.Scanner; //1
/**
 *
 * @author LaboratorioLTI2
 */
public class U3_P3 { //1

    public static void main(String[] args) { //2
        Scanner sc = new Scanner(System.in); //1
        int dia; //2
        System.out.print("Escrible el dia de la semana numerico: "); //3
        dia = sc.nextInt(); //4
        switch (dia){ //5
        case 1:
        System.out.println("Lunes");
        break;
        case 2:
        System.out.println("Martes");
        break;
        case 3:
        System.out.println("Miercoles");
        break;
        case 4:
        System.out.println("Jueves");
        break;
        case 5:
        System.out.println("Viernes");
        break;
        case 6:
        System.out.println("Sabado");
        break;
        case 7:
        System.out.println("Domingo");
        break;
        default:
            System.out.println("No existe el dia ingresado");
        } //6
        
    } //6
    
} //6
