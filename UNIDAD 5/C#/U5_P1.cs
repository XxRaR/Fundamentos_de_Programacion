using System;

namespace U5_P1
{
    internal class U5_P1
    {
        static void Main(string[] args)
        {
            Console.WriteLine("suma = " + Suma(7, 8));
            Console.WriteLine("resta = " + Resta(3, 25));
            Console.WriteLine("multiplicación = " + Multiplicacion(4, 3));
            Console.WriteLine("división = " + Division(3, 21));
        }

        // Método o función
        public static int Suma(int a, int b)
        {
            int s = a + b;
            return s;
        }

        public static int Resta(int a, int b)
        {
            int r = a - b;
            return r;
        }

        public static int Multiplicacion(int a, int b)
        {
            int m = a * b;
            return m;
        }

        public static double Division(double a, int b)
        {
            double d = a / b;
            return d;
        }
    }
}