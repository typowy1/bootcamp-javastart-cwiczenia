package prework2.prework.kolekcja_i_metody.listy;

import java.util.Arrays;
import java.util.List;

public class ArrTest {
    public static void main(String[] args) {
        // przed java 9:
//        Jeżeli chcemy utworzyć niewielką listę i znamy elementy, które będą do niej wstawione, to przed Javą 9
//        najwygodniejszym sposobem było wykorzystanie metody Arrays.asList()

        Integer[] ints = {5, 10, 15};
        List<Integer> lista = Arrays.asList(ints);
        for (Integer num : lista) {
            System.out.println(num);
        }

        //collections factory methods
//        Java 9 wprowadza tzw. collections factory methods, czyli specjalne metody, przeznaczone przede wszystkim do
//            tworzenia niewielkich list, gdy znamy elementy, które mają się w niej znaleźć. Od teraz w celu utworzenia
//        listy można zapisać:

        List<Integer> numbers = List.of(5, 10, 15); //metoda tworząca niewielkąliste, !nie można z niej usówać ani dodawać do niej elementów
        for (Integer number : numbers) {
            System.out.println(number);
        }
//        Istnieje też specjalna wersja tej metody przyjmująca dowolną liczbę argumentów, ale nie powinna ona być nam zbyt
//        często potrzebna. Rozwiązanie takie jest podyktowane kwestią wydajności i przy niewielkich tablicach pozwala uniknąć
//        tworzenia dodatkowej tablicy.

//        Bardzo ważną kwestią przy tworzeniu list z użyciem powyższej metody jest to, że lista taka jest niemodyfikowalna,
//        czyli nie możemy do niej ani dodawać, ani usuwać z niej elementów. Jeśli spróbujemy to zrobić to otrzymamy wyjątek
//                UnsupportedOperationException

//        Listy i inne kolekcje a polimorfizm
//
//        Ponieważ zarówno klasy ArrayList jak i LinkedList implementują wspólny interfejs List, to wiele z ich metod jest
//        współdzielonych. Dzięki temu w wielu sytuacjach lepiej jest pisać programy operujące na jak najbardziej abstrakcyjnych
//        typach kolekcji. Przykładowo jeśli chcemy napisać metodę, która wyświetla wszystkie elementy listy, to lepiej jest
//        zadeklarować, że przyjmuje ona jako parametr obiekt typu List, a nie LinkedList, czy ArrayList, bo dzięki temu
//        będziemy mogli do niej przekazać zarówno te pierwsze jak i drugie:
    }
}
