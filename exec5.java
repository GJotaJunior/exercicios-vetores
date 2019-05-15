import java.util.Locale;
import java.util.Scanner;

public class exec5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVet = sc.nextInt();

		double[] vet = new double[tamanhoVet];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}

		double testePar = 0;
		double par = 0;
		int media = 0;

		for (int i = 0; i < vet.length; i++) {
			testePar = vet[i] % 2;
			if (testePar == 0) {
				par = par + vet[i];
				media++;
			}
		}

		par = par / media;

		System.out.printf("%.1f%n", par);

		sc.close();

	}

}
