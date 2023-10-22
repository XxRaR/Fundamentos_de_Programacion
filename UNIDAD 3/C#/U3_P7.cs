using System;

namespace U3_P7
{
    internal class U3_P7
    {
        static void Main(string[] args)
        {

            float temp;
            Console.WriteLine("Ingresa la temperatura actual: ");
            temp = Convert.ToSingle(Console.ReadLine());
            if (temp > 27)
            {
                Console.WriteLine("Hace calor " + temp + "°C");
            }
            else if (temp > 20 && temp < 27)
            {
                Console.WriteLine("Clima Agradable " + temp + "°C");
            }
            else if (temp < 20)
            {
                Console.WriteLine("Hace frio " + temp + "°C");
            }

        

        }
    }
}