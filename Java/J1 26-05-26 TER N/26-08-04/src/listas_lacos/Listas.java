package listas_lacos;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	
public static void main(String[] args) {
	
		//variáveis separadas/isoladas
		String produto1 = "Pão";
		String produto2 = "Queijo";
		String produto3 = "Presunto";
		
		/*System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(produto3);*/
		
		
		List<String> produtos = new ArrayList<>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		//System.out.println(produtos);
		
		List<Integer> numeros = new ArrayList<>(); 
//		numeros.add(1);
//		numeros.add(2);
//		numeros.add(3);
//		//...
//		numeros.add(1000);
		
		for(int i = 1; i <= 1000; i++) {
			numeros.add(i);
		}
		
		System.out.println(numeros);
		
		
		
		
	}
	
}

