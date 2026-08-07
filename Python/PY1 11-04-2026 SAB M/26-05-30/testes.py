####
x = [10, 11, 12, 13, 14, 15]


####


# peca ao usuário que digite quantos numeros ele quiser
# caso ele digite -1, encerre o programa
# e mostra a soma dos valores digitados

# 1, 2, 3, -1 -> 6

soma = 0
while True:
    numero = int(input("Digite um valor: "))
    if numero < 0:
        break
    else:
        soma += numero

print(soma)

# turnos = ["manhã", "tarde", "noite"]

# for turno in turnos:
#     print(turno)

# for contador in range(5):
#     print(contador)


# valor1 = int(input("digite um valor: "))
# valor2 = int(input("digite outro valor: "))
# print(valor1 + valor2)