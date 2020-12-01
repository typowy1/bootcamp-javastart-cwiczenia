package cwiczenia.lekcja13.zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers2 {
    public static void main(String[] args) {

        //tworzenie metod, refactor, extract method
        List<Double> list = createList(10);

        printReversedList(list);

        sumEvenElements(list);

        multiplyOddElements(list);

        printMaxElement(list);
    }

    private static void printMaxElement(List<Double> list) {
        double max = list.get(0);
        for (Double aDouble : list) {
            if (max < aDouble)
                max = aDouble;
        }
        System.out.println("Największa liczba: " + max);
    }

    private static void multiplyOddElements(List<Double> list) {
        double multi = 1;
        for (int i = 1; i < list.size(); i += 2) {
            multi *= list.get(i);
        }
        System.out.println("Iloczyn nieparzystych: " + multi);
    }

    private static void sumEvenElements(List<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i += 2) {
            sum += list.get(i);
        }
        System.out.println("Suma przystych: " + sum);
    }

    private static void printReversedList(List<Double> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    private static List<Double> createList(int size) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj kolejną liczbę:");
            list.add(scanner.nextDouble());
        }
        return list;
    }
}
