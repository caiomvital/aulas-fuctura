package modelo;

public class Celular {

	//todo celular tem
	String marca;
	String modelo;
	int bateria;
	
	//todo celular precisa dizer o que tem
	Celular(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = 100;
	}
	
	
	
	//todo celular faz
	void exibirDados() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Bateria: " + this.bateria + "%");
	}
	
	void usarCelular(int consumo) {
		bateria -= consumo;
	}
	
	void assistirVideo() {
		System.out.println("Assistindo o novo clipe de Anitta");
		usarCelular(5);
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {

		String dados = "Marca: " + this.marca;
		dados += "\nModelo: " + this.modelo;
		dados += "\nBateria: " + this.bateria + "%";

		
		return dados;
	}
	
}
