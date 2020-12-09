package prework2.prework.strumienie;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
//Jak wiemy strumień może składać się z obiektów o bardziej złożonej strukturze danych, przykładowo może to być strumień zdefiniowany jako Stream<List<Integer>>, gdzie tego typu strumień stworzyliśmy dzieląc kolekcję wejściowej (List lub Set) na szereg kolekcji o mniejszym rozmiarze z wykorzystaniem operacji grupowania (Collectors.groupingBy()).
//
//Czasem jednak zachodzi potrzeba uproszczenia takiej struktury i przekształcenia takiego strumienia w np. Steram<Integer>. Innymi słowy zamiast strumienia w postaci […[2, 4, 6], [8, 10, 12], [14, 16]…] chcemy uzyskać strumień w postaci  […2, 4, 6, 8, 10, 12, 14, 16…]. W tym wypadku flatMap() okazuje się przydatną operacją by taką strukturę uprościć i tym samym ułatwić dalsze operacje na elementach strumienia. Poniższy listing pokazuje przykładowe zastosowanie flatMap() , by uzyskać pożądany efekt.

//    czyli  z takiej postaci […[2, 4, 6], [8, 10, 12], [14, 16]…]
//
//    uzyskujemy taką postać […2, 4, 6, 8, 10, 12, 14, 16…]

//flatMap przyjmuje jako paramter strumień
//
//więc np nie można .flatMap(payment -> payment.getItems).... - bo to by daje List<PaymentItem>
//
//ale za to flatMap(payment -> payment.getItems().stream()) - powinno przejść

    public static void main(String[] args) {
        final List<List<Integer>> slicedIntegers = Arrays.asList(
                Arrays.asList(2, 4, 6),
                Arrays.asList(8, 10, 12),
                Arrays.asList(14, 16)
        );

        final List<Integer> simpleIntegerList =
                slicedIntegers
                        .stream()
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());

        System.out.println("slicedIntegers: " + slicedIntegers);
        //slicedIntegers: [[2, 4, 6], [8, 10, 12], [14, 16]]

        System.out.println("simpleIntegerList: " + simpleIntegerList);
        //simpleIntegerList: [2, 4, 6, 8, 10, 12, 14, 16]


    }

}
