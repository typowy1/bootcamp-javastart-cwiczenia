package cwiczenia.lekcja12.cwiczenie1atatystykiwysrazow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
//        https://bootcamp.javastart.pl/konto/cwiczenie/1209
        String fileContent = Files.readString(Paths.get("input.txt")); // wczytuje plik do stringa, i można sprawdzac metodami z stringa

        int ileZnakow = fileContent.length();

        fileContent = fileContent.strip(); // usówa puste znaki z przodu i z tyłu

        String[] words = fileContent.split("[ \r\n]"); // dowiemy się ile jest wyrazów, robi splita po spacji i po znaku nowej lini i znak przejścia na początek tej lini, tak nie do końca to rozwiązanie działa
        System.out.println("Liczba wyrazów: " + words.length);
//        ile znaków//

        System.out.println("Ile znaków: " + ileZnakow);

        // liczba czarnych znaków bez spacji tabulatorów enterów
//        replaceAll - zastąp

        String fileContentWithoutEmptyCharcters = fileContent.replaceAll(" ", "");

        System.out.println("Ilosć czarnych znaków " + fileContentWithoutEmptyCharcters.length());
    }
}
