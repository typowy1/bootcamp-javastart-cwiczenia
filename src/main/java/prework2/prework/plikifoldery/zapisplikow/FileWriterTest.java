package prework2.prework.plikifoldery.zapisplikow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {

        // najlepsze zapisywanie
        String fileName = "testFile.txt";
        try (
                var fileWriter = new FileWriter(fileName); // zapisuje wiersz po wierszu, nadpisuje dane czyli stracimy wczesniejsze dane, zapisuje znak po znaku
//                var fileWriter = new FileWriter(fileName, true);//jeśli chcemy dopisywać dane do pliku, a nie zapisywać plik od zera, to wystarczy dodać flagę true w konstruktorze FileWritera, rzy każdym uruchomieniu tej klasy w pliku będą pojawiały się kolejne wiersze tekstu pozostawiając te już istniejące, domyślnie ustawione jest false czyli nadpisywanie pliku
                var writer = new BufferedWriter(fileWriter);
        ) {
            writer.write("Bolek");
            writer.newLine();// zapisze w nowym wierszu, dodaje znak nowego wiersza
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
//            writer.flush(); // przy try() with resources nie trzeba tego zapisywać bo zmienne w recourcessą automatycznie zamykane, flush() wypycha danych do pliku, opróżnia bufor, trzeba to zrobic, bez tego nie zapiszą się dane w pliku// mozemy tez użyć close
//            writer.newLine(); // przy dopisywaniu danych do pliku ta liniejka będzie potrzebna
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }

//        Proces tworzenia BufferedWritera przebiega analogicznie jak w przypadku BufferedReadera i również dałoby się go
//        skrócić do jednego wiersza.
//
//        Do zapisu danych w pliku wykorzystujemy metodę write(), która jako argument przyjmuje dowolny String.
//                Istotne jest to, żeby do zapisywania znaku nowej linii używać dedykowanej metody newLine(),
//                dzięki czemu mamy gwarancję, że zostanie wykorzystany znak nowego wiersza odpowiedni dla danego
//        systemu operacyjnego.
//
//        Ponieważ korzystamy z konstrukcji try-with-resources to nie musimy pamiętać o wywołaniu metody close(),
//                jednak jeżeli korzystalibyśmy ze standardowego try-catch i zapomnimy wywołać close() to część danych,
//                która jest w buforze, nie zostanie zapisana. Należy na to zwrócić szczególną uwagę i przynajmniej
//        wywołać metodę flush(), która opróżnia bufor.

//        try() - try-with-resources nie musimy korzystać z instrukcji close,
//        przy standardowym try catch musimy kożystać z i nstrukcji close bo inaczej część danych, która jest w buforze, nie zostanie zapisana
//    Należy na to zwrócić szczególną uwagę i przynajmniej wywołać metodę flush(), która opróżnia bufor.
    }

}
