package prework2.prework.struktury_sterujace_if_switch.struktura_if;

public class UserManager {
    public static void main(String[] args) {

//        if - wykożystujemy wartości true lub false czy dany warunek ma się wykonać czy nie, true - wykona się,false nie
        User user = new User("Jan", "Kowalski");

        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikuj dane użytkownika");

        int option = 2;

        if (option == 0) {
            System.out.println("Bye bye");
        } else if (option == 1) {
            System.out.println("Użytkownik: " + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmieniono dane użytkownika na: " + user.getFirstName() + " " + user.getLastName());
        } else {
            System.out.println("Błędna opcja");
        }
    }
}
