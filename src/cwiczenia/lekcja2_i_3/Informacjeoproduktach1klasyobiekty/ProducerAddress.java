package cwiczenia.lekcja2_i_3.Informacjeoproduktach1klasyobiekty;

public class ProducerAddress {

    String city;
    String street;
    String number; // lepiej dać string bo może być adres 33A

    ProducerAddress(String cit, String stree, String numb) {
        city = cit;
        street = stree;
        number = numb;
    }
}
