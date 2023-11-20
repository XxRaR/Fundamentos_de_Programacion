using System;

namespace U3_P25
{
    internal class U3_P25
    {
        static void Main(string[] args)
        {
            double n1, resultado = 0;
            char operador;

            do
            {
                Console.WriteLine("Ingrese el operador (+, -, *, /) o 'q' para salir:");
                operador = Console.ReadLine()[0];
                if (operador =='q' || operador == 'Q')
                {
                    Console.WriteLine("Saliendo del programa...");
                    break;
                }

                Console.Write("Ingrese el primer número: ");
                n1 = Convert.ToDouble(Console.ReadLine());








                switch (operador)
                {
                    case '+':
                        resultado = resultado+ n1 ;
                        break;
                    case '-':
                        resultado = resultado-n1;
                        break;
                    case '*':
                        resultado = resultado * n1 ;
                        break;
                    case '/':
                        if (n1 != 0)
                        {
                            resultado = resultado / n1 ;
                        }
                        else
                        {
                            Console.WriteLine("Error!! No se puede dividir entre cero.");
                            continue;
                        }
                        break;
                    default:
                        Console.WriteLine("Operador no válido. Por favor, presione +, -, *, o /");
                        continue;
                }

                Console.WriteLine("El resultado es: " + resultado);

               




            } while (true);
            
        }
    }
}