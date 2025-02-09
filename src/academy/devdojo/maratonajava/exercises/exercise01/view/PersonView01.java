package academy.devdojo.maratonajava.exercises.exercise01.view;

import academy.devdojo.maratonajava.exercises.exercise01.domain.Person;

public class PersonView01 {
    public static void main(String[] args) {
        Person person1 = new Person("Henrique", 35);
        Person person2 = new Person("Letícia", 28);

        System.out.println(person1);
        System.out.println(person2);
    }
}
