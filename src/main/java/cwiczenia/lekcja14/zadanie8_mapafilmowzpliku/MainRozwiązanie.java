package cwiczenia.lekcja14.zadanie8_mapafilmowzpliku;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainRozwiązanie {
    public static void main(String[] args) {

        MovieDatabaseReader movieDatabaseReader = new MovieDatabaseReader();

        try {
            Set<Movie> allMovies = movieDatabaseReader.readMovieDatabase();
            System.out.println("Baza danych wczytana. Liczba elementów: " + allMovies.size());

            Map<String, Set<Movie>> moviesByCategory = new TreeMap<>();

            for (Movie movie : allMovies) {

                Set<String> genres = movie.getGenre();

                for (String genre : genres) {

                    Set<Movie> moviesInGivenGenre;
                    if (moviesByCategory.containsKey(genre)) {
                        moviesInGivenGenre = moviesByCategory.get(genre);
                    } else {
                        moviesInGivenGenre = new HashSet<>();
                        moviesByCategory.put(genre, moviesInGivenGenre);

                    }
                    moviesInGivenGenre.add(movie);
                }
            }

            Set<Map.Entry<String, Set<Movie>>> entries = moviesByCategory.entrySet();

            for (Map.Entry<String, Set<Movie>> entry : entries) {
                String genre = entry.getKey();
                Set<Movie> movies = entry.getValue();

                System.out.println("Gatunek " + genre + ", liczba filmów: " + movies.size());
            }


        } catch (IOException e) {
            System.out.println("Nie udało się odczytać bazy filmów.");
        }

    }
}
