using System;
namespace U3_P10
{
    internal class U3_P10
    {
        static void Main(string[] args){
            int hT,hE,hM=40;
            double ph,sueldo,phE,phM;
            Console.Write("Ingresa las horas trbajadas (en formato 24hrs): ");
            hT = Convert.ToInt32(Console.ReadLine());
            Console.Write("Ingresa el pago por hora: $");
            ph = Convert.ToInt32(Console.ReadLine());
            hE = hT - 40;
            if (hT<=40)
            {
                sueldo = hT * ph;
                Console.WriteLine("El sueldo del trabajador a la semana por trabajar " + hT + "hrs es: $" + sueldo);

            } else if (hT > 40)
            {
                phE = (ph * 2) * hE; phM = ph * hM;
                sueldo = phE + phM; 
                Console.WriteLine("El sueldo del trabajador a la semana por trabajar " + hT + "hrs es: $" + sueldo);

            }


        }
    }
}