/* 4.Realizar un algoritmo que convierta de grados
centrigrados a grados fahrenheit */
using System;
namespace P_SEIS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float GC, GF;
            Console.Write("Ingresa los grados centigrados ");
            GC = Convert.ToSingle(Console.ReadLine());
            GF = (GC * 9 / 5) + 32;
            Console.Write($"La temperatura en grados fahrenheit es: {GF}°F");

        }
    }
}
