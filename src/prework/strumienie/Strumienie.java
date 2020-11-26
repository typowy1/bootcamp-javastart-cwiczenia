package prework.strumienie;

import java.util.stream.Stream;

public class Strumienie {

    //Podstawową interfejsem, który reprezentuje strumień w Javie jest Stream.
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");

//        Analogicznie jeśli przekażemy do metody np. jakieś liczby, to zostaną one opakowane w swoje odpowiedniki obiektowe i uzyskamy np. strumień obiektów Integer:
//
//Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
//1
//file_copy
//
//W sytuacji, gdy nie chcesz operować na typach opakowujących typów prostych, tylko bezpośrednio na strumieniu wartości typów prostych, to należy wykorzystać jedną z przeznaczonych do tego klas:
//
//    IntStream,
//    LongStream,
//    FloatStream,
//    DoubleStream.
//
//W każdej z tych klas także znajduje się m.in. metoda of(), którą możemy wykorzystać analogicznie do tego co pokazano powyżej, np.:
//
//IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
//1
//file_copy
//
//Różnica w porównaniu do wcześniejszego przykładu z klasą Stream polega na tym, że tym razem operujemy na liczbach typu int, a nie obiektach Integer, co w niektórych przypadkach może mieć spore znaczenie, bo wartości typów prostych zajmują nieporównywalnie mniej pamięci.


//        Filtrowanie, mapowanie, operacje pośrednie i terminalne
//
//Ok, mamy utworzony strumień i co dalej? Możemy na nim wykonywać różne operacje. Jest ich naprawdę sporo, ale na początek ograniczymy się do trzech metod:
//
//    filter() - filtruje elementy strumienia zgodnie z zadanym kryterium w postaci predykatu, zwraca przefiltrowany strumień,
//    map() - przekształca każdy element strumienia zgodnie z przekazaną funkcją, zwraca strumień z przetworzonymi elementami,
//    toArray() - zbiera elementy strumienia do tablicy.
//
//Zobacz teraz, jak ze strumienia odfiltrować liczby nieparzyste (czyli chcemy zostawić same parzyste) i jak je później zebrać do tablicy.

    }
}
