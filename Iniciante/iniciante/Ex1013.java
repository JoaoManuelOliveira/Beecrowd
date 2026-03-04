package iniciante;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex1013 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		ArrayList<Integer> numeros = new ArrayList<>();
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		numeros.add(a);
		numeros.add(b);
		numeros.add(c);
		int maior = Collections.max(numeros);
		System.out.println(maior + " eh o maior");
	}
}
