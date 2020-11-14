package cwiczenia.lekcja13.zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {

    public static void main(String[] args) {
//        Stwórz listę, która będzie przechowywała liczby typu Double. Wprowadź od użytkownika 10 liczb i zapisz je w liście.
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj kolejną liczbę:");
            list.add(scanner.nextDouble()); // dodajemy obiekt, doda się automatycznie na koniec listy
        }

//        elementy listy w kolejności odwrotnej niż kolejność w jakiej zostały dodane
        for (int i = list.size() - 1; i >= 0; i--) { //odwołujemy się do rozmiaru listy, wcześniej utworzonej i dekrementacja, schodzimy w dół
//            rozmiar tablicy, pomniejszony o 1 poniewaz indeksy w listach liczymy od 0 i i >=0, czyli 0 będzie pierwszym elementem
            System.out.println(list.get(i)); //  i odejmujemy itego elementu, czyli będziemy mieli 9, 8, 7 itd
        }

//        sumę elementów na parzystych indeksach listy,
        double sum = 0;// rozwiązanie dotyczy programistycznych indeksów czyli będzie sumować index 1, 3, 5 (0=1 ludzki, indeks 1= 2 ludzki czyli parzyst)
        for (int i = 0; i < list.size(); i += 2) { // i += 2 przeskakujemy co drugi element
            sum += list.get(i); // i będzie się zmieniało 1, 3, 5 - to są indexy i dodawało liczbę do sum
        }
        System.out.println("Suma parzystych: " + sum);

//        iloczyn elementów na nieparzystych indeksach listy

        double multi = 1; // nie możemy mnożyć przez 0
        for (int i = 1; i < list.size(); i += 2) { // i += 2 przeskakujemy co drugi element
            multi *= list.get(i); // iloczyn na nieparzystych
        }
        System.out.println("Iloczyn nieparzystych: " + multi);

//        największy element zapisany w liście
        double max = list.get(0); // pierwsza wprowadzona liczba przez użytkownika będzie największa, więc odwołujemy się od zerowego elementu na liście
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) //jezeli max jest mniejsze od elementu (i){
                max = list.get(i); // to przypisujemy do max element(i)
        }
        System.out.println("Największ liczba: " + max);
    }
}
