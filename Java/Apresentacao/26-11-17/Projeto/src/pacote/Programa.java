package pacote;

public class Programa {

	public static void main(String[] args) {
	
		var lucro = 500;
		var despesa = 100;
		//se o lucro for 500 ou mais, guardar 200 na poupança 
		var poupanca = 100;
		
		if(lucro - despesa > 0) poupanca += lucro - despesa;

		System.out.println(poupanca); 
		
		if(lucro >= 200 & lucro < 500)
			System.out.println("Vou comer uma pizza");
			

	}

}
