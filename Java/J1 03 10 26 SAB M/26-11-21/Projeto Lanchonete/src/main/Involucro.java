package main;

import java.util.ArrayList;
import java.util.List;

public class Involucro  {

	public static void main(String[] args) {
		
		List<Integer> inteiros = new ArrayList<>();
		List<Double> decimais = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		List<Boolean> valores = new ArrayList<>();
		List<Character> caracteres = new ArrayList<>();
		
		System.out.println(Integer.parseInt("33"));
		
		
		String str = "Java 2026";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		//tipo inteiro
		int valorInteiro = 10;
		Integer valorInteiro2 = 5;
		
		
		//tipo decimal
		double valorDecimal = 9.99;
		Double valorDecimal2 = 4.44;
		
		//tipo caractere
		char letra = 'Z';
		Character letra2 = 'Y';
		
		//tipo lógico
		boolean logico = true;
		Boolean logico2 = false;
		
		String nome = "Tadeu";
		nome = nome.replace('T', 'K');
		System.out.println(nome);
		
		
	}

}
