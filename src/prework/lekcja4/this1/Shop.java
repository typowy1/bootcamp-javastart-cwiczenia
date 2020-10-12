package prework.lekcja4.this1;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Cola", 55, "CocaCola");
        Product product2 = new Product("Cola", "CocaCola");

        System.out.println(product1.getName() + " " + product1.getPrice() + " " + product1.getProducer());
        System.out.println(product2.getName() + " " + product2.getProducer());

    }
}
