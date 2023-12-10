using System;

namespace U5_P8
{
    internal class U5_P8
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el número de lanzamientos: ");
            int nL = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < nL; i++)
            {
                int RD1 = LanzarDado();
                int RD2 = LanzarDado();

                Console.WriteLine("Lanzamiento " + (i + 1) + ": Dado 1 = " + RD1 + ", Dado 2 = " + RD2);
            }
        }

        public static int LanzarDado()
        {
            Random random = new Random();
            return random.Next(1, 7); // Rango de 1 a 6, inclusivo
        }
    }
}