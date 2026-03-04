package iniciante;

import java.util.Scanner;

public class Ex1070 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 0;
		int i = n;

		while (count < 6) {
			if (i % 2 != 0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
}
