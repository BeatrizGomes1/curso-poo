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

    public void emprestar (int emprestado){
        if (quantidade >= emprestado) {
            quantidade -= emprestado;
            System.out.println("Empréstimo feito com sucesso! Quantidade restante: " + quantidade);
        } else {
            System.out.println("Erro: Operação cancelada. Estoque insuficiente! (Disponível: " + quantidade + ")");
        }
    }

    @Override
    public String toString(){
        return "Código: " + codigo + " | " + "Título: " + titulo + " | " + "Estoque: " + quantidade;
    }
}
