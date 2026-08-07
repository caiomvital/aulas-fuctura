from modelos.contato import Contato


class Agenda:

    def __init__(self):
        # lista que armazenará os contatos
        # toda agenda tem uma lista de contatos
        self.contatos = []

    def adicionar_contato(self, nome, numero):
        """
        cria um novo contato e o adiciona à agenda.
        """

        contato = Contato(nome)

        # adiciona o número ao contato
        contato.adicionar_numero(numero)

        # adiciona o contato à agenda
        self.contatos.append(contato)

        print("\nContato cadastrado com sucesso!")

    def listar_contatos(self):
        """
        exibe todos os contatos cadastrados.
        """

        if len(self.contatos) == 0:
            print("\nNenhum contato cadastrado.")
            return

        print("\n===== CONTATOS =====")

        for contato in self.contatos:
            print(contato)
            print("-" * 30)

    def buscar_por_numero(self, numero):
        """
        procura um contato pelo número informado.
        """

        # Ainda precisamos fazer: 
        # Percorrer todos os contatos

        # Ainda precisamos fazer: 
        # Verificar se o número informado
        # está na lista de números do contato

        # Ainda precisamos fazer:
        # Retornar o contato encontrado

        return None

    def remover_contato(self, numero):
        """
        Remove um contato pelo número.
        """

        contato = self.buscar_por_numero(numero)

        if contato is None:
            print("\nContato não encontrado.")
            return

        # Precisamos fazer:
        # Remover o contato da lista

        print("\nContato removido com sucesso!")

    def atualizar_contato(self, numero):
        """
        Atualiza os dados de um contato.
        """

        contato = self.buscar_por_numero(numero)

        if contato is None:
            print("\nContato não encontrado.")
            return

        print(f"\nContato encontrado: {contato.nome}")

        novo_nome = input("Novo nome: ")

        # Precisamos fazer:
        # Atualizar o nome do contato

        opcao = input("Deseja adicionar outro número? (S/N): ")

        if opcao.upper() == "S":

            novo_numero = input("Novo número: ")

            # Precisamos fazer:
            # Adicionar o novo número ao contato

        print("\nContato atualizado com sucesso!")
