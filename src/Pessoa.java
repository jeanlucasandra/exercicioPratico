public class Pessoa {
    private String nome;

    //construtores
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

    //get e set apenas do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
