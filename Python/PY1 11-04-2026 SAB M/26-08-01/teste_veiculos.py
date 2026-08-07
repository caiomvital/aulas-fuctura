# importando todo o arquivo
# import veiculos

# importando do arquivo apenas a classe
from veiculos import Carro, Bicicleta

monza = Carro("Chevrolet", "Monza", "Gasolina")
print(f"Marca: {monza.marca}")
print(f"Modelo: {monza.modelo}")
print(f"Combustível: {monza.combustivel}")
print(monza)
monza.acelerar()

caloi = Bicicleta("Caloi", "Explorer", "Mountain Bike")
print(f"Marca: {caloi.marca}")
print(f"Modelo: {caloi.modelo}")
print(f"Tipo: {caloi.tipo}")
print(caloi)
caloi.acelerar()

palio = Carro("Fiat", "Palio", "Álcool")
hb20 = Carro("Hyundai", "HB20", "GNV")
civic = Carro("Honda", "Civic", "Flex")



marca = input("Digite a marca do carro: ")
modelo = input("Digite o modelo do carro: ")
combustivel = input("Digite o tipo de combustível: ")

carro = Carro(marca, modelo, combustivel)


class Pessoa:
    def __init__(self, nome):
        self.nome = nome

    def acelerar(self):
        print(f"{self.nome} saiu correndo.")

pessoa = Pessoa("Tadeu")

lista = [monza, palio, hb20, civic, carro, pessoa]

for item in lista:
    item.acelerar()
