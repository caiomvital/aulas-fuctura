"""
2. Crie uma classe Veiculo com atributos marca e ano. Crie uma classe Carro que herde de Veiculo e adicione um atributo modelo. Instancie e imprima todos os atributos.
"""
class Veiculo:
    def __init__(self, marca, ano):
        self.marca = marca
        self.ano = ano

class Carro(Veiculo):
    def __init__(self, marca, ano, modelo):
        super().__init__(marca, ano)
        self.modelo = modelo

    def __str__(self):
        dados = f"Marca: {self.marca}"
        dados += f"\nModelo: {self.modelo}"
        dados += f"\nAno: {self.ano}"
        return dados

c = Carro("Toyota", 2022, "Corolla")
print(c)


