"""
1. Crie uma classe Animal com um método falar() que imprima "Animal falando". Crie uma classe Cachorro que herde de Animal e sobrescreva falar() para imprimir "Au au!".
"""

class Animal:
    def falar(self):
        print("Animal falando.")

class Cachorro(Animal):
    def falar(self):
        print("Au au!")

# objeto da classe Animal
a = Animal() # a é o objeto da classe Animal
a.falar() # o objeto 'a' chamando a função falar
c = Cachorro() 
c.falar()