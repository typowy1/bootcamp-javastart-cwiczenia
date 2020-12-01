package cwiczenia.lekcja14.zadanie8_mapafilmowzpliku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        //czytanie plików
        BufferedReader reader = new BufferedReader(new FileReader("movies.csv"));

        String line = reader.readLine(); //pozbywamy się pierwszej lini, zostanie odczytana i potem nadpisana przez pętle
//        line = reader.readLine() - czyta linie

        Set<Movie> allMovies = new HashSet<>(); // zbiór wszystkich filmów
        while ((line = reader.readLine()) != null) { // dopóki linia nie jest pusta to działaj w pętli, jak będzie pusta to wyjdzie zpętli

            if (line.contains("\"")) {//jeżeli lina zawiera " to splituj po cudzysłowiu
//                tu musimy podzielic tez po cudzysłowiu ba czasami wystepuje
                //40,"Cry, the Beloved Country (1995)",Drama

                String[] split = line.split("\"");

                String genersString;
                String titleWithYear = split[1];
                //okazalo sie ze przy dzieleniu za pomoca " moze wyjsc wiecej niz 3 elemeny wiec dajemy kolejny warunek
                if (split.length == 5) {
                    titleWithYear = split[1] + split[2] + split[3]; // łączymy w jedną całosć
                    genersString = split[4];
                } else if (split.length == 3) {
                    genersString = split[2].substring(1);
                } else {
                    throw new RuntimeException("Split length " + split.length);
                }

                int length = titleWithYear.length();// pierw liczbe liter tytułu zeby wiedziec ile ma i z niej bedziemy obliczac ile trzeba odjac zeby odseparowac rok i tytuł
                String yearAsString = titleWithYear.substring(length - 5, length - 1); // wyciągamy rok
                String title = titleWithYear.substring(0, length - 7); //wyciągamy sam tytuł

                long id = Long.parseLong(split[0].substring(0, split[0].length() - 1)); //pozbylismy sie przecinka 40,

                genersString = split[2].substring(1); // weźmie od pierwszego wszystko dalej - ,Drama
                String[] generesArray = genersString.split(" \\| ");// w kategoriach usuniemy |, Adventure|Animation|Children
                List<String> strings = Arrays.asList(generesArray);
                HashSet<String> geners = new HashSet<>(strings);//zamieniemy tabliece generesArray na zbiór, bo generes w movis to zbiór
                Movie movie = new Movie(id, title, Integer.parseInt(yearAsString), geners);
                allMovies.add(movie);
            } else {

                System.out.println(line);
//            wyciągamy dane 13,Balto (1995),Adventure|Animation|Children
                String[] split = line.split(", ");//dzielimy po przecinku i zapisujemy wartości do tablicy

                Long id = Long.parseLong(split[0]); // zamieniamy stringa na long- 13
                String titleWithYear = split[1].trim();//Balto (1995), trim usówa spacje z przodu i z tył


                String[] generesArray = split[2].split(" \\| ");// w kategoriach usuniemy |, Adventure|Animation|Children
                List<String> strings = Arrays.asList(generesArray);
                HashSet<String> geners = new HashSet<>(strings);//zamieniemy tabliece generesArray na zbiór, bo generes w movis to zbiór

                String title = "";
                String yearAsString = "0";
                if (titleWithYear.contains("(")) {//jezeli zawiera nawiasy
                    int length = titleWithYear.length();// pierw liczbe liter tytułu zeby wiedziec ile ma i z niej bedziemy obliczac ile trzeba odjac zeby odseparowac rok i tytuł
                    yearAsString = titleWithYear.substring(length - 5, length - 1); // wyciągamy rok
                    title = titleWithYear.substring(0, length - 7); //wyciągamy sam tytuł
                }
                //wywołanie konstruktora z klasy Movie
                Movie movie = new Movie(id, title, Integer.parseInt(yearAsString), geners);
                allMovies.add(movie);
            }
        }

    }
}
