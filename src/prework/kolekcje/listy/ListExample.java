package prework.kolekcje.listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // kopiowanie tablicy do listy

        double[] numbers = new double[3];
        numbers[0] = 2.2;
        numbers[1] = 3.3;
        numbers[2] = 4.4;
        double[] numbersCopy = Arrays.copyOf(numbers, 10);
        System.out.println(Arrays.toString(numbersCopy));


        ArrayList<Double> ints = new ArrayList<>();// pocztkowy rozmiar tablicy to 0
        ints.add(2.5);
        ints.add(2.6);
        ints.add(2.8);
        System.out.println(ints); // wyświetlanie alemantóe z listy, nie trzeba pisac to string
        System.out.println(ints.get(0) + ints.get(1)); // zwróci wynik dodawania


        //przekształcenie tablicy na liste, ! w wyniku dostajemy wartość która jest niemotyfikowalna, nie dodamy nic
        // to nie jest arraylista ani linkedlista
        Integer[] ints5 = {3, 4, 5, 6};
        List<Integer> list = Arrays.asList(ints5);
        System.out.println("List: " + list);

        //przekształcenie tablicy na liste, ! w wyniku dostajemy wartość która jest niemotyfikowalna, nie dodamy nic
        //od java 9
        List<Integer> list1 = List.of(3, 4, 5, 6);
    }
}
