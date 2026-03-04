package iniciante;

import java.util.Scanner;

public class Ex1012 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		double pi = 3.14159;

		double areaTriangulo = (a * c) / 2;
		double areaCirculo = pi * (c * c);
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuardado = b * b;
		double areaRetangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuardado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

	}
}
