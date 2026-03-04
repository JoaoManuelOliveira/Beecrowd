package iniciante;

import java.util.Scanner;

public class Ex1072 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numeros = new int[n];
		int intervaloIn = 0, intervaloOut = 0;

		for (int i = 0; i < n; i++) {
			numeros[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (numeros[i] >= 10 && numeros[i] <= 20) {
				intervaloIn++;
			} else {
				intervaloOut++;
			}
		}
		System.out.println(intervaloIn + " in");
		System.out.println(intervaloOut + " out");

	}
}
