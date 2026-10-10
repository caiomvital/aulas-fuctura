package pacote;

public class Principal {

	public static void main(String[] args) {
		
		Estacionamento rioDoce = new Estacionamento(7.50);
		Estacionamento espinheiro = new Estacionamento(10.0);
		Carro c = new Carro(3);
		c.tempo = 3;
		//System.out.println(e.taxaHora * c.tempo);
		rioDoce.calcularTotal(c.tempo);
		espinheiro.calcularTotal(c.tempo);
		
		
		
		
		
		
		
			
	}

}

