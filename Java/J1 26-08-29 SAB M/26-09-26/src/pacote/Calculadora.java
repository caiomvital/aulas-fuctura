package pacote;

public class Calculadora {

	//somar -> numero x, numero y
	void somar(int x, int y) {
		System.out.println(x + y);
	}
	
	//subtrair -> numero x, numero y
	void subtrair(int x, int y) {
		System.out.println(x - y);
	}
	
	//multiplicar -> numero x, numero y
	void multiplicar(int x, int y) {
		System.out.println(x * y);
	}
	
	//dividir -> numero x, numero y
	void dividir(double x, double y) {
		System.out.println(x / y);
	}
	
	void media(int x, int y) {
		System.out.println((x + y) / 2);
	}
	
}
