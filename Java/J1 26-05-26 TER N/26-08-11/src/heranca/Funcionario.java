package heranca;

public class Funcionario extends Pessoa {

	//dado privado - inacessível fora da classe
	private double salario;
	
	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	
	//método de acesso - método getter
	public double getSalario() {
		
		return this.salario;
	}
	
	//método de modificação - método setter
	public void setSalario(double valor) {
		if(valor < 1617) {
			System.out.println("Salário não pode ser mais baixo.");
		} else {
			this.salario = valor;
		}
	}
	
	
	
}
