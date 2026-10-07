package pacote;

public class Teste {
public static void main(String[] args) {
	somar(2,2,3,4, 5);
}
static void somar(double... nums) {
	double total = 1;
	for(double num : nums) {
		total *= num;
	}
	System.out.println(total);
}
}
