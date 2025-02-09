package academy.devdojo.maratonajava.exercises.exercise04.domain;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void areaCalculator() {
        System.out.println("A área do círculo é: " + (3.14 * Math.pow(radius, 2)));
    }

    public void circumferenceCalculator() {
        System.out.println("A circunferência do círculo é: " + (3.14 * radius * 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
