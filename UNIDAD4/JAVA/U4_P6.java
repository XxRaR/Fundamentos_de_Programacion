/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4_p6;
import java.util.Scanner;
/**
 *
 * @author fatim
 */
public class U4_P6 {

    public static void main(String[] args) {

        Scanner L = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de numeros a procesar: ");
        int CN = L.nextInt();
        L.nextLine();

    
        int[] numeros = new int[CN];
       
        for (int c = 0; c < CN; c++) {
            System.out.print("Ingrese el numero #" + (c + 1) + ": ");
            numeros[c] = L.nextInt();
            L.nextLine();
        }
            
          
          
          
       int temp;
       for(int i=0; i<numeros.length; i++){
        for(int j=i+1; j<numeros.length; j++){
            if(numeros[i]>numeros[j])
            {
                temp=numeros[i];
                numeros[i]=numeros[j];
                numeros[j]=temp;
            }
        }
        
        System.out.print(numeros[i] + ", ");
    }
       
    }
    
}
 