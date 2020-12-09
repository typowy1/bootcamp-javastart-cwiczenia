package prework2.prework.dziedziczenie.animal;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("Czarny");
        Bird bird = new Bird();
        bird.setColor("Niebieski");
        System.out.println("Zwierzęta dają głos");
        System.out.println("Kot: ");
        cat.makeSound();

        System.out.println("Ptak: ");
        bird.makeSound();
        // Nadpisanie oznacza, że w klasie pochodnej definiujemy metodę o identycznej sygnaturze co metoda w klasie
        // bazowej, czyli metodę z takim samym typem zwracanym, nazwą i parametrami, ale innym zachowaniem.
        // konstruktory nie są dziedziczone
    }
}
