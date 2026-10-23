package interfaces;

import controle.Controle;
import modelo.Carro;
import modelo.Moto;

public class Principal {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Honda", "Civic");
		Moto moto1 = new Moto();
		carro1.setQtdPortas(-5);
		moto1.setMarca("Honda");
		moto1.setModelo("Biz");
		
		Controle controle1 = new Controle();
		controle1.adicionarVeiculo(carro1);
		controle1.adicionarVeiculo(moto1);
		controle1.listarVeiculos();
		System.out.println(carro1.getQtdPortas());

	}

}
