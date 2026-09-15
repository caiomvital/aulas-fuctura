package aula1;

public class Aluno {

	double nota1;
	double nota2;
	double media;
	
	void calcular_media() {
		media = (nota1 + nota2) / 2;
		System.out.println("A média é: " + media);
	}
	
	
}
