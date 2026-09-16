package pacote;

public class Programa {

	public static void main(String[] args) {
		
		var cliente = "POSTO DE GASOLINA DE GERVÁSIO";
		var valor = 100;
		var gasolina = 6.75;
		var gasto = gasolina * 5;
		var total = valor - gasto;
		var contagem = valor / 20;
		
		System.out.println("Lucro: R$ " + total);
		
		//se o cliente pagar 100, exibir 5 vezes o nome
		//se o cliente pagar 200, exibir 10 vezes o nome
		
		//se valor = 100, nome * 5
		//se valor = 200, nome * 10
	
		if(valor >= 60) {
		
			for(var i = 1; i <= contagem; i++)
				System.out.println(cliente);
		
		}
		else {
			System.out.println("Valor mínimo é R$ 60");		
		}
		
		
		

		
	}

}
