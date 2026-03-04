package iniciante;

import java.util.Scanner;

public class Ex1047 {

	public static void main(String[] args) {

		int hi, hf, mi, mf, h, m;
		Scanner leia = new Scanner(System.in);

		do {
			hi = leia.nextInt();
			mi = leia.nextInt();
			hf = leia.nextInt();
			mf = leia.nextInt();
		} while (hi < 0 && mi < 0 && hf < 0 && mf < 0);

		h = hf - hi;
		m = mf - mi;

		if (hi == hf && mi == mf) {
			h = 24;
			m = 0;
		}
		System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");

	}

}
