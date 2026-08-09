package entities_lista_de_arraylist;

public class Funcionarios {

    private int id;
    private String nome;
    private double salario;
    private String cargo;

    public Funcionarios(int id, String nome, double salario, String cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
