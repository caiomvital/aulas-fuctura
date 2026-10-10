package pacote;

public class Programa {

	public static void main(String[] args) {
		
		Cliente tadeu = new Cliente("Tadeu");
		Cliente gervasio = new Cliente("Gervásio");
		saudacao(tadeu.nome);
		saudacao(gervasio.nome);
		

	}
	
	static void saudacao(String nome) {
		System.out.println("Boa tarde, " + nome + "!");
	}
	
}
