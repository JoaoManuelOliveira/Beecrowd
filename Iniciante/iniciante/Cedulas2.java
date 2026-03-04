//ex1021
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Cedulas2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		double n;
		int qtd;
		double[] notas = { 100, 50, 20, 10, 5, 2 };
		double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

		Scanner leia = new Scanner(System.in);

		n = leia.nextDouble();

		if (n > 1000000) {
			n = leia.nextDouble();
		}
		// notas
		System.out.println("NOTAS:");
		for (double nota : notas) {
			qtd = (int) (n / nota);
			n = n % nota;
			System.out.printf("%d nota(s) de R$ %.2f\n", qtd, nota);
		}
		// moedas
		System.out.println("MOEDAS:");
		for (double moeda : moedas) {
			qtd = (int) (n / moeda);
			n = n % moeda;
			n = Math.round(n * 100.0) / 100.0;
			System.out.printf("%d moeda(s) de R$ %.2f\n", qtd, moeda);

		}
	}
}