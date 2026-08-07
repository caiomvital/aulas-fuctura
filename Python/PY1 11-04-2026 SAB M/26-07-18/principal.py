
class Soldado:
    # método construtor
    def __init__(self, nome):
        self.nome = nome
        self.balas = 10

    # métodos da classe (ações)
    def atirar(self):
        if self.balas > 0:
           print(f"{self.nome} atirou.")
           self.balas -= 1
           print(f"Balas restantes: {self.balas}")
        else:
            print(f"{self.nome} está sem balas.")
    
    def recarregar(self):
        if self.balas < 10:
            self.balas += (10 - self.balas)
            print(f"Balas de {self.nome} recarregadas")
        else:
            print(f"A munição de {self.nome} já está cheia.")

class Sniper(Soldado):
    def mirar(self):
        print(f"{self.nome} está mirando...")

sniper = Sniper("Tadeu")


class SniperDeElite(Sniper):
    def __init__(self, nome, alcance):
        super().__init__(nome)
        self.alcance = alcance

sniper_elite = SniperDeElite("Geraldo", 800)
