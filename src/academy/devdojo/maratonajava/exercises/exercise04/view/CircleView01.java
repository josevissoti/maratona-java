package academy.devdojo.maratonajava.exercises.exercise04.view;

import academy.devdojo.maratonajava.exercises.exercise04.domain.Circle;

public class CircleView01 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        circle.areaCalculator();
        circle.circumferenceCalculator();
    }
}
