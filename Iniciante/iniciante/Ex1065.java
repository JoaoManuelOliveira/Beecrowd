package iniciante;

import java.util.Scanner;

public class Ex1065 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[5];
		int pares = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
			if (numeros[i] % 2 == 0) {
				pares += 1;
			}
		}
		System.out.println(pares + " valores pares");
	}
}
