/* 9.Realizar un algoritmo que solicite al usuario
la edad y determine si es mayor o menor, considerando
la mayoria de edad 18 años. */
using System;
namespace P_9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int edad;
            Console.Write("Escribe tu edad ");
            edad = Convert.ToInt32(Console.ReadLine());
            if (edad >= 18)
                {
                Console.WriteLine("Eres mayor de edad ");

            }
            else
            {
                Console.WriteLine("Eres menor de edad ");
            }

        }
    }
}
