package prework.kolekcje.kolejki;

public class Patient {

    private String name;
    private String pesel;

    public Patient(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
