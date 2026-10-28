package model;

public class Pessoa {

	// ATRIBUTOS
	private String nome;
	private String endereco;
	
	// CONSTRUTOR
	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	// METODOS DE ACESSO
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	//METODOS DE MANIPULACAO
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
