package prework.konstruktory;

public class Address {
    //    getter - metoda służąca do odczytu danych,
//    setter - metoda służąca do modyfikacji danych
    String city;
    String street;
    String homeNo;

    Address(String city, String street, String homeNo) {
        this(city, street);
        this.homeNo = homeNo;
    }

    Address(String city, String street) {
        this.city = city;
        this.street = street;
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

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }
}
