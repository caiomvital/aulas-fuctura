package modelos;

import java.util.List;

public class Turma {

	String nome;
	Professor professor;
	List<Aluno> alunos;

	Turma(String nome, Professor professor, List<Aluno> alunos) {
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
	}

	void exibirDados() {
		System.out.println("-- " + this.nome + " --");
		System.out.println("Professor: " + this.professor.nome);
		System.out.println("--- Alunos ---");
		//para cada aluno na lista, exiba seu nome
		for(Aluno aluno : this.alunos)
			System.out.println(aluno);
		System.out.println("--------------");
		
	}

}
