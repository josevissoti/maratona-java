package academy.devdojo.maratonajava.exercises.exercise05.domain;

public class Student extends Person{
    private Classroom claassroom;

    public Student(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }

    public Classroom getClaassroom() {
        return claassroom;
    }

    public void setClaassroom(Classroom claassroom) {
        this.claassroom = claassroom;
    }
}
