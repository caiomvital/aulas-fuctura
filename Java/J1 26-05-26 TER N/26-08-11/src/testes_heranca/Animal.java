package testes_heranca;

public class Animal extends SerVivo {

	
	Animal(String nome) {
		super(nome);
		
	}
	
	void emitirSom() {
		System.out.println("Som de animal");
	}

}
