package pacote;

public class Programa {

	public static void main(String[] args) {
		
		var receita = 3500;
		var despesa = 4200;
		var saldo = receita - despesa;
		var porcentagem = 0;
		
		
		if(saldo > 500) porcentagem = saldo * 0.3;
		var valorFinal = saldo - porcentagem;
		
		System.out.println("Receita: R$ " + receita);
		System.out.println("Despesa: R$ " + despesa);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Porcentagem: R$ " + porcentagem);
		System.out.println("Valor Final: R$ " + valorFinal);
		

	}

}
