package model;

public class Funcionario extends Pessoa {

	//ATRIBUTOS

	private int matricula;
	
	//CONSTRUTOR
	public Funcionario(String nome, String endereco, int matricula) {
		//chamando o construtor da superclasse(Pessoa)
		super(nome, endereco);
		this.matricula = matricula;
	}
	
	//METODOS DE ACESSO
	public int getMatricula() {
		return matricula;
	}
	
	//METODO DE MANIPULACAO
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void executarFuncao() {
		System.out.printf("O funcionário %s executou sua função.", getNome());
	}
	
	
	
}
