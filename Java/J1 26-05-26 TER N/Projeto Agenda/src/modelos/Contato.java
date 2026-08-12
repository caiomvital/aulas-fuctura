package modelos;

import java.util.List;

public class Contato {

    private String nome;
    private List<String> telefones;

    public Contato() {
        /*
         * Inicializar os atributos do contato.
         * A lista de telefones deverá ser criada para permitir
         * que novos números sejam adicionados posteriormente.
         */
    }

    public Contato(String nome, List<String> telefones) {
        /*
         * Receber o nome e a lista de telefones.
         * Armazenar os valores recebidos nos atributos da classe.
         */
    }

    public String getNome() {
        /*
         * Retornar o nome armazenado no contato.
         */
        return null;
    }

    public void setNome(String nome) {
        /*
         * Alterar o nome do contato.
         * O nome não deverá ser aceito caso esteja vazio.
         */
    }

    public List<String> getTelefones() {
        /*
         * Retornar a lista de telefones do contato.
         */
        return null;
    }

    public void setTelefones(List<String> telefones) {
        /*
         * Substituir a lista de telefones do contato.
         * A lista não deverá permitir números repetidos.
         */
    }

    @Override
    public String toString() {
        /*
         * Montar e retornar uma representação textual do contato,
         * exibindo o nome e todos os telefones cadastrados.
         */
        return "";
    }
}
