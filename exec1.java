import java.util.Locale;
import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVet = sc.nextInt();
		int i = 0;
		double[] vet = new double[tamanhoVet];

		for (i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		double maior = vet[0];
		int posicao = 0;

		for (i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			}
		}

		System.out.printf("%.1f%n", maior);
		System.out.println(posicao);

		sc.close();
	}

}
