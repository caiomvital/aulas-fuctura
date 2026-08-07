package modelos;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		List<Aluno> alunosA = new ArrayList<>();
		List<Aluno> alunosB = new ArrayList<>();
		
		alunosA.add(banco.aluno1);
		alunosA.add(banco.aluno2);
		alunosA.add(banco.aluno3);
		
		alunosB.add(banco.aluno4);
		alunosB.add(banco.aluno5);
		alunosB.add(banco.aluno6);
		
		Professor prof1 = banco.professor1;
		Professor prof2 = banco.professor2;
		
		Turma turmaA = new Turma("Turma A", prof1, alunosA);
		Turma turmaB = new Turma("Turma B", prof2, alunosB);
		
		turmaA.exibirDados();
		turmaB.exibirDados();
		
	}
	
}
