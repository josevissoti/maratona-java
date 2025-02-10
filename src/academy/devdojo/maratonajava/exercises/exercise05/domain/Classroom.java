package academy.devdojo.maratonajava.exercises.exercise05.domain;

import academy.devdojo.maratonajava.exercises.exercise05.domain.enums.Bloco;

public class Classroom {
    private Student[] students;
    private Teacher[] teachers;
    private Bloco bloco;

    public Classroom(Student[] students, Teacher[] teachers, Bloco bloco) {
        this.students = students;
        this.teachers = teachers;
        this.bloco = bloco;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }
}
