//ex1017
// vm = velocidade media, d = distancia gf = gasto fixo do carro
package iniciante;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		int tempo, vm, d;
		double combustivel;
		Scanner leia = new Scanner(System.in);

		tempo = leia.nextInt();
		vm = leia.nextInt();
		d = vm * tempo;
		combustivel = d / 12.0;

		System.out.printf("%.3f\n", combustivel);
	}
}
