using System;

namespace U3_P2
{
    internal class U3_P2
    {
        static void Main(string[] args)
        {

            int c1, c2, c3, c4, c5, c6;
            float prom;
            Console.Write("Escribe calificacion 1: ");
            c1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 2: ");
            c2 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 3: ");
            c3 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 4: ");
            c4 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 5: ");
            c5 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe calificacion 6: ");
            c6 = Convert.ToInt32(Console.ReadLine());
            prom = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
            Console.WriteLine("Tu promedio es: " + prom);
            if (prom >= 70)
            {
                Console.WriteLine("Pasaste la materia");
            }
            else
            {
                Console.WriteLine("No pasaste la materia");
            }
        }
    }
}
