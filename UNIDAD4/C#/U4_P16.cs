using System;

namespace U4_P16
{
    internal class U4_P16
    {
        static void Main(string[] args)
        {

            char[,] letras= { { 'a','b','c' }, {'d', 'e', 'f'}};
            int fila = letras.GetLength(0);
            int columna = letras.GetLength(1);

            for (int f = 1; f >= 0; f--)
            {
                for (int c = 2; c >= 0; c--)
                {
                    Console.Write(letras[f, c] + ",");
                } //FIN FOR COLUMNA
                Console.WriteLine();
            }//FIN FOR FILA

        }//FIN MAIN
    }//FIN CLASS
}//FIN NAMESPACE