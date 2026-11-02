package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * *Exercício 6*
		 * 
		 * Uma loja quer criar um sistema simples de caixa.
		 * 
		 * O programa deve apresentar as seguintes opções:
		 * 
		 * 1 - Registrar venda 
		 * 2 - Consultar total vendido 
		 * 3 - Encerrar o caixa
		 * 
		 * Quando o usuário registrar uma venda, o programa deve perguntar o valor e
		 * acrescentá-lo ao total vendido.
		 * 
		 * O menu deve continuar aparecendo até que o usuário escolha encerrar o caixa.
		 * 
		 * Ao encerrar, o programa deve mostrar o valor total vendido e quantas vendas
		 * foram realizadas.
		 */

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double total = 0;
		int qtdVendas = 0;
		String menu = """
		1 - Registrar venda 
		2 - Consultar total vendido 
		3 - Encerrar o caixa
				""";
		
		System.out.println(menu);
		System.out.println("Digite uma opção: ");
		int opcao = scan.nextInt();
		
		while (opcao != 3) {
			
			switch (opcao) {

			case 1 -> {
				System.out.println("Informe o valor da venda: ");
				double valor = scan.nextDouble();
				total += valor;
				qtdVendas++;
			}
			case 2 -> {
				System.out.println("Total vendido até o momento: R$ " + total);
			}
			case 3 -> {
				break;
			}

			default -> {
				System.out.println("Opção inválida.");
			}

			}
			System.out.println(menu);
			System.out.println("Digite uma opção: ");
			opcao = scan.nextInt();
			
		}
	System.out.println("Total vendido: R$ " + total);
	System.out.println("Vendas totais: " + qtdVendas);
		
	}
}
