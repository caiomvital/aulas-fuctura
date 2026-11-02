package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*
		 * *Exercício 5*
		 * 
		 * Um jogo começa com 100 pontos de energia. A cada rodada, o jogador perde uma
		 * quantidade de energia informada pelo usuário.
		 * 
		 * O programa deve continuar recebendo os valores enquanto o jogador tiver
		 * energia.
		 * 
		 * Quando a energia chegar a zero ou ficar negativa, o jogo termina e informa
		 * quantas rodadas o jogador conseguiu sobreviver.
		 */
		int energia = 100;
		Scanner scan = new Scanner(System.in);
		int perda = 0;
		int rodadas = 0;
		
		while(energia > 0) {
			System.out.println("Informe a quantidade de energia perdida: ");
			perda = scan.nextInt();
			rodadas++;
			energia -= perda;
		}
		
		System.out.printf("O jogador sobreviveu a %d rodadas", rodadas);
		
		
	}
}
