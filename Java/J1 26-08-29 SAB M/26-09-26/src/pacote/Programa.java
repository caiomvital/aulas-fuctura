package pacote;

public class Programa {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 20; i++) {
			if(i % 2 != 0) System.out.println(i);
		}
		
		exibirPlaca(8, "Ouro");

	}
	static void exibirPlaca(int vezes, String produto) {
		
		for(var vez = 1; vez <= vezes; vez++)
			System.out.println("Vez: " + vez);
			System.out.println("Compro " + produto + "!");
		
		
	}
	
	
	/*
	 static void exibirPlaca() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o produto: ");
		String produto = scan.nextLine();
		System.out.println("Compro " + produto + "!");
		System.out.println("Compro " + produto + "!");
		System.out.println("Compro " + produto + "!");
	} */
	 }
