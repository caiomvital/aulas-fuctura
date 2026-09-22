package pacote;

public class Principal {
	public static void main(String[] args) {

		var p = new Pessoa("Tadeu", "12312312312");
		Pessoa q = new Pessoa("Gervásio", "32132132132");
		p.altura = 1.83;
		q.altura = 1.74;
		System.out.println(p.nome);
		System.out.println(p.altura);
		System.out.println(p.cpf);
		
		
		
		

	}
}
