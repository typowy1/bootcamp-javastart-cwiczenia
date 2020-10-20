package prework.petla_for_for_each;

import java.util.Scanner;

public class NumberChecker {
    //https://javastart.pl/kurs/java/java-podstawy-temat-15-petle/lekcja/java-petla-for-i-foreach
    public static void main(String[] args) {

        //Napiszmy drugi program, który pozwoli wczytać 3 liczby całkowite od użytkownika i za każdym razem rozpozna,
        // czy liczba ta jest parzysta (podzielna przez 2), czy też nieparzysta.
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Liczba " + number + " jest parzysta");
            } else {
                System.out.println("Liczba " + number + " jest nieparzysta");
            }
        }
        System.out.println("Koniec zabawy!");
        scanner.close();
//        Najpierw utworzyliśmy obiekt Scanner, który pozwoli wczytywać dane. Dalej utworzyliśmy zmienną lokalną number, do
//            której będziemy mogli przypisać kolejne liczby i na bieżąco wyświetlić odpowiednie informacje zwrotne.
//                W pętli for inicjujemy licznik liczbą 0, ponieważ chcemy wczytać trzy liczby to warunek stopu
//        ustawiliśmy na i<3 (dla wartości i=0, 1, 2 otrzymamy true) i w każdym przebiegu pętli zwiększamy licznik przy
//        pomocy inkrementacji(i++).
//                Wewnątrz pętli najpierw prosimy użytkownika o wprowadzenie liczby, program będzie oczekiwał dopóki
//        użytkownik jej nie poda. W instrukcji warunkowej if wykorzystaliśmy operację modulo (reszta z dzielenia).
//                Jeśli liczba jest podzielna przez 2 (jest parzysta) to reszta z dzielenia wynosi 0, natomiast jeśli
//        reszta z dzielenia jest inna (jedyna inna możliwa wartość to 1) to liczba jest nieparzysta.
//
//        Na końcu zamykamy strumień w Scannerze. Warto tutaj zwrócić szczególną uwagę na to, żeby Scannera nie zamknąć np.
//        wewnątrz pętli, a dopiero wtedy kiedy już nie będziemy z niego korzystali. Jeśli wywołamy metodę close() to nie
//        będzie już możliwe wczytanie niczego więcej.

//        Kolejność wykonywania pętli for to:
//
//        Zainicjowanie licznika.
//        Sprawdzenie warunku.
//        Jeśli warunek jest spełniony, to wykonywane są instrukcje w ciele pętli, wykonywane jest wyrażenie
//        modyfikujące licznik, po czym wracamy do punktu 2.
//        Jeśli warunek nie jest spełniony, to wychodzimy z pętli.


        // pętla for each - ma za zadanie iteracje przez wszystkie elementy kolekcji

    }
}
