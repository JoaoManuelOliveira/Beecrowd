//ex1018
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		int n, qtd;
		double[] notas = { 100, 50, 20, 10, 5, 2, 1 };

		Scanner leia = new Scanner(System.in);

		n = leia.nextInt();

		if (n > 1000000) {
			n = leia.nextInt();
		}
		System.out.println(n);
		for (double nota : notas) {
			qtd = (int) (n / nota);
			n = n % (int) nota;
			System.out.printf("%d nota(s) de R$ %.2f\n", qtd, nota);
		}

	}
}