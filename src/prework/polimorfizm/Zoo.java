package prework.polimorfizm;

public class Zoo {

    public static void main(String[] args) {
//        Animal[] animals = new Animal[3];
//        animals[0] = new Dog("Burek");
//        animals[1] = new Cat("Mruczek");
//        animals[2] = new Animal("Kotopies");
//
////        dog.giveSound();
////        cat.giveSound();
////        doge.giveSound();
//
//
//        changeAnimalName(animals[0], "Misiek");
//        for (Animal animal : animals) {
//            animal.giveSound();
//        }

        //rzutowanie czyli zmiana na dany typ obiektu

//        Animal dog = new Dog("Burek"); // przypisujemy obiekt typu dog do referencji typu animal
//        Animal cat = new Cat("Mruczek");

//        dog.bark();
//        cat.meow();

//        A bardziej ludzkimi słowami powiemy - żeby móc wywołać metodę bark(), to metoda ta musi być zdefiniowana w klasie Animal

//        Dog dog = new Dog("Burek");
//        dog.bark();

//        Nie oznacza to jednak, że musimy od razu rezygnować z polimorfizmu. Typ referencji możemy zmienić poprzez
//    rzutowanie, podobnie jak było przy typach prostych. Robimy to zapisując nowy typ referencji w okrągłych nawiasach,
//                przed referencją, której typ chcemy zmienić. Zrzutowaną referencję możemy przypisać do zmiennej,
//                lub wywołać na niej metodę "w locie".

//        Animal dog = new Dog("Burek");
//        Animal cat = new Cat("Mruczek");

//        rzutowanie ztypu ogólniejszego na typ konkretny
        // rzutowanie do zmiennej
//        Dog specyficDog = (Dog) dog; // dzięki temu możemy wywoływac metody które są dostępne tylko w Dog
//        specyficDog.bark();

        // rzutowanie "w locie"
//        ((Cat)cat).meow(); //teraz mamy dostęp do metody meow() z poziomu typu animal,

//        Możliwe jest także rzutowanie "w górę", czyli z typu konkretnego na typ ogólniejszy o czym już wiesz, ponieważ
//        od początku tej lekcji robiliśmy to przypisując np. obiekt typu Dog do referencji typu Animal

        //    sprawdzamy czy rzutowanie na określony typ jest możliwe

        Animal cat = new Cat("Mruczek");
        //rzutowanie "w locie"
        if (cat instanceof Dog) {
            // rzutujemy referencję cat na Dog, tylko wtedy, kiedy jest do niej przypisany
            // obiekt Dog. W tym przypadku if się nie wykona i nie dojdzie do rzutowania.
            ((Dog) cat).bark();
        }
    }

    private static void changeAnimalName(Animal animal, String newName) {
        animal.setName(newName);
    }


}
