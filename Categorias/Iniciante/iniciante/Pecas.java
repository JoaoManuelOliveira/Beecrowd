//ex1010
package iniciante;

import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {

		int cod1;
		int n1;
		double valor1;
		double total1;
		int cod2;
		int n2;
		double valor2;
		double total2;

		Scanner leia = new Scanner(System.in);

		cod1 = leia.nextInt();
		n1 = leia.nextInt();
		valor1 = leia.nextDouble();
		total1 = n1 * valor1;

		cod2 = leia.nextInt();
		n2 = leia.nextInt();
		valor2 = leia.nextDouble();
		total2 = n2 * valor2;

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (total1 + total2));
	}
}
