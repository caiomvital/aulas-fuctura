package pacote;

public class Principal {
		
		
	public static void main(String[] args) {

		var presunto = new Produto();
		presunto.nome = "Presunto Perdigão";
		presunto.preco = 4.99;
		//presunto.exibirDados();
		
		var queijo = new Produto();
		queijo.nome = "Queijo Prato DaVaca";
		queijo.preco = 7.99;
		//queijo.exibirDados();
		
		var pao = new Produto();
		pao.nome = "Pão de Forma Plus Vita";
		pao.preco = 8.99;
		//pao.exibirDados();
		
		var mercado = new Mercado();
		mercado.produtos.add(presunto);
		mercado.produtos.add(queijo);
		mercado.produtos.add(pao);
		
		mercado.listarProdutos();
		
//		mercado.produtos.get(0).exibirDados();
//		mercado.produtos.get(1).exibirDados();
//		mercado.produtos.get(2).exibirDados();
		

	}
	
}
