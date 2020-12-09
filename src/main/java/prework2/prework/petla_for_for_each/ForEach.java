package prework2.prework.petla_for_for_each;

public class ForEach {
//    https://javastart.pl/kurs/java/java-podstawy-temat-15-petle/lekcja/java-petla-for-i-foreach
    // pętla for each - ma za zadanie iteracje przez wszystkie elementy kolekcji

    public static void main(String[] args) {
        //wyświetlenie wszystkich elementów tablicy przedstawiono poniżej:

//        int[] numbers = {1, 2, 3, 4, 5};
//
//        for (int tmp: numbers){
//            System.out.println(tmp);
//        }
//        W pętli for each występuje tylko jedna zmienna, którą w tym przypadku nazwaliśmy tmp, która musi być zgodna z
//        typem elementów przechowywanych w tablicy, po której iterujemy - u nas int. Do zmiennej tmp w kolejnych
//        przebiegach pętli przypisywane będą kolejne elementy z tablicy, czyli odpowiednio numbers[0], numbers[1],
//                aż do numbers[4].Zapamiętaj ją jako "dla każdego elementu tablicy numbers wykonaj polecenia w ciele pętli"
//                /W ogólności unikaj używania pętli for-each w przypadku, gdy chcesz modyfikować elementy tablicy,
//                używaj jej natomiast możliwie wszędzie tam, gdzie dane chcesz jedynie odczytać..

        //wypełnić tablicę 3 liczbami pobranymi od użytkownika, a następnie wyświetlmy je na ekranie.
        // tak się nie powinno robic, niestety kolejne liczby są przypisywane do zmiannej a nie do tablicy
//        int[] numbers = new int[3];
//        Scanner sc = new Scanner(System.in);
//        for(int tmp: numbers){
//            System.out.println("Podaj liczbę");
//            tmp = sc.nextInt();
//        }
//
//        for (int tmp: numbers){
//            System.out.println(tmp);
//        }

        //poprawna wersja programu

//        int[] numbers = new int[3];
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println("Podaj Liczbę!");
//            numbers[i] = sc.nextInt();
//        }
//        for(int tmp: numbers){
//            System.out.println(tmp);
//        }
//        sc.close();
//        //
//        break - powoduje przerwanie działanie aktualnej iteracji i wyjście z pętli,
//        continue - powoduje przerwanie aktualnej iteracji i przejście do następnej iteracji.

        // wyświetlenie tylko liczb nieparzystych przy użyciu continue, przerywa iteracje dla parzystych,
        // czyli dla spełnionego warunku dla parzystych trzeba zmienić warunek na ==1
        //Pierwsza pętla przeskakuje do kolejnej iteracji, gdy wynik dzielenia modulo przez 2 wynosi 0
        //czyli gdy liczby są parzyste.
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Liczby nieparzyste " + i);
        }
        // zakończenie programu na danej iteracji, wyświetli liczby 1, 2, 3, 4
//W drugiej pętli dzięki instrukcji break powodujemy przerwanie działania i wyjście z pętli, gdy licznik osiąga wartość 5.
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Liczby do 5: " + i);
        }
//        Stosownie instrukcji break w pętli for często odbierane jest jako zła praktyka. Jest to mylące i w przypadku
//        dłuższego ciała pętli może być ciężkie do zrozumienia twoich zamiarów. Skoro na początku w pętli for wskazujesz
//        "iteruj po wszystkich liczbach aż do osiągnięcia przez zmienną "i" wartości 10" to później nie "okłamuj"
//        programu mówiąc mu, żeby przerwał działanie pętli w połowie.

    }
}
