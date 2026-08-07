class Veiculo:
    ## método construtor (função construção)
    def __init__(self, marca, modelo):
        # atributos (informações / valores)
        self.marca = marca
        self.modelo = modelo

    def acelerar(self):
        print(f"{self.marca} {self.modelo} acelerou.")

    # método de representação em texto (string) 
    def __str__(self):
        dados = f"Marca: {self.marca} | Modelo: {self.modelo}"
        return dados

# classe Carro herda informações da classe Veiculo
# todo Carro "é um" Veiculo
# Veiculo passa a ser a superclasse de Carro
# Carro passa a ser subclasse de Veiculo
class Carro(Veiculo):
    def __init__(self, marca, modelo, combustivel):
        # super() chama a superclasse Veiculo
        super().__init__(marca, modelo)
        self.combustivel = combustivel

    def __str__(self):
        dados = super().__str__() + f" | Combustível: {self.combustivel}"
        return dados

class Bicicleta(Veiculo):
    def __init__(self, marca, modelo, tipo):
        self.marca = marca
        self.modelo = modelo
        self.tipo = tipo

    def __str__(self):
        dados = f"Marca: {self.marca} | Modelo: {self.modelo}"
        return dados
