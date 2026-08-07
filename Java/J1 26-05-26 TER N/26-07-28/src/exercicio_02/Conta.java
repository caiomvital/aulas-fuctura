package exercicio_02;

public class Conta {

	String titular;
	double saldo;
	
	void sacar(double valor) {

	// caso contrário, não posso sacar
	// se saldo >= valor -> pode sacar

	if(saldo >= valor) {
		System.out.println("Saque efetuado.");
		saldo -= valor;
		System.out.println("Saldo atual: " + saldo);
	} else {
		System.out.println("Saldo insuficiente");
	}
	
	}
	
}
