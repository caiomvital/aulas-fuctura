lista1 = (1000, 2, 3, 5, 20000)
print(max(lista1), min(lista1))

idades = []
maiores = []
menores = []

idade = int(input("Digite sua idade: "))
while idade >= 0:
    idades.append(idade)
    if idade >= 18:
        print("pessoa é maior de idade")
        maiores.append(idade)
    else:
        print("A pessoa é menor de idade.")
        menores.append(idade)
    
    idade = int(input("Digite sua idade: "))
    

print(idades)
print(sum(idades) / len(idades))
qtd_maiores = len(maiores) 
qtd_menores = len(menores)

if qtd_maiores > qtd_menores:
    print("Tem mais maiores que menores")
elif qtd_maiores < qtd_menores:
    print("Tem mais menores que maiores")
else:
    print("Tem a mesma quantidade de gente")


print(max(idades))
print(min(idades))