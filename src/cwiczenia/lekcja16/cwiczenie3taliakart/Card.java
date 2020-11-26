package cwiczenia.lekcja16.cwiczenie3taliakart;

public class Card {

    // obiekt karty z polami typu Enum
    private CardColor color;
    private CardValue value;

    public Card(CardColor color, CardValue value) {
        this.color = color;
        this.value = value;
    }

    public String plTranslation() {// wyświetlanie polskiego tłumaczenia, taki tostring dla tłumaczenia
        return value.getPlName() + " " + color.getPlName();
    }

    public String engTranslation() {// wyświetlanie angielskiego tłumaczenia
        return value.getEngName() + " of " + color.getEngName();
    }

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color +
                ", value=" + value +
                '}';
    }
}
