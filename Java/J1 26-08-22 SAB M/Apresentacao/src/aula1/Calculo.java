package aula1;

public class Calculo {

	public static void main(String[] args) {
		
		//int idade = 17;
		
		// se a idade for maior ou igual a 18
		//if(idade >= 18) System.out.println("Maior de idade");
		//else System.out.println("Menor de idade");
		// a pessoa é maior de idade
		// caso contrário
		// a pessoa é menor de idade
		
		
		//voto proibido abaixo de 16 anos
		
		int idade = 18;
		
		//voto obrigatorio é entre 18 e 70 anos
		if(idade >= 18 && idade < 70) System.out.println("Voto obrigatório");
		//voto facultativo é entre 16 e 18 e acima de 70 anos
		else if(idade >= 16 && idade < 18 || idade >= 70) System.out.println("Voto facultativo");
		
		else System.out.println("Voto proibido");
		
		
//		int quantidade = 1;
//		double preco = 1.99;
//		
//		//se o preco estiver 2.49, leve 4 unidades
//		
//		if(preco < 2.50) quantidade = 4;
//		
//		System.out.println(quantidade * preco);
		

	}

}
