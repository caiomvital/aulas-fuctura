package pacote;

public class Livro {

	//dados de um livro
	//todo livro tem...
	//tipo texto
	String titulo;
	//tipo decimal
	Double preco;
	
	//ações de um livro
	//todo livro faz...
	void exibirDados() {
		System.out.println("Título: " + titulo);
		System.out.println("Preço: R$ " + preco);
	}
	
}
