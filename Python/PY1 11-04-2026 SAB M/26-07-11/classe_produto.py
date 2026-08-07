class Produto:
    id_produto = 1
    def __init__(self, nome, preco):
        
        self.id = Produto.id_produto
        Produto.id_produto += 1
        self.nome = nome
        self.preco = preco

    def __str__(self):
        return f"ID: {self.id} - Nome: {self.nome} - Preço: R$ {self.preco}"
    


