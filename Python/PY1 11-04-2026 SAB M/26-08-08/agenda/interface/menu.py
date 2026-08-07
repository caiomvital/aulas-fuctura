def exibir_menu(agenda):

    while True:

        print("\n" + "=" * 30)
        print("       AGENDA")
        print("=" * 30)
        print("1 - Adicionar contato")
        print("2 - Remover contato")
        print("3 - Atualizar contato")
        print("4 - Listar contatos")
        print("5 - Buscar contato por número")
        print("0 - Sair")

        opcao = input("\nEscolha uma opção: ")

        if opcao == "1":

            print("\n=== NOVO CONTATO ===")

            nome = input("Nome: ")
            numero = input("Número: ")

            agenda.adicionar_contato(nome, numero)

        elif opcao == "2":

            print("\n=== REMOVER CONTATO ===")

            numero = input("Número do contato: ")

            agenda.remover_contato(numero)

        elif opcao == "3":

            print("\n=== ATUALIZAR CONTATO ===")

            numero = input("Número do contato: ")

            agenda.atualizar_contato(numero)

        elif opcao == "4":

            agenda.listar_contatos()

        elif opcao == "5":

            print("\n=== BUSCAR CONTATO ===")

            numero = input("Número: ")

            contato = agenda.buscar_por_numero(numero)

            if contato is None:
                print("\nContato não encontrado.")
            else:
                print()
                print(contato)

        elif opcao == "0":

            print("\nPrograma encerrado.")
            break

        else:

            print("\nOpção inválida.")