class Alimento:
    def __init__(self, nome):
        self.nome = nome
        self.preco = 2.99

    def exibir_dados(self):
        print(f"Nome: {self.nome}")

class AlimentoPerecivel(Alimento):
    def __init__(self, nome_alimento, validade):
        super().__init__(nome_alimento)
        self.validade = validade
        

class AlimentoNaoPerecivel(Alimento):
    pass

alimentoA = Alimento("Requeijão")
alimentoB = AlimentoPerecivel("Pão", "04/08/2026")
print(alimentoB.nome)
print(alimentoB.validade)
print(alimentoB.preco)
alimentoC = AlimentoNaoPerecivel("Lasanha Congelada")


