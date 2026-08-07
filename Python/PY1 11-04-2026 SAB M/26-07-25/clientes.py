class Cliente:
    def __init__(self, nome, situacao):
        self.nome = nome
        self.situacao = situacao
    def exibir_dados(self):
            print("Dados do cliente: ")
            print(self.nome)
            print(self.situacao)


class ClienteBasico(Cliente):

    def __init__(self, nome, situacao, endereco):
         super().__init__(nome, situacao)
         self.endereco = endereco

    def exibir_dados(self):
         print("Dados do Cliente Básico")
         print(f"Nome: {self.nome}")
         print(f"Situação: {self.situacao}")
         print(f"Endereço: {self.endereco}")


class ClientePremium(Cliente):
    pass

cb = ClienteBasico("Geraldo", "Adimplente", "Rua Tal, 1")
cb.exibir_dados()
cp = ClientePremium("Gervásio", "Inadimplente")
cp.exibir_dados()







""" Formulário de Cliente
Nome: _________
CPF: __________
Ano Nascimento: __/__/__

"""
