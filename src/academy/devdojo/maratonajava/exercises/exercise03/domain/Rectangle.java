package academy.devdojo.maratonajava.exercises.exercise03.domain;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void areaCalculator() {
        System.out.println("A área do retângulo é: " + (width * height));
    }

    public void perimeterCalculator() {
        System.out.println("O perímetro do retângulo é: " + (2 * width + 2 * height));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
