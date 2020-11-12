package prework.plikifoldery.zapisplikow;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {

        // tworzenie plików i folderów
        String fileName = "testFile.txt"; //możemy też wskazać ściezkę np. P:\Projekty\Bootcamp java\pl.bootcamp.javastart.zadania\testFile.txt
        File file = new File(fileName); // reprezentacja pliku lub folderu

        boolean fileExists = file.exists();// exists zwraca true lub false,
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.err.println("Nie udało się utworzyć pliku");
            }
        }
        if (fileExists) {
            System.out.printf("Plik " + fileName + " istnieje lub został utworzony");
        }

//       **** file.mkdir() tworzy katalog try catch nie będzie potrzebny

//        boolean fileExists = file.exists();// exists zwraca true lub false,
//        if (!fileExists) {
//            fileExists = file.mkdir(); //mkdirs - tworzy wiele katalogów
//        }
//        if (fileExists) {
//            System.out.printf("Plik " + fileName + " istnieje lub został utworzony");
//        }

    }
    // do tworzenia folfer metoda mkdir(), a ciągu folderów mkdirs()

//    D:/a - utworzony zostanie folder na dysku D o nazwie "a"
//            /a - utworzony zostanie katalog dysku systemowym
//            ./a - utworzony zostanie folder w katalogu projektu
//    ../a - utworzony zostanie folder w folderze powyżej folderu projektu (w przypadku uruchamiania programu eclipse,
//                                                                          bedzie to "workspace")
// trows ingoruje wyjątek
//    przy odczycie plików idealna jest pętla while
}
