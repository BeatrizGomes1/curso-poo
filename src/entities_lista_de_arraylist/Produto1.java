package entities_lista_de_arraylist;

public class Produto1 {

    private int codigo;
    private String nome;
    private int estoque;

    public Produto1(int codigo, String nome, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void entradaNoEstoque(int entrada) {
        estoque += entrada;
    }

    public void saidaNoEstoque(int saida) {
        estoque -= saida;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome + " - " + estoque;
    }
}
