package interfaces;

import java.util.Scanner;

import controladores.Agenda;

public class Menu {

    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\n========== AGENDA ==========");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Adicionar compromisso");
            System.out.println("3 - Listar contatos");
            System.out.println("4 - Listar compromissos");
            System.out.println("5 - Remover contato");
            System.out.println("6 - Remover compromisso");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> agenda.adicionarContato();

                case 2 -> agenda.adicionarCompromisso();

                case 3 -> agenda.listarContatos();

                case 4 -> agenda.listarCompromissos();

                case 5 -> agenda.removerContato();

                case 6 -> agenda.removerCompromisso();

                case 0 -> {
                    System.out.println("Sistema encerrado.");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
