using System;
namespace U4_P2_1
{
    internal class U4_P2_1
    {
        static void Main(string[] args)
        {
           
            double suma = 0.0, prom;
            int t;
            //SOLICITANDO EL TAMAÑO DE ARREGLO, SE CREA EL ARREGLO CON ESE TAMAÑO
            Console.WriteLine("Escribe las calificaciones a procesar: ");
            t = Convert.ToInt32(Console.ReadLine());
            int[] calif = new int[t];
            //SOLICITAR LOS VALORES 
            for(int x=0; x<calif.Length; x++)
            {
                Console.WriteLine("Escribe la calificacion " + x + " :");
                calif[x] = Convert.ToInt32(Console.ReadLine());
            }
            for (int i = 0; i < calif.Length; i++)
            {
                suma += calif[i];
            }
            //CALCULAR EL PROMEDIO
            prom = suma / calif.Length;
            Console.WriteLine("El promedio es: " + prom);
        }
    }
}