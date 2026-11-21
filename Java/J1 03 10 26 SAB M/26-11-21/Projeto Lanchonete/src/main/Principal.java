package main;

import model.Coxinha;
import model.Pastel;
import model.Pedido;
import model.Prato;
import model.Sanduiche;

public class Principal {

	public static void main(String[] args) {

		Prato p = new Prato();
		Sanduiche s = new Sanduiche();
		Coxinha c = new Coxinha();
		Pastel ps = new Pastel();
		
		s.nome = "Sanduíche de Mortadela";
		s.preco = 9.99;
		c.nome = "Coxinha de Batata";
		c.preco = 7.99;
		ps.nome = "Pastel de Frango";
		ps.preco = 14.99;		
		
		Pedido pedido = new Pedido();
		
		pedido.itens.add(s); // Sanduíche custa 9.99
		pedido.itens.add(c); // Coxinha custa 7.99
		pedido.itens.add(ps); // Pastel custa 14.99
		
		System.out.println(pedido.calcularTotal());
		pedido.montarPedido();
		System.out.println(pedido.calcularTotal());
	}

}
