package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.estudante.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.sex = 'M';

        System.out.println("\nNome: " + professor.name + "\nIdade: " + professor.age + "\nSexo: " + professor.sex);

    }

}
