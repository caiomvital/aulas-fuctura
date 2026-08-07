tarefas = []
# qtd_tarefas = int(input("Digite a quantidade de tarefas: "))
# for volta in range(qtd_tarefas):
#    tarefa = input("Digite o nome da tarefa: ")
#    tarefas.append(tarefa)

for volta in range(15):
    tarefa = input("Digite o nome da tarefa: ")
    tarefas.append(tarefa)
    opcao = input("deseja continuar? s/n: ")
    if opcao == "s": 
        continue
    else:
        break

print(tarefas)
for tarefa in tarefas:
    print(tarefa)