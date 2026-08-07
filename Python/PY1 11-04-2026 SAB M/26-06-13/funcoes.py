def menu_inicial():
    print("---Início---")
    print("--Login--")
    print("--Login com o Facebook--")
    print("--Recuperar Conta--")
    print("--Criar Conta--")

def contar_caracteres(palavra):
    print(len(palavra.replace(" ", ""))) # length (tamanho / comprimento)    

# contar_caracteres("999 999 899")


# passos para criar uma função:
# palavra-chave def
# nome da função
# o que ela precisa para rodar
# o que ela deve fazer
# def nome_da_funcao(o que precisa):
#   recuo(TAB)

def tornar_maisculo(palavra):
    print(palavra.upper())

tornar_maisculo("batata inglesa dançando cancã")



