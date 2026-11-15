package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();
		
		System.out.println("Quantos produtos serão cadastrados? ");
		int qtdProdutos = scan.nextInt(); scan.nextLine();

		for(int i = 0; i < qtdProdutos; i++) {
			Produto p = new Produto();
			System.out.println("Digite o nome do produto: ");
			p.nome = scan.nextLine();
			System.out.println("Digite o preço do produto: ");
			p.preco = scan.nextDouble(); scan.nextLine();
			System.out.println("Digite a quantidade em estoque: ");
			p.quantidade = scan.nextInt(); scan.nextLine();
			
			if(p.quantidade < 5) {
				System.out.println("Atenção: " + p.nome + 
						" está com o estoque baixo.");
			}
			
			produtos.add(p);
		}
		
		double valorTotal = 0;
		int qtdProdutosCadastrados = qtdProdutos;
		int qtdProdutosEstoqueMenorQue5 = 0;
		
		for(Produto p : produtos) {
			double valor = 0;
			valor = p.preco * p.quantidade;
			valorTotal += valor;
			if(p.quantidade < 5) qtdProdutosEstoqueMenorQue5++;
		}
		
//for(Produto p : produtos) valorTotal += p.preco * p.quantidade;
	
		System.out.println("Valor Total: R$ " + valorTotal);
		System.out.println("Produtos Cadastrados: " + qtdProdutosCadastrados);
		System.out.println("Produtos com Estoque Menor que 5: " + qtdProdutosEstoqueMenorQue5);
		
		
		
/*
 * Toddynho 5 unidades a 2reais
 * Nescau 3 unidades a 3 reais
 * 5 x 2 + 3 x 3
 * 2 + 3
 * */		
		
		
		
		
		
	}

}
