package pacote;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

	//todo mercado tem...
	//lista de produtos
	List<Produto> produtos = new ArrayList<>();
	
	//todo mercado faz...
	void listarProdutos() {
		//para cada produto na prateleira, exiba seus dados
		//para cada produto na prateleira, produto.exibirDados();
		//para Produto p na prateleira, p.exibirDados();
		//for Produto p : produtos, p.exibirDados();
		
		System.out.println("=== Produtos ===");
		
		for(Produto p : produtos) {
			p.exibirDados();
			System.out.println("---------");
		}
		
		System.out.println("=== === === === ===");
	}
	
}
