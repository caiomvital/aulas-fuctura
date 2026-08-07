# Classe que representa uma música
class Musica:

    # Método construtor.
    # É executado automaticamente quando um objeto é criado.
    def __init__(self, titulo, autor):

        # Atributo que guarda o título da música
        self.titulo = titulo

        # Atributo que guarda o autor da música
        self.autor = autor


# Classe que representa um animal
class Animal:

    # Método construtor da classe Animal
    def __init__(self, nome):

        # Atributo que guarda o nome do animal
        self.nome = nome

    # Método que define um comportamento do animal
    def andar(self):
        print("O animal está andando.")


# Cria um objeto da classe Animal
# e atribui o nome "Tadeu"
gato = Animal("Tadeu")

# Chama o método andar()
gato.andar()

# Exibe o valor do atributo nome
print(gato.nome)