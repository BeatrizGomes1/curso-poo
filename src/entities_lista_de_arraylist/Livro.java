package entities_lista_de_arraylist;

public class Livro {

    private int codigo;
    private String titulo;
    private int quantidade;

    public Livro(int codigo, String titulo, int quantidade) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int emprestar (int estoque){
        return quantidade - estoque;
    }

    @Override
    public String toString(){
        return codigo + " | " + titulo + " | " + quantidade;
    }
}
