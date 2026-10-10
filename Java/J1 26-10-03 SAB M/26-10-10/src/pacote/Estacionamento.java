package pacote;

public class Estacionamento {

	//todo estacionamento tem...
	double taxaHora;
	
	//todo estacionamento é feito assim...
	Estacionamento(double novaTaxaHora) { 
		taxaHora = novaTaxaHora;
	}
	
	//todo estacionamento faz...
	void calcularTotal(int tempo) {
		double total = tempo * taxaHora;
		double desconto = 5;
		if(tempo >= 4) System.out.println(total - desconto);
		else System.out.println(total);
	
	
	
	}
	
}
