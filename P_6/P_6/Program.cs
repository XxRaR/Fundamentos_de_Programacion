/* 6. Realizar un algoritmo que a partir del precio
de 3 (con iva incluido) productos calcule el iva 
subtotal y el total. */
using System;
namespace P_6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float p1, p2, p3, t, s, i;
            Console.Write("Ingresa el precio del primer producto: ");
            p1 = Convert.ToSingle(Console.ReadLine()); 
            Console.Write("Ingresa el precio del segundo producto: ");
            p2 = Convert.ToSingle(Console.ReadLine());
            Console.Write("Ingresa el precio del tercer producto: ");
            p3 = Convert.ToSingle(Console.ReadLine());
            t = p1+p2+p3;
            i = t * 0.16f;
            s = t-i;
            Console.WriteLine("El total es: $" + t + " El iva es: $" + i + " El subtotal es: $" + s);

        }
    }
}