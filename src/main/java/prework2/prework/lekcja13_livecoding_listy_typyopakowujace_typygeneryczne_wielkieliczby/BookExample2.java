package prework2.prework.lekcja13_livecoding_listy_typyopakowujace_typygeneryczne_wielkieliczby;

import java.util.List;

public class BookExample2 {

    public static void main(String[] args) {
        Book2 book2 = new Book2("Autor", 566);
        book2.getAuthors().add("Autor1"); // dodanie autora do listy autorów z klasy Book2
        book2.getAuthors().add("Autor2"); // dodanie autora do listy autorów z klasy Book2
//        lub
        List<String> autors = book2.getAuthors(); // pobranie listy autorów i dodanie kolejnych lub pierwszych
        autors.add("autor3");// dodaje autora

        System.out.println(book2.getAuthors());//[Autor1, Autor2, autor3]
    }

}
