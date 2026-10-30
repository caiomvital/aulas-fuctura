package pacote;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "Gervásio";
		boolean casado = false;
		System.out.println("Nome registrado: " + nome);
		if(casado) System.out.println("Estado Civil: Casado");
		else System.out.println("Estado Civil: Solteiro");
		
		Cliente cliente = new Cliente();
		cliente.nome = "Gervásio";
		cliente.casado = true;
		
		System.out.println("Nome registrado: " + cliente.nome);
		if(cliente.casado) System.out.println("Estado Civil: Casado");
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Tadeu";
		cliente2.casado = false;
		cliente2.exibirDados();
		
		
	}

}
