class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __str__(self):
        dados = f"Produto: {self.nome}\n"
        dados += f"Preço: R$ {self.preco:.2f}\n".replace(".", ",")
        return dados
    


produtos = []


def exibir_menu():
    print("Bem-vindo ao Sistema de Produtos")
    print("1: Adicionar Produto")
    print("2: Remover Produto")
    print("3: Listar Produtos")
    print("Sair")

def adicionar_produto(Produto, produtos):
    nome = input("Digite o nome do produto: ")
    preco = float(input("Digite o preço do produto: ").replace(",", "."))
    produto = Produto(nome, preco)
    
    produtos.append(produto)
    print("Produto adicionado com sucesso.")

def remover_produto(produtos):
    nome = input("Digite o nome do produto: ")

    for item in produtos:
        if item.nome.lower() == nome.lower():
            produtos.remove(item)
            print("Produto removido com sucesso.")
            break
    else:
        print("Não há produtos com esse nome.")

def listar_produtos(produtos):
    print("---Lista de Produtos---")
        
    for item in produtos:
        print(item)
        
    print("😁" * 24)

while True:
    exibir_menu()    
    opcao = input("digite a opção: ")
    
    if opcao == "1":
          adicionar_produto(Produto, produtos)
    elif opcao == "2":
        remover_produto(produtos)    
    elif opcao == "3":
        listar_produtos(produtos)
    elif opcao.lower() == "sair":
        break




total = 0
for item in produtos:
    total += item.preco

print(total)