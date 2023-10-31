using System;
namespace U3_P13
{
    internal class U3_P13
    {
        static void Main(string[] args)
        {
            int c, num, CP = 0, CN = 0;//2

            for (c = 1; c <= 100; c++)
            { //5
                Console.Write("Ingresa un numero entero: ");
                num = Convert.ToInt32(Console.ReadLine());

                if (num >= 0) //5c
                    CP++;

                else
                    CN++;


            }
            Console.WriteLine("La cantidad de numeros positivos es: " + CP);
            Console.WriteLine("La cantidad de numeros positivos es: " + CN);

            

        }
    }
}