package academy.devdojo.maratonajava.javacore.ZZDoptional.view;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalView01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("-------------");

        Optional<String> nameOptional = findName("Luffy");
        System.out.println(nameOptional.orElse("EMPTY"));

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    public static Optional<String> findName(String name) {
        List<String> list = List.of("Luffy", "Shanks");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
