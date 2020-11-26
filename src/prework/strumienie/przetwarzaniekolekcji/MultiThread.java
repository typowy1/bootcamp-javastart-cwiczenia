package prework.strumienie.przetwarzaniekolekcji;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiThread {

    //    Ostatnią z zalet strumieni w połączeniu z kolekcjami, którą omówimy jest wielowątkowe przetwarzanie kolekcji.
//
//W Twoim komputerze uruchomionych jest w tym momencie wiele procesów, czyli w ogólności aplikacji i usług systemowych, które sprawiają, że wszystko po prostu działa. W ramach pojedynczego procesu może jednak być uruchomionych kilka wątków, co sprawia, że aplikacje mogę wykonywać obliczenia szybciej lub np. w jednym wątku przetwarzać dane a w innym odbierać dane od użytkownika i wykonywać te czynności jednocześnie.
//
//Programowanie wielowątkowe przynosi korzyści zarówno na procesorach jedno jak i wielordzeniowych, ponieważ niezależnie od naszej architektury sprzętowej każdy proces otrzymuje co chwilę krótki przydział procesora - w przypadku aplikacji wielowątkowej na procesorze z pojedynczym rdzeniem, aplikacja otrzyma więc więcej przydziałów i zdąży wykonać więcej obliczeń.
//
//wielowątkowość
//
//Standardowo kolekcje w Javie do 7 włącznie nie dostarczały mechanizmów do przetwarzania i obliczeń wielowątkowych, jednak wraz z wprowadzeniem strumieni jest to już możliwe. Przydatne będzie szczególnie wtedy, gdy na każdym elemencie obiektu kolekcji będziemy wywoływać czasochłonną metodę, taką jak odczyt/zapis do zewnętrznej bazy danych, czy odczyt danych z internetu.
//
//W celu zobrazowania korzyści napiszmy metodę, która będzie symulowała wykonywanie pewnych obliczeń przez czas 1 sekundy. W tym celu zastosujmy wykorzystywaną już wcześniej metodę Thread.sleep(), która usypia aktualnie wykonywany wątek na czas wskazany jako parametr metody.
    public static void main(String[] args) {
//    List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//    ints = ints.stream()
//            .map(MultiThread::incrementValue)
//            .collect(Collectors.toList());

//    Po uruchomieniu programu przez 10 sekund na ekranie co sekundę pojawi się kolejna linia tekstu. Całość można jednak znacznie przyspieszyć przetwarzając strumień wielowątkowo. W starszych wersjach Javy byłby to mocno skomplikowane, w Javie 8 wystarczy dopisać wywołanie jednej metody parallel():

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints = ints.stream()
                .parallel()
                .map(MultiThread::incrementValue)
                .collect(Collectors.toList());

//Alternatywą jest wywołanie na kolekcji metody parallelStream() zamiast samego stream(). Zauważ jedną ważną rzecz, że przetwarzanie danych w ten sposób nie gwarantuje nam kolejności przetwarzania obiektów, wszystko zależy od tego, który wątek dostał ile czasu procesora.
    }

    public static int incrementValue(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + x);
        return x + 1;
    }

}
