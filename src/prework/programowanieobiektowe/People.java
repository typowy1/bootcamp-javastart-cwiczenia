package prework.programowanieobiektowe;

public class People {
    public static void main(String[] args) {
        //Wartości domyślne dla typów prostych to 0 dla liczb, false dla typu boolean
//        znak '\u0000' dla typu char oraz null dla typów obiektowych takich jak String, czy Car

        //  Person person1;// - zmienna typu obiektowego
        Person person1 = new Person(); //  do zmiennej typu obiektowego możemy przypisać obiekt new Person zwany instancją
        //        boolean isPerson = person1 instanceof Person; - możemy sprawdzić czy zmienna jest typu Person
//                System.out.println(isPerson); //true
        person1.firstName = "Marta";
        person1.lastName = "Kowalska";
        person1.age = 30;
        person1.gender = true;
//        boolean isPerson = person1 instanceof Person; - sprawdzamy czy zmienna jest typu Person

        System.out.println("Pierwsza osoba");
        System.out.println("Imię: " + person1.firstName);
        System.out.println("Nazwisko: " + person1.lastName);
        System.out.println("Wiek: " + person1.age);
        System.out.println("Czy kobieta " + person1.gender);

        Person person2 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Abacki";
        person1.age = 44;


    }
}
