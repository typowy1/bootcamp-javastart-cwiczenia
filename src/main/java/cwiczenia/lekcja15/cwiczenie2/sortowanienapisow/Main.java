package cwiczenia.lekcja15.cwiczenie2.sortowanienapisow;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // w main2 prostrzy sposób

        //    nieposortowaną listę
        List<String> strings = Arrays.asList("b", "b", "z", "b", "l", "d", "y", "a", "k", "a");// tworzenie listy
        System.out.println(strings);// wyświetlenie listy

//        posortowaną listę
        Collections.sort(strings);
        System.out.println(strings);

//        listę posortowaną w odwrotnej kolejności
        Collections.reverse(strings);
        System.out.println(strings);

//        liczbę wystąpień unikalnych elementów
        //wżucamy do mapy dlatego że kluczem jest dany napis a wartościa do niego przypisaną jest liczba wtystąpien danego napisu

        Map<String, Integer> occurencesMap = countOccurences(strings);
        printMap(occurencesMap);// posortowane na podstawie kluczy

//        informację o tym jaki element powtarza się najczęściej
        String max = max(occurencesMap);
        System.out.println("Najczęściej powtarza sie: " + max + ": " + occurencesMap.get(max)); //occurencesMap.get(max) - wyswietli wartość pod kluczem max
    }

    // do pierwszego wystapienia litery(kluca) przypisujemy wartosc 1, po przez porównanie sprawdzamy czy występuje znowu i jak tak do 1 dodajemy 1
    static Map<String, Integer> countOccurences(List<String> strings) {//wżucamy do mapy dlatego że kluczem jest dany napis a wartościa do niego przypisaną jest liczba wtystąpien danego napisu
        Map<String, Integer> occurences = new TreeMap<>(); //dlatego bo upożadkowana
        for (String str : strings) {
            if (occurences.containsKey(str)) //jeżeli w mapie ocurences istnije kucz str to powinnismy pobrac jego wartosc, zwiekszyc ją pobrac spowrotem do mapy
                occurences.put(str, occurences.get(str) + 1);
            else // czyli jezeli sie nie powtarzaja to przypisujemy 1
                occurences.put(str, 1); // do wartosci przypisujemy 1
        }
        return occurences;
    }

    //wyświetlanie kluczy i wartosci mapy
    static void printMap(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();// pobieramy pary kluczy i wartosci
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }

    //element ktowry najczesciej wystepuje
    static String max(Map<String, Integer> map) {//przekazujemy mape w ktorej chcemy wyszukac klucz z najwieksza wartoscia
        String maxKey = null;// napis który powtarza się najczęściej
        int maxValue = 0;// liczba wystąpien tego napisu
        Set<Map.Entry<String, Integer>> entries = map.entrySet();//pobieramy zbiór wszystkich wpisów
        for (Map.Entry<String, Integer> entry : entries) {// petla przejdzie przez każdy element

            if (entry.getValue() > maxValue) { // jezeli w tym wpisie wartość przypisana do tego napisu jest większa niż maxValue to przypisujemy do maxValue
                maxKey = entry.getKey(); // przypisujemy wartosć klucza większego niż poprzednia wartość
                maxValue = entry.getValue(); // przypisujemy wartosć większą niż poprzednia
            }
        }
        return maxKey; // zwracamy klucz, po którym wyświetliy informacje
    }
}

