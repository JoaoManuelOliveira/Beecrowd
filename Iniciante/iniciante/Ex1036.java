package iniciante;

import java.util.Scanner;

public class Ex1036 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		double delta = (b * b) - (4 * a * c);
		double finalFormula = 2 * a;
		double bhaskara1 = (-b + Math.sqrt(delta)) / finalFormula;
		double bhaskara2 = (-b - Math.sqrt(delta)) / finalFormula;

		if ((finalFormula == 0) || (delta < 0)) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%n", bhaskara1);
			System.out.printf("R2 = %.5f%n", bhaskara2);
		}

	}
}
