using System;
namespace U3_P18
{
    internal class U3_P18
    {
        static void Main(string[] args)
        {
            double S = 1500, I = 0.10, i;
            int años = 6;
            for (i = 1; i <= años && años > 0; i++)
            {
                S = (S * I) + S;
                Console.WriteLine("El salario anual" + i + " es de: $" + S);

            }
            Console.WriteLine("El salario a los 6 años es: " + S);

        }
    }
}