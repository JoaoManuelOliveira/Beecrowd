package iniciante;

import java.util.Scanner;

public class Ex1066 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
		}

		int pares = 0, impares = 0, positivos = 0, negativos = 0;
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {
				pares += 1;
			} else {
				impares += 1;
			}

			if (numeros[i] > 0) {
				positivos += 1;
			} else if (numeros[i] < 0) {
				negativos += 1;
			}
		}
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

	}
}
