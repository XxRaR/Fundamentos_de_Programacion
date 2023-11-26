using System;

namespace U4_18
{
    internal class U4_P18
    {
        static void Main(string[] args)
        {
            int[][] diag = {new [] { 1, 2, 3 }, new[] { 4, 5, 6 }, new [] { 7, 8, 9 } };
            Console.WriteLine(" \n Diagonal principal...");
            int sDP = 0, sDS = 0, sDI = 0;
            for (int c = 0; c < diag.Length; c++)
            {
                Console.WriteLine(diag[c][c] + " ");
                sDP += diag[c][c];
            }
            Console.WriteLine("\n Diagonal inversa...");
            for (int i = 0; i < 3; i++)
            {
                Console.WriteLine(diag[i][diag.Length - i - 1] + " ");
                sDI += diag[i][diag.Length - i - 1];
            }
            Console.WriteLine("\n Diagonal secundaria...");
            for (int i = 1; i < 3; i++)
            {
                Console.WriteLine(diag[i][i - 1] + " ");
                sDS += diag[i][i - 1];

            }
            Console.WriteLine($"La suma de los elementos de la diagonal principal es: {sDP}");
            Console.WriteLine($"La suma de los elementos de la diagonal inversa es: {sDI}");
            Console.WriteLine($"La suma de los elementos de la diagonal secundaria es: {sDS}");


        }
    }
}