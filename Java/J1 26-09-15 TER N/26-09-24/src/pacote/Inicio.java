package pacote;

public class Inicio {

	public static void main(String[] args) {
		
		
		exibir_promocao(1, "Carne");
		
		exibir_promocao(2, "Laticínios");
		
		exibir_promocao(3, "Ovos");
		
		exibir_promocao(4, "Pães e Bolos");
		
		exibir_promocao(5, "Aves");
	}
	static void exibir_promocao(int dia, String produto) {
		System.out.println("Dia " + dia);
		System.out.println("Promoção de Hoje: " + produto);
	}

}
