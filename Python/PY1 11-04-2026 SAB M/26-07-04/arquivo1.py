# Classe que representa um produto.
# Cada objeto criado terá um ID, um nome e um preço.

class Produto:

    # Variável da classe.
    # Serve para gerar IDs automáticos.
    id_produto = 1

    # Função construtora.
    # É executada automaticamente quando um novo Produto é criado.
    def __init__(self, nome, preco):

        # Atribui o próximo ID disponível ao produto.
        self.id = Produto.id_produto

        # Incrementa o contador para o próximo produto.
        Produto.id_produto += 1

        # Armazena os dados recebidos.
        self.nome = nome
        self.preco = preco

    # Função responsável por definir como o objeto será exibido
    # quando utilizarmos a função print().
    def __str__(self):
        return f"ID: {self.id} - Nome: {self.nome} - Preço: R$ {self.preco}"