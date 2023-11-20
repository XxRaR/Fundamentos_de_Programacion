using System;

namespace U4_P7
             { 
    internal class U4_P7    
            { 
        static void Main(string[] args)
        {
            double mediana, media, suma = 0;

            Console.WriteLine("Escribe la cantidad de números: ");
            int CN = Convert.ToInt32(Console.ReadLine());
            
            double[] num = new double[CN];


            for (int i = 0; i < CN; i++)
            {
                Console.WriteLine("Escribe el numero #" + i + ": ");
                num[i] = Convert.ToDouble(Console.ReadLine());
            }



            foreach (double numero in num)
            {
                suma += numero;
            }
            media = suma / CN;




            if (CN % 2 == 0)
            {

                mediana = (num[CN / 2 - 1] + num[CN / 2]) / 2.0;
            }
            else
            {

                mediana = num[CN / 2];
            }


            Console.WriteLine("Media: " + media);
            Console.WriteLine("Mediana: " + mediana);
         
        }
    }
}