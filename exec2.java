import java.util.Locale;
import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVet = sc.nextInt();
		int i = 0;
		int quantPar = 0;

		double[] vet = new double[tamanhoVet];

		for (i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}

		for (i = 0; i < vet.length; i++) {
			double testePar = vet[i] % 2;
			if (testePar == 0) {
				System.out.printf("%.0f%n", vet[i]);
				quantPar++;
			}
		}

		System.out.println(quantPar);

		sc.close();
	}

}
