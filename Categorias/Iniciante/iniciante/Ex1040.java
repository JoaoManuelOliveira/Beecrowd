package iniciante;

import java.util.Scanner;

public class Ex1040 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, n4, nExame, media1;
		int p1 = 2, p2 = 3, p3 = 4, p4 = 1;
		boolean status = false;

		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		n3 = leia.nextDouble();
		n4 = leia.nextDouble();

		media1 = ((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) / (p1 + p2 + p3 + p4);
		System.out.printf("Media: %.1f\n", media1);

		if (media1 >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media1 >= 5.0 && media1 < 7.0) {
			System.out.println("Aluno em exame.");
			status = true;
		} else {
			System.out.println("Aluno reprovado.");
		}

		if (status == true) {
			nExame = leia.nextDouble();
			double mediaFinal = (media1 + nExame) / 2;
			System.out.printf("Nota do exame: %.1f\n", nExame);

			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", mediaFinal);
		}

	}

}
