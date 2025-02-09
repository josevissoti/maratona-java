package academy.devdojo.maratonajava.exercises.exercise05.domain;

public class Student extends Person{
    private Classroom calassroom;

    public Student(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }

    public Classroom getCalassroom() {
        return calassroom;
    }

    public void setCalassroom(Classroom calassroom) {
        this.calassroom = calassroom;
    }
}
