package cwiczenia.lekcja14.zadanie8_mapafilmowzpliku;

import java.util.Set;

public class Movie {

    private Long id;
    String title;
    private int year;
    private Set<String> genre; //kategorie wrzuciliśmy do zbioru bo jest ich kilka

    public Movie(Long id, String title, int year, Set<String> genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<String> getGenre() {
        return genre;
    }

    public void setGenre(Set<String> genre) {
        this.genre = genre;
    }
}
