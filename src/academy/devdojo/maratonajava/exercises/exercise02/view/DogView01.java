package academy.devdojo.maratonajava.exercises.exercise02.view;

import academy.devdojo.maratonajava.exercises.exercise02.domain.Dog;

public class DogView01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Terror", "Pastor Alemão");
        Dog dog2 = new Dog("Nina", "Viralata");

        dog1.setName("Muralha");
        dog1.setBreed("Pitbull");
        dog2.setBreed("Pinsher");

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
