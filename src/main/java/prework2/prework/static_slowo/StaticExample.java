package prework2.prework.static_slowo;

public class StaticExample {
    public static void main(String[] args) {
        //  double result = squareArea(); // nie możemy tak wywołać metody statycznej w main static

        double result = ShapeCalculator.squareArea(5);
        // Math statyczne metody
        Person person1 = new Person("Jan", "Kowalski", 20);
        Person person2 = new Person("Anna", "Woźniak", 20);

        System.out.println(Person.getPeopleNumber());
        // pola statyczne głównie wykożystuje się do stałych

        if (person1.getAge() > Person.ADULT_AGE) {
            System.out.println("Osoba pełnoletnia");
        }
    }
}
