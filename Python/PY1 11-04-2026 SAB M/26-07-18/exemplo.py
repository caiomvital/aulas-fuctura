# Criar uma classe Pessoa com o atributo 'nome'
# Criar uma função para exibir os dados

class Pessoa:
    def __init__(self, nome):
        self.nome = nome
    
    def exibir_dados(self):
        print(f"Nome: {self.nome}")

class PessoaFisica(Pessoa):
    def __init__(self, nome, cpf):
        super().__init__(nome)
        self.cpf = cpf

    def exibir_dados(self):
        super().exibir_dados()
        print(f"CPF: {self.cpf}")

tadeu = Pessoa("Tadeu")
geraldo = PessoaFisica("Geraldo", "1234")
tadeu.exibir_dados()
geraldo.exibir_dados()

class A:
    def __init__(self, nome):
        self.nome = nome

class B(A):
    pass

class C(B):
    def __init__(self, nome, profissao):
        super().__init__(nome)
        self.profissao = profissao

# ex_a = A("Letra A")
# ex_b = B("Letra B")
ex_c = C("Gervásio Gates", "professor")
print(ex_c.nome)

