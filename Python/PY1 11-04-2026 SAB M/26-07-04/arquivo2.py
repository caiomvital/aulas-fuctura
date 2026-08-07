# Importa a classe Produto do outro arquivo.
from arquivo1 import Produto

# Lista que funcionará como nosso banco de dados em memória.
lista = []

# Função responsável por cadastrar um novo produto.
def adicionar_produto():

    nome = input("Nome: ")
    preco = float(input("Preço: "))

    # Cria um novo objeto Produto.
    produto = Produto(nome, preco)

    # Adiciona o objeto na lista.
    lista.append(produto)


# Função que percorre toda a lista exibindo os produtos.
def listar_produtos():

    for produto in lista:
        print(produto)


# Função que procura um produto pelo ID informado.
def buscar_produto_por_id():

    id = int(input("Digite o ID: "))

    # Percorre todos os produtos da lista.
    for produto in lista:

        # Se encontrar o ID, retorna o objeto.
        if produto.id == id:
            return produto

    # Executado somente se nenhum produto for encontrado.
    else:
        print("Produto não encontrado.")
        return None


# Função responsável por alterar os dados de um produto.
def atualizar_produto():

    # Primeiro procura o produto.
    produto = buscar_produto_por_id()

    # Só continua se o produto existir.
    if produto is not None:

        nome = input("Novo nome: ")
        preco = float(input("Novo preço: "))

        # Atualiza os atributos do objeto.
        produto.nome = nome
        produto.preco = preco

        # Atualiza a referência na lista.
        # (Na prática, esta linha é desnecessária, pois o objeto já foi alterado.)
        lista[produto.id - 1] = produto

        print("Produto atualizado.")


# Função responsável por excluir um produto da lista.
def remover_produto():

    # Procura o produto pelo ID.
    produto = buscar_produto_por_id()

    # Remove apenas se ele existir.
    if produto is not None:

        lista.remove(produto)

        print("Produto removido.")