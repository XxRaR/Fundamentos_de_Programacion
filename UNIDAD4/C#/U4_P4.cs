using System;

namespace U4_P4
{
    internal class U4_P4
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de numeros a procesar: ");
            int CN = Convert.ToInt32(Console.ReadLine());
          

            int[] numeros = new int[CN];


            int TN = 0;
            for (int c = 0; c < CN; c++)
            {
                Console.Write("Ingrese el numero #" + (c + 1) + ": ");
                numeros[c] = Convert.ToInt32(Console.ReadLine());
            }



            for (int i = 0; i < numeros.Length; i++)
            {
                if (numeros[i] < 0)
                {
                    TN++;
                }
            }


            Console.WriteLine("Total de números negativos: " + TN);
            
        }
    }
}
