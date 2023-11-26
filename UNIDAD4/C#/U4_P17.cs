using System;

namespace U4_P17
{
    internal class U4_P17

    {
        static void Main(string[] args)
        {

            int F = 0, C = 0;

            Console.Write("Ingrese el numero de filas: ");
            F = Convert.ToInt32(Console.ReadLine());
            Console.Write("Ingrese el numero de columnas: ");
            C = Convert.ToInt32(Console.ReadLine());




            int[,] numeros = new int[F, C];
            int[,] numeros2 = new int[F, C];
            int[,] res = new int[F, C];

            for (int i = 0; i < F; i++)
            {
                for (int c = 0; c < C; c++)
                {
                    Console.Write($"Elemento [{i + 1},{c + 1}]: ");
                    numeros[i, c] = Convert.ToInt32(Console.ReadLine());
                }
            }
            Console.WriteLine("Ingresa los elementos para la segunda matriz..");

            for (int i = 0; i < F; i++)
            {
                for (int c = 0; c < C; c++)
                {
                    Console.Write($"Elemento2[{i + 1},{c + 1}]: ");
                    numeros2[i, c] = Convert.ToInt32(Console.ReadLine());
                }
            }
            for (int i = 0; i < F; i++)
            {
                for (int c = 0; c < C; c++)
                {
                    res[i, c] = numeros[i, c] * numeros2[i, c];
                    Console.WriteLine("Total de la multiplicacion entre las dos matrices: " + res[i, c]);
                }
            }
            
            Console.WriteLine();
        }
    }
}