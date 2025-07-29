package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.List;

public class MetodoGenericoView01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    /*
        Ao se criar um metodo genérico, é usado um `<T>` entre o modificador de acesso e o tipo de retorno
        Define que o metodo ira utilizar um parâmetro generico nas condições postas.
     */
    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

    /*
        Condições podem ser impostas sob as classes genéricas.
        extends Comparable<T> - Define que apenas classes que implementam a interface Comparable podem ser utilizadas.
     */
    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto02(T t) {
        return List.of(t);
    }

}