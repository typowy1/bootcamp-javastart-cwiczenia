package cwiczenia.lekcja16.cwiczenie3taliakart;

public enum CardValue {
    //typ wyliczeniowy dla wartosci

    TWO("Dwójka", "Two"),
    THREE("Trójka", "Three"),
    FOUR("Czwórka", "Four"),
    FIVE("Piątka", "Five"),
    SIX("Szóstka", "Six"),
    SEVEN("Siódemka", "Seven"),
    EIGHT("Ósemka", "Eight"),
    NINE("Dziewiątka", "Nine"),
    TEN("Dziesiątka", "Ten"),
    JACK("Walet", "Jack"),
    QUEEN("Królowa", "Queen"),
    KING("Król", "King"),
    ACE("As", "Ace");

    private final String plName;
    private final String engName;

    CardValue(String plName, String engName) {
        this.plName = plName;
        this.engName = engName;
    }

    public String getPlName() {
        return plName;
    }

    public String getEngName() {
        return engName;
    }
}
