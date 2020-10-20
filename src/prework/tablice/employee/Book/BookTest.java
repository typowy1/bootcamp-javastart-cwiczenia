package prework.tablice.employee.Book;

public class BookTest {
    public static void main(String[] args) {
        Book ksiązka1 = new Book(1, "Dziady", 6);
        // można to wrzucić w tablice

        Book[] books = new Book[3];// przy tablicach dobrze jest używać nazwy mnogiej wtedy widzimy że przechowywanych
        // jest wiele wartosci
        // wstawianie obiektu ksiązki do tablicy
        books[0] = new Book(2, "Wiedźmin", 7);
        books[1] = new Book(3, "Gangster", 5);
        books[2] = ksiązka1; // możemy też przypisać wcześniej utworzony obiekt do referencji indeks 2


        BookUtils bookUtils = new BookUtils();
        bookUtils.printBook(books);
        System.out.println("Srednia z ocena to: " + bookUtils.avgRating(books));
    }
}
