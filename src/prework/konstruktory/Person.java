package prework.konstruktory;

public class Person {

    //Konstruktory to elementy klas które pozwalają na twożenie nowych obiektów, konstruktor konstruje obiekt,
    // przyjmuje nazwe klasy
    String firstName;
    String lastName;
    int age;
    Address address;

//    Jeżeli w konstruktorze bezparametrowym zostaną zapisane jakieś funkcje to zostaną one wykonane za każdym razem
//    jak ktoś będzie tworzył obiekt wskazanego typu

    Person() { //<- konstruktor bezparametrowy

        String text = "Tworzę obiekt Person";
        System.out.println(text);
    }

    //    konstruktor parametrowy - za pomocą parametrów w konstruktorze przypisujemy wartości do pól klacy
    Person(String fn, String ln, int a, Address addr) {
        firstName = fn;
        lastName = ln;
        age = a;
        address = addr;
    }

    Person(String fn, String ln, int a) { // przeciążanie konstruktorów, muszą mieć różną liczbe parametrów lub
        // przy tej samej ilości parametrów muszą mieć różne typy
//        konstruktory nie mogą mieć tej samej liczby parametrów o tych samych typach, spowoduje to błąd kompilacji.
        firstName = fn;
        lastName = ln;
        age = a;
    }
}
