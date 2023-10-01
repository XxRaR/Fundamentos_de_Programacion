/* 2.Realizar un algoritmo que permita calcular la 
siguiente formula: x=y+a+3 */
using System;
namespace P_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x, y, a;
            Console.Write("Escribe el valor para y: ");
            y = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe el valor para a: ");
            a = Convert.ToInt32(Console.ReadLine());
            //Se calcula la formula x=y+a+3
            x = y + a + 3;
            Console.Write($"El valor de x es: {x}");
        }
    }
}