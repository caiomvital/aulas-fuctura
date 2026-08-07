class Pessoa:
    # método construtor
    def __init__(self, nome):
        self.nome = nome

    # método que exibe um texto com os dados do objeto
    def __str__(self):
        dados = f"Nome: {self.nome}"
        return dados
    
    def acordar(self):
        print(f"{self.nome} acordou.")


# objeto pessoa1 (formado a partir da classe Pessoa)
pessoa1 = Pessoa("Tadeu")
pessoa1.acordar()
print(pessoa1.nome)
# objeto pessoa2 (formado a partir da classe Pessoa)
pessoa2 = Pessoa("Gervásio")
print(pessoa2.nome)
pessoa2.acordar()

print(pessoa1)

