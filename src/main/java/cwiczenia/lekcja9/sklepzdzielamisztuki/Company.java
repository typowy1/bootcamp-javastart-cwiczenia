package cwiczenia.lekcja9.sklepzdzielamisztuki;

public class Company extends Client {

    private String name;
    private String nIP;
    private String regon;


    public Company(String firstNme, String lastName, String address, boolean premium, String name, String nIP, String regon) {
        super(firstNme, lastName, address, premium);
        this.name = name;
        this.nIP = nIP;
        this.regon = regon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnIP() {
        return nIP;
    }

    public String getRegon() {
        return regon;
    }

}