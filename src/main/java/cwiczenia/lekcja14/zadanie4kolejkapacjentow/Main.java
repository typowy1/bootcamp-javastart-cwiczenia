package cwiczenia.lekcja14.zadanie4kolejkapacjentow;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // tworzenie kolejki
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("Krzysztof", "Kowalski", 74547547));//dodawanie do kolejki elementu
        queue.offer(new Person("Jan", "Zioomalski", 74445));//dodawanie do kolejki elementu
        queue.offer(new Person("Anna", "Zawadzka", 65475));//dodawanie do kolejki elementu

        // przejście po wszystkich elementach kolejki
        for (Person person : queue) {
            System.out.println(person);
        }

        System.out.println("*******");
        System.out.println("W kolejce zostało " + queue.size() + " osób"); // ilość osób w kolejce

        while (!queue.isEmpty()) {// wykonujemy pętle dopoki nie bedzie posta
            Person person = queue.poll();
            System.out.println(person + " proszony do gabinetu");
            System.out.println(person + " obsłużony");
        }

        Person peek = queue.peek();//podejży 1 osbe dostępną w kolejce
        Person pool = queue.poll(); // wyżuci osobę z kolejki

        System.out.println("W kolejce zostało " + queue.size() + " osób"); // ilość osób w kolejce


    }
}
