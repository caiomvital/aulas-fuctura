import math


class FormaGeometrica:
    def calcular_area(self):
        pass

class Circulo(FormaGeometrica):
    def __init__(self, raio):
        self.raio = raio
    def calcular_area(self):
        print(f"Área do Círculo: {math.pi * (self.raio ** 2)}" )

class Quadrado(FormaGeometrica):
    def __init__(self, lado):
        self.lado = lado
    def calcular_area(self):
        print(f"Área do Quadrado: {self.lado ** 2}")


circulo = Circulo(5)
quadrado = Quadrado(4)

formas = [circulo, quadrado]

for forma in formas:
    forma.calcular_area()





















# class Pai:
#     def __init__(self, nome):
#         self.nome = nome

# class Filho(Pai):
#     def __init__(self, nome, sobrenome):
#         super().__init__(nome)
#         self.sobrenome = sobrenome

# pai = Pai("Tadeu")
# print(pai.nome)
# filho = Filho("Tadeu", "Silva")
# print(filho.nome, end=" ")
# print(filho.sobrenome)