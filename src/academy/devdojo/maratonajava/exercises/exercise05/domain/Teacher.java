package academy.devdojo.maratonajava.exercises.exercise05.domain;

public class Teacher extends Person{
    private double salario;
    private String cpf;
    private Classroom[] classrooms;
    private Discipline discipline;

    public Teacher(String nome, int idade, String endereco, String cpf) {
        super(nome, idade, endereco);
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Classroom[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Classroom[] classrooms) {
        this.classrooms = classrooms;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
