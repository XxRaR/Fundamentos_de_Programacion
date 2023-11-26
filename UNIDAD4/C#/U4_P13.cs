using System;

namespace U4_13
{
    internal class U4_P13
    {
        static void Main(string[] args)
        {
            float[,] temp = new float[5,7];
            for (int f = 0; f < 5; f++)
            {
                for (int c = 0; c < 7; c++)
                {
                    Console.WriteLine("Escribe temperatura en (" + f + ", " + c + ")");
                    temp[f,c] = Convert.ToSingle(Console.ReadLine());
                }
            } //ALAMCENA LA CONVERSION A °F
            float[,] tempF = new float[5,7];
            for (int f = 0; f < 5; f++)
            {
                for (int c = 0; c < 7; c++)
                {
                    tempF[f,c] = (temp[f,c] * 9 / 5) + 32;
                    Console.WriteLine("°F en (" + f + ", " + c + ")" + "= " + tempF[f,c] + " ");
                }
                Console.WriteLine();
            }



        }
    }
}