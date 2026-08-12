class Pessoa:
    def __init__(self, nome, saldo):
        self.__nome = nome
        self.__saldo = saldo

    @property
    def nome(self):
        return self.__nome
    @nome.setter
    def nome(self, novo_nome):
        if novo_nome == "Janaína":
            print("Nome inválido.")
        else:
            self.__nome = novo_nome

    def exibir_dados(self):
        print(self.nome)
        print(self.__saldo)

tadeu = Pessoa("Tadeu", 200)
gervasio = Pessoa("Gervásio", 0)
# tadeu.__saldo -= 50
# gervasio.__saldo += 50
tadeu.nome = "Geraldo"
tadeu.exibir_dados()
gervasio.exibir_dados()

