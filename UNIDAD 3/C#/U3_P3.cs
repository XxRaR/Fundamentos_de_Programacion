using System;

namespace U3_P3
{
    internal class U3_P3
    {
        static void Main(string[] args)
        {

            int dia; //2
            Console.Write("Escrible el mes del año numerico: "); //3
            dia = Convert.ToInt32(Console.ReadLine()); //4
            switch (dia)
            { //5
                case 1:
                    Console.WriteLine("Lunes");
                    break;
                case 2:
                    Console.WriteLine("Martes");
                    break;
                case 3:
                    Console.WriteLine("Miercoles");
                    break;
                case 4:
                    Console.WriteLine("Jueves");
                    break;
                case 5:
                    Console.WriteLine("Viernes");
                    break;
                case 6:
                    Console.WriteLine("Sabado");
                    break;
                case 7:
                    Console.WriteLine("Domingo");
                    break;

                default:
                    Console.WriteLine(" Erorr!! No existe el dia ingresado");
                    break;

            }
        }
    }
}