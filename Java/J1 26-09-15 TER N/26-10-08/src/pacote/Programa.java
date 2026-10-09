package pacote;

public class Programa {
public static void main(String[] args) {
	
	Estacionamento e = new Estacionamento();
	e.taxa = 5.00;
	Carro c = new Carro();
	c.tempo = 3;
	//System.out.println(e.taxa * c.tempo);
	e.calcularTotal(c.tempo);
	
	Carro fusca = new Carro();
	fusca.modelo = "Fusca";
	fusca.placa = "KGU-5793";
	fusca.tempo = 5;
	e.carros.add(fusca.estacionar());
	
	Carro gol = new Carro();
	gol.modelo = "Gol";
	gol.placa = "7U1HY123G";
	gol.tempo = 4;
	e.carros.add(gol.estacionar());
	
	Carro monza = new Carro();
	monza.modelo = "Monza";
	monza.placa = "123UM23";
	monza.tempo = 7;
	e.carros.add(monza.estacionar());
	
	e.listarCarros();
	
	
	
	
	
	
}
}
