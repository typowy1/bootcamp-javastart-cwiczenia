package prework.strumienie;

import java.util.stream.IntStream;

public class Generator {

    public static void main(String[] args) {
//        Tworzenie strumieni na bazie generatora

//        Innym sposobem na stworzenie strumienia jest wykorzystanie metody iterate() z klasy Stream, IntStream lub podobnej. Jako pierwszy argument przyjmuje ona wartość początkową strumienia (w ogólności dowolny obiekt), a jako drugi parametr wyrażenie lambda, zgodne z interfejsem UnaryOperator. Interfejs ten rozszerza interfejs Function i posiada metodę:
//
//T apply(T t);
//1
//file_copy
//
//To co odróżnia UnaryOperator od interfejsu Function, to fakt, że w tym przypadku funkcja przyjmuje i zwraca obiekt tego samego typu. W przypadku interfejsu Function mogliśmy przyjąć obiekt jednego typu i zwrócić coś innego.
//
//Jeżeli chcesz uzyskać strumień kolejnych liczb całkowitych zaczynając od zera, wystarczy zapisać:
        IntStream numStream = IntStream.iterate(0, x -> x + 1);
//
//IntStream numStream = IntStream.iterate(0, x -> x + 1);
//1
//file_copy
//
//Powyższy zapis oznacza "stwórz strumień liczb typu int, zaczynając od 0, a każdy kolejny element powinien być zgodny z przekazaną funkcją, czyli kolejne wartości powinny być większe o 1 od poprzedniej".
//
//Zauważ, że strumień stworzony w taki sposób jest potencjalnie nieskończony, nie mamy tutaj żadnego ograniczenia, które wskazywałoby ile wartości chcemy wygenerować. Z tego powodu, jeżeli spróbujesz np. uruchomić program, w którym są takie dwie linijki kodu:
//
//IntStream numStream = IntStream.iterate(0, x -> x + 1);
//int[] numbers = numStream.toArray();
//1
//2
//file_copy
//
//to otrzymasz wyjątek OutOfMemoryError, który mówi o tym, że na stercie zabrakło miejsca.
//
//Możesz jednak na takim strumieniu wywołać metodę limit(), w której możesz podać liczbę, która będzie oznaczała ile początkowych elementów ze strumienia wejściowego ma trafić do strumienia, który powstanie w wyniku wywołania tej metody. W celu utworzenia strumienia z liczbami od 0 do 99, należy więc nałożyć limit na 100 elementów:
//
//IntStream numStream = IntStream.iterate(0, x -> x + 1);
        IntStream linitedStream = numStream.limit(100);
//IntStream limitedStream = numStream.limit(100);
//int[] numbers = limitedStream.toArray();
//System.out.println(Arrays.toString(numbers));
//1
//2
//3
//4
//file_copy
//
//Tym razem z zamianą strumienia na tablicę nie będzie już problemu. Pamiętaj, że strumienie są leniwe, pomimo że oryginalny strumień reprezentuje potencjalnie nieskończoną sekwencję elementów, to nie będą one generowane, dopóki nie będą potrzebne. Alternatywnym sposobem na stworzenie strumienia z liczbami z zamkniętego przedziału jest wykorzystanie metody rangeClosed() gdzie podajemy wartość początkową i końcową strumienia:
//
//IntStream numbers = IntStream.rangeClosed(0, 99);
//1
//file_copy
//
//Zarówno liczba 0 jak i 99 będą uwzględnione w strumieniu.
//
//Na strumieniu utworzonym z wykorzystaniem metody iterate() możesz oczywiście wykonywać dalsze operacje. Przykładowo jeżeli chcesz utworzyć tablicę 100 liczb, które będą kwadratami kolejnych 100 liczb całkowitych, rozpoczynając od 0, to zapiszemy to tak:

//Na strumieniu utworzonym z wykorzystaniem metody iterate() możesz oczywiście wykonywać dalsze operacje. Przykładowo jeżeli chcesz utworzyć tablicę 100 liczb, które będą kwadratami kolejnych 100 liczb całkowitych, rozpoczynając od 0, to zapiszemy to tak:
//
//int[] squares = IntStream.iterate(0, x -> x + 1)
//        .limit(100)
//        .map(x -> x * x)
//        .toArray();
//System.out.println(Arrays.toString(squares));

        //Jeżeli z tych liczb chcielibyśmy pobrać wyłącznie liczby parzyste, to wystarczy w sekwencję wywołania metod wpleść dodatkowo metodę filter().
        //
        //int[] squares = IntStream.iterate(0, x -> x + 1)
        //        .limit(100)
        //        .map(x -> x * x)
        //        .filter(x -> x % 2 == 0)
        //        .toArray();


        //To samo można zapisać z wykorzystaniem np. klasycznej pętli for, jednak byłoby to nieporównywalnie bardziej skomplikowane, ponieważ zwróć uwagę, że nie wiemy na samym początku jaki będzie rozmiar wynikowej tablicy. Wykorzystanie strumieni pozwala pisać kod bardziej ekspresywny, tzn. taki, który krok po kroku "opowiada" nam co będzie się działo w programie.


//        Strumienie w API Javy
//
//W Javie 8 niektóre klasy zostały zaktualizowane, aby wykorzystać potencjał strumieni. Przykładem takiej klasy jest BufferedReader, w którym pojawiła się metoda dodatkowa metoda lines() zwracająca strumień typu Stream<String>. Analogiczna metoda znajduje się od Javy 9 także w klasie Scanner i nazywa się tokens().
//
//Dzięki temu np. do wczytania całej zawartości pliku nie potrzebujesz już pętli. Zamiast tego, jeśli chcesz wczytać np. tekst z pliku o nazwie plik.txt i go wyświetlić, to możesz zapisać:
//
//Scanner scanner = new Scanner(new File("plik.txt"));
//Stream<String> tokens = scanner.tokens();
//tokens.forEach(System.out::println);
//1
//2
//3
//file_copy
//
//lub krócej:
//
//Scanner scanner = new Scanner(new File("plik.txt"));
//scanner.tokens().forEach(System.out::println);
        //lub
//        scanner.tokens()
//        .map(String::toUpperCase)
//        .forEach(System.out::println);
//1
//2
//file_copy
//
//Metoda forEach() jest metodą terminalną, jako jej argument przekazujemy konsumenta, który pozwoli wykonać pewną operację na każdym obiekcie w strumieniu - u nas jest to wyświetlanie.
    }
}
