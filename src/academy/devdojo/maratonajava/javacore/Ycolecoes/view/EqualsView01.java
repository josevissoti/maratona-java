package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsView01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphone2 = new Smartphone("1ABC1", "iPhone");

        System.out.println(smartphone1.equals(smartphone2));

    }
}
