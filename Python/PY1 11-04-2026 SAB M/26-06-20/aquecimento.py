"""
Um funcionário chega ao trabalho e encontra uma fila na máquina de café.

Cada pessoa demora entre 1 e 3 minutos para ser atendida.

O programa deve:
1. Ler quantas pessoas estão na fila.
2. Ler o tempo gasto por cada pessoa.
3. Somar todos os tempos da fila.
4. Acrescentar 2 minutos de caminhada (ir e voltar).
5. Verificar se o tempo total é menor ou igual a 15 minutos.
"""

# Quantidade de pessoas que estão esperando na fila
pessoas = int(input("Quantas pessoas na fila? "))

# Acumulador para guardar a soma dos tempos da fila
minutos_totais = 0

# Tempo máximo permitido para pegar o café e voltar
tempo_maximo = 15

# Tempo gasto para ir até a máquina e voltar para a mesa
tempo_gasto = 2

# Repete uma vez para cada pessoa da fila
for pessoa in range(pessoas):

    # Lê o tempo que a pessoa levou para usar a máquina
    tempo = int(input("Quanto tempo você passou? (1 - 3) "))

    # Soma o tempo informado ao total acumulado
    minutos_totais += tempo

# Adiciona os 2 minutos da caminhada ao total
minutos_totais += tempo_gasto

# Verifica se o tempo total ultrapassou o limite
if minutos_totais > tempo_maximo:
    print("Estourou o tempo!")
else:
    print("Deu tempo de voltar à mesa.")