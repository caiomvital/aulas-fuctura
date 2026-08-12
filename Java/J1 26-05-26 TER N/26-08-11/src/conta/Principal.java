package conta;

public class Principal {
	public static void main(String[] args) {

		Conta c = new Conta(1000);
		System.out.println(c.getSaldo());
		c.sacar(1000);
		System.out.println(c.getSaldo());
		c.depositar(500);
		System.out.println(c.getSaldo());
		
		
		
		
	}
}
