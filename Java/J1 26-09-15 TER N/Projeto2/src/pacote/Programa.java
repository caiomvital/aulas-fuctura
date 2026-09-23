package pacote;

public class Programa {

	public static void main(String[] args) {
		
		
		var valor_hora = 70;
		var horas_trabalhadas = 144;
		var hora_extra = valor_hora + (valor_hora * 0.4);
		var qtd_horas_extras = 10;
		var salario = valor_hora * horas_trabalhadas;
		var total_hora_extra = hora_extra * qtd_horas_extras;
		System.out.println("Salário: " + salario);
		System.out.println("Hora Extra: " + hora_extra);
		System.out.println("Total de Hora Extra: " + total_hora_extra);
		
		
		
		
		
		
		//var salario = 2000;
		var bonus = 300;
		var total = salario + bonus;
		
		System.out.println("Total: " + total);
		
		
		
		
		
		
		
		var receita = 4500;
		var despesa = 8000;
		var saldo = receita - despesa;
		
		System.out.println("Receita: " + receita);
		System.out.println("Despesa: " + despesa);
		System.out.println("Saldo: " + saldo);
		

	}

}
