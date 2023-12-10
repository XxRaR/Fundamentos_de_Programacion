using System;

namespace U5_P4
{
    internal class U5_P4
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese un número: ");
            int n = Convert.ToInt32(Console.ReadLine());

            if (EsPrimo(n))
            {
                Console.WriteLine(n + " es un número primo.");
            }
            else
            {
                Console.WriteLine(n + " no es un número primo.");
            }
        }

        public static bool EsPrimo(int n)
        {
            if (n <= 1)
            {
                return false;
            }

            for (int i = 2; i <= Math.Sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    return false;
                }
            }

            return true;
        }
    }
}