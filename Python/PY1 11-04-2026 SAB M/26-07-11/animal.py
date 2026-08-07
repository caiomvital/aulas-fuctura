class Animal:
    def __init__(self, nome):
        self.nome = nome

    def comer(self, comida):
        print(f"{self.nome} está comendo {comida}.")

    def tomar_banho(self):
        print(f"{self.nome} está tomando banho.")   

        
gato = Animal("Langanho")
gato.comer("Whiskas Sachê")
gato.tomar_banho()
cachorro = Animal("Teobaldo")
cachorro.comer("Osso")

dict = {"preço: ": 1.99, "nome" : "arroz"}
