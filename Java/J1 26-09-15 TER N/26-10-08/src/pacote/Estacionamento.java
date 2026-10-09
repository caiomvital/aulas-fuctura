package pacote;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

	//todo estacionamento tem...
	double taxa;
	int vagas;
	List<Carro> carros = new ArrayList<>();
	
	//todo estacionamento faz...
	void calcularTotal(int tempo) {
		double total = taxa * tempo;
		System.out.println("Total: R$ " + total);
	}
	
	void listarCarros() {
		//para cada carro na lista,
		//exiba sua placa, modelo e tempo de permanencia
		
		for(Carro carro : carros) {
			carro.exibirDados();
			calcularTotal(carro.tempo);
		}
		
	}
	
	
}
