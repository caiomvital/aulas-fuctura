package pacote;

public class Carro {

	//todo carro tem...
	String modelo;
	String placa;
	int tempo;
	
	//todo carro faz...
	Carro estacionar() {
		return this;
	}
	
	void exibirDados() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Placa: " + placa);
		System.out.println("Tempo: " + tempo + "h");
	}
	
	
}
