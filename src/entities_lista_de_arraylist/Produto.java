package entities_lista_de_arraylist;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void desconto (double porcentagem) {
        preco -= ((porcentagem / 100) * preco);
    }

    @Override
    public String toString (){
        return codigo + ", " + nome + ", " + String.format("%.2f ", preco);
    }
}
