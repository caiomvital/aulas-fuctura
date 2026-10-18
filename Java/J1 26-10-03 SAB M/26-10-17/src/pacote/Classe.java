package pacote;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		var pontos = 0;
		var horas = 0;
		var recompensa = 0.0;
		
		System.out.println("Quantas horas de atividade física você fez? ");
		horas = scan.nextInt();
		
		//até 10h de exercício físico -> pontos = horas
		//entre 10 e 20h, -> pontos = horas * 2
		//mais de 20h -> pontos = horas * 3
		//cada ponto equivale a 10 centavos de recompensa
		
		if (horas <= 10) {
			pontos = horas;
			System.out.println("1. Você fez " + pontos + " pontos.");
		}
		
		else if (horas > 10 && horas <= 20) {
			pontos = horas * 2;
			System.out.println("2. Você fez " + pontos + " pontos.");
		}
		
		else {
			pontos = horas * 3;
			System.out.println("3. Você fez " + pontos + " pontos.");
		}
		
		
		recompensa = pontos * 0.10;
		
		
		System.out.println("Você recebeu R$ " + recompensa);
		//versão formatada
		System.out.printf("Você recebeu R$ %.2f", recompensa);
		
	}

}
