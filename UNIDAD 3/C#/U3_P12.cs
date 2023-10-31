using System;
namespace U3_P12
{
    internal class U3_P12
    {
        static void Main(string[] args)
        {
            int c, total, num;//2
            Console.Write("Escribe el total de numeros a procesar: ");//3
            total = Convert.ToInt32(Console.ReadLine());//4
            for (c = 1; c <= total; c++)
            { //5
                Console.WriteLine("Escribe numero: "); //5a
                num = Convert.ToInt32(Console.ReadLine()); //5b
                if (num % 2 == 0) //5c
                    Console.WriteLine("Par");
           else //5d
                    Console.WriteLine("Impar");

            }


            
         
        }
    }
}