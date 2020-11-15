package prework.kolekcje.mapy;

import java.util.*;

public class Mapy {

    // Mapy składają sie z kluczy i wartosci
    public static void main(String[] args) {
//        składa się z klucz i wartości i w <> definiujemy dwa typy
        // HashMap szybkie dodawanie do mapy, szybkie wyszukiwanie, szybko usówać.
        // jeżeli mamy swoje obiekty to trzeba w nich wygenerowac metody equals i hashcode ponieważ mapy kożystają z nich
//        wtedy mamy gwarancje unikalności obiektów
        // nie ma gwarancji w jakiej kolejnosci sa przechowywane obiekty

        Map<Integer, String> people = new HashMap<>();
        // wstawianie elementów do mapy
        people.put(111, "Jan Kowalski"); // klucz, wartość
        people.put(222, "Anna Zawadzka"); // klucz, wartość
        people.put(333, "Piotr Wodecki"); // klucz, wartość
        people.put(111, "Krzysztof Babacki"); // klucz, wartość, stara wartość zostanie nadpisana i pod 11 będzie krzysztof


//        String person222 = people.get(222);// pobiera wartosć obiektu na podstawie klucza
//        String person555 = people.get(555);// tu będzie null ponieważ nie wystepuje w mapie
//        System.out.println(person222);//wyświetli się element dostępny pod tym Id
//        System.out.println(person555);//null
//
//        people.remove(222); // usówanie wartości na podstawie klucza
//        System.out.println(person222);//wyświetli się element dostępny pod tym Id

        // pobieranie wartości z mapy
        //1. możemy pobrać klucze
        //2. możemy pobrać wartosci
        //3. mozemy pobrac pary klucze i wartości

        //1. możemy pobrać klucze
//        Po zbiorach nie możemy iterować pętlą for tylko foreach ponieważ kożystają z iteratora
        Set<Integer> keys = people.keySet();// pobranie zbioru kluczy z mapy people
        System.out.println(keys); //  klucze wyswietlone w 1 wierszu, kożysta z metody toString
        for (Integer key : keys) { // klucze wyswietlone jeden pod drugim
            System.out.println(key);
        }

        //2. możemy pobrać wartosci w wyniku zwraca kolekcje
        Collection<String> values = people.values();
        System.out.println(values); // wartosci wyswietlone w 1 wierszu, kożysta z metody toString
        for (String value : values) {
            System.out.println(value); // wyświetli wartoscj wyswietlone jeden pod drugim
        }

        //3. mozemy pobrac pary klucze i wartości

        Set<Map.Entry<Integer, String>> entries = people.entrySet(); // pobieranie par za pomocą sntryset z mapy people
        for (Map.Entry<Integer, String> entry : entries) { // entries reprezentuje zbiór kluczy i wartosci
            //System.out.println(entry);
            System.out.println(entry.getKey() + " ::: " + entry.getValue()); // wyciąganie kluczy i wartosci
        }


//        LinkedHashMap
//        LinkedHashMap - przechowuje kolejnosć wstawiania obiektów do mapy

        Map<Integer, String> people1 = new LinkedHashMap<>();
        // wstawianie elementów do mapy
        people1.put(111, "Jan Kowalski"); // klucz, wartość
        people1.put(222, "Anna Zawadzka"); // klucz, wartość
        people1.put(333, "Piotr Wodecki"); // klucz, wartość
        people1.put(111, "Krzysztof Babacki"); // klucz, wartość, stara wartość zostanie nadpisana i pod 11 będzie krzysztof, przy mapie linked nie zaburzamy kolejnosci oryginalnego dodawania

        Set<Integer> keys1 = people1.keySet();// pobranie zbioru kluczy z mapy people
        System.out.println(keys1); //  klucze wyswietlone w 1 wierszu, kożysta z metody toString
        for (Integer key1 : keys1) { // klucze wyswietlone jeden pod drugim
            System.out.println(key1);
        }

        Collection<String> values1 = people1.values();
        System.out.println(values1); // wartosci wyswietlone w 1 wierszu, kożysta z metody toString
        for (String value1 : values1) {
            System.out.println(value1); // wyświetli wartoscj wyswietlone jeden pod drugim
        }

//        TreeMap -  gwarantuje sortowanie po kluczach

        Map<Integer, String> people2 = new TreeMap<>(); //
        // wstawianie elementów do mapy
        people2.put(222, "Anna Zawadzka"); // klucz, wartość
        people2.put(111, "Jan Kowalski"); // klucz, wartość
        people2.put(333, "Piotr Wodecki"); // klucz, wartość
        people2.put(111, "Krzysztof Babacki"); // klucz, wartość, stara wartość zostanie nadpisana i pod 11 będzie krzysztof, przy mapie linked nie zaburzamy kolejnosci oryginalnego dodawania

        System.out.println("TreeMap");
        Set<Integer> keys2 = people2.keySet();// pobranie zbioru kluczy z mapy people
        System.out.println(keys2); //  klucze wyswietlone w 1 wierszu, kożysta z metody toString
        for (Integer key2 : keys2) { // klucze wyswietlone jeden pod drugim
            System.out.println(key2);
        }

        Collection<String> values2 = people2.values();
        System.out.println(values2); // wartosci wyswietlone w 1 wierszu, kożysta z metody toString
        for (String value2 : values2) {
            System.out.println(value2); // wyświetli wartoscj wyswietlone jeden pod drugim
        }
    }
}
