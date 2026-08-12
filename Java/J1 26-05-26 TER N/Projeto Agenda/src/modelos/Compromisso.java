package modelos;

public class Compromisso {

    private String nome;
    private String data;
    private Contato contato;

    public Compromisso() {
        /*
         * Inicializar os atributos do compromisso.
         */
    }

    public Compromisso(String nome, String data, Contato contato) {
        /*
         * Receber o nome, a data e o contato associado.
         * Armazenar os valores recebidos nos atributos da classe.
         * O compromisso deverá possuir obrigatoriamente um contato.
         */
    }

    public String getNome() {
        /*
         * Retornar o nome do compromisso.
         */
        return null;
    }

    public void setNome(String nome) {
        /*
         * Alterar o nome do compromisso.
         */
        // Implementar a lógica posteriormente.
    }

    public String getData() {
        /*
         * Retornar a data do compromisso.
         */
        return null;
    }

    public void setData(String data) {
        /*
         * Alterar a data do compromisso.
         */
        // Implementar a lógica posteriormente.
    }

    public Contato getContato() {
        /*
         * Retornar o contato associado ao compromisso.
         */
        return null;
    }

    public void setContato(Contato contato) {
        /*
         * Alterar o contato associado ao compromisso.
         * Não deverá ser permitido deixar o compromisso sem contato.
         */
    }

    @Override
    public String toString() {
        /*
         * Montar e retornar uma representação textual do compromisso,
         * exibindo o nome, a data e o contato associado.
         */
        return "";
    }
}
