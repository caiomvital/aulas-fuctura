package heranca;

public class Monitor extends Aluno {

	String especialidade;

	Monitor(String nome, String matricula, String especialidade) {
		super(nome, matricula);		
		this.especialidade = especialidade;

	}
	
	void exibirDados() {
		super.exibirDados();
		System.out.println("Especialidade: " + this.especialidade);
	}
}
