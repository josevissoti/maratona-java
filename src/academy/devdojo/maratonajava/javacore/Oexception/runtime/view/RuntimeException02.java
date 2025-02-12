package academy.devdojo.maratonajava.javacore.Oexception.runtime.view;

public class RuntimeException02 {
    public static void main(String[] args) {
        try {
            System.out.println(division(1, 0));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static double division(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Argumento inválido");
        }
        return num1 / num2;
    }
}
