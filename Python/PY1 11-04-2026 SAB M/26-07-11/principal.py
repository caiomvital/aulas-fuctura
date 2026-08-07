from classe_produto import Produto
from classe_compra import Compra
produto1 = Produto("Arroz", 6.99)
produto2 = Produto("Feijão", 6.95)
produto3 = Produto("Macarrão", 3.95)
lista1 = [produto1, produto2, produto3]
produto4 = Produto("Carne Moída", 17.99)
produto5 = Produto("Molho", 3.98)
produto6 = Produto("Tilápia", 19.99)
lista2 = [produto4, produto5, produto6]
compra1 = Compra(lista1)
compra2 = Compra(lista2)
print(compra2.total)
compra1.exibir_cupom_fiscal()
compra2.exibir_cupom_fiscal()