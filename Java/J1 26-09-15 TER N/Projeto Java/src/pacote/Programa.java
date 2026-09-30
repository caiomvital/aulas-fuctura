package pacote;

public class Programa {

	public static void main(String[] args) {

		var receita = 5000;
		var despesa = 4600;
		var saldo = receita - despesa;
		var cofre = 0;

		if (saldo >= 1500) {
			cofre = 1500;

			saldo = saldo - 1500;
		} else if (saldo >= 1000) {
			cofre = 500;
			saldo = saldo - 500;
		} else {
			System.err.println("Não foi possível guardar dinheiro esse mês.");
		}

		System.out.println(saldo);

//		var promocao1 = "- Carne";
//		var promocao2 = "- Leite";
//		var estoque = 5;
//		var promocao3 = "- Ovos";
//		
//		System.out.println("Promoção de Hoje");
//		System.out.println(promocao1);
//		
//		if(estoque >= 10)
//		System.out.println(promocao2);
//		
//		System.out.println(promocao3);

	}

}
