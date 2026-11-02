package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Uma lanchonete quer calcular quanto cada cliente gastou. 
		O programa deve perguntar quantos produtos o cliente comprou e, depois, 
		pedir o preço de cada produto.

		Ao final, deve mostrar o valor total da compra. Caso o total seja maior 
		que R$ 100,00, o cliente recebe 10% de desconto.*/ 

		double total = 0;
		int qtdProdutos = 0;
		double preco = 0;
		double desconto = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de produtos: ");
		qtdProdutos = scan.nextInt();

		for(int i = 0; i < qtdProdutos; i++) {
			System.out.printf("Informe o preço do %dº produto: ", i+1);
			preco = scan.nextDouble();
			total += preco;
			
		}
		
		if(total >= 100) {
			desconto = total * 0.1;
			total -= desconto;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
	}

}
