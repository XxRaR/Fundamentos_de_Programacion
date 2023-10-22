using System;
namespace U3_P9
{
    internal class U3_P9
    {
        static void Main(string[] args)
        {

        int hE, hS, TH;
        double TC;
        Console.Write("Ingresa la hora de entrada (en formato 24hrs): ");
        hE = Convert.ToInt32(Console.ReadLine());
        Console.Write("Ingresa la hora de salida (en formato 24hrs): ");
        hS = Convert.ToInt32(Console.ReadLine());
            TH = hS - hE;
            Console.WriteLine("El total de hora es: " + TH);
            if (TH<=2)
            {
                TC = TH * 5;
                Console.WriteLine("El total a cobrar es de: $" + TC);

            }else if (TH<=3 && TH>2)
            {
                TC = TH * 4;
                Console.WriteLine("El total a cobrar es de: $" + TC);
            } else if (TH<=5 && TH>3)
            {
                TC = TH * 3;
                Console.WriteLine("El total a cobrar es de: $" + TC);
            } else if (TH<=10 && TH >5)
            {
                TC = TH * 2;
                Console.WriteLine("El total a cobrar es de: $" + TC);
            }
        }

    }
}