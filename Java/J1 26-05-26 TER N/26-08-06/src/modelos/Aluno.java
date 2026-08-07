package modelos;

public class Aluno {

	//atributos // características // dados
	String nome;
	String turma;
	
	// método construtor // função de construção
	Aluno(String dado1) {
		
		// passar o nome (primeiro dado/registro)
		nome = dado1;
		// passar a turma (segundo dado/registro)
	}
	//métodos // ações // funções
	void exibirDados() {
		
		System.out.println("Aluno: " + nome);
		System.out.println("Turma: " + turma);
		
	}
	
	@Override
	public String toString() {
		
		return nome;
	}
	
}
