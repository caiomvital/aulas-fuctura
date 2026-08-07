# Importa o arquivo "exercicio.py" e dá a ele o apelido "playlist"
import exercicio as playlist

# Cria uma lista vazia que representará a playlist
lista = []

# Adiciona músicas à playlist
playlist.adicionar_musica(lista, "Musica1")
playlist.adicionar_musica(lista, "Musica2")
playlist.adicionar_musica(lista, "Musica3")

# Exibe todas as músicas da playlist
playlist.listar_musicas(lista)

# Remove uma música da playlist
playlist.remover_musica(lista, "Musica3")

# Exibe novamente as músicas após a remoção
playlist.listar_musicas(lista)

# Toca uma música informando a playlist
playlist.tocar_musica("Musica1", lista)

# Toca uma música sem informar uma playlist
playlist.tocar_musica("Musica5")
