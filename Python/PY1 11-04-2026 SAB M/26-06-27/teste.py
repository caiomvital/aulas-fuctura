
situacao = False

def avaliar_situacao(media):
    if media >= 7:
        return True
    return False

media_tadeu = 7
resultado = avaliar_situacao(media_tadeu)
if resultado:
    print("Tadeu passou")
else:
    print("Tadeu não passou")













# def sem_parametro():
#     print("Esta é uma função sem paramêtro.")

# def com_parametro(valor):
#     (f"Esta é uma função com paramêtro: Valor: {valor}")

# def funcao_com_retorno(numero):
#     return "par" if numero % 2 == 0 else "impar"


# sem_parametro()
# com_parametro("Eu sou um parâmetro")
# print(funcao_com_retorno(10))
