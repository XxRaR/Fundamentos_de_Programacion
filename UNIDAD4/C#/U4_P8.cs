using System;

namespace U4_P8
{
    internal class U4_P8
    {
        static void Main(string[] args)
        {
            int CE;

            Console.Write("Escribe la cantidad de elementos en el arreglo: ");
            CE = Convert.ToInt32(Console.ReadLine());
           
            int[] A = new int[CE];

            for (int i = 0; i < CE; i++)
            {
                Console.Write("Escribe el elemento #" + i + ": ");
                A[i] = Convert.ToInt32(Console.ReadLine());
            }


            Console.WriteLine("Elementos Pares:");
            foreach (int elemento in A)
            {
                if (elemento % 2 == 0)
                {
                    Console.WriteLine(elemento);
                }
            }

            Console.WriteLine("Elementos Impares:");
            foreach (int elemento in A)
            {
                if (elemento % 2 != 0)
                {
                    Console.WriteLine(elemento);
                }
            }
           
        }
    }
}