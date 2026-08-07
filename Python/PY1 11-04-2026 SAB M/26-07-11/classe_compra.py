class Compra:

    def __init__(self, produtos):
        self.produtos = produtos
        total = 0
        for item in produtos:
            total += item.preco
        self.total = total
    
    def exibir_cupom_fiscal(self):
        print("===CUPOM FISCAL===")
        for item in self.produtos:
            print(item)
        
        print(f"Total: R$ {self.total:.2f}")