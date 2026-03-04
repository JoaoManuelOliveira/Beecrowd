package iniciante;

import java.util.Scanner;

public class Ex1019 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, horas, minutos, segundos = 0, aux;
		n = in.nextInt();
		horas = n / 3600;
		minutos = (n % 3600) / 60;
		segundos = n % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

	}
}
