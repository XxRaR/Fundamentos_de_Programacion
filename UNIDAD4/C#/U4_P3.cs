using System;
namespace U4_P3
{
    internal class U4_P3
    {
        static void Main(string[] args)
        {

            double F, K;
            int t;
            
            //SOLICITANDO EL TAMAÑO DE ARREGLO, SE CREA EL ARREGLO CON ESE TAMAÑO
            Console.WriteLine("Escribe las temperaturas a procesar: ");
            t = Convert.ToInt32(Console.ReadLine());
            double[] C = new double[t];
            //SOLICITAR LOS VALORES 
            for ( int x = 0; x < C.Length; x++)
            {
                Console.WriteLine("Ingresa la temperatura " + x );
                C[x] = Convert.ToInt32(Console.ReadLine());
            }
            //Operacion
            for (int i = 0; i < C.Length; i++)
            {
                
                K = C[i]+273.15;
                Console.WriteLine("La temperatura de grados celsius " + C[i] + "°C" + " a grados kelvin es de: " + K + "°K");
                F = ((K-273.15)* 9/5) + 32;
                //F = (C[i]*9/5)+32; 
                Console.WriteLine("La temperatura de " + K + "°K a grados Fahrenheit es de: " + F + "°F");
            }
           
             
        }
    }
}
