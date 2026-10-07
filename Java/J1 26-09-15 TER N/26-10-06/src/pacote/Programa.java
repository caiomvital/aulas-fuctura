package pacote;

public class Programa {

	public static void main(String[] args) {
		
		var destinatario = "Tadeu";
		System.out.println("Destinatário: " + destinatario);
		System.out.println("Sistema Fora do Ar as 22h");
		
		enviarMensagem("Sistema Fora do Ar as 22h", "Tadeu", "Gervásio", "Jacira", "Bebeto", "Geraldo");
		

	}
	static void enviarMensagem(String mensagem, String... destinatarios) {
		//para cada destinatario, envie a mensagem
		for(String destinatario : destinatarios)
		System.out.println(destinatario + ": " + mensagem);
		
	}
}
