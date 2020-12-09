package prework2.prework.strumienie;

import java.util.Arrays;
import java.util.stream.Stream;

public class LetterStream {

//    Przejdźmy teraz do kolejnego przykładu. Tym razem skupmy się nie na filtrowaniu, ale na przekształcaniu obiektów w strumieniu. Wykorzystamy do tego metodę pośrednią map(). Aby było ciekawiej stworzymy tym razem strumień z obiektami, konkretnie z napisami "a", "b", "c", a w wyniku będziemy chcieli uzyskać tablicę z tymi samymi elementami, ale w postaci wielkich liter. Jeżeli chcesz utworzyć nowy strumień o takiej samej liczbie elementów co strumień źródłowy i chcesz jednocześnie wykonać pewną operację na każdym obiekcie, to należy do tego celu wykorzystać metodę map(). Przyjmuje ona parametr typu Function, czyli w jego miejsce możemy przekazać wyrażenie lambda przekształcające obiekt typu T w jakiś obiekt typu R. U nas będziemy przekształcali obiekt typu String w inny obiekt typu String i jest to jak najbardziej ok.

    public static void main(String[] args) {
//        Stream<String> letters = Stream.of("a", "b", "c");
//        Object[] upperCaseLetters = letters.map(s -> s.toUpperCase())
//                .toArray();
//        System.out.println(Arrays.toString(upperCaseLetters));

        //prawidłowo
//        /Jedynym problemem jaki pojawia się w powyższym kodzie jest to, że metoda toArray() zwraca tablicę typu Object[], a nie String[]. Jest to związane z wymazywaniem typów generycznych na etapie kompilacji. Da się to jednak dosyć łatwo naprawić, ponieważ istnieje przeciążona wersja metody toArray(), do której możemy przekazać wyrażenie lambda, które utworzy tablicę size -> new String[size], albo referencję do konstruktora tablicy, czyli String[]::new. To co możemy dodatkowo zmienić, to zamiast wyrażenia lambda, które przekształca litery z małych na wielkie, możemy przekazać referencję do metody toUpperCase().

        Stream<String> letters = Stream.of("a", "b", "c");
        String[] upperCaseLetters = letters.map(String::toUpperCase).toArray(String[]::new); // arraj zwraca typ Obiect a z zapisem String[]::new zwróci stringa
        System.out.println(Arrays.toString(upperCaseLetters));

    }
}
