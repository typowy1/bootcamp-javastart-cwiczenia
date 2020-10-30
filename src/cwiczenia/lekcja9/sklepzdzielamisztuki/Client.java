package cwiczenia.lekcja9.sklepzdzielamisztuki;

public class Client {

    private String firstNme;
    private String lastName;
    private String address;
    private boolean premium;

    public Client(String firstNme, String lastName, String address, boolean premium) {
        this.firstNme = firstNme;
        this.lastName = lastName;
        this.address = address;
        this.premium = premium;
    }

    public String getFirstNme() {
        return firstNme;
    }

    public void setFirstNme(String firstNme) {
        this.firstNme = firstNme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
