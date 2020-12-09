package prework2.prework.enum1.livecoding;

public enum ContinentsEnum {

    // enumy deklaruje się po przecinku
    EUROPE("Europa"), //w konstrukto enuma wpisuje tłumaczenie
    AFRICA("Afryka"),
    ASIA("Azja"),
    AUSTRALIA("Australia"),
    ANTARCTIC("Antarktyda");

    // dodajemy wartosci do enumów

    private String translation;

    ContinentsEnum(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
