package pacote;

import java.util.List;

public class Principal {
	public static void main(String[] args) {

		Cliente tadeu = new Cliente();
		tadeu.nome = "Tadeu";

		Pedido p1 = new Pedido();
		p1.descricao = "Hambúrguer com tomate em cubos";
		p1.valor = 27;

		tadeu.pedido.add(p1);

		Pedido p2 = new Pedido();
		p2.descricao = "Sukita Uva 1l";
		p2.valor = 11.99;

		tadeu.pedido.add(p2);

		double valorTotal = calcularTotal(tadeu.pedido);

		boolean dezPorCento = true;

		// se quiser pagar os 10%, a conta ficará
		// total + 10% do total
		if(dezPorCento == true) 
			System.out.println(valorTotal + (valorTotal * 0.1));
		
		else
			System.out.println(valorTotal);

		avaliarAtendimento(5);

	}

	static double calcularTotal(List<Pedido> pedido) {
		double total = 0;

		for (Pedido p : pedido) {
			total += p.valor;
		}

		return total;

	}
	
	static void avaliarAtendimento(int nota) {
		//se a nota for abaixo de 1: 0 estrela
		if(nota < 1) System.out.println("0");
		//se a nota for 1: 1 estrela
		else if(nota == 1) System.out.println("⭐");
		//se a nota for 2: 2 estrelas
		else if(nota == 2) System.out.println("⭐⭐");
		//se a nota for 3: 3 estrelas
		else if(nota == 3) System.out.println("⭐⭐⭐");
		//se a nota for 4: 4 estrelas
		else if(nota == 4) System.out.println("⭐⭐⭐⭐");
		//se a nota for 5 ou mais: 5 estrelas
		else if(nota >= 5) System.out.println("⭐⭐⭐⭐⭐");
	}
}
