//ex1014
package iniciante;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {

		int km;
		double g, media;
		// km = k percorridos, g (gasolina)= combustivel

		Scanner leia = new Scanner(System.in);

		km = leia.nextInt();
		g = leia.nextDouble();
		media = km / g;

		System.out.printf("%.3f km/l\n", media);

	}
}
