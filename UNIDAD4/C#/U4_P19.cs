﻿using System;

namespace U4_P19
{
    internal class U4_P19
        
    {
        static void Main(string[] args)
        {
            
            int EI = 0, EP = 0, F=0, C=0; 
           
                Console.Write("Ingrese el numero de filas: ");
                F = Convert.ToInt32(Console.ReadLine());
                Console.Write("Ingrese el numero de columnas: ");
                C = Convert.ToInt32(Console.ReadLine());

            int[,] numeros = new int[F, C];

            for (int i = 0; i<F; i++)
            {
                for(int c = 0; c<C; c++)
                {
                    Console.Write($"Elemento [{i+1},{c+1}]: ");
                    numeros[i, c]=Convert.ToInt32(Console.ReadLine());
                }
            }



            Console.WriteLine("Elementos Pares:");
            foreach (int elemento in numeros)
            {
                if (elemento % 2 == 0)
                {
                    
                    EP++;
                    Console.WriteLine(elemento);
                }
            }

            Console.WriteLine("Elementos Impares:");
            foreach (int elemento in numeros)
            {
                if (elemento % 2 != 0)
                {
                    
                    EI++;
                    Console.WriteLine(elemento);
                }
            }

            Console.WriteLine("Total de números pares: " + EP);
            Console.WriteLine("Total de números impares: " + EI);

        }
    }
}
