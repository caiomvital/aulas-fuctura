class Animal:
    def falar(self):
        print("animal emitiu um som.")

class Gato(Animal):
    def falar(self):
            print("O gato miou.")

class Cachorro(Animal):
     def falar(self):
          print("O cachorro latiu.")

class Vaca(Animal):
     def falar(self):
          print("A vaca mugiu.")


gato = Gato()
gato.falar()
cachorro = Cachorro()
cachorro.falar()
vaca = Vaca()
vaca.falar()

animais = [gato, cachorro, vaca]

for animal in animais:
     animal.falar()
