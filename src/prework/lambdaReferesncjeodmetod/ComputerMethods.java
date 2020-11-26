package prework.lambdaReferesncjeodmetod;

import java.util.List;
import java.util.function.Consumer;

public class ComputerMethods {

    public static void main(String[] args) {

//        Dla uproszczenia i czytelności metoda consume() nie jest generyczna. Operuje wyłącznie na obiektach typu Computer.
//        Ponieważ metoda consume() przyjmuje parametr typu Consumer, to przy jej wywołaniu możemy przekazać wyrażenie
//        lambda, co też robimy w metodzie main().
//
//Kod wydaje się całkiem czytelny, ale jeśli pomyślisz o nim w dłuższej perspektywie i tym, że będzie on rozwijany, to
// jednak warto dążyć do tego, żeby:
//
//    kod miał u nas znaczenie - w naszym przypadku musimy się wczytać w ciało wyrażenia lambda, żeby wiedzieć co ono robi,
//    starać się pisać krótkie metody o pojedynczej odpowiedzialności (metoda ma robić jedną rzecz, a dobrze) - u nas metoda
//    main niepotrzebnie się rozrasta, da się ją podzielić na mniejsze metody.

        List<Computer> computers = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("HP", 3200, 66),
                new Computer("Apple", 3400, 78),
                new Computer("Asus", 2800, 42)
        );
//        consume(computers, c -> { // do metody consume przekazaliśmy wyrażenie lambda które zostanie wywołane w iterfejsieconsumer.accepr(computer)
//            String textToPrint = c.getName() + " " + c.getCpu();
//            if (c.getTemperature() < 50)
//                textToPrint += " / cold";
//            else
//                textToPrint += " / hot";
//            System.out.println(textToPrint);
//        });
        //    consume(computers, c -> printComputerWithTemperature(c));

        //Wyrażenie lambda, które przekazujemy teraz przy wywołaniu metody consume, czyli c -> printComputerWithTemperature(c)
        // odpowiada sygnaturą takiemu wyrażeniu lambda jak (Computer c) -> void, to z kolei pasuje do sygnatury metody accept()
        // z interfejsu Consumer.

//        Referencję do metody możemy przekazać na trzy różne sposoby:
//
//    Klasa::metodaStatyczna - przekazanie metody statycznej klasy,
//    obiekt::metodaInstancji - przekazanie metody niestatycznej - niezbędne jest wcześniejsze utworzenie obiektu,
//    Klasa::metodaInstancji - równoznaczne z wywołaniem metody w sposób x..method(y) - gdzie x i y są argumentami.

//        Referencja do metody statycznej
//
//Jeżeli w ramach wyrażenia lambda wywołujemy tylko pojedynczą metodę statyczną, to można ją bezpośrednio zastąpić referencją
//do tej metody. Zasugeruje Ci to nawet IntelliJ, podświetlając odpowiedni kod na żółto. Jeżeli klikniesz na taki kod i wciśniesz
//Alt + Enter, to pojawi się opcja "Replace lambda with method reference", czyli "Zastąp wyrażenie lambda referencją do metody".
//
//Argument postaci ComputerMethods::printComputerWithTemperature, czyli przekazanie referencji
//do metody oraz c -> printComputerWithTemperature(c), czyli przekazanie wyrażenia lambda, są sobie funkcjonalnie równoważne.
//Przekazując referencję do metody statycznej, zawsze musimy skorzystać z zapisu Klasa::nazwaMetodyStatycznej.
//Nawet jeżeli metoda znajduje się w klasie, w której aktualnie jesteśmy, to nie możemy pominąć podania nazwy klasy przed podwójnym dwukropkiem.

        //  consume(computers, ComputerMethods::printComputerWithTemperature);


        //   Referencja do metody instancji

//        Jeżeli w ramach wyrażenia lambda wywołujemy pojedynczą metodę, ale metoda ta nie jest statyczna, to potrzebny
//        będzie obiekt, na którym metodę tę wywołamy. W naszym przypadku dla zobrazowania przykładu możemy usunąć słowo
//        static z sygnatury metody printComputerWithTemperature(). Wykorzystując wyrażenie lambda zapisalibyśmy teraz coś takiego:

        //Podobnie jak w przypadku metody statycznej, jeżeli w ramach wyrażenia lambda wywołujemy pojedynczą metodę, to
        // można takie wyrażenie zastąpić referencją do metody. Referencję do takiej metody przekazujemy jednak poprzez instancję, a nie klasę, czyli:

        ComputerMethods computerMethods = new ComputerMethods();

        consume(computers, computerMethods::printComputerWithTemperature);


        //Referencja do metody instancji, wywoływanej na parametrze wyrażenia lambda
        //
        //Tytuł tej części może brzmi skomplikowanie, ale zobaczysz, że nie jest to takie straszne. Jako przykład dodajmy
        // do klasy Computer dodatkową metodę, która będzie służyła do podkręcania procesora. Jednorazowe podkręcenie procesora,
        // zwiększa jego prędkość o 10%. Podkręcenie procesora powoduje liniowe zwiększenie temperatury, czyli ona też
        // zostanie podniesiona o 10%.

        Computer lenovo = new Computer("Lenovo", 3000, 45);
        lenovo.overclock();
        System.out.println(lenovo.getCpu() + " / " + lenovo.getTemperature() + "C");

//        Wracamy do wcześniejszego przykładu i załóżmy, że chcemy podkręcić każdy komputer, który znajduje się na liście.
//        Możemy w tym celu wykorzystać metodę consume(), przekazując jako argument odpowiednie wyrażenie lambda.


        consume(computers, computer -> computer.overclock());
//        W miejsce wyrażenia lambda c -> c.overclock() możemy przekazać referencję do metody overclock() i zapisać:
        consume(computers, Computer::overclock);

//        Zapis jest identyczny jak w przypadku przekazywania referencji do metody statycznej, jednak schemat działania
//        jest zupełnie inny. Metoda overclock() jest metodą instancji, a do jej wywołania potrzebujemy obiektu typu Computer.
//        Ponieważ metoda ta nic nie zwraca, to wyrażenie lambda, które będzie jej odpowiednikiem miałoby taką sygnaturę
//        (Computer c) -> void. Jest to więc znowu to samo, co wymusza na nas interfejs Consumer. W tym przypadku zapis
//        Computer::overclock oznacza więc, że metoda overclock() zostanie wywołana na każdym obiekcie, który znajduje
//        się w liście, a w przypadku metody statycznej oznaczało to, że każdy kolejny obiekt z listy będzie argumentem metody statycznej.


//        Podsumowanie
//
//W miejsce wyrażenia lambda możesz przekazać referencję do metody, która będzie pasowała swoją sygnaturą do tego wyrażenia.
// Jest to szczególnie wskazane, jeżeli w ramach wyrażenia lambda masz zapisane kilka linijek kodu i chcesz podnieść jego czytelność.
// W takiej sytuacji wydziel ten kod do osobnej metody, a następnie zamiast wyrażenia lambda, przekaż referencję do metody.
//
//Istnieją trzy sposoby na przekazywanie referencji do metod. Wybór odpowiedniego spośród nich zależy od konkretnego przypadku i
// niestety nie ma tutaj żadnej uniwersalnej zasady, którą dałoby się opisać przy pomocy krótkiego zdania.

    }

    //Interesuje nas w tym przypadku fakt, że metoda przyjmuje parametr typu Computer i nie zwraca żadnego wyniku. Gdyby to
// odzwierciedlić przy pomocy wyrażenia lambda, to ponownie otrzymujemy sygnaturę (Computer c) -> void.
    private void printComputerWithTemperature(Computer computer) {
        String textToPrint = computer.getName() + " " + computer.getCpu();
        if (computer.getTemperature() < 50)
            textToPrint += " / cold";
        else
            textToPrint += " / hot";
        System.out.println(textToPrint);
    }


    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        //        Consumer<Computer> consumer jakiś parametr typu consumer który będzie pozwalał na wykonanie operacji na kazdym komuterze jakiś parametr typu consumer który będzie pozwalał na wykonanie operacji na kazdym komuterze
        for (Computer computer : computers) {
            consumer.accept(computer);
        }
    }
}
