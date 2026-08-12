package heranca;

public class Aluno extends Pessoa {

	String matricula;
	
	Aluno(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}
	
	void exibirDados() {
		super.exibirDados();
		System.out.println("Matrícula: " + this.matricula);
	}
	
	
	
}
