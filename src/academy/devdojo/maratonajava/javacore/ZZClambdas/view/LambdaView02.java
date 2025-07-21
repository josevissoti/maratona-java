package academy.devdojo.maratonajava.javacore.ZZClambdas.view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaView02 {
    public static void main(String[] args) {
        List<String> names = List.of("Natsu", "Alucard");
        List<Integer> integers = map(names, String::length);
        List<String> strings = map(names, String::toUpperCase);
        System.out.println(integers);
        System.out.println(strings);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
