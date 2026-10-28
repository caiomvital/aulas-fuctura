package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Funcionario;
import model.Pessoa;

public class Cadastro {

	private List<Pessoa> cadastro = new ArrayList<>();
	private Scanner scan = new Scanner(System.in);
	
	//METODOS DE CADASTRO
	public void cadastrarFuncionario() {
		
		System.out.println("Digite o nome do funcionário: ");
		String nome = scan.nextLine();
		System.out.println("Digite o endereço do funcionário: ");
		String endereco = scan.nextLine();
		System.out.println("Digite a matrícula do funcionário: ");
		int matricula = scan.nextInt(); scan.nextLine();
		
		Funcionario f = new Funcionario(nome, endereco, matricula);
		
		cadastro.add(f);
		
	}
	
	public void cadastrarCliente() {
		System.out.println("Digite o nome do cliente: ");
		String nome = scan.nextLine();
		System.out.println("Digite o endereço do cliente: ");
		String endereco = scan.nextLine();
		
		Cliente c = new Cliente(nome, endereco);
		
		cadastro.add(c);
		
	}
	
	//METODOS DE REMOCAO
	public void removerFuncionario() {
		System.out.println("Informe a matrícula do funcionário: ");
		int matricula = scan.nextInt();
		
		for(Pessoa p : cadastro) {
			
			if(p instanceof Funcionario funcionario) {
				
				if(funcionario.getMatricula() == matricula) {
					cadastro.remove(funcionario);
					break;
				}
				
			}
			
		}
		
		
		
	}
	
	public void removerCliente() {
		
	}
	
	public void listarRegistros() {
		
		for(Pessoa p : cadastro) {
			
			if(p instanceof Funcionario f) {
				System.out.println("----Funcionário----");
				System.out.println(f.getNome());
				System.out.println(f.getEndereco());
				System.out.println(f.getMatricula());
			} else if(p instanceof Cliente c) {
				System.out.println("-----Cliente-----");
				System.out.println(c.getNome());
				System.out.println(c.getEndereco());
				
				if(!c.getProdutos().isEmpty()) {
					System.out.println("---Produtos---");
					c.getProdutos().forEach(System.out::println);
				} else {
					System.out.println("Cliente sem produtos.");
				}
				
			}
			
		}
		
	}
	
	public void adicionarProduto(String cliente, String produto) {

		for(Pessoa p : cadastro) {
			if(p instanceof Cliente c) {
				if(c.getNome().equals(cliente)) {
					c.adicionarProduto(produto);
				}
			}
		}
			
	}
	
}
