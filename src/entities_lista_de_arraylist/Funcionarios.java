package entities_lista_de_arraylist;

public class Funcionarios {

    private int id;
    private String nome;
    private double salario;
    private String departamento;

    public Funcionarios(int id, String nome, double salario, String cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamento = cargo;
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
        return departamento;
    }

    public void setCargo(String cargo) {
        this.departamento = cargo;
    }

    public void increaseSalary(double porcentagem) {
        salario += (salario * (porcentagem / 100));
    }

    @Override
    public String toString(){
        return "[ID: " + id + "] " + "Nome: " + nome + " | " + "Depto: " + departamento + " | "
                + "Salario: R$" + String.format("%.2f", salario);
    }
}
