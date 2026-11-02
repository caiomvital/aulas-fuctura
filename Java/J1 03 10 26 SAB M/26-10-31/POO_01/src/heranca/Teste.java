package heranca;

public class Teste {

	public static void main(String[] args) {
		
		GatoDomestico tadeu = new GatoDomestico();
		tadeu.nome = "Tadeu";
		tadeu.alimento = "Whiskas Sachê";
		tadeu.corDoPelo = "Maracajá";
		tadeu.tutor = "Jacira";
		Cachorro gervasio = new Cachorro();
		gervasio.comer();
		tadeu.comer();
		
	}

}
