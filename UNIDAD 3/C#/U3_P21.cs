using System;
namespace U3_P21
{
    internal class U3_P21
    {
        static void Main(string[] args)
        {
            int num, NT, I = 1;
            Console.WriteLine("Ingresa el total de numeros: ");
            NT = Convert.ToInt32(Console.ReadLine());
            while (I <= NT)
            {
                Console.WriteLine("Ingresa un numero: ");
                num = Convert.ToInt32(Console.ReadLine());

                if (num > 0)
                    Console.WriteLine("El numero " + num + " elevado al cubo es: " + (num * num * num));
                I++;

            }
           




        }
    }
}