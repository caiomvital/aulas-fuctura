"""
5. Implemente um sistema simples de pagamento com classes CartaoCredito e Boleto, ambas com método pagar(valor).
"""
class FormaPagamento:
    def pagar(self):
        print("Pagamento efetuado")

class CartaoCredito(FormaPagamento):
    def pagar(self, valor):
        print(f"Pagamento de {valor} no cartão de crédito")

class Boleto(FormaPagamento):
    def pagar(self, valor):
        print(f"Pagamento de {valor} via boleto")


"""
6. Crie uma função que receba uma lista de objetos que implementem pagar(valor) e chame esse método para cada um.
"""
def listar_pagamentos(lista_pagamentos, valor):
    for item in lista_pagamentos:
        item.pagar(valor)


pag1 = CartaoCredito()
pag2 = Boleto()
pag3 = CartaoCredito()
pag4 = Boleto()
lista = [pag1, pag2, pag3, pag4]


listar_pagamentos(lista, 200)


