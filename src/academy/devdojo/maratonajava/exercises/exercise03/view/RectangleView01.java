package academy.devdojo.maratonajava.exercises.exercise03.view;

import academy.devdojo.maratonajava.exercises.exercise03.domain.Rectangle;

public class RectangleView01 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 200);

        rectangle.areaCalculator();
        rectangle.perimeterCalculator();
    }
}
