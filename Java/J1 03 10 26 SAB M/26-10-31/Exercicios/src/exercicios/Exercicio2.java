package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Um estacionamento quer saber quantos carros entraram durante o dia 
		 * e quanto arrecadou.
		 * 
		 * O programa deve perguntar quantos carros foram atendidos. Para cada carro,
		 * deve perguntar quantas horas ele permaneceu estacionado.
		 * 
		 * O estacionamento cobra R$ 8,00 pela primeira hora e R$ 5,00 por cada hora
		 * adicional.
		 * 
		 * Ao final, mostre o valor arrecadado no dia.
		 */
		int qtdCarros = 0;
		double total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int qtdHoras = 0;
		double primeiraHora = 8;
		double horaAdicional = 5;
		
		System.out.println("Digite a quantidade de carros: ");
		qtdCarros = scan.nextInt();
		
		for(int i = 0; i < qtdCarros; i++) {
			System.out.printf("Informe quantas horas o carro nº%d ficou: ", i+1);
			qtdHoras = scan.nextInt();
			total += primeiraHora;
			total += (qtdHoras - 1) * horaAdicional;
			
		}
		System.out.println("Total Arrecadado: R$ " + total);
	}

}
