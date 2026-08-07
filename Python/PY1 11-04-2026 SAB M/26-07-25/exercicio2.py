# Criar uma classe Veiculo
class Veiculo:
# Todo veículo tem marca e modelo
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.ligado = False
        
# Todo veículo pode ligar e desligar
    def ligar(self):
        self.ligado = True

    def desligar(self):
        self.ligado = False

    def exibir_dados(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")

# Criar uma classe Carro e uma classe Moto
# Carro e Moto devem ser subclasses de Veiculo
class Carro(Veiculo):
# O Carro tem qtdPassageiros
    def __init__(self, marca, modelo, qtdPassageiros):
        super().__init__(marca, modelo)
        self.qtdPassageiros = qtdPassageiros

class Moto(Veiculo):
# A Moto tem cilindrada
    def __init__(self, marca, modelo, cilindradas):
        super().__init__(marca, modelo)
        self.cilindradas = cilindradas

# Criar um objeto carro e um objeto moto
carro = Carro("Chevrolet", "Monza", 5)
carro.ligar()
moto = Moto("Honda", "Biz", 180)
moto.ligar()
# Exibir os dados de cada um deles
print("----Dados do Carro----")
carro.exibir_dados()
print(f"Capacidade: {carro.qtdPassageiros} pessoas")
print("xXx"*5)
print("----Dados da Moto----")
moto.exibir_dados()
print(f"Cilindradas: {moto.cilindradas}cc")