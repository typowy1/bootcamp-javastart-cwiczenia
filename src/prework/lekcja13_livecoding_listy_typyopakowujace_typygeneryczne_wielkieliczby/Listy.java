package prework.lekcja13_livecoding_listy_typyopakowujace_typygeneryczne_wielkieliczby;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listy {

    public static void main(String[] args) {
        //  ArrayList
        // lista tablicowa, rozszezana tablica, domyślnie tablica może przchowywać 10, jeśli chcemy więcej to
        // mozemy przekazać wartosc tablicy ArrayList(100), nie okreslamy poczatkowego rozmiaru, dajemy jej rosnac
        // wstawianie elmentow na koncu i na poczatku jest dosyc malo wydajne,
        // nie ma operacji usowania z tablicy, jezeli usuniemy to wszystkie ementy bedą musiały być przesunieta o jeden w lewa strone
// żeby wyświetlić element wystarczy podac indeks


        // domyslnie przechowuje null dlatego ze kolekcje operuja na typach obiektowych
        //[nul, null, null itd]
        ArrayList<Integer> list1 = new ArrayList();
        //typy generyczne przechowujemy w <>ostrych nawiasach i operują na typach obiektowych czyli Integer
        // przy wprowadzeniu wiekszej ilosci zostanie storzona wieksza
        // tablica i obiekty z mniejszej zostana przkopiowane do wiekszej
        list1.add(5);  //dodawanie liczb do listy
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println(list1);
        //automatycznie jest dodana metoda to string i taki zapis wystarczy do wydrukowania listy

        //odwoływanie się do elementów
//        możemy po indeksach, przy odwoływaniu się do pojedyńczych elementów
        System.out.println(list1.get(5)); //indeks 0 jest indeksem pierwszym, czyli wywołując indeks 5 dostaniemy szóstą wartosć
        System.out.println(list1.get(4));

//        Autoaotboxing - np. rozpakowanie typu Ineger i wyciągniecie z niego  int
//        sumowanie, lista powinna miec okreslony typ zeby dodawac
        int sum = list1.get(4) + list1.get(5);
        System.out.println(sum);

        //przedostatni element z listy i ostatni element
        int sum1 = list1.get(list1.size() - 2) + list1.get(list1.size() - 1);
        //przedostatni indeks = list1.get(list1.size() - 2) wielkość tablicy jest 3, indeksy są od 0 do 5,
        // czyli zeby uzyskać czwarty indeks musimy od rozmiaru tablicy 6 odjąc 2 i uzyskamy indeks 4
//        ostatni indeks list1.get(list1.size() - 1, 6 - 1 = 5, 5 jest ostatnim indeksem

//        pokaż wszystkie elementy zapisane w liście jeden pod drugim
//        pętla for
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) * 10); // wszystkie elementy pomnozone przez 10
        }
//        petka for each
        for (Integer integer : list1) {
            System.out.println(integer * 10); // wszystkie elementy pomnozone przez 10
        }

        //Linked list - lista wiązana
        LinkedList<Integer> list2 = new LinkedList<>();
        // inaczej są przechowywane elementy w takiej liscie
        //elementy przechowywane sa w takim jakby pudłeku i jest tworzony wezel dla tego obiektu
//        array [nul, null, null itd]
//        linked [10] <-> [20[ <-> [30]
//        usówanie pierwszych i ostatnich elementow jest proste
        //usowamy element i podmieniamy jest to szybkie, podmieniamy pierwsza referencje i oststnia referencje
//        jezeli chcemy wyswietlic element o indeksie 3000 to musimy przez 3000 elementow przejsc prz arraylist wystarczy podac indek


//        dodatkowe metody w linked list

        // System.out.println(list2.getFirst());// - pobranie 1 elementu
        // System.out.println(list2.getLast()); // - pobranie drugiego elementu
//        żadko używane są te metody


        //****czesciej uzywa sie arraylisty jest szybsza, przy odczycie

        //do dekralacji typu używajmy interfejsu List, polimorfizm bedziemy mieli dostep do dwoch list, uzywamy typu nadzednego

        System.out.println("Suma list1 " + sumListElements(list1));
        System.out.println("Suma list2 " + sumListElements(list2));
        //obsłużyliśmy dwa typy list ponieważ w metodzie jest taki zapis sumListElements(List<Integer> list)
        // kiedy potrzebujemy metod ktore sa tylko w danej liscie to wtedy deklarujmy kontkretny typ czyli np arraylist

        // do listy możemy tez dodawac duplikaty i wartości null

        List<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Ola");
        names.add("Zosia");
        names.add("Zosia");

//        usówanie elementu
        names.remove(0); // po indeksie
        names.remove("Zosia"); // po wartości, usunie pierwsze wystąpienie

//        sprawdzenie czy obiekt jest w naszej liscie
        if (names.contains("Ola")) {
            System.out.println("Jest Karol");
        }// jak nie będzie zwróci false

        //usówanie wszystkich elementów z listy
        // names.clear();
        System.out.println(names);
        //po usunieciu elementy przesuna sie w lewo o 1 index, nigdy po usunieciu nie bedzie pustych wartosci null

        // metoda dodająca obiekt w srodek listy
        names.add(2, "Dupa");

        // wyszukanie obiektu i sprawdzenie na którym indeksie się on znajduje
        int ola = names.indexOf("Ola");
        System.out.println(ola);

        //sprawdzanie czy list ajest pusta
        if (names.isEmpty()) {
            System.out.println("Pusta");
        } else {
            System.out.println("Pełna");
        }
    }

    //    suma z listy
    static int sumListElements(List<Integer> list) {
        //taki zapis pozwala obsluzyc wszystkie listy, jest bardziej uniwersalny, niż dekralowanie w argumencie np ArrayList
        int sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
}
