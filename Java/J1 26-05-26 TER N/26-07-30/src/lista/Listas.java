package lista;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		//adicionar itens na lista
		lista.add("Pão"); // 0
		lista.add("Queijo"); // 1
		lista.add("Presunto"); // 2
		
		System.out.println(lista.get(2)); // acessar pela posição
		//indexOf -> índice do item
		System.out.println(lista.indexOf("Presunto"));
		System.out.println(lista);
		lista.remove("Presunto"); // remove pelo item
		System.out.println(lista);
		
		
	}

}
