package cwiczenia.lekcja16.cwiczenie4obslugazamowien;

public enum OptionsMenuItem {

    //enum do wyświetlania opcji
    SORT(1, "Posortuj"), // druga wartosć to informacja dla użytkownika
    CHANGE_STATE(2, "Zmień stan"),
    ADD(3, "Dodaj"),
    END(0, "Zakończ działanie");

    public final int number;
    public final String text;

    OptionsMenuItem(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void enter() {

    }
}
