package pacote;

public class Cliente {

	String nome;
	boolean casado;

	void exibirDados() {
		System.out.println("Nome do Cliente: " + nome);
		if (casado)
			System.out.println("Estado Civil: Casado");
		else
			System.out.println("Estado Civil: Solteiro");
	}
}
