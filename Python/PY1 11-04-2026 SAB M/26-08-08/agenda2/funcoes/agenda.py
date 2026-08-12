from modelos.contato import Contato

class Agenda:
    def __init__(self):
        self.contatos = []

    def adicionar_contato(self):
        nome = input("Digite o nome do contato: ")
        contato = Contato(nome)

        numero = input("Digite um número do contato ou digite enter para avançar: ")
        if numero.isdigit(): 
            contato.numeros.append(numero)

        self.contatos.append(contato)

    def remover_contato(self):
    
        nome = input("digite o nome do contato: ")

        for item in self.contatos:

            if item.nome == nome:
                self.contatos.remove(item)
                print("Contato removido com sucesso.")
                break
        else:
            print("Contato não localizado.")

    def localizar_contato(self):
       nome = input("digite o nome do contato: ")

       for item in self.contatos:
            
            if item.nome == nome:
                return item
            
       else:
           
           return None

    def atualizar_contato(self):
        contato = self.localizar_contato()

        if contato is not None:
            novo_nome = input("digite o novo nome: ")
            contato.nome = novo_nome

            opcao = input("Deseja adicionar um número? ")
            if opcao == "s":
                numero = input("digite o novo número: ")
                contato.numeros.append(numero)

            print("contato atualizado com sucesso.")

        else:
            print("contato não encontrado.")

