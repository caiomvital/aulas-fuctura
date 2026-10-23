package modelo;

public class Carro extends Veiculo {

	private int qtdPortas;
	
	//método construtor
	public Carro(String marca, String modelo) {
		this.setMarca(marca);
		this.setModelo(modelo);
	}
	

	// método de manipulação/modificação (setter)
	public void setQtdPortas(int qtdPortas) {
		if (qtdPortas <= 0) {
			System.out.println("Número inválido.");
		} else {
			this.qtdPortas = qtdPortas;
		}
	}

	// método de acesso
	public int getQtdPortas() {
		return qtdPortas;
	}

}
