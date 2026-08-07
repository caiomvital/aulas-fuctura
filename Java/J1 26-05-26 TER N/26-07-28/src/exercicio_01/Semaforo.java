package exercicio_01;

public class Semaforo {

	
	//atributo do tipo texto (String)
	String cor;
	
	void mostrarSituacao() {
		
		//se a cor for verde
		//escrever "siga"
		if(cor == "verde") System.out.println("Siga");
		//se a cor for amarelo
		//escreva "atenção"
		if(cor == "amarelo") System.out.println("Atenção");
		//se a cor for vermelho
		//escreva "pare"
		if(cor == "vermelho") System.out.println("Pare");
		
	}
	
}
