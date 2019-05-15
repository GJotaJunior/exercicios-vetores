import java.util.Locale;
import java.util.Scanner;

public class exec7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVet = sc.nextInt();

		String[] nome = new String[tamanhoVet];
		double[] nota1 = new double[tamanhoVet];
		double[] nota2 = new double[tamanhoVet];
		double[] resultado = new double[tamanhoVet];

		for (int i = 0; i < nome.length; i++) {
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			resultado[i] = (nota1[i] + nota2[i]) / 2;
		}

		System.out.println("Alunos aprovados:");

		for (int i = 0; i < nome.length; i++) {
			if (resultado[i] >= 6) {
				System.out.println(nome[i]);
			}
		}

		sc.close();

	}

}
