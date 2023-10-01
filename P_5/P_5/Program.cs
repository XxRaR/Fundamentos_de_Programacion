/* 5.Realizar un algoritmo que convierta de metros
a pies. */
using System;
namespace P_5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            float m, p;
            

            Console.Write("Ingresa la longitud m: ");
            m = Convert.ToSingle(Console.ReadLine());
            p = (m * 3.281f);
            Console.Write($"La conversion de metros a pies es: {p} Pie");
        }
    }
}