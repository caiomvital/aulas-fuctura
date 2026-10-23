package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Carro;
import modelo.Veiculo;

public class Controle {

	public List<Veiculo> veiculos = new ArrayList<>();
	
	public void adicionarVeiculo(Veiculo v) {
		veiculos.add(v);
	}
	
	public void removerVeiculo(Veiculo v) {
		veiculos.remove(v);
	}
	
	public void listarVeiculos() {
		for(Veiculo v : veiculos) {
			
			System.out.println(v.getMarca());
			System.out.println(v.getModelo());
			
			
		}
	}
	
}
