package pacote;

public class Exercicio01 {
	public static void main(String[] args) {

		// escreva uma rotina que peça o id numerico de uma compra
		// e o valor total dela, e exiba as informações na tela
		// ex: calcularTotal(123, 4.99, 5.98, 6.97)
		// Total: R$ 17.94
		
		calcularTotal(123, 4.99, 5.98, 6.97);

	}
	
	static void calcularTotal(int id, double... valores) {
		double total = 0;
		
		for(double valor : valores) total += valor;
		
		System.out.println("ID: " + id + " --- R$ " + total);
		
	}
	
}
