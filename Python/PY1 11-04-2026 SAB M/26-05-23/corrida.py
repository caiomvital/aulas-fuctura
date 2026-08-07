import random

# ==========================================
# SEÇÃO 1: Preparação da corrida
# ==========================================
print("🏁 GRANDE PRÊMIO PYTHON 🏁\n")

posicoes = [0, 0, 0]  # Posição de cada carro: A, B, C
nomes = ["A", "B", "C"]
total_voltas = 8

# ==========================================
# SEÇÃO 2: As voltas da corrida
# ==========================================
for volta in range(total_voltas):
    print(f"\n{'='*40}")
    print(f"  VOLTA {volta + 1}")
    print(f"{'='*40}")

    # Cada carro avança aleatoriamente
    for i in range(len(posicoes)):
        avanco = random.randint(1, 6)  # Sorteia de 1 a 6
        posicoes[i] += avanco          # Acumula na posição do carro
        print(f"  Carro {nomes[i]} avançou {avanco} → total: {posicoes[i]}")

# ==========================================
# SEÇÃO 3: Descobrir o vencedor
# ==========================================
indice_vencedor = 0
maior_posicao = posicoes[0]

for i in range(len(posicoes)):
    if posicoes[i] > maior_posicao:
        maior_posicao = posicoes[i]
        indice_vencedor = i

# ==========================================
# SEÇÃO 4: Mostrar resultado final
# ==========================================
print(f"\n{'='*40}")
print(f"  RESULTADO FINAL")
print(f"{'='*40}")

for i in range(len(posicoes)):
    if i == indice_vencedor:
        print(f"  🏆 Carro {nomes[i]}: {posicoes[i]} casas")
    else:
        print(f"     Carro {nomes[i]}: {posicoes[i]} casas")

print(f"\n🎉 VENCEDOR: CARRO {nomes[indice_vencedor]}!")
