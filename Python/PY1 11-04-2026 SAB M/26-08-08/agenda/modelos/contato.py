class Contato:
    # Função construtora:
    def __init__(self, nome):
        # Nome do contato
        self.nome = nome

        # Um contato pode ter vários números
        self.numeros = []

    def adicionar_numero(self, numero):
        """
        adiciona um número ao contato.

        falta aqui criar a validação
        para que um contato tenha apenas
        números únicos (não pode repetir)
        """
        self.numeros.append(numero)

    def remover_numero(self, numero):
        """
        remove um número do contato.
        vamos implementar este método.
        """
        pass

    def __str__(self):
        """
        retorna uma representação em texto do contato.

        vamos melhorar essa função.
        """
        return f"Nome: {self.nome}\nNúmeros: {', '.join(self.numeros)}"




        """
        @nome.setter
    def nome(self, novo_nome):
        if novo_nome.strip() == "":
            print("O nome não pode ficar vazio.")
            return
        """