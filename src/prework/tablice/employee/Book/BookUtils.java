package prework.tablice.employee.Book;

public class BookUtils {
    void printBook(Book[] books) {

        System.out.println(books[0].getTitle());
        System.out.println(books[1].getTitle());
        System.out.println(books[2].getTitle());
    }

    // obliczamy średnia raitng
    double avgRating(Book[] books) {

        int sumRaiting = books[0].getRating() + books[1].getRating() + books[2].getRating();
        double avg = (double) sumRaiting / books.length;
        return avg; //musimy zrzutować na double conajmniej jeden z składników dlatego ż
        // e mamy int / int  a w wyniku ma być double, dzięki temu nie utracimy częscu dziesiętnej
        // tu chcemy podzielić przez wszystkie dostępne raitingi, czyli wykorzystamy
        // length, teraz nie ważne jaką tablice przekażemy czy o rozmiarze 3 czy 5 i tak obliczy
    }
}
