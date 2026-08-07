# criar uma classe Animal
# criar um objeto da classe Animal
# fazer o objeto "andar" (criar uma função para isso)
# criar 3 animais diferentes
# REGRA 1: Todo animal deve ter um nome
# DESAFIO: Todo animal anda de um jeito diferente

class Animal:

    def __init__(self, nome):
        self.nome = nome

    def andar(self):
        print(f"{self.nome} está andando.")

    def comer(self, alimento):
        print(f"{self.nome} está comendo {alimento}.")

gato = Animal("Tadeu")
gato.andar()
gato.comer("Whiskas Sachê")
cachorro = Animal("Langanho")
cachorro.andar()
cachorro.comer("Frolic")
papagaio = Animal("Geraldo")
papagaio.andar()
papagaio.comer("Semente de Girassol")








#lista = ["Tadeu", "Gervásio", "Geraldo"]

#import random


#print(lista[random.randint(0, len(lista) -1)])
