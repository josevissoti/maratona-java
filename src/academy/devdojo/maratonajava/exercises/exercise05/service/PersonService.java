package academy.devdojo.maratonajava.exercises.exercise05.service;

import academy.devdojo.maratonajava.exercises.exercise05.domain.Classroom;
import academy.devdojo.maratonajava.exercises.exercise05.domain.Person;
import academy.devdojo.maratonajava.exercises.exercise05.domain.Student;
import academy.devdojo.maratonajava.exercises.exercise05.domain.Teacher;

public class PersonService {
    public static void imprintPerson(Person person) {
        System.out.println("\n--- Relatório de Pessoa ---");
        System.out.println("Nome da pessoa: " + person.getNome());
        System.out.println("Endereço: " + person.getEndereco());
        System.out.println("Idade: " + person.getIdade());
        if (person instanceof Teacher teacher) {
            System.out.println("Disciplina exercída: " + teacher.getDiscipline().getNome());
            for (Classroom classroom : teacher.getClassrooms()) {
                System.out.println("Aula no ano " + classroom.getBloco().ANO + " bloco "
                        + classroom.getBloco().BLOCO);
            }
        } else if (person instanceof Student student) {
            System.out.println("Sala do ano " + student.getClaassroom().getBloco().ANO +
                    " bloco " + student.getClaassroom().getBloco().BLOCO);
        }
    }
}
