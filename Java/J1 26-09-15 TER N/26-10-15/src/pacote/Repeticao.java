package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Repeticao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random r = new Random();

		int numeroSorteado = r.nextInt(0, 20) + 1;
		boolean acertou = false;
		int numTentativas = 0;
		List<Integer> registroTentativas = new ArrayList<>();

		while (acertou == false) {
			System.out.println("Tente adivinhar o número: ");
			int tentativa = scan.nextInt();
			

			while (registroTentativas.contains(tentativa)) {
				System.out.println("Esse número já foi, tente outro: ");
				tentativa = scan.nextInt();
				if (!registroTentativas.contains(tentativa)) {
					break;
				}
			}
			registroTentativas.add(tentativa);
			numTentativas++;

			if (tentativa == numeroSorteado) {
				System.out.println("Acertou!");
				acertou = true;
				System.out.println("Tentativas: " + numTentativas);

			} else {
				System.out.println("Errou!");
			}

		}

//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println("----------------");
//		for(int i = 0; i <= 20; i++) {
//			
//			//if/else
//			if(i % 2 != 0) {
//				System.out.println(i);
//			
//			}
//			
//		}

//		double media = 0;
//		double total = 0;
//		int qtdAlunos = 0;
//		
//		System.out.println("Informe quantos alunos tem: ");
//		qtdAlunos = scan.nextInt();
//		
//		//dois laços de repetição: 
//		//enquanto -> while
//		//para -> for
//		
//		for(int inicio = 1; inicio <= qtdAlunos; inicio++) {
//			System.out.println("Informe a média do aluno: ");
//			media = scan.nextDouble();
//			
//			total += media;
//		}
//		
//		System.out.println("Total: " + total);
//		System.out.println("Média por aluno: " + (total / qtdAlunos));

	}
}
