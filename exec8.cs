using System;
using System.Globalization;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            double[] altura = new double[N];
            String[] sexo = new String[N];

            for (int i = 0; i < altura.Length; i++)
            {
                String[] vet = Console.ReadLine().Split(' ');
                altura[i] = double.Parse(vet[0], CultureInfo.InvariantCulture);
                sexo[i] = vet[1];
            }

            double maiorAltura = altura[0], menorAltura = altura[0];
            int quantMulher = 0, quantHomem = 0;
            double alturaMediaMulher = 0;

            for (int i = 0; i < altura.Length; i++)
            {
                if (altura[i] > maiorAltura)
                {
                    maiorAltura = altura[i];
                }
                else if (altura[i] < menorAltura)
                {
                    menorAltura = altura[i];
                }
                if (sexo[i] == "F")
                {
                    quantMulher++;
                    alturaMediaMulher += altura[i];
                }
                else if (sexo[i] == "M")
                {
                    quantHomem++;
                }
            }

            alturaMediaMulher /= quantMulher;

            Console.WriteLine("Menor altura = " + menorAltura.ToString("F2", CultureInfo.InvariantCulture));
            Console.WriteLine("Maior altura = " + maiorAltura.ToString("F2", CultureInfo.InvariantCulture));
            Console.WriteLine("Media das alturas das mulheres = " + alturaMediaMulher.ToString("F2", CultureInfo.InvariantCulture));
            Console.WriteLine("Numero de homens = " + quantHomem);

        }
    }
}
