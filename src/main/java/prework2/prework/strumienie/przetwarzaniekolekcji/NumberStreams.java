package prework2.prework.strumienie.przetwarzaniekolekcji;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberStreams {

    private static final int DIVIDER = 10;

    public static void main(String[] args) {

//        //
//        toCollection(TypKolekcji::new)
//
//        Dzięki takiemu podejściu zyskujemy bardzo wygodną możliwość tworzenia różnych rodzajów kolekcji na żądanie. Prosty przykład:

//        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
//        // lista kwadratów kolejnych 100 liczb całkowitych
//        List<Integer> squareNumbers = numStream.map(x -> x*x)
//                .limit(100)
//                .collect(Collectors.toList());
//        // zbiór kwadratów liczb
//        Set<Integer> biggerThan5 = squareNumbers.stream()
//                .filter(x -> x%10 ==0)
//                .map(x -> x/10)
//                .collect(Collectors.toCollection(TreeSet<Integer>::new));
//
//        System.out.println("List");
//        squareNumbers.forEach(x -> System.out.print(x + " ; "));
//        System.out.println("\nSet");
//        biggerThan5.forEach(x -> System.out.print(x + " ; "));

        //Lista squareNumbers wygenerowana została na podstawie strumienia liczb całkowitych numStream. Wywołanie map(x -> x*x) powoduje podniesienie każdej liczby do kwadratu, a limit(100) ogranicza ilość liczb przetworzonych przez strumień do 100. Dalsze wartości nie są obliczane, bo strumienie są leniwe, czyli wykonują tak mało pracy jak to możliwe. Na końcu zwracamy listę za pomocą metody collect(), przekazując jej odpowiedni Collector.
        //
        //Kolejny zbiór liczb tworzymy na podstawie strumienia uzyskanego z wcześniej utworzonej listy (strumień operuje więc na 100 liczbach). Strumień filtrujemy i zostawiamy tylko liczby podzielne przez 10. Liczby, które go spełniają dzielimy przez 10 w metodzie map(). Tym razem posłużyliśmy się w metodzie collect() Collectorem zbierającym dane do konkretnego typu kolekcji (TreeSet). Zauważ, że strumień nie operuje na oryginalnych wartościach kolekcji, więc elementy listy podzielne przez 10 nadal mają wartości takie jak 100, 400, ... a w zbiorze te wartości wynoszą 10, 40, ...


//        Powtarzalność kodu i referencje metod
//
//Powyższy kod jest całkiem czytelny, ale posiada pewien mankament. W wielu sytuacjach będzie się zdarzało, że warunki filtrowania, czy mapowania strumienia będą powtarzalne. Zapisywanie więc wszędzie tego samego, np. filter(x -> x%5==0) byłoby stratą czasu i jakakolwiek zmiana wymagałaby poprawek w wielu miejscach kodu. Jeszcze gorzej sytuacja będzie wyglądała, gdy będziemy operowali na obiektach i będziemy odwoływali się do ich metod, bo wtedy warunki przestaną być czytelne.
//
//Warto w takich sytuacjach zastępować wyrażenia lambda zwykłymi metodami, przerabiając poprzedni kod uzyskamy więc poniższy:

//        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
//        // lista kwadratów kolejnych 100 liczb całkowitych
//        List<Integer> squareNumbers = numStream.map(NumberStreams::square)
//                .limit(100)
//                .collect(Collectors.toList());
//        //zbiór kwadratów liczb
//        Set<Integer> biggerThan5 = squareNumbers.stream()
//                .filter(NumberStreams::isDividedBy)
//                .map(NumberStreams::divide)
//                .collect(Collectors.toCollection(TreeSet<Integer>::new));
//
//        System.out.println("List");
//        squareNumbers.forEach(x -> System.out.print(x + " ; "));
//        System.out.println("\nSet");
//        biggerThan5.forEach(x -> System.out.print(x + " ; "));


//        Do generowania liczb wykorzystujemy metodę iterate(), jednak ponieważ w programowaniu często istnieje potrzeba operowania na strumieniach liczb, to w Javie 8 zdefiniowano gotowe klasy strumieni liczbowych takie jak:
//
//    IntStream
//    LongStream
//    DoubleStream
//
//Nazwy wskazują, na jakich wartościach możemy na nich operować. Dodatkowo klasa String implementując interfejs CharSequence pozwala przekształcić dowolny napis w strumień wartości Integer. Przypomnijmy, że znaki typu char mogą być również reprezentowane w postaci odpowiadających im kodów w tabeli Unicodu, czyli po prostu liczb całkowitych. W celu przekształcenia napisu na strumień skorzystaj z metody:
//
//    "dowolnyString".chars()
//
//Metoda main() naszego przykładu może więc zostać przerobiona na poniższą:

        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = IntStream.range(0, 100)
                .map(NumberStreams::square)
                .boxed()
                .collect(Collectors.toList());
        //zbiór kwadratów liczb
        Set<Integer> biggerThan5 = squareNumbers.stream()
                .filter(NumberStreams::isDividedBy)
                .map(NumberStreams::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + " ; "));
        //metoda range(0, 100) generuje dla nas liczby od 0 do 99, które później podnosimy do kwadratu. Jeżeli chcemy przekształcić strumień IntStream w typ Stream<Integer> należy wywołać metodę boxed() a wtedy przerobić ją na listę.


    }

    private static int square(int x) {
        return x * x;
    }

    private static boolean isDividedBy(int x) {
        return x % DIVIDER == 0;
    }

    private static int divide(int x) {
        return x / DIVIDER;
    }


}
