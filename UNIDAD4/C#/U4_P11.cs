using System;

namespace U4_P11
{
    internal class U4_P11
    {
        static void Main(string[] args)
        {
            /*
       int [] [] calf= new int [3] [3];
       //FILA, COLUMNA

       calf [0,0]=5;
       calf [0,1]=7;
       calf [0,2]=9;
       calf [1,0]=6;
       calf [1,1]=8;
       calf [1,2]=7;
       calf [2,0]=10;
       calf [2,1]=3;
       calf [2,2]=1;
       */
            int[,] calf = {{5, 7, 9},
                        {6, 8, 7},
                        {10, 3, 1}};
            Console.Write(calf[0, 0] + ",");
            Console.Write(calf[0, 1] + ",");
            Console.WriteLine(calf[0, 2] + ",");
            Console.Write(calf[1, 0] + ",");
            Console.Write(calf[1, 1] + ",");
            Console.WriteLine(calf[1, 2] + ",");
            Console.Write(calf[2, 0] + ",");
            Console.Write(calf[2, 1] + ",");
            Console.Write(calf[2, 2]);


        }
    }
}