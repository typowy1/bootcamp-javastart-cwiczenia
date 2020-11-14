package prework.kolekcje.zbiory_i_iteratory;

import prework.petla_while_do_while.While;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Library {

    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("tytuł1", 555, 7));
        books.add(new Book("tytuł1", 555, 7));
        books.add(new Book("tytuł2", 448, 4));
        books.add(new Book("tytuł2", 55, 2));
        System.out.println(books); // zeby tak wyswietlic musisz miec metode toString
        System.out.println(books.size());

//        chcemy wyświetlic wszystkie elementy jeden pod drugim
        //w zbiorze hashtest nie ma gwarancji na to zę pod danym indekesem jest dany element

        Iterator<Book> iterator = books.iterator();
        // iterator, pozwoli przejżeć wszystkie obiekty znajdujące sie w danej kolekci
        // iterator ustawiony jest przed pierwszym obiektem

        //dostępne metody iteratora

//        iterator.hasNext(); // zwraca true jeśli jest jakiś obiekt do pobrania jeszcze
//        iterator.next(); // przechodzi do kolejnego obiektu i go zwraca

//        zliczamy wszystkie ilości ksiązek w bibliotece
        int allBooks = 0;
        while (iterator.hasNext()) { // sprawdzamy czy jeszcze jest jakiś obiekt w tej kolekcji, jeśli jest to zwraca true i wchodzimy do petli jesli nie to wychodzimy s petli
            Book next = iterator.next();//pobieramy obiekt, przechodzi do obiektu i go zwraca wiec zapisujemy go w zmiennej
            System.out.println(next); // to pozwoli nam wyswienlic ksazke jedna pod druga, nie musimy tego robic
            allBooks += next.getAmount();
        }
        System.out.println("Ilosć ksiązek " + allBooks); //wyświetli ilosć ksiązek w obiektach
//        ponizej odpowiednik krótszej metody

//        dzięki iteratorowu można to zapisac krócej
        int allBooks1 = 0;
        for (Book book : books) {// iterator jest wykożystywany pod spodem i wykożystujemy go kożystając z pętli foreach
            System.out.println(book);
            allBooks1 += book.getAmount();
        }
        System.out.println("Ilosć ksiązek " + allBooks1);
        //problemem będzie usowanie obiektów i dodawanieobiektow nie mozna ta petla
//        rozwiazaniem jest petal while
        //pobieramy iterator
        Iterator<Book> iterator2 = books.iterator();
        while (iterator2.hasNext()) { // sprawdzamy czy jest kolejny obiekt do ktorego iterator moze sie przesunac
            Book next = iterator2.next(); // przechodzimy do tego obiektu i zwracamy go do zmiennej
            if (next.getAmount() < 2)// sprawdzamy czy ilosć egzemplarzy ksiązki jest mniejsz niz 5 a jezeli tak to usówamy za pomocą iteratora
                iterator.remove(); // zostanie usunięty ten obiekt na który iterator wskazuje
        }
        System.out.println(books);


// Jeżeli operujemy na własnych obiektach to przy reeSet bedziemy musieli zagwarantowac cos jeszcze, trzeba
// zaimplementowac interfejs Comparable inaczej wyskoczy wyjatek ClassCastException Book cannot be cast to class java.lang.Comparable
//        Set<Book> books1 = new TreeSet<>();
//        books1.add(new Book("tytuł1", 555, 7));
//        books1.add(new Book("tytuł2", 448, 4));
//        books1.add(new Book("tytuł2", 55, 2));
//        System.out.println(books1); // zeby tak wyswietlic musisz miec metode toString
//        System.out.println(books1.size());
    }
}
