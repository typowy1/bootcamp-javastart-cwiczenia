package cwiczenia.lekcja17woddzielnymrepo.lekcja17wcwiczeniachwfolderze.cwiczenie2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strumien {
    public static void main(String[] args) {

        // moje rozwiązanie
        List<Integer> list = IntStream.iterate(8, x -> x + 1)
                .filter(x -> x > 100 && x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        list.forEach(x -> System.out.print(x + "; "));
        // list.forEach(System.out::print);

        // rozwiazanie javastart

        Stream.iterate(8, i -> i + 1)
                .filter(number -> number > 100)
                .filter(number -> number % 5 == 0)
                .map(number -> number * 3)
                .limit(10)
                .forEach(System.out::println);

    }
}
