using System;
namespace U3_P16
{
    internal class U3_P16
    {
        static void Main(string[] args)
        {
            int c = 1, horas;
            double pago, sueldo;
            while (c <= 20)
            {
                Console.Write("Escribe la cantidad de horas trabajadas: ");
                horas = Convert.ToInt32(Console.ReadLine());
                Console.Write("Escribe el sueldo por hora: $");
                pago = Convert.ToDouble(Console.ReadLine());
                sueldo = horas * pago;
                Console.WriteLine("El sueldo semanal del trabajador -" + c + "- es: $" + sueldo);
                c++;
            }



        }
    }
}