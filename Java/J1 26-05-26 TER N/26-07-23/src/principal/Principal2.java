package principal;

public class Principal2 {
	public static void main(String[] args) {

		exibirMensagem("Olá", 2);

	}
	
	static void exibirMensagem(String mensagem, int quantidade) {
		for(int i = 0; i < quantidade; i++) {
			System.out.println(mensagem);
		}
	}
	
	
	static void exibirMenu(String turno) {
		if(turno.equals("Tarde")) {
			System.out.println("Boa tarde");
		} else if(turno.equals("Noite")) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Bom dia");
		}
			
			
		System.out.println("Digite 1 para salvar");
		System.out.println("Digite 2 para sair");
	}
	
}
