using System;
namespace U3_P17
{
    internal class U3_P17
    {
        static void Main(string[] args)
        {
            char opcion;
            do
            {
                Console.WriteLine("Bienvenido a una sola ejecucion ");
                Console.WriteLine("¡¡¡Escribe n para salir!!! ");
                opcion = Console.ReadKey().KeyChar;
            } while (opcion != 'n');



        }
    }
}