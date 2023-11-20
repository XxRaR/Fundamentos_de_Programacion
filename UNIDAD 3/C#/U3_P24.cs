using System;
namespace U3_P24
{
    internal class U3_P24
    {
        static void Main(string[] args)
        {
            int n;

            do
            {
                Console.WriteLine("Ingrese un numero (ingrese un número negativo para detenerse): ");
                n = Convert.ToInt32(Console.ReadLine());

                if (n < 0)
                {
                    break;
                }

                if (n % 2 == 0)
                {
                    Console.WriteLine("El numero " + n + " es un numero par.");
                }
                else
                {
                    Console.WriteLine("El numero " + n + " es un numero impar.");
                }
            } while (true);

            Console.WriteLine("El programa ha finalizado.");
        }
    }
}