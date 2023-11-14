using System;
namespace U4_P1
{
    internal class U4_P1
    {
        static void Main(string[] args)
        {
            //DECLARAR ARREGLOS Y ASIGNAR VALORES
            int[] edades = new int[] {17,19,18,18,17};
            //SINTAXIS SIMPLIFICADA
            int[] edades2 = new int[] { 17, 19, 18, 18, 18 };
            //IMPRESION EL CONTADOR ME AYUDA A INDICAR EL INDICE
            for (int i = 0; i < edades.Length; i++)
            {
               
                Console.WriteLine("Indice: " + i + " es: " + edades[i]);
                if (edades[i] >= 18)
                    Console.WriteLine("Eres mayor!!!.");
                else
                    Console.WriteLine("Eres menor!!!.");
            }
        }
    }
}
