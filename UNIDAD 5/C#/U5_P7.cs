using System;

namespace U5_P7
{
    internal class U5_P7
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el monto a calcular: $");
            double M = Convert.ToDouble(Console.ReadLine());

            double I = CalcularIVA(M);
            double T = CalcularTotal(M, I);
            double ST = CalcularSubTotal(T, I);

            Console.WriteLine("IVA (16%) es: $" + I);
            Console.WriteLine("Total es: $" + T);
            Console.WriteLine("Subtotal es: $" + ST);
        }

        public static double CalcularIVA(double M)
        {
            double PorI = 0.16;
            return M * PorI;
        }

        public static double CalcularTotal(double M, double I)
        {
            return M + I;
        }

        public static double CalcularSubTotal(double T, double I)
        {
            return T - I;
        }
    }

}