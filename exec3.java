import java.util.Locale;
import java.util.Scanner;

public class exec3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVet = sc.nextInt();

		double[] vet1 = new double[tamanhoVet];

		int i = 0;
		for (i = 0; i < vet1.length; i++) {
			vet1[i] = sc.nextDouble();
		}

		double[] vet2 = new double[tamanhoVet];

		for (i = 0; i < vet2.length; i++) {
			vet2[i] = sc.nextDouble();
		}

		double[] vet3 = new double[tamanhoVet];

		for (i = 0; i < vet3.length; i++) {
			vet3[i] = vet1[i] + vet2[i];
			System.out.println((int) vet3[i]);
		}

		sc.close();
	}

}
