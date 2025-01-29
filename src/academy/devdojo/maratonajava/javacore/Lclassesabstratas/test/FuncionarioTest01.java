package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 120000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zoro", 200000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprint();
    }
}
