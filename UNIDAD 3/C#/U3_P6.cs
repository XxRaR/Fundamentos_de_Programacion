using System;

namespace U3_P6
{
    internal class U3_P6
    {
        static void Main(string[] args)
        {

            int num;
            Console.Write("Ingresa un numero entero positivo: ");
            num = Convert.ToInt32(Console.ReadLine());
            if (num >= 0)
            {
                if (num % 2 == 0)
                {
                    Console.WriteLine("El numero " + num + " es par ");

                }
                else
                {
                    Console.WriteLine("El numero " + num + " es impar");

                }


            }
            else
            {
                Console.WriteLine("Por favor ingresa un numero entero positivo");
            }
            

        }
    }
}