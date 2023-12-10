using System;

namespace U5_P9
{
    internal class U5_P9
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el sueldo diario del trabajador: ");
            double SD = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el tiempo laborado en días: ");
            int DT = Convert.ToInt32(Console.ReadLine());

            double F = CalcularFiniquito(SD, DT);

            Console.WriteLine("El finiquito del trabajador es: $" + F);
        }

        public static double CalcularFiniquito(double SD, int DT)
        {
            return SD * DT;
        }
    }
}