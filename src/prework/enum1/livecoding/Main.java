package prework.enum1.livecoding;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ContinentsEnum europe = ContinentsEnum.EUROPE;
//        System.out.println(europe);// wyświetli s ie nazwa enuma
//
//        ContinentsEnum[] cocntynents = ContinentsEnum.values();// wyswietla wszystkie enumy w klasie, tworzymy zmienna tablicy
//        System.out.println(Arrays.toString(cocntynents));

        Country poland = new Country("Polska", ContinentsEnum.EUROPE); //przypisanie enuma do obiektu
        Country niemcy = new Country("Niemcy", ContinentsEnum.EUROPE); //przypisanie enuma do obiektu
        Country indie = new Country("Indie", ContinentsEnum.ASIA); //przypisanie enuma do obiektu
        Country thailand = new Country("Tajlandia", ContinentsEnum.ASIA); //przypisanie enuma do obiektu
        Country zambia = new Country("Zambia", ContinentsEnum.AFRICA); //przypisanie enuma do obiektu
        Country kenia = new Country("Kenia", ContinentsEnum.AFRICA); //przypisanie enuma do obiektu
        //
        // na podstawie nazwy kontynetu uzytkownik znajdzie wszystkie kraje ktore do niego nalezace
        //dodajemy do listy

        List<Country> countries = Arrays.asList(poland, niemcy, indie, thailand, zambia, kenia);
        System.out.println("Podaj nazwe kontynentu. Dostępne opcje: ");
//        wyswietlamy wszystkie enumy
        ContinentsEnum[] continents = ContinentsEnum.values();
        System.out.println(Arrays.asList(continents));

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        ContinentsEnum continent = null;
        try {
            continent = ContinentsEnum.valueOf(userInput);// w momencie którym nie zostanie znaleziony to spróbuj znalazc jeszcze w inny sposóbto przyjmuje kontynent, czyli wyszuka enum o nazwie kotynentu
            //będziemy szukać też nazwy po polsku
        } catch (IllegalArgumentException e) {
//            wyłapujemy wyjątek, i jeśli nie znajdziesz to przejdz po wszystkich możliwych kontynentach, i jeśli contynent jego tłumaczenie które wpisał użytkownik, znaczy ze wpisalismy po nazwie ktora wpisal
            for (ContinentsEnum c : continents) {
                if (c.getTranslation().equalsIgnoreCase(userInput)) { // dzięki temu wyszuka po mały literach jaki dużych literach, zignoruje to że napis jest tylko w wielkich literach i w małych też można
                    continent = c; // do znalezionego contynentu przypisuje contynent
                    break; // przerywam pętle jeśli znalazł kontynent
                }
            }
        }

        if (continent != null) {
            System.out.println("Państwa należące do tego kontynentu");
            // przechodzimy po liście z krajami
            for (Country country : countries) {
                if (country.getContinent() == continent) {// do porównania enumów można użyc ==, porównujemy wpisaną nazwe przez użytkownika z Enumem(COntinent)
                    System.out.println(country);//
                }
            }
        } else {
            System.out.println("Nie znaleziono takiego kontynentu");
        }

    }

}
