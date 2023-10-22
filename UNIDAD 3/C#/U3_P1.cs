using System;

namespace U3_P1
{
    internal class U3_P1
    {
        static void Main(string[] args)
        {

            int edad; //2
            Console.Write("Escribe tu edad: "); //3
            edad = Convert.ToInt32(Console.ReadLine()); //4
            if (edad >= 18) //5 

                Console.WriteLine("Eres mayor de edad!"); //5
        else //6
                Console.WriteLine("Eres menor de edad!"); //6
        }
    }
}
