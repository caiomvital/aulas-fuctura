package turma;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	String professor;
	List<Aluno> alunos = new ArrayList<>();
	
	Turma(String professor, List<Aluno> alunos){
		this.professor = professor;
		this.alunos = alunos;
	}
}
