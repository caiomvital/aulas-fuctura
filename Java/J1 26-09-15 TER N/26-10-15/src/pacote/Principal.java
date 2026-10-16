package pacote;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pontos = 0;
		double valor = 0;
		int horas = 0;
		
		// Até 10h de atividade no mês: ganha 2 pontos por hora 
		// se horas <= 10 -> pontos = horas * 2
		// De 10h até 20h de atividade no mês: ganha 5 pontos por hora
		// se horas > 10 e <= 20 -> pontos = horas * 5
		// Acima de 20h de atividade no mês: ganha 10 pontos por hora
		// se horas >= 20 -> pontos = horas * 10
		
		System.out.println("Quantas horas de atividade física você fez? ");
		horas = scan.nextInt();
		
		if(horas <= 10) pontos = horas * 2;
		else if(horas > 10 && horas <= 20) pontos = horas * 5;
		else pontos = horas * 10;
		
		// 1 ponto = 0.05;
		valor = pontos * 0.05;
		
		System.out.println("Pontos: " + pontos);
		System.out.println("Recebido: R$ " + valor);
		
		
		
		
		// System.out.println("Digite seu nome: ");
		// var nome = scan.nextLine();
		// System.out.println("Olá, " + nome);

	}

}
