﻿/* 1.Realizar un algoritmo que determine el promedio
de 6 calificaciones. */
using System;
namespace P_1
{
    internal class Promedio
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6;
            float promedio;

            Console.Write("Escribe calificacion 1: ");
            c1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 2: ");
            c2 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 3: ");
            c3 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 4: ");
            c4 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 5: ");
            c5 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 6: ");
            c6 = Convert.ToInt32(Console.ReadLine());
            //PASO- CALCULA PROMEDIO
            promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
            //PASO- IMPRIME EL RESULTADO
            Console.WriteLine("Tu promedio es: " + promedio);


        }
    }
}