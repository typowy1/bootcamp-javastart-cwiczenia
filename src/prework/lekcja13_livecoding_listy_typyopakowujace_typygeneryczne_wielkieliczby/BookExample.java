package prework.lekcja13_livecoding_listy_typyopakowujace_typygeneryczne_wielkieliczby;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(); // w liscie przechowujemy obiekty book
        //dodawanie obiektu przez wywołanie konstruktora
        books.add(new Book("tytuł 1", "Autor 1", 345));
        books.add(new Book("tytuł 2", "Autor 2", 555));

        Book book = books.get(1);
        System.out.println(book.getAuthor()); // przypisalismy obiekt drugi z listy do zmiennej i za pomoca zmiennej wyswietlamy autora
        System.out.println(books.get(0).getAuthor()); // lub tak

//        wyswietlanie takiej listy, musimy zdefiniowac metode tostring
        System.out.println(books); // wyswietli [Book{title='tytuł 1', author='Autor 1', pages=345}, Book{title='tytuł 2', author='Autor 2', pages=555}]


//        tablica z losowymi elementami
        List<Integer> randomNumbers = generateRandomList(20);// lista o rozmiaze 20 a wniej losowe wartosci od 0 do 100
        System.out.println(randomNumbers.size());
        System.out.println("Lista ma:" + randomNumbers);
        if (randomNumbers.contains(25)) {
            System.out.println("W liście jest 25");
        } else {
            System.out.println("Lista nie ma 25");
        }
    }

//    zwracanie listy w wyniku


    //    suma z listy
    static int sumListElements(List<Integer> list) {
        //taki zapis pozwala obsluzyc wszystkie listy, jest bardziej uniwersalny, niż dekralowanie w argumencie np ArrayList
        int sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }

    //metoda tworzy liste o wielkości jaka pod aużytkownik z losowymi wartosciami(liczbami) od 0 do 100
    // metoda zwraca liste z ilomas losowymi liczbami o wielkosci podanej przez uzytkownika
    static List<Integer> generateRandomList(int sizeList) {//typ zwracany najlepiej uzyc interfejsu list
        Random random = new Random(); // losowanie liczb, potrzebny obiekt random
//        lista bedzie przechowywac obiekty typi Iteger
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) { // wykona się tyle razy jaki parametr nam ktoś przekaze
            resultList.add(random.nextInt(100)); // będzie losowało liczby od zero do 100
        }
        return resultList;
    }

}

