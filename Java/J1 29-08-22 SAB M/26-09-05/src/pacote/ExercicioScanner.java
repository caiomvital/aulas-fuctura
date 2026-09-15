package pacote;

import java.util.Scanner;

public class ExercicioScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//peça a um aluno a primeira e segunda notas
		//informe a média simples
		
		//passo 1: crie uma variavel para a primeira nota
		double nota1;
		//passo 2: crie uma variavel para a segunda nota
		double nota2;
		//passo 3: crie uma variavel para a media
		double media;
		//passo 4: peça a primeira nota ao aluno
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		//passo 5: peça a segunda nota ao aluno
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		//passo 6: calcule a media simples -> (nota1 + nota2) / 2
		media = (nota1 + nota2) / 2;
		//passo 7: use o println para exibir a media
		System.out.println("Média: " + media);
		
		if(media >= 7) System.out.println("Aluno aprovado");
		else if(media >= 4) System.out.println("Recuperação");
		else System.out.println("Aluno reprovado");
		
		
		 
//		System.out.println("Qual o seu nome? ");
//		String nome = scan.nextLine(); // lê a próxima String digitada
//		System.out.println("Qual a sua idade? ");
//		int idade = scan.nextInt(); // lê o próximo inteiro digitado
//		System.out.println("Nome: " + nome);
//		System.out.println("Idade: " + idade);
		
		//peça ao usuário a receita e a despesa do mês
		//exiba o saldo restante
		//passo 1: crie uma variavel para a receita e a despesa
		//passo 2: crie uma variavel para o saldo restante
//		double receita, despesa, saldo;
//		System.out.println("Digite a receita: ");
//		receita = scan.nextDouble();
//		System.out.println("Digite a despesa: ");
//		despesa = scan.nextDouble();
//		
//		saldo = receita - despesa;
//		System.out.println("Saldo: " + saldo);
		//passo 3: use o println para pedir os valores
		//passo 4: use o scanner para receber os valores
		//passo 5: use o println para exibir o resultado
		
		
		
		
		
		
	}

}
