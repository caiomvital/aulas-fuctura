package model;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String menu = """
				1 - Vender sanduíche
				2 - Vender coxinha
				3 - Consultar total vendido
				4 - Consultar quantidade de vendas
				5 - Encerrar o caixa
				""";

		Caixa caixa1 = new Caixa();
		caixa1.totalVendido = 0.0;
		caixa1.quantidadeVendas = 0;

		System.out.println(menu);
		System.out.println("Digite sua opção: ");
		Integer opcao = scan.nextInt();
		scan.nextLine();

		switch (opcao) {
		case 1 -> {
			System.out.println("Digite o nome do sanduíche: ");
			String nome = scan.nextLine();
			System.out.println("Digite o preço do sanduíche: ");
			Double preco = scan.nextDouble();
			scan.nextLine();
			System.out.println("Digite o tipo de pão: ");
			String tipoPao = scan.nextLine();
			System.out.println("Digite o recheio do sanduíche: ");
			String recheio = scan.nextLine();
			Sanduiche s = new Sanduiche();
			s.nome = nome;
			s.preco = preco;
			s.tipoPao = tipoPao;
			s.recheio = recheio;
			caixa1.totalVendido += s.preco;
			caixa1.quantidadeVendas++;
		}
		case 2 -> {
			System.out.println("Digite o nome da coxinha: ");
			String nome = scan.nextLine();
			System.out.println("Digite o preço da coxinha: ");
			Double preco = scan.nextDouble();
			scan.nextLine();
			System.out.println("Digite o recheio da coxinha: ");
			String recheio = scan.nextLine();
			Coxinha c = new Coxinha(nome, preco, recheio);
			caixa1.totalVendido += c.preco;
			caixa1.quantidadeVendas++;

		}
		}

	}
}
