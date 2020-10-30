package cwiczenia.lekcja8.shop;

public class Address {
    private String city;
    private String street;
    private String homNo;
    private String flatNo;

    public Address(String city, String street, String homNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.homNo = homNo;
        this.flatNo = flatNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomNo() {
        return homNo;
    }

    public void setHomNo(String homNo) {
        this.homNo = homNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    String getFullInfo() {
        return city + ", " + street + ", " + homNo + "/" + flatNo;
    }
}
