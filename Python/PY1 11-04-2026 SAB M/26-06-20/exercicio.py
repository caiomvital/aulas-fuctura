# Adiciona uma música ao final da playlist
def adicionar_musica(playlist, musica):
    playlist.append(musica)


# Remove uma música da playlist
def remover_musica(playlist, musica):
    playlist.remove(musica)


# Simula a reprodução de uma música
# Se uma playlist for informada, exibe uma mensagem diferente
def tocar_musica(musica, playlist=None):

    # Verifica se uma playlist foi passada como argumento
    if playlist is not None:
        print(f"Tocando a música {musica} da playlist.")
    else:
        print(f"Tocando a música {musica}...")


# Função para repetir uma música
# Ainda não foi implementada
def repetir_musica(musica):
    pass


# Função para pausar a reprodução
# Ainda não foi implementada
def pausar_musica():
    pass


# Função para reproduzir músicas em ordem aleatória
# Ainda não foi implementada
def ordem_aleatoria():
    pass


# Percorre a playlist e exibe cada música
def listar_musicas(playlist):

    # Para cada música da playlist
    for musica in playlist:
        print(musica)