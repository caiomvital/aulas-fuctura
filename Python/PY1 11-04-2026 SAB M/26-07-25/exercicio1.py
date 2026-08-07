# 1 criar a classe Pessoa
class Pessoa:
    def exibir_tipo(self):
        print("esta é uma pessoa.")

# 2 criar a classe PessoaJuridica
class PessoaJuridica(Pessoa):
    def exibir_tipo(self):
        print("esta é uma pessoa jurídica.")

# 3 criar a classe PessoaFisica
class PessoaFisica(Pessoa):
    def exibir_tipo(self):
        print("esta é uma pessoa física.")
# 4 toda pessoa exibe seu tipo
p = Pessoa()
p.exibir_tipo()
pj = PessoaJuridica()
pj.exibir_tipo()
pf = PessoaFisica()
pf.exibir_tipo()