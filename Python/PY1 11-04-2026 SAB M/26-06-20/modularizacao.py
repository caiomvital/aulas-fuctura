# Importa todo o arquivo "calculadora.py"
import calculadora

# Chama a função somar que está dentro do módulo calculadora
calculadora.somar(3, 4)


# Importa apenas a função somar do arquivo calculadora.py
from calculadora import somar

# Agora podemos chamar a função diretamente,
# sem escrever "calculadora."
somar(1, 2)