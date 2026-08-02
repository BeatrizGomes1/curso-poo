package entities_lista_de_arraylist;

public class Aluno {

    private int matricula;
    private String nome;
    private double notaFinal;

    public Aluno(int matricula, String nome, double notaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void pontosExtras(double ponto){
        notaFinal += ponto;

        if (notaFinal > 100){
            notaFinal = 100;
        }
    }

    @Override
    public String toString (){
        return "Matrícula: "
                + matricula + " | "
                + "Nome: " + nome + " | "
                + "Nota: " + String.format("%.2f" , notaFinal);
    }
}
