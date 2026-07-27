package entities;

public class Student {

    public String nome;
    public double s1;
    public double s2;
    public double s3;

    public double finalGrade() {
        return (s1 + s2 + s3);
    }

    public double missing() {
        return 60 - finalGrade();
    }
}
