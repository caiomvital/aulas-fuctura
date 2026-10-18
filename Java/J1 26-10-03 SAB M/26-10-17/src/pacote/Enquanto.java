package pacote;

import java.util.Random;
import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random r = new Random();

		int valorSorteado = r.nextInt(0, 20) + 1;

		System.out.println("Tente acertar o número sorteado: ");
		int tentativa = scan.nextInt();

		while (true) {
			
			if (tentativa == valorSorteado) {
				System.out.println("Parabéns, você ganhou um confeito.");
				break;
			} else {
				System.out.println("Errou, tente novamente.");
				tentativa = scan.nextInt();
			}
			
		}

	}

}
