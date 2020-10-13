package cwiczenia.lekcja4.library.model.app;

import cwiczenia.lekcja4.library.model.Book;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("W pustyni", "Adam Kowalski", "1262781");
        book1.showInfo();
        book1.setIsbn("33333");
        book1.showInfo();
        System.out.println("Title: " + book1.getTitle());
    }
}
