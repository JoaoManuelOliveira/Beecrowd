package iniciante;

import java.util.Scanner;

public class Ex1015 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1, y1, x2, y2;
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		double formula = (Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2);
		double distancia = Math.sqrt(formula);
		System.out.printf("%.4f%n", distancia);

	}
}
