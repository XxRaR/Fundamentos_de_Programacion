using System;

namespace U4_20
{
    internal class U4_P20
    {
        static void Main(string[] args)
        {
            int [,]num = { { 5, 6 }, { 8, 9 } };
            int [,] resultado = new int[2, 2];
            for (int f = 0; f < 2; f++)
            {
                for (int c = 0; c < 2; c++)
                {
                    resultado[f,c] = num[f,c] * num[f,c];

                }
            }
            for (int f = 0; f < 2; f++)
            {
                for (int c = 0; c < 2; c++)
                {
                    Console.Write(resultado[f,c] + ", ");


                }
                Console.WriteLine();
            }
            
        }
    }
}