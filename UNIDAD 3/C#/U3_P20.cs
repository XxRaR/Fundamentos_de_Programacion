using System;
namespace U3_P20
{
    internal class U3_P20
    {
        static void Main(string[] args)
        {
            int i;
            double A = 0;
            for (i = 1; i <= 365; i++)
            {
                double x = Math.Pow(3, i);
                A = A + x;
                Console.WriteLine("El ahorro en el dia " + i + " es: $" + x);

            }
            Console.WriteLine("El ahorro en un año es: $" + A);
          



        }
    }
}