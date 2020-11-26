package prework.strumienie;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberExample {

    //Zobacz teraz, jak ze strumienia odfiltrować liczby nieparzyste (czyli chcemy zostawić same parzyste) i jak je później zebrać do tablicy.

    public static void main(String[] args) {

//        Filtrowanie
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.filter(x -> x % 2 == 0);
        int[] evenNumbers = stream.toArray();
        System.out.println(Arrays.toString(evenNumbers));

//        Utworzyłem strumień pięciu liczb, z których trzy są nieparzyste i chciałbym je odfiltrować. Metoda filter() ma zdefiniowany parametr typu IntPredicate, w którym jest metoda test() o takiej sygnaturze:
//
//boolean test(int value)
//1
//file_copy
//
//Metoda ta przyjmuje liczbę typu int i zwraca true lub false w zależności od tego, czy pewien warunek jest spełniony, czy nie. Metoda ta odpowiada wyrażeniu lambda o sygnaturze (int x) -> boolean, i z tego powodu możemy w to miejsce wstawić wyrażenie lambda x -> x % 2 == 0, które zwraca true dla liczb parzystych i false dla nieparzystych.

        //prawidłowo
        IntStream stream1 = IntStream.of(1, 2, 3, 4, 5);
        IntStream evenStream = stream1.filter(x -> x % 2 == 0);
        int[] evenNumbers1 = evenStream.toArray();
        System.out.println(Arrays.toString(evenNumbers1));
        //Należy zapamiętać jedną ważną rzecz. Strumienie w Javie są leniwe. Oznacza to, że żadna operacje pośrednia nie zostanie na nich wykonana, dopóki nie następuje po niej jakakolwiek metoda terminalna. Odnosząc się do naszego przykładu, metoda filter() nie zostanie uruchomiona, dopóki nie wywołamy na jej wyniku metody toArray().


        // lelpij
        IntStream stream2 = IntStream.of(1, 2, 3, 4, 5);
        int[] evenNumbers2 = stream2.filter(x -> x % 2 == 0).toArray();
        System.out.println(Arrays.toString(evenNumbers2));


    }
}
