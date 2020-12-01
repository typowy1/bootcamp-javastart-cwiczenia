package cwiczenia.lekcja9.sklepzdzielamisztuki;

public class Individual extends Client {

    private String pesel;

    public Individual(String firstNme, String lastName, String address, boolean premium, String pesel) {
        super(firstNme, lastName, address, premium);
        this.pesel = pesel;
    }


    public String getPesel() {
        return pesel;
    }
}
