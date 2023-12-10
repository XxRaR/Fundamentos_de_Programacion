using System;

namespace U5_P6
{
    internal class U5_P6
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de números que desea en la secuencia Fibonacci: ");
            int NT = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Secuencia Fibonacci:");
            for (int i = 0; i < NT; i++)
            {
                Console.Write(Fibonacci(i) + " ");
            }
        }

        public static int Fibonacci(int n)
        {
            if (n <= 1)
            {
                return n;
            }
            else
            {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        }
    }
}