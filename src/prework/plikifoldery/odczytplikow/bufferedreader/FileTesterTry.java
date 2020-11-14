package prework.plikifoldery.odczytplikow.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTesterTry {

    public static void main(String[] args) throws IOException {

        // łatwiejszy zapis klasy File tester
//        Jeśli porównamy kod do odczytu plików z wykorzystaniem klas Scanner oraz BufferedReader to nie da się ukryć, że
//        ten drugi jest dużo bardziej skomplikowany, choć robi w zasadzie to samo. Szczególnie negatywnie na czytelność
//        wpływają tutaj zagnieżdżone bloki try-catch, rozdzielona deklaracja i inicjalizacja obiektów FileReader i
//        BufferedReader. Projektanci Javy zauważyli ten problem i rozwiązali go wprowadzając w Javie 7 konstrukcję
//    nazywaną try-with-resources. Jest ona przeznaczona do pracy z klasami służącymi do operacji na zasobach. Jeśli taka
//        klasa implementuje interfejs AutoCloseable, to będziemy zwolnieni z konieczności jawnego wywoływania metody
//    close(), zostanie to za nas zrobione automatycznie po wykonaniu się bloku try. Spójrzmy jak może wyglądać poprzedni
//        przykład z wykorzystaniem tej konstrukcji.

        // od javy 7 można tak to zrobić
//        String fileName = "testFile.txt";
//        try ( // zmienne pomiędzy() będą automatycznie zamykane
//                var fileReader = new FileReader(fileName); //var = FileReader
//                var reader = new BufferedReader(fileReader); // var = BufferedReader
//                // można tez tak, krócej
////                var reader = new BufferedReader(new FileReader("testFile.txt"));
//        ) {
//            String nextLine = null;
//            int lines = 0;
//            while ((nextLine = reader.readLine()) != null) {
//                System.out.println(nextLine);
//                lines++;
//            }
//            System.out.println("Ilość wierszy w pliku " + lines);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //    Deklarację i inicjalizację obiektów FileReader i BufferedReader przenieśliśmy między nawiasy okrągłe występujące
//    bezpośrednio po słowie try. Wszystkie obiekty, które zostaną utworzone w tym miejscu, a implementują interfejs
//    AutoCloseable (w naszym przypadku oba z nich) zostaną automatycznie zamknięte, więc możemy pozbyć się także mało czytelnego
//    bloku finally. Funkcjonalnie kod jest identyczny z tym, który stworzyliśmy wcześniej, jednak jego czytelność jest bez
//    porównania lepsza. Od Javy 10 możemy dodatkowo użyć słowa var, aby jeszcze skrócić zapis.

//        od javy 9 można tak to zrobić
//        W Javie 9 wprowadzono kolejne usprawnienie bloku try-with-resoures, które polega na tym, że deklaracja i inicjalizacja
//    obiektów, które mają być zamknięte nie musi odbywać się bezpośrednio w okrągłych nawiasach przy try. Teraz deklaracja
//        może znajdować się przed blokiem try, a obiekty, które mają być zamknięte należy wymienić w okrągłych nawiasach.
//        Jedyne ograniczenie jest takie, że zmienne muszą być finalne lub efektywnie finalne, czyli nie możemy później
//    przypisywać do nich nowego obiektu.
//    } tu trzeba będzie zignorować wyjątek throws IOException, przy wcześniejszym zapisie nie

        String fileName = "testFile.txt";
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader);

        try (
                fileReader;
                reader;
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        }
    }// podobnie w javie 7 i 8, jednak deklaracja obiektów musiała znajdować się w okrągłych nawiasach).
}
