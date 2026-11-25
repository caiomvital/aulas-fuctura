package pacote;

public class Classe {

	public static void main(String[] args) {
		
		var A = false;
		var B = true;
		var C = false;
		
		if(A == true) {
			System.out.println("Letra A");
		}
		if(B == true) {
			System.out.println("Letra B");
			
		}
		if(C == true) {
			System.out.println("Letra C");
		}
		
		
		
		
		// Sacar R$ 100 no caixa eletrônico
		// Passo 1: Verificar se está com o cartão SIM
		// Passo 2: Digitar a senha (Senha correta SIM)
		// Passo 3: Digitar o valor
		// Passo 4: Sacar
		var cartao = false;
		//SE Cartão for Falso
		// Volte pra casa
		if(cartao == false) {
			System.out.println("Volte pra casa.");
		}
		//SE Cartão for Verdadeiro
		if(cartao == true) {
			System.out.println("Insira o cartão no caixa.");
			System.out.println("Digite a senha.");
			// Inserir cartão no caixa
			// Digitar a senha
			var senha = "123456";
			var senha_digitada = "1234567";
			
			// SE Senha Incorreta
			// Tentar novamente
			if(senha != senha_digitada) {
				System.out.println("Senha incorreta.");
			}
				//SE Senha Correta
		// Digitar o valor desejado
			if(senha == senha_digitada) {
				System.out.println("Senha correta.");
				System.out.println("Digite o valor desejado.");
				var valor = 100.00;
				var saldo = 99.99;
				// Se SALDO menor que valor desejado
				if(saldo < valor) {
					System.out.println("Saldo insuficiente.");
					
				}
				if(saldo >= valor) {
					System.out.println("Saque realizado.");
					
				}
				
			}
		}
		
		
	
		
		
		// Verificar SE deseja sacar valor menor
		// Saque
		// SENAO
		// Volta pra casa
		
		
		
	}

}
