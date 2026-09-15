package aula1;

public class Media {

	void main() {
		
		String nome = IO.readln("Digite seu nome: ");
		IO.println(nome);
		
	}
		
		Aluno aluno1 = new Aluno();
		aluno1.nota1 = 7.6;
		aluno1.nota2 = 8.2;
		aluno1.calcular_media();
		Aluno aluno2 = new Aluno();
		aluno2.nota1 = 6.7;
		aluno2.nota2 = 10.00;
		aluno2.calcular_media();

		double nota1aluno3 = 6.9;
		double nota2aluno3 = 10.00;
		double mediaAluno3 = (nota1aluno3 + nota2aluno3) / 2;
		System.out.println("A média é: " + mediaAluno3);
		

	}

}
