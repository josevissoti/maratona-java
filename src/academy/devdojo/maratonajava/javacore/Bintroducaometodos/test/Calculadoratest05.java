package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class Calculadoratest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numbers = {1, 2, 3, 4, 5};

        calculadora.somaArray(numbers);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
