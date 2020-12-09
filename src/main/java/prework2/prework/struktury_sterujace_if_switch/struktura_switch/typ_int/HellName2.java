package prework2.prework.struktury_sterujace_if_switch.struktura_switch.typ_int;

public class HellName2 {
    //Switch jest przydatny też do stworzenia metody która pozwala nam zamienić jakieś wartosci
    public static void main(String[] args) {
        int option = 2;

        switch (option) {
            case 0:
                System.out.println("Koniec Programu");
                break;
            case 1:
                System.out.println("Dodawanie nowej osoby");
                break;
            default:
                System.out.println("Opcja nieznana");

        } // kod powyżej odpowiednik tego co niżej
        System.out.println("Koniec działania programu");

//        User user = new User("Jan", "Kowalski");
//
//        System.out.println("Wybierz opcję:");
//        System.out.println("0 - wyjście z programu");
//        System.out.println("1 - wyświetl informacje o użytkowniku");
//        System.out.println("2 - modyfikuj dane użytkownika");
//
//        int option = 2;
//
//        if(option == 0){
//            System.out.println("Bye bye");
//        }else if (option == 1){
//            System.out.println("Użytkownik: " + user.getFirstName() + " " + user.getLastName());
//        }else if (option == 2){
//            user.setFirstName("Marian");
//            user.setLastName("Powolny");
//            System.out.println("Zmieniono dane użytkownika na: " + user.getFirstName() + " " + user.getLastName());
//        }else{
//            System.out.println("Błędna opcja");
//        }
    }
}
