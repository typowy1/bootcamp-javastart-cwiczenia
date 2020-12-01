package cwiczenia.lekcja16.cwiczenie3taliakart;

public enum CardColor {

    //typ wyliczeniowy do koloru

    CLUBS("żołądź", "clubs"), // konstrukto enuma CLUBS
    DIAMONDS("dzwonek", "diamonds"),
    HEARTS("kier", "hearts"),
    SPADES("pik", "spades");

    private final String plName;// polskie tłumaczenie
    private final String engName; // angielskie tłumaczenie

    CardColor(String plName, String engName) {
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
