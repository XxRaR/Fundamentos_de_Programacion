using System;

namespace U4_P6
{
    internal class U4_P6
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de numeros a procesar: ");
            int CN = Convert.ToInt32(Console.ReadLine());
            


            int[] numeros = new int[CN];

            for (int c = 0; c < CN; c++)
            {
                Console.Write("Ingrese el numero #" + (c + 1) + ": ");
                numeros[c] = Convert.ToInt32(Console.ReadLine());
                
            }




            int temp;
            for (int i = 0; i < numeros.Length; i++)
            {
                for (int j = i + 1; j < numeros.Length; j++)
                {
                    if (numeros[i] > numeros[j])
                    {
                        temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
                //Ordenados
                Console.Write( numeros[i] + ", ");
            }
            
        }
    }
}