package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    /*
        Metodo é um bloco de código utilizado para definir um comportamento ou uma ação que um objeto pode realizar.
        Possui uma sequência de instruções, que podem ou não ter um retorno de acordo com cada situação.
    */

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2, int num3) {
        System.out.println(num1 * num2 * num3);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDividesaoDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não existe divisão por 0");
    }

    public void alteraDoisValores(int numero1, int numero2) {
        numero1 = 33;
        numero2 = 99;
        System.out.println("\nDentro do método alteraDoisValores:");
        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);
    }

    /*
        Mwtodo público, com retorno de tipo vazio, nomeado `somaArray()`.
        Eecebe um Array de valores inteiros que será nomeado como `numbers` durante a utilização do metodo.
        Esse metodo possui a função de somar todos os números contidos no Array e imprimi-los no console.
     */
    public void somaArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void somaVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

}
