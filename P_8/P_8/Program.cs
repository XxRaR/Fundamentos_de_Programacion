/* 8. Realizar un algoritmo que calcule el área de
un hexágono. */
using System;
namespace P_8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            decimal A,P,a;
            Console.Write("Ingresa el perimetro del hexagono: ");
            P = Convert.ToDecimal(Console.ReadLine());
            Console.Write("Ingresa el apotema del hexagono: ");
            a = Convert.ToDecimal(Console.ReadLine());
            
            A = (a * P) / 2;
           
            Console.WriteLine("El area del hexagono es: " + A);

        }
    }
}