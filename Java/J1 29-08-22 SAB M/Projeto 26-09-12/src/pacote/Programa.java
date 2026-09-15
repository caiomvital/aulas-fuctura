package pacote;

public class Programa {

	public static void main(String[] args) {

		//true -> verdadeiro
		//false -> falso
		
		//var pagou = false;
		
		//if(pagou) System.out.println("pagamento recebido.");
		//else System.out.println("favor enviar comprovante.");
		
		var valor = 10;
		
		// se o resto da divisao de um numero por 2 for 0 ele é par
		
		if(valor % 2 == 0) System.out.println("Par");
		else System.out.println("Ímpar");
		
		var vencimento = 10;
		var dia_util = true;
		
		if(vencimento == 10 && dia_util) 
			System.out.println("dia de pagamento");
		
		var final_semana = true;
		var ferias = false;
		
		if(final_semana || ferias)
			System.out.println("Descanso");
		
		
		
		
		
	}

}
