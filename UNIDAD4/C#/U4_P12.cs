using System;

namespace U4_P12
{
    internal class U4_P12
    {
        static void Main(string[] args)
        {
           
            int[,] calf = {{5, 7, 9, 5 }, {6, 8, 7,5}, {10, 3, 1,5}};
            int fila = calf.GetLength(0);
            int columna = calf.GetLength(1);
     
            for (int f = 0; f < fila; f++)
            {
                for (int c = 0; c < columna; c++)
                {
                    Console.Write(calf[f, c] + ",");
                } //FIN FOR COLUMNA
                Console.WriteLine();
            }//FIN FOR FILA

        }//FIN MAIN
    }//FIN CLASS
}//FIN NAMESPACE