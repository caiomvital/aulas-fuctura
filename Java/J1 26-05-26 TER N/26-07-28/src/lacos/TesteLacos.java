package lacos;

import java.util.Scanner;

public class TesteLacos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroSecreto = 50;
		System.out.println("Digite um número de 1 a 100: ");
		int chute = scan.nextInt();
		
		while(chute != numeroSecreto) {
			System.out.println("Tente novamente.");
			chute = scan.nextInt();
		
			//se o chute for maior que numeroSecreto
			if(chute > numeroSecreto) {
				//informar "o número secreto é menor"
				System.out.println("O número secreto é menor.");
			}
			//se o chute for menor que o numeroSecreto
			if(chute < numeroSecreto) {
				//informar "o número secreto é maior"
				System.out.println("O número secreto é maior.");

			}
		
		}
		
		System.out.println("Resposta correta.");
		
	}

}
