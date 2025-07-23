package academy.devdojo.maratonajava.javacore.ZZClambdas.view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceView03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Veldora", "Benimaru"));
        names.sort(String::compareTo);
        System.out.println(names);
        Function<String, Integer> numStringtoInteger = Integer::parseInt;
        System.out.println(numStringtoInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Rimuru"));
    }
}
