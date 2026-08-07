# produtos = ["Salame", "Batata", "Banana"]

def par_ou_impar(numero):
    
    if numero % 2 == 0:
        print("Número é par.")
    else:
        print("Número é ímpar.")

#par_ou_impar(8)


produtos = []

print("-" * 20)
# para cada item na lista:
for item in produtos:
    print(item)
# para cada numero no intervalo de x:
# for numero in range(0, 21, 2):
#     print(numero)

# enquanto o usuário quiser adicionar
# um item na lista, execute o .append
while True:
    produto = input("Digite o nome do produto: ")
    produtos.append(produto)

    if len(produtos) > 5:
        break

print("-*" * 20)
# para cada item na lista:
for item in produtos:
    print(item)