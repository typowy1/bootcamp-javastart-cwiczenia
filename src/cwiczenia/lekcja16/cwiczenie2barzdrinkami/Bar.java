package cwiczenia.lekcja16.cwiczenie2barzdrinkami;

import java.util.Map;
import java.util.Scanner;

public class Bar {

    private static final int LEGAL_AGE = 18;

    public static void main(String[] args) {

        //Poproś użytkownika o podanie nazwy drinka. Jeżeli informacji o takim drinku nie ma w naszej bazie, to poinformuj o tym klienta. Jeżeli drink zostanie odnaleziony, to:
//         Jeżeli drink nie zawiera alkoholu, wyświetl cenę do zapłaty,
//    Jeżeli drink jest alkoholowy, to poproś użytkownika o podanie wieku.
//        Jeżeli wiek jest większy, bądź równy 18, to wyświetl cenę.
//        Jeżeli wiek jest mniejszy od 18, to wyświetl komunikat z odmową sprzedaży.
        Map<String, Drink> drinks = createMap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę drinka:");
        String drinkName = scanner.nextLine();
        if (drinks.containsKey(drinkName)) {
            Drink drink = drinks.get(drinkName);
            DrinkType drinkType = drink.getType();
            if (drinkType == DrinkType.SOFT || drinkType == DrinkType.SMOOTHIE)// jeżeli drink jest bezalkocholowy lub jest smooyhi to możemy od rzau takiego drinka sprzedać
                System.out.println("Do zapłaty: " + drink.getPrice());
            else {
                System.out.println("Podaj wiek:"); //jezeli drink jest alkoholowy to pytamy o wiek
                int age = scanner.nextInt();
                if (age < LEGAL_AGE) {
                    System.err.println("Nie sprzedajemy alkoholu nieletnim!");
                } else {
                    System.out.println("Do zapłaty: " + drink.getPrice());
                }
            }
        } else {
            System.out.println("Takiego drinka nie ma w naszej ofercie");
        }
    }

    //    przechowywane dostępne w naszym barze drinki
    private static Map<String, Drink> createMap() {
        // najwygodniej mama bo do jd przypiszemy nazwe drinka bedzie latwo wyszukiwac bo key = nazwa if (drinks.containsKey(drinkName))
        return Map.of("Mojito", new Drink("Mojito", 16, DrinkType.ALCOHOLIC),
                "Margarita", new Drink("Margarita", 18, DrinkType.ALCOHOLIC),
                "Cosmopolitan", new Drink("Cosmopolitan", 22, DrinkType.ALCOHOLIC),
                "Fruit Punch", new Drink("Fruit Punch", 14, DrinkType.SMOOTHIE),
                "Orange Twist", new Drink("Orange Twist", 12, DrinkType.SOFT));
    }
}
