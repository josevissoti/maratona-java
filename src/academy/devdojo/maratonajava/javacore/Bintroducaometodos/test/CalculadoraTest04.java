package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisValores(num1, num2);

        System.out.println("\nDentro da classe CalculadoraTest04");
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);


    }
}
