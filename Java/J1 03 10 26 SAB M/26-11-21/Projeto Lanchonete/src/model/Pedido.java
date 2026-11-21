package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

	public List<Prato> itens = new ArrayList<>();
	public Double total = calcularTotal();

	public Double calcularTotal() {
		Double somatorio = 0.0;

		for (Prato item : itens) {
			somatorio += item.preco;
		}

		return somatorio;
	}

	public void montarPedido() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 1 para adicionar sanduíche");
		System.out.println("Digite 2 para adicionar coxinha");
		System.out.println("Digite 3 para adicionar pastel");
		System.out.println("Digite 4 para encerrar");
		int opcao = scan.nextInt();
		scan.nextLine();

		switch (opcao) {
		case 1 -> {
			System.out.println("Digite o nome do sanduíche: ");
			Sanduiche s = new Sanduiche();
			s.nome = scan.nextLine();
			s.preco = 9.99;
			itens.add(s);

		}
		case 2 -> {
			System.out.println("Digite o nome da coxinha: ");
			Coxinha c = new Coxinha();
			c.nome = scan.nextLine();
			c.preco = 7.99;
			itens.add(c);
		}

		}

	}

}
