package modelo;

public class TesteAnimal {
	public static void main(String[] args) {
		Animal preguica = new Animal();
		preguica.nome = "Gervásio";
		preguica.emitirSom();
		Animal papagaio = new Animal();
		papagaio.nome = "Tadeu";
		papagaio.emitirSom();
		Gato gato = new Gato();
		gato.nome = "Geraldo";
		gato.emitirSom();
		
		GatoDomestico jacira = new GatoDomestico();
		jacira.emitirSom();
		
		
		
		
	}
}
