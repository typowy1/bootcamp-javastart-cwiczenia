package cwiczenia.lekcja16.cwiczenie1typyopon;

public enum TireType {

    // enum daje nam odpornosć na błędy
    //typ opony z tłumaczeniem na polski
    SUMMER("lestnie"),
    WINTER("zimowe"),
    UNIWERSAL("uniwersalne");

    private String plName;

    TireType(String plName) {
        this.plName = plName;
    }

    @Override
    public String toString() {// to wyświetli wartość enuma, nadpisze type z Tire metody to string
        return plName;
    }
}
