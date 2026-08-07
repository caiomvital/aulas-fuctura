package principal;

public class Soldado {

	Arma arma;
	int municao;

	Soldado(Arma arma) {
		this.arma = arma;
		this.municao = arma.capacidade;
	}
	
	void mostrarDados() {
		System.out.println("Arma do Soldado: " + this.arma);
		System.out.println("Munição Disponível: " + this.municao);
	}
	
}
