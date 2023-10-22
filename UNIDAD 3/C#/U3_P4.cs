using System;

namespace U3_P4
{
    internal class U3_P4
    {
        static void Main(string[] args)
        {

            int mes; //2
            Console.Write("Escrible el mes del año numerico: "); //3
            mes = Convert.ToInt32(Console.ReadLine()); //4
            switch (mes)
            { //5
                case 1:
                    Console.WriteLine("Enero");
                    break;
                case 2:
                    Console.WriteLine("Febrero");
                    break;
                case 3:
                    Console.WriteLine("Marzo");
                    break;
                case 4:
                    Console.WriteLine("Abril");
                    break;
                case 5:
                    Console.WriteLine("Mayo");
                    break;
                case 6:
                    Console.WriteLine("Junio");
                    break;
                case 7:
                    Console.WriteLine("Julio");
                    break;
                case 8:
                    Console.WriteLine("Agosto");
                    break;
                case 9:
                    Console.WriteLine("Septiembre");
                    break;
                case 10:
                    Console.WriteLine("Octubre");
                    break;
                case 11:
                    Console.WriteLine("Noviembre");
                    break;
                case 12:
                    Console.WriteLine("Diciembre");
                    break;


                default:
                    Console.WriteLine(" Erorr!! No existe el mes ingresado");
                    break;

            }
        }
    }
}