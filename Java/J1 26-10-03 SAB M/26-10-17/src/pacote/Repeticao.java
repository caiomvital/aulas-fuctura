package pacote;



public class Repeticao {

	public static void main(String[] args) {
		
		Atleta tadeu = new Atleta();
		tadeu.qtdExercicios = 30;
		var tempoPorExercicio = 30;
		var tempoGasto = 0;
		
		//para cada exercício, o tempo gasto aumenta em 30 segundos
		
		for (int contador = 1; contador <= 30; contador++) {
			tempoGasto += 30;
			
		}
		var tempoGastoEmMin = tempoGasto / 60;
		System.out.println("Você gastou " + tempoGastoEmMin + " minutos.");
		
//fechamento do main
	}
//fechamento da classe
}
