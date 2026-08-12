package conta;

public class Conta {

	private double saldo;

	Conta(double saldo) {

		if (saldo < 0) {
			this.saldo = 0;

		} else {
			this.saldo = saldo;
		}
	}

	// getter
	public double getSaldo() {
		return saldo;
	}

	// setter
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// depositar
	void depositar(double valorDeposito) {
		if(valorDeposito > 0) {
			this.saldo += valorDeposito;
		} else {
			System.out.println("Deposito não efetuado");
		}
	}

	// sacar
	void sacar(double valorSaque) {

		if (valorSaque <= 0 || saldo < valorSaque) {
			System.out.println("saque não efetuado.");
		} else {
			this.saldo -= valorSaque;
		}
	}

}
