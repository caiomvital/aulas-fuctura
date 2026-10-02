package pacote;

public class Principal {

	public static void main(String[] args) {

		var produto = new Produto();
		var mercado = new Mercado();
		var produto2 = new Produto();
		produto.id = 1;
		produto.nome = "Presunto";
		produto.preco = 4.99;
		produto2.id = 2;
		produto2.nome = "Queijo";
		produto2.preco = 8.99;
		
		
		mercado.estoque.add(produto);
		mercado.estoque.add(produto2);
		
		//para cada produto, exiba seus dados
		//for Produto p, produto.exibirDados();
		//for Produto p do estoque, p.exibirDados();
		//for Produto p : estoque, p.exibirDados();
		for(Produto p : mercado.estoque) p.exibirDados();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		var livro = new Livro();
//		var livro2 = new Livro();
//		var livro3 = new Livro();
//		livro.titulo = "Java para Leigos";
//		livro.preco = 42.99;
//		livro.exibirDados();
//		livro2.titulo = "Spring Boot";
//		livro2.preco = 29.99;
//		livro.exibirDados();
//		livro3.titulo = "Café da Manhã dos Campeões";
//		livro3.preco = 19.99;
//		livro3.exibirDados();*/
		
		
		

	}

}
