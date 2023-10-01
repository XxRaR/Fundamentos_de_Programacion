/* 3.Realizar un algoritmo que calcule el area y 
perimetro de un triangulo */
using System;
namespace P_3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            decimal b, h, p, A, l;
            Console.Write("Ingresa la altura del triangulo: ");
            h = Convert.ToDecimal(Console.ReadLine());
            Console.Write("Ingresa la base del triangulo: ");
            b = Convert.ToDecimal(Console.ReadLine());
            Console.Write("Ingresa el lado del triangulo: ");
            l = Convert.ToDecimal(Console.ReadLine());
            A = (b * h) / 2;
            p = l + l + l;
            Console.WriteLine("El area del triangulo es: " + A);

            Console.Write($"El perimetro del triangulo es: " + p);
        }
    }
}