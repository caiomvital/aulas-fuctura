package turma;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		//criando um aluno a partir do modelo:
		// temos que passar nome e turma
		// para criar um aluno válido
		Aluno a = new Aluno("Tadeu", "Turma A");
		Aluno b = new Aluno("Gervásio", "Turma A");
		Aluno c = new Aluno("Jacira", "Turma A");
		Aluno d = new Aluno("Geraldo", "Turma A");
		//a.exibirDados();
		//b.exibirDados();
		//c.exibirDados();
		
		List<Aluno> alunos = new ArrayList<>();
		System.out.println("Tamanho da lista: " + alunos.size());
		alunos.add(a); // posição 0
		alunos.add(b); // posição 1
		alunos.add(c); // posição 2
		alunos.add(d); // posição 3
			
		for(int i = 0; i < alunos.size(); i++) {
			Aluno x = alunos.get(i);
			// se a turma do aluno x for Turma B,
			// aluno x deve exibir os dados
			if(x.turma.equals("Turma B")) x.exibirDados();
			}	
		System.out.println("Fim do laço.");
		
		
		
	}

}
