/* 10. Realizar un algoritmo que imprima el nombre */
using System;

namespace P_10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            string nombre, apellidos, completo;
            Console.Write("Ingresa tus nombres ");
            nombre = Console.ReadLine();
            Console.Write("Ingresa tus apellidos");
            apellidos = Console.ReadLine();
            completo = nombre + apellidos;

            Console.WriteLine(" * * Bienvenido * * " + completo + " * * ");
            Console.WriteLine(" -- Gracias :)");

        }
    }
}