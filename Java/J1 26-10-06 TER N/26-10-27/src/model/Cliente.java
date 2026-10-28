package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

	private List<String> produtos = new ArrayList<>();
	
	public Cliente(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	public List<String> getProdutos() {
		return produtos;
	}
	
	public void adicionarProduto(String produto) {
		this.produtos.add(produto);
	}
	
	
}
