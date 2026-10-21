package modelo;

public class Pessoa {

	private String nome;
	private String cpf;
	private Integer idade;
	private Double altura;

	void exibir() {
		System.out.println("Eu sou " + nome);
	}

	public String getNome() {
		return nome.toUpperCase();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
