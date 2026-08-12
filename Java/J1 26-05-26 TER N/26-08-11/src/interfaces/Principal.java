package interfaces;

import heranca.Funcionario;

public class Principal {
public static void main(String[] args) {
	
	Funcionario tadeu = new Funcionario("Tadeu", 1617);
	System.out.println(	tadeu.getSalario());
}
}
