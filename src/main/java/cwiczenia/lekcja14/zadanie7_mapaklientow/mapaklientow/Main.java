package cwiczenia.lekcja14.zadanie7_mapaklientow.mapaklientow;

import java.util.*;

public class Main {
    // z mapy robimy pole klasy
    private static Map<Long, Customer> customerMap = new HashMap<>();// tworzym ymape do której odnosimy si w metodzie addToMap
    //tworzymy mapę, nie musimy mieć sortowania

    public static void main(String[] args) {
        addToMap(1L, "Jan", "Kowalski", "022 565787987");// dodawanie klienta i klucza do mapy za pomocą metody
        addToMap(2L, "Ola", "Godpodarna", "022 76876876");// dodawanie klienta i klucza do mapy
        addToMap(3L, "Krzyś", "Kowalskiewicz", "022 8976759");// dodawanie klienta i klucza do mapy

        //wyświetlanie informacji o kluczach
        Set<Long> longs = customerMap.keySet();//zbieramy zbiór kluczy
        System.out.println(longs); // wyświetli zbiór kluczy

        //wyświetlanie wartosci, czyli w tym wypadku obiektu Customer
        Collection<Customer> values = customerMap.values();
        System.out.println(values);

        // Zapytaj użytkownika o id klienta:
        System.out.println("Podaj id klienta");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong(); // wczytaj id od klienta do zmiennej
        scanner.nextLine();
        scanner.close();
        // i wyszukuje w mapie id ktre podał klient
        // Customer customer = customerMap.get(id);//id=klucz mapy wiec mozemy wyszukac po id
//        lub tak
        //sprawdzmy czy zawiera klucz
        boolean containsIdKey = customerMap.containsKey(id);//sprawdzumy czy mapa zawiera taki klucz
        if (containsIdKey) { // jezeli zawiera klucz to będziemy wyświetlać a w przeciwnym razie, to wyświetlimy że nie ma takiego klienta
            Customer customer = customerMap.get(id);// pobieramy klucz
            System.out.println(customer); //i na podstawie klucza wyświetlamy dane klienta
        } else {
            System.out.println("Nie znaleziono klienta o tym id");
        }

    }

    //metoda do dodawania klienta do mapy
    private static Customer addToMap(Long id, String firstName, String kowalski,
                                     String telNumber) {// id dodajemy w dwóch miejscach, jako klucz mapy i jako id w konstruktorze
        return customerMap.put(id, new Customer(id, firstName, kowalski, telNumber));
    }
}
