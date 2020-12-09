package prework2.prework.strumienie;

import java.util.List;
import java.util.stream.Stream;

public class Strumienieprzyklady {

    public static void main(String[] args) {

        // strumienie to strumien danych, stream to pętla for
        // dział w sposób sekwncyjny czyli 1 po drugim
        // bierze 1 element z streamu i przepuszcza przez wszystkie metodu, potem drugi itd
        // streamy sa leniwe, jezeli im nie powiemu ze cos ma robic to nic nie zrobi
        //metody posrednie nie powoduja ze stream zacznie pracowac, metody terminalne to mowia, foreach, colecttolist, reduce
        //streamy nie modyfikują kolekcji, modyfikuje tylko stream, np zbierze dane elementy z kolekcji

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4)
                .filter(x -> x % 2 == 0); //co ma robić


        Stream.of(1, 2)
                .parallel()//rozdzielanie stremow na rownoległe
                .map(x -> x * 2)
                .reduce(Integer::sum); // sumowanie elementów w streamie


        //****tworzenie streamow

        // pusty stream
        Stream<Integer> empty = Stream.empty();
        Stream<String> empty1 = Stream.empty();

        //za pomocą metody of
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);//różne typy mogą być

        //za pomocą kolekcji, z kolekcji tworzymy streama, bedzie zawierał wszystkie elementy znajdujace sie w kolekcji
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Stream<Integer> stream = integers.stream(); //stream

        //konkatenacja streamow, łączenie streamow

        Stream<Integer> integeras = Stream.of(1, 2, 3);
        Stream<Integer> integerasTwo = Stream.of(4, 5, 6);
        Stream<Integer> concat = Stream.concat(integeras, integerasTwo); // nowy stream ctóry będzie zawierał wartości z dwóch pozostałych


        //******Lambdy funkcje na streamach, wyrazenia lambda to instancja typu ktora ma jedna metode abstrakcyjna
//        f(x) = x * 2;
//        f(2) = 2 * 2;
//        to samo co

//        (x) -> x * 2

//        forEach - metoda kończąca, zmuszająca stream do działanoa
        List<Integer> integers3 = List.of(1, 2, 3, 4, 5, 6, 7);// - // list of tworzy nie modyfikowalna arraylist
        integers3.stream() //zwraca strumien lementow wewnątrz kolekcji
                .forEach(number -> System.out.println(number)); //wyświetli każdy element z kolekcji, przyjmuje consumer czyli interfejs funkcyjny, zawierający abstrakcyjną metode czyli tak ktora nie ma implementacji, consumer przyjmuje wartosć i zwraca nic czyli zwraca void


    }
}
