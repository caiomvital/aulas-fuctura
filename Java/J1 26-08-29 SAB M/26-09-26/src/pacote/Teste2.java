package pacote;

public class Teste2 {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1.nome = "Tadeu";
		cliente1.cpf = "123123";
		cliente1.exibirDados();
		cliente2.nome = "Gervásio";
		cliente2.cpf = "321321";
		cliente2.exibirDados();

	}

}
