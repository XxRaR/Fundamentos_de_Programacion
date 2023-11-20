using System;

namespace U4_P9
{
    internal class U4_P9
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de nombres y apellidos: ");
            int C = Convert.ToInt32(Console.ReadLine());
           


            String[] nombres = new String[C];
            String[] apellidos = new String[C];

            for (int i = 0; i < C; i++)
            {
                Console.Write("Ingrese el nombre #" + (i + 1) + ": ");
                nombres[i] = Console.ReadLine();
            }


            for (int i = 0; i < C; i++)
            {
                Console.Write("Ingrese el apellido #" + (i + 1) + ": ");
                apellidos[i] = Console.ReadLine();
            }


            String[] NC = new String[C];


            for (int i = 0; i < C; i++)
            {
                NC[i] = nombres[i] + " " + apellidos[i];
            }


            Console.WriteLine("Nombres completos:");
            foreach (String nombreCom in NC)
            {
                Console.WriteLine(nombreCom);
            }
            
        }
    }
}