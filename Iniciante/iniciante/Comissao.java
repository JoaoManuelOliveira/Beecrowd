//ex1009
//exemplo de salario com comissao de 15 sobre as vendas
//print com 2 casas apos a virgula

package iniciante;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		
		String nome;
		double salario;
		double vendas;
		double comissao;
		
		Scanner leia = new Scanner(System.in);
		
		nome = leia.next();
		salario = leia.nextDouble();
		vendas = leia.nextDouble();
		
		comissao = salario + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n" , comissao);
	

	}

}
