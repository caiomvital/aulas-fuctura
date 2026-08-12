"""
3. Crie uma classe base Pessoa com atributos nome e idade. Crie uma classe Estudante que herde de Pessoa e adicione o atributo curso.

"""
class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

p = Pessoa("Tadeu", 33)

class Estudante(Pessoa):
    def __init__(self, nome, idade, curso):
        super().__init__(nome, idade)
        self.curso = curso

"""
4. Crie uma classe Funcionario que herde de Pessoa e adicione atributo salario. Crie um método aumentar_salario().
"""

class Funcionario(Pessoa):
    def __init__(self, nome, idade, salario):
        super().__init__(nome, idade)
        self.salario = salario

    def aumentar_salario(self, percent):
        self.salario += self.salario * (percent / 100)


func = Funcionario("Tadeu", 33, 1000)
func.aumentar_salario(25)
print(func.salario)
