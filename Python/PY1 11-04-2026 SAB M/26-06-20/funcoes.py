# Função responsável por mostrar o passo a passo
# para preparar um café
def fazer_cafe():
    print("1. adicionar o grão")
    print("2. moer o grão")
    print("3. adicionar o pó ao filtro")
    print("4. adicionar água")
    print("5. ligar a máquina")


# Função que pede o nome do usuário
# e exibe uma mensagem de boas-vindas
def saudacao():
    nome = input("Digite seu nome: ")
    print(f"Olá, {nome}! Bem-vindo ao programa!")


# Função que recebe uma idade como parâmetro
# e verifica se a pessoa é maior de idade
def avaliar_idade(idade):

    # Se a idade for 18 ou mais
    if idade >= 18:
        print("Maior de idade.")

    # Caso contrário
    else:
        print("Não é maior de idade.")


# Solicita a idade ao usuário
idade = int(input("Digite sua idade: "))

# Chama a função passando a idade informada
avaliar_idade(idade)