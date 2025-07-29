package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardView02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(gatos);
        printConsulta(cachorros);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    /*
        ? - Define o uso do Wildcard
          - Utilizado para se referenciar a um tipo genérico sem a necessidade de saber ou modificar o tipo.
          - Condições podem ser postas para limitar as classes utilizadas.
     */

    /*
        Ao se usar 'extends', define que Classes filhas de Animal são aceitas como parâmetro.
        Não se pode adicionar elementos em métodos com extends
            - Evita conflitos de classes específicas incompatíveis.
     */
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    /*
        Ao se usar 'super', define que Classes pai de Animal são aceitas como parâmetro.
            - Evita problemas de conflito entre classes específicas por se utilizar parâmetros genéricos.
     */
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
