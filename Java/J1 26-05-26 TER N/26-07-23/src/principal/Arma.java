package principal;

public enum Arma {

	PISTOLA(12),
	REVOLVER(6),
	FUZIL(30),
	METRALHADORA(200),
	BAZUCA(1);

	int capacidade;
	
	Arma(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
