package iniciante;

import java.util.Scanner;

public class Ex1046 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inicio = in.nextInt();
		int fim = in.nextInt();
		int duracao = 0;

		if (fim > inicio) {
			duracao = fim - inicio;
		} else if (fim <= inicio) {
			duracao = (24 - inicio) + fim;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	}
}
