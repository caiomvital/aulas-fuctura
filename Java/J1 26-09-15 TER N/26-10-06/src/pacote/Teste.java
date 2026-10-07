package pacote;

public class Teste {

	public static void main(String[] args) {
		
		var produto1 = new Produto("Água Sanitária", 1.98);
		var produto2 = new Produto("Detergente", 2.10);
		
		var compra1 = new Compra();
		compra1.id = 1;
		compra1.produtos.add(produto1);
		compra1.produtos.add(produto2);
		
		

	}

}
