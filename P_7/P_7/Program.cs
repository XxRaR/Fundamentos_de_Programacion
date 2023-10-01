/* 7. Realizar un algoritmo realice las operaciones
basicas de una calculadora (suma,resta,multiplica
ción, división) a partir de 2 números. */
using System;
namespace P_7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float a, b,s,r,d,m;
            Console.Write("Ingresa un numero ");
            a = Convert.ToSingle(Console.ReadLine());
            Console.Write("Ingresa otro numero ");
            b = Convert.ToSingle(Console.ReadLine());
            s = a + b;
            r = a - b;
            d = a / b;
            m = a * b;
            Console.Write($"El resultado de la suma es: {s} ");
            Console.Write($"El resultado de la resta es: {r} ");
            Console.Write($"El resultado de la division es: {d} ");
            Console.Write($"El resultado de la multiplicacion es: {m} ");



        }
    }
}