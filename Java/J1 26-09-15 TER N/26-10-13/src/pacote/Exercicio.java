package pacote;

public class Exercicio {

	public static void main(String[] args) {
		
		//valor que seja divisível por 3, 5, 6, 10, 12, 15 ao mesmo tempo
		// 60
		
		
		
		
		
		var valor = 60;
		
		if(valor % 3 == 0 && 
		   valor % 5 == 0 &&  
		   valor % 6 == 0 && 
		   valor % 10 == 0 && 
		   valor % 12 == 0 && 
		   valor % 15 == 0) System.out.println("Valor divisível por 3, 5, 6, 10, 12 e 15");
	
	
	diaDaSemana(7);
	
	
	}
	
	static void diaDaSemana(int dia) {
		// de acordo com o dia,
		// informe se é
		if(dia == 1) System.out.println("Domingo");
		if(dia == 2) System.out.println("Segunda");
		if(dia == 3) System.out.println("Terça");
		if(dia == 4) System.out.println("Quarta");
		if(dia == 5) System.out.println("Quinta");
		if(dia == 6) System.out.println("Sexta");
		if(dia == 7) System.out.println("Sábado");
		//1 domingo
		//2 segunda 
		//3 terça
		//4 quarta 
		// 5 quinta 
		// 6 sexta 
		// 7 sábado
		
	}

}
