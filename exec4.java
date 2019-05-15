import java.util.Locale;
import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVet = sc.nextInt();

		double[] vet = new double[tamanhoVet];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}

		double media = vet[0];

		for (int i = 1; i < vet.length; i++) {
			media = media + vet[i];
		}

		media = media / vet.length;

		System.out.printf("%.3f%n", media);

		for (int i = 0; i < vet.length; i++) {
			if (media > vet[i]) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}

		sc.close();
	}

}
