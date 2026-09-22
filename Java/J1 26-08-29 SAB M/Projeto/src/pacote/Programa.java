package pacote;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora: ");
		var valor_hora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas: ");
		var horas_trabalhadas = scan.nextInt();
		var total_bruto = horas_trabalhadas * valor_hora;
		System.out.println("Total Bruto: R$ " + total_bruto);
		
		// inss = 8%
		// transporte = 6%
		// imposto_renda = se o salario for acima de 5000 -> 7,5%
		// imposto_renda = se o salario for acima de 10000 -> 15%
		
		var inss = total_bruto * 0.08;
		var transporte = total_bruto * 0.06;
		var imposto_renda = 0.0;
		
		// imposto_renda = se o salario for acima de 5000 -> 7,5%
		// imposto_renda = se o salario for acima de 10000 -> 15%
		
		//se salario > 5000 
		//imposto_renda = total_bruto * 0.075;
		//se salario > 10000
		//imposto_renda = total_bruto * 0.15;
		
		if(total_bruto > 5000) {
			imposto_renda = total_bruto * 0.075;
		} else if(total_bruto > 10000) {
			imposto_renda = total_bruto * 0.15;
		}
		
		var total_impostos = inss + transporte + imposto_renda; 
		
		var total_liquido = total_bruto - total_impostos;
		
		
		System.out.println("Horas Trabalhadas: " + horas_trabalhadas);
		System.out.println("Valor da Hora: R$💵 " + valor_hora + "/h");
		
		System.out.println("Desconto INSS: R$ " + inss);
		System.out.println("Desconto Transporte: R$ " + transporte);
		System.out.println("Desconto IR: R$ " + imposto_renda);
		
		System.out.println("Valor Bruto: R$ " + total_bruto);
		System.out.println("Valor Líquido: R$ " + total_liquido);
		
		
		
	}
	
}
