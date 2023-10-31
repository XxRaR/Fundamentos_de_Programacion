using System;
namespace U3_P19
{
    internal class U3_P19
    {
        static void Main(string[] args)
        {
            int c = 1, num, MC = 0, CMC = 0, N = 0, n;//2
            Console.WriteLine("Ingresa LA CANTIDAD OBTENER: ");
            num = Convert.ToInt32(Console.ReadLine());
            while (c <= num)
            { //5
                Console.WriteLine("Ingresa un numero natural: ");
                n = Convert.ToInt32(Console.ReadLine());

                if (n > 0) //5c
                    MC++;

                else if (n < 0)
                    CMC++;
                else
                    N++;
                c++;

            }
            Console.WriteLine("La cantidad de numeros mayores a cero son: " + MC);
            Console.WriteLine("La cantidad de numeros menores a cero son: " + CMC);
            Console.WriteLine("La cantidad de numeros iguales a cero son: " + N);
            


        }
    }
}