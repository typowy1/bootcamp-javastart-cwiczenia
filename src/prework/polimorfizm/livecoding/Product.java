package prework.polimorfizm.livecoding;

import java.util.Objects;

public class Product {
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


    // możemy ją wygenerować automatyczne alt + insert i wybieramy insert equals and hash code
//   @Override
//    public boolean equals(Object object) { // nadpisaliśmy metode equals zklasy Object, teraz będzie porównywała obiekty z tej klasy
//        if (this == object)
//            return true;
//        if (object == null)
//            return false;
//        if (!(object instanceof Product))
//            return false;
//        Product other = (Product) object;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        if (price != other.price)
//            return false;
//        return true;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {// zwraca tą samą wartosć liczbową dla danego bjektu, wartosć jest generowana na podstawie pół
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + ", " + price + "zł";
    }
}
