using System;
using System.Globalization;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            String[] mercadoria = new String[N];
            double[] precoCompra = new Double[N], precoVenda = new Double[N];
            for (int i = 0; i < mercadoria.Length; i++)
            {
                String[] vet = Console.ReadLine().Split(' ');
                mercadoria[i] = vet[0];
                precoCompra[i] = double.Parse(vet[1], CultureInfo.InvariantCulture);
                precoVenda[i] = double.Parse(vet[2], CultureInfo.InvariantCulture);
            }

            int lucroAbaixo10 = 0, lucroEntre10e20 = 0, lucroAcima20 = 0;
            for (int i = 0; i < mercadoria.Length; i++)
            {
                double porcentagemLucro = (precoVenda[i] - precoCompra[i]) / precoCompra[i] * 100;

                if (porcentagemLucro < 10)
                {
                    lucroAbaixo10++;
                }
                else if (porcentagemLucro <= 20)
                {
                    lucroEntre10e20++;
                }
                else
                {
                    lucroAcima20++;
                }
            }

            double valorCompra = 0, valorVenda = 0;
            for (int i = 0; i < mercadoria.Length; i++)
            {
                valorCompra += precoCompra[i];
                valorVenda += precoVenda[i];
            }

            double lucro = valorVenda - valorCompra;

            Console.WriteLine("Lucro abaixo de 10%: " + lucroAbaixo10);
            Console.WriteLine("Lucro entre 10% e 20%: " + lucroEntre10e20);
            Console.WriteLine("Lucro acima de 20%: " + lucroAcima20);
            Console.WriteLine("Valor total de compra: " + valorCompra.ToString("F2", CultureInfo.InvariantCulture));
            Console.WriteLine("Valor total de venda: " + valorVenda.ToString("F2", CultureInfo.InvariantCulture));
            Console.WriteLine("Lucro total: " + lucro.ToString("F2", CultureInfo.InvariantCulture));
        }
    }
}
