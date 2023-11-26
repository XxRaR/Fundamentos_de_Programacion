using System;

namespace U4_P14
{
    internal class U4_P14

    {
        static void Main(string[] args)
        {

            int F = 0, C = 0, suma = 0;

            Console.Write("Ingrese el numero de filas: ");
            F = Convert.ToInt32(Console.ReadLine());
            Console.Write("Ingrese el numero de columnas: ");
            C = Convert.ToInt32(Console.ReadLine());




            int[,] numeros = new int[F, C];


            for (int i = 0; i < F; i++)
            {
                for (int c = 0; c < C; c++)
                {
                    Console.Write($"Elemento [{i + 1},{c + 1}]: ");
                    numeros[i, c] = Convert.ToInt32(Console.ReadLine());
                    
                }
            }
            
            for(int i = 0;i < F; i++)
            {
                for(int c = 0;c < C; c++)
                {
                    suma += numeros[i, c];
                }
            }
                    
               

                Console.WriteLine("La suma de los valores es: " + suma);
            



        }
    }
}