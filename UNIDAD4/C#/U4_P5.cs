using System;

namespace U4_P5
{
    internal class U4_P5
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de frutas a procesar: ");
            int CF = Convert.ToInt32(Console.ReadLine());

            

            String[] FO = new String[CF];
            String[] FI = new String[CF];

            for (int i = 0; i < CF; i++)
            {
                Console.Write("Ingrese la fruta #" + (i + 1) + ": ");
                FO[i] = Console.ReadLine();
            }
            for (int c = 0; c < FO.Length; c++)
            {
                FI[c] = FO[FO.Length - 1 - c];
            }
            //Impresion de arreglo 1
            foreach (String elemento1 in FO)
            {
                Console.Write(elemento1 + ", ");
            }
            Console.WriteLine();
            //Impresion de arreglo inverso
            foreach (String elemento in FI)
            {
                Console.Write(elemento + ", ");
            }
            Console.WriteLine();
            
        }
    }
}