package iniciante;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1045 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double a, b, c;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		double[] lados = { a, b, c };
		Arrays.sort(lados);
		a = lados[2];
		b = lados[1];
		c = lados[0];

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (a * a == b * b + c * c) {
				System.out.println("TRIANGULO RETANGULO");
			} else if (a * a > b * b + c * c) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (a == b || a == c || b == c) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

	}
}
