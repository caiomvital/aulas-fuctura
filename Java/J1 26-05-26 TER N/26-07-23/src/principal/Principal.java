package principal;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Soldado soldado1 = new Soldado(Arma.BAZUCA);
		soldado1.mostrarDados();
		
		//mostrar as capacidades de cada arma
		System.out.println(Arma.FUZIL.capacidade);
		System.out.println(Arma.PISTOLA.capacidade);
		System.out.println(Arma.REVOLVER.capacidade);
		
		//mostrar os nomes das armas do enum
		System.out.println(Arrays.toString(Arma.values()));
		
		//mostrar nome e capacidade para cada arma do enum
		//para cada arma da lista, mostre os dados dela
		for(Arma arma : Arma.values()) {
			System.out.println("Arma: " + arma);
			System.out.println("Capacidade: " + arma.capacidade);
		}
	}
	
}
