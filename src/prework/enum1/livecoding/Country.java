package prework.enum1.livecoding;

public class Country {

    private String name;
    private ContinentsEnum continent; // pole o typie ContinentsEnum

    public Country(String name, ContinentsEnum continent) {
        this.name = name;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContinentsEnum getContinent() {
        return continent;
    }

    public void setContinent(ContinentsEnum continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return name + ", kontynent: " + continent.getTranslation(); //pobieramy wartosć z enuma nie nazwe enuma
    }
}
