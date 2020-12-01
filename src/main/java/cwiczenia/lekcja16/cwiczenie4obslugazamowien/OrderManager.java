package cwiczenia.lekcja16.cwiczenie4obslugazamowien;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderManager {// metody z obsługą aplikacji

    private List<Order> orders; // uruchomienie run spowoduje wczytanie listyy do pola klasy, bedzie moża wykożystać liste w innych metodach za pomoca pola

    public void run() {

        OrderReader orderReader = new OrderReader();

        try {// obsługujemy wyjątek czytania pliku
            orders = orderReader.readFromFile(); // lista zamówień wczytana z pliku
            printOrderList();// wyświetlenie listy zamówień
            mainLoop();

        } catch (IOException e) {
            System.out.println("Nie udało się wczytać listy zamówień");
        }

    }

    private void mainLoop() { // lop do wybierania opcji, głowna pętla która cały czas chodzi dopoki nie wybierzemy danej opcji
        boolean end = false; // wykona się dopóki nie ma decyzji o końcu programu
        do {
            printMenu();
            int selectedOption = readIntFromConsole(); // czytamy wybór użytkownika
            OptionsMenuItem menuItem = findMenuItem(selectedOption); // pętla wybór użytkownika porównujemy z Enumem opcji i zwracamy wybraną opcje

            if (menuItem == null) { //jesli nie udalo sie znalezc opcji która wybrał uzytkownik to wyswietlamy komunikat i kontynujemy znowy wybor opcji w pętli findMenuItem az wybierze prawidłowa
                System.out.println("Nieprawidłowy wybór");
                continue;
            }// w przeciwnym wypadku czyli jak wybierze dobrze to wychodzimy z pętli findMenuItem i wchodzimy do switch i wykonujemy inne rzeczy

            switch (menuItem) {
                case SORT:// sortowanie
                    displaySortMenu();
                    break;
                case CHANGE_STATE:
                    displayChangeStateMenu(); // zmiana stanu
                    break;
                case ADD:
                    displayAddMenu();
                    break;
                case END:
                    end = true; // tak kończymy działanie programu
                    break;
            }

        } while (!end);// wykona się dopóki nie ma decyzji o końcu programu, dopuki nie koniec to eykonuj petle
    }

    private void displayAddMenu() {
        System.out.println("Podaj nazwę");
        String name = readStringFromConsole();
        System.out.println("Podaj cenę");
        Double price = Double.parseDouble(readStringFromConsole());

        int max = 0;
        for (Order order : orders) {
            max = Math.max(max, order.getId());
        }

        Order order = new Order(max + 1, name, price, OrderState.ORDERED);

        orders.add(order);

        System.out.println("Dodano!");
        printOrderList();
    }

    private int readIntFromConsole() {// metoda do szczytania od użytkownika int, zwraca wpisany przez użytkownika int
        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();
        scanner.nextLine();
        return selectedOption;
    }


    private void displaySortMenu() { //sortowanie,
        System.out.println("==== SORTOWANIE ==== ");
        System.out.println("Możliwe wartości");
        SortOrder[] sortOrders = SortOrder.values(); // tworzymy tablice enumow z do sortowania z metody values(), enumy wywołują comaratory z klas comparatorów
        System.out.println(Arrays.asList(sortOrders)); //wyświetlamy opcje  sortowania

        String userInput = readStringFromConsole(); // wartość od uzytkownika, wybór opcji do sortowania

        SortOrder sortOrder = SortOrder.valueOf(userInput); // tworzymy enuma z wartości wczytanaj od uzytkownika
        Collections.sort(orders, sortOrder.orderComparator); // sortujemy po wartosci wczytanej od uzytkownika, (lista, comparator), sortOrder zwróci enuma z klasy enum  SortOrder, gdzie do konstruktorów enumów przypisane są comapratory

        System.out.println("Lista posortowana:");
        printOrderList();// wyświetlam liste posortowana
    }

    private String readStringFromConsole() { //czyta od użytkownika stringa i zwraca go
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void displayChangeStateMenu() {
        System.out.println("Podaj ID zamówienia");
        int selectedOption = readIntFromConsole(); // wczytujemy od użytkownika id zamówienia

        Order foundOrder = null; // zmienna na znalezione zamówienie

        for (Order order : orders) { // szukamy zamówienia podanego przez użytkownika, używamy do tego pętli, czy takie zamówienie jest na naszej liscie
            if (order.getId() == selectedOption) {
                foundOrder = order; //  jak znadziemy to przypisujemy do foundOrder
            }
        }

        if (foundOrder == null) { // jeśli zamówienie o id nie zostało znalezione
            System.out.println("Zmówinienie o ID: " + selectedOption + " nie zostało znalezione");// info o nie znalezieniu zamowienia
            return; // kończy działanie tej metody
        }

        System.out.println("Na jaki stan chcesz zmienić to zamówienie?"); // jeśli zamowienie zostało znalezione to pytamy

        List<String> availableTargetStates = foundOrder.getState().getAvailableTargetStates(); // lista dostępnych stanów

        if (availableTargetStates.isEmpty()) {// jeżeli lista stanów jest pusta to wyswietlam komunikat
            System.out.println("Nie można zmienić stanu tego zamówienia!");
            return; // koncze metode
        }

        System.out.println("Dostępne stany: " + availableTargetStates);// jak jest lista pełna to wyświetlam stany
        String userInput = readStringFromConsole(); // pobieram stringa od usera

        if (availableTargetStates.contains(userInput)) { // porównujemy stan od użytkownika z stanem dostepnym w liscie stanów
            OrderState orderState = OrderState.valueOf(userInput); // zamieniamy stan od użytkownika na Enuma OrderState
            foundOrder.setState(orderState); // i ustawiamy stan w obiekcie order
            System.out.println("Stan ustawiony!");
        } else {
            System.out.println("Stan nie został ustawiony!");
        }

        printOrderList(); //wyświetlamy liste zamówień
    }

    private OptionsMenuItem findMenuItem(int selectedOption) {// pobieramy od użtkownika co wybrał, na podstawie wskazanej przez uzytkownika opcji zwracamy wybór
        for (OptionsMenuItem menuItem : OptionsMenuItem.values()) { // pobieramy wszystkie wartości za pomocą metody values() która tworzy tablicę
            if (selectedOption == menuItem.number) { // jeżeli wprowadzona opcja == się opcji z OptionsMenuItem Enum to zwróć zamówieńie
                return menuItem;
            }
        }
        return null;
    }

    private void printOrderList() {// wyświetli wszystkie zamówienia obiekty order
        System.out.println("==== LISTA ZAMÓWIEŃ ==== ");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private void printMenu() { // wyświetlanie opcji do wyboru z Enum OptionsMenuItem
        System.out.println("Co chcesz zrobić? Możliwe opcje:");
        OptionsMenuItem[] values = OptionsMenuItem.values(); // pobieramy wszystkie wartości za pomocą metody values() która tworzy tablicę i tworzymy tablice
        for (OptionsMenuItem value : values) { // petla iterujemy po tablicy opcji do wyboru
            System.out.println(value.number + " -> " + value.text); // wyswietlamy dostępne enumy z numerami i wartościami
        }
    }
}
