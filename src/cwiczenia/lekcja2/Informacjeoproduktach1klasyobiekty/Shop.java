package cwiczenia.lekcja2.Informacjeoproduktach1klasyobiekty;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productName = "Cola";
        product1.producer = "CocaCola";
        product1.price = 10;
        product1.availability = true;

        System.out.println("Product name: " + product1.productName + ", manufacturer: " + product1.producer
                + ", price: " + product1.price + "zł" + ", availability: " + product1.availability);

        Product product2 = new Product();
        product2.productName = "Pawełek";
        product2.producer = "Wedel";
        product2.price = 5;
        product2.availability = true;

        System.out.println("Product name: " + product2.productName + ", manufacturer: " + product2.producer
                + ", price: " + product2.price + "zł" + ", availability: " + product2.availability);

        Product product3 = new Product();
        product3.productName = "Lays";
        product3.producer = "Pepco";
        product3.price = 7.5;
        product3.availability = false;

        System.out.println("Product name: " + product3.productName + ", manufacturer: " + product3.producer
                + ", price: " + product3.price + "zł" + ", availability: " + product3.availability);
    }
}
