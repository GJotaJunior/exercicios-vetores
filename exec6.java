import java.util.Locale;
import java.util.Scanner;

public class exec6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVet = sc.nextInt();

		double[] idade = new double[tamanhoVet];
		String[] nome = new String[tamanhoVet];

		int pos = 0;

		for (int i = 0; i < idade.length; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextDouble();
		}

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > idade[pos]) {
				pos = i;
			}
		}

		System.out.println("Pessoa mais velha: " + nome[pos]);

		sc.close();

	}

}
