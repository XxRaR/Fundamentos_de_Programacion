using System;

namespace U5_P3
{
    internal class U5_P3
    {
        static void Main(string[] args) { 
         Console.WriteLine("Escribe el valor para x: ");
        double x = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Escribe el valor para y: ");
        double y = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Resultado ecuacion1: " + Ecuacion1(x, y));
        Console.WriteLine("Resultado ecuacion2: " + Ecuacion2(x, y));
    }

    public static double Ecuacion1(double x, double y)
    {
        double r = Math.Pow(x, y) + (2 * Math.Pow(y, 4));
        return r;
    }

    public static double Ecuacion2(double x, double y)
    {
        double r = Math.Sqrt(Math.Pow(x, 4) + 5 * y);
        return r;
    }
}
}