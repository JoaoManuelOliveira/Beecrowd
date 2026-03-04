package iniciante;

import java.util.Scanner;

public class Ex1073 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for (int i = 2; i <= n; i++) {
			int formula = (int) Math.pow(i, 2);
			if (i % 2 == 0) {
				System.out.println(i + "^2" + " = " + formula);
			}
		}
	}
}
