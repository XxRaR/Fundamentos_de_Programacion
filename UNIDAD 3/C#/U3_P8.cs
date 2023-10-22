using System;
namespace U3_P8
{
    internal class U3_P8
    {
        static void Main(string[] args)
        {
            int a, b;
            Console.Write("Escribe numero 1: ");
            a = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe numero 2: ");
            b = Convert.ToInt32(Console.ReadLine());
            if (a > b)
            {
                Console.WriteLine("El numero " + a + " Es mayor que " + b);
            }
            else if (b > a)
            {
                Console.WriteLine("El numero " + a + " Es menor que " + b);
            }
        }
    }
}