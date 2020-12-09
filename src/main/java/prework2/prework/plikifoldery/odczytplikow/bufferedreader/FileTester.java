package prework2.prework.plikifoldery.odczytplikow.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;

public class FileTester {
    //    https://javastart.pl/kurs/java/java-podstawy-temat-26-operacje-na-plikach/lekcja/java-podstawy-zapis-odczyt-plikow-tekstowych
    //    FileReader - pozwala nam czytać plik znak po znaku,
// BufferedReader - natomiast ta druga wiersz po wierszu
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        FileReader fileReader = null; // pozwala na odczytywanie pliku byte po bycie , literak po literce
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);//opakowaliśmy FileReadera ponieważ BufferedReader pozwala odczytywać dane wiersz po wierszu
            String nextLine = null;
            int lines = 0;
            while ((nextLine = bufferedReader.readLine()) != null) { // tu w pętli sprawdzamy czy dany wiersz nie jest nullem, czyli np wiersz 0 nie jest nullem, jeśli zwróci null to przerywamy pętle bo znaczy to ze dośliśmy do końca
                System.out.println(nextLine);// jeśli nie jest nullem to wyświetlamy
                lines++;
            }
            System.out.println("Ilość wierszy wpliku: " + lines);
        } catch (IOException e) {
            System.err.println("Nie udało się odczytać pliku " + fileName);
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)// zmknąć możemy tylko wtedy jak reader nie będzie nullem
                    bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

//Utworzenie nowego obiektu BufferedReader jest dosyć długie - klasa FileReader pozwala pracować na obiekcie File,
// a BufferedReader dodaje do obiektu FileReader dodatkowe metody - jest to wzorzec projektowy zwany dekoratorem
//    Kolejne wiersze możemy odczytać za pomocą metody readLine() i przypisać je tak jak w naszym przykładzie do tymczasowej
//    zmiennej nextLine typu String. Jeśli readLine() zwróci wartość null, oznacza to, że doszliśmy do końca pliku i należy wyjść z pętli.
//
//    W przypadku odczytu pliku wyjątki mogą wystąpić przy tworzeniu obiektu FileReader (FileNotFoundException) oraz przy
//    nieoczekiwanym problemie odczytu pliku (IOException). Ponieważ wyjątek FileNotFoundException dziedziczy po IOException,
//    możemy je obsłużyć w jednym ogólnym bloku catch.
//
//    Podobnie jak w przypadku Scannera zamykamy strumień, z którego korzystaliśmy. Najczęściej wykorzystywany będzie do
//        tego blok finally w formie jaką przedstawioną, jednak w Javie 7 da się to zrobić ładniej o czym dowiesz się poniżej.
//
//    Po uruchomieniu w konsoli powinien pojawić się identyczny wydruk jak poprzednio.
//}
