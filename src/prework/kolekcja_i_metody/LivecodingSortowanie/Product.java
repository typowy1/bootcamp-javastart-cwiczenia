package prework.kolekcja_i_metody.LivecodingSortowanie;

public class Product implements Comparable<Product> { // będziemy porównywalie z obiektem <Product>

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // definijemy naturalnu porządek

    @Override
    public int compareTo(Product p) { //zaimpelemntowalismy metode z interfejsu Comparable, i tu będziemy implementowac sortowanie
        //this //obiekt na tórym metoda bedzie wywolywana a pe obiekt z ktorym bedziemy porownywali
        //sortowanie wdług ceny
//        if (this.price > p.price) {
//            return 1; //chodzi o to ze jak bedzie wieksza to zwracamy dodatnia
//        }else if(this.price > p.price){
//            return 0; // równe
//        } else {
//            return -1; // mniejsza
//        }

        // krótszy zapis ;], zamiast ifów można zapisac
        // return Double.compare(this.price, p.price); // porównujemy toa cene do ceny obiektu

//        sortowanie stringow
//        return this.name.compareTo(p.name); // sortowanie po nazwie

        //sortowanie po cenie i po nazwie
        int priceCompare = Double.compare(this.price, p.price);
        if (priceCompare == 0) {
            return this.name.compareTo(p.name);
            // jezeli ceny sa równe to zwracamy wynik porownania nazw, czyli jak ceny beda rowne to sortujemy po nazwach
            // jeżeli cena jest mniejsza lub większ to na nazwe nie musimy patrzec i dopisujemy blok elese i zwracamy priceCompare
        } else
            return priceCompare;

        //sortowanie według kilku kryteriów
//       1. tworzymy osobne klasy do tego z interfejsem comparator, PriceComparator


    }
}
