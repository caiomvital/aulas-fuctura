package exercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		/**Exercício 4*

Uma pessoa resolveu guardar dinheiro durante 30 dias. 
No primeiro dia, ela guarda R$ 1,00. 
No segundo, R$ 2,00. No terceiro, R$ 3,00, e assim sucessivamente, 
aumentando R$ 1,00 a cada dia. 
Faça um programa que calcule quanto dinheiro essa pessoa 
terá guardado ao final dos 30 dias.
*/
double total = 0;
double valor = 1;
for(int i = 0; i < 30; i++) {
	System.out.println("Valor no dia " + (i + 1));
	System.out.println(valor);
	total += valor;
	valor += 1;
	System.out.println("Total no dia " + (i + 1));
	System.out.println(total);
}
System.out.println("Total: R$ " + total);
	}

}
