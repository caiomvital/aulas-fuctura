package controladores;

import java.util.List;

import modelos.Compromisso;
import modelos.Contato;

public class Agenda {

    private List<Contato> contatos;
    private List<Compromisso> compromissos;

    public Agenda() {
        /*
         * Criar as listas que armazenarão os contatos
         * e os compromissos da agenda.
         */
    }

    public void adicionarContato(Contato contato) {
        /*
         * Adicionar um contato à lista de contatos.
         * Verificar se o contato possui um nome válido.
         * Também verificar se os telefones do contato não estão repetidos.
         */
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        /*
         * Adicionar um compromisso à lista de compromissos.
         * Verificar se o compromisso possui um contato associado.
         */
    }

    public List<Contato> listarContatos() {
        /*
         * Retornar a lista de contatos cadastrados.
         */
        return null;
    }

    public List<Compromisso> listarCompromissos() {
        /*
         * Retornar a lista de compromissos cadastrados.
         */
        return null;
    }

    public void removerContato(int indice) {
        /*
         * Remover um contato da lista utilizando o índice informado.
         * Verificar se o índice é válido.
         * Verificar se o contato possui algum compromisso associado
         * antes de permitir a remoção.
       */
    }

    public void removerCompromisso(int indice) {
        /*
         * Remover um compromisso da lista utilizando o índice informado.
         * Verificar se o índice é válido antes de realizar a remoção.
         */
    }
}
