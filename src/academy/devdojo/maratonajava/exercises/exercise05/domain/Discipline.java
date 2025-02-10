package academy.devdojo.maratonajava.exercises.exercise05.domain;

public class Discipline {
    private String nome;
    private Teacher[] teachers;

    public Discipline(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
