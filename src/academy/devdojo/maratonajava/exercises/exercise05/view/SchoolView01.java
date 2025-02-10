package academy.devdojo.maratonajava.exercises.exercise05.view;

import academy.devdojo.maratonajava.exercises.exercise05.domain.Classroom;
import academy.devdojo.maratonajava.exercises.exercise05.domain.Discipline;
import academy.devdojo.maratonajava.exercises.exercise05.domain.Student;
import academy.devdojo.maratonajava.exercises.exercise05.domain.Teacher;
import academy.devdojo.maratonajava.exercises.exercise05.domain.enums.Bloco;
import academy.devdojo.maratonajava.exercises.exercise05.service.PersonService;

public class SchoolView01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Rodolfo", 33, "Rua dos Limões n33", "798239");
        Teacher teacher2 = new Teacher("Isabela", 48, "Rua São Paulo n839", "634563");
        Teacher teacher3 = new Teacher("Thiago", 62, "Rua da Baixada", "342543");

        Student student1 = new Student("Rafaela", 17, "Rua Glória n78");
        Student student2 = new Student("Henrique", 16, "Rua São Bernardo n2384");
        Student student3 = new Student("Ana Maria", 17, "Rua Rio de Janeiro n12");

        Discipline discipline1 = new Discipline("Matemática");
        Discipline discipline2 = new Discipline("Inglês");

        Student[] students1 = {student1, student3};
        Student[] students2 = {student2};

        Teacher[] teachers1 = {teacher1, teacher2};
        Teacher[] teachers2 = {teacher1, teacher3};

        Teacher[] teachers3 = {teacher1};
        Teacher[] teachers4 = {teacher2, teacher3};

        Classroom classroom1 = new Classroom(students1, teachers1, Bloco.BLOCO3B);
        Classroom classroom2 = new Classroom(students2, teachers2, Bloco.BLOCO2A);

        Classroom[] classrooms1 = {classroom1};
        Classroom[] classrooms2 = {classroom2};
        Classroom[] classrooms3 = {classroom1, classroom2};

        discipline1.setTeachers(teachers4);
        discipline2.setTeachers(teachers3);

        teacher1.setDiscipline(discipline2);
        teacher2.setDiscipline(discipline1);
        teacher3.setDiscipline(discipline1);

        teacher1.setClassrooms(classrooms3);
        teacher2.setClassrooms(classrooms1);
        teacher3.setClassrooms(classrooms2);

        student1.setClaassroom(classroom1);
        student2.setClaassroom(classroom2);
        student3.setClaassroom(classroom1);

        PersonService.imprintPerson(teacher1);
        PersonService.imprintPerson(teacher2);
        PersonService.imprintPerson(teacher3);

        PersonService.imprintPerson(student1);
        PersonService.imprintPerson(student2);
        PersonService.imprintPerson(student3);
    }
}
