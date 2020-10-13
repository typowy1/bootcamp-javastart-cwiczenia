package prework.struktury_sterujace_if_switch.struktura_switch.string;

public class HelloName {

    public static void main(String[] args) {
        //Switch jest przydatny też do stworzenia metody która pozwala nam zamienić jakieś wartosci
//        switch - porównujemy ze sobą wiele wartosci całkowitoliczbowych albo String, używamy wtedy kiedy mamy kilka
//        na sztywno zdefinowanych wartości które sie nie zmieniają
//        idealnie nadaje się do wyboru np opcji w programie, w packageu typ_int przykład

        final String name1 = "Krzysiek";
        final String name2 = "Maciek";
        final String name3 = "Piotr";

        String name = "Krzysiek"; // ta wartosć może być wpisana np z klawiatury lub pobrana

        // ważne dla tej instrukcji zmienne trzeba podać jako final lub bezpośrednio przy case, muszą być niezmienne
        switch (name) { //(wartość int lub String) którą chcemy porównac z innymi wartościami
            case name1:// case - przypadek, //jesli false to sprawdz nastepny
                //jeżeli name to jest to samo co name1 to wydrukuj Siema Krzychu
                System.out.println("Siemano Krzychu! Witaj w programie.");
                break;// powoduje przerwanie bloku case, trzeba stosować po każdym case bo
            // inaczej wykonają się wszystkie instrukcje
            case name2:
            case name3://możemy wkonać instrukcje dla kilku zmiennych, czyli dla dwóch prezesów wyświetli
                // się ten sam komunikat
                //jeżeli name to jest to samo co name2 to wydrukuj Witam Panie prezesie
                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
                break;
            default: // jeżeli name nie będzie ani name 1, ani name 2 to wykona się blok defalut, nie jest on konieczny
                // odpowiednik else, //domyślne zachowanie programu w przypadku, gdy żadna z wartości podanych powyżej
                // nie została dopasowana, Ponieważ jest to ostatnia instrukcja w naszym switch'u nie musimy
                // się już martwić przerywaniem wykonania i możemy pominąć instrukcję break.
//                Blok default jest opcjonalny, nie musisz go definiować, jeśli nie masz pomysłu na domyślne zachowanie.
                System.out.println("Witaj nieznany użytkowniku");
        }
        System.out.println("Koniec Programu");

//        tak to wygląda jaśniej
//        switch (name) {
//            case "Krzysiek":
//                System.out.println("Siemano Krzychu! Witaj w programie.");
//                break;
//            case "Maciek":
//                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
//                break;
//            default:
//                System.out.println("Witaj nieznany użytkowniku!");
//        }

        //Jeżeli istnieje potrzeba zastosowania takiego samego wyniku dla kilku różnych wartości, możemy zastosować
        // konstrukcję z wielokrotnym case. Dodajmy do powyższego kodu jeszcze jedną osobę - Marka, który też jest
        // prezesem, więc powitanie będzie dla niego takie samo jak dla Maćka.

//        final String krzysiek = "Krzysiek";
//        final String maciek = "Maciek";
//        final String marek = "Marek";
//
//        String name = "Marek";
//
//        switch (name) {
//            case krzysiek:
//                System.out.println("Siemano Krzychu! Witaj w programie.");
//                break;
//            case maciek:
//            case marek:
//                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
//                break;
//            default:
//                System.out.println("Witaj nieznany użytkowniku!");
//        }
    }
}
