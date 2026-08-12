package heranca;



public class Pessoa {

	private String nome;
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
	}
	public String getNome() {
		return nome;
	}
}
