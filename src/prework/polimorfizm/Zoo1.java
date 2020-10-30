package prework.polimorfizm;

import java.util.Scanner;

public class Zoo1 {

    // wybieranie jaki typ obiektu użytkownik chce utowżyć

    public static void main(String[] args) {
        //wybieramy typ obirktu który będzie przypisany do referencji typu animal
        Animal animal = null;
        Scanner scanner = new Scanner((System.in));
        System.out.println("Kot = 1, Pies = 2");
        int option = scanner.nextInt();
        if (option == 1) {
            animal = new Cat("Mruczek");
        } else if (option == 2) {
            animal = new Dog("Burek");
        }

        if (animal instanceof Dog) {
            ((Dog) animal).bark();
        } else if (animal instanceof Cat)
            ((Cat) animal).meow();
//        zabezpieczenie sprawdzamy czy referencje animal wskazuje na obiekt typu Dog jeśli tak to robimy rzutowanie i
//        mamy dostęp do metody bark() i ją wywołujemy
    }
}
