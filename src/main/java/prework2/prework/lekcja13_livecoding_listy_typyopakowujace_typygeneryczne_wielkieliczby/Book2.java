package prework2.prework.lekcja13_livecoding_listy_typyopakowujace_typygeneryczne_wielkieliczby;

import java.util.ArrayList;
import java.util.List;

public class Book2 {

    //    z listą autorów

    private String title;
    private List<String> authors = new ArrayList<>(); // utworzenie nowej pustej array list dla autorow
    private int pages;

    public Book2(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
