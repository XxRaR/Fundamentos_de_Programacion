using System;

namespace U4_P10
{
    internal class U4_P10
    {
        static void Main(string[] args)
        {
            int CP;
            double Lp, Tc = 0;
            Console.Write("Ingrese la cantidad de países: ");
            CP = Convert.ToInt32(Console.ReadLine());
            



            String[] P = new String[CP];

            for (int i = 0; i < CP; i++)
            {
                Console.Write("Ingrese el nombre del país #" + (i + 1) + ": ");
                P[i] = Console.ReadLine();
            }



            foreach (String palabra in P)
            {
                Tc += palabra.Replace(" ", " ").Length;
            }


            Lp = Tc / P.Length;


            Console.WriteLine("La longitud promedio de las palabras de los países es: " + Lp);
         
        }
    }
}