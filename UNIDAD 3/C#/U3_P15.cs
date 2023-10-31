using System;
namespace U3_P15
{
    internal class U3_P15
    {
        static void Main(string[] args)
        {
            int c = 1, suma = 0; //2
            while (c <= 20)
            { //3
                suma = suma + c; //3a
                c++; //3b
            } //FIN WHILE
            Console.WriteLine("suma = " + suma); //4

        }
    }
}