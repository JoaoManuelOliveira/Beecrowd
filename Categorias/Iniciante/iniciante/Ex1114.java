package iniciante;

import java.util.Scanner;

public class Ex1114 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String senha = "2002", tentativa;

		tentativa = in.next();

		while (!tentativa.equals(senha)) {
			System.out.println("Senha Invalida");
			tentativa = in.next();

		}
		System.out.println("Acesso Permitido");
	}
}