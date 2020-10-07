package cwiczenia.lekcja2_i_3.Informacjeoproduktach1klasyobiekty;

public class Shop {
    public static void main(String[] args) {
        ProducerAddress producerAddress = new ProducerAddress("Warsaw", "Helenowska", "33A");
        Producer producer1 = new Producer("CocaCola", producerAddress);
        Product product1 = new Product("Cola", 10, true, producer1);

        ProducerAddress producerAddress2 = new ProducerAddress("Cracow", "Broniewskiego", "15");
        Producer producer2 = new Producer("Pawełek", producerAddress2);
        Product product2 = new Product("Wedel", 5, true, producer2);

        ProducerAddress producerAddress3 = new ProducerAddress("Poznan", "Jasna", "10");
        Producer producer3 = new Producer("Pepco", producerAddress3);
        Product product3 = new Product("Lays", 7.5, false, producer3);

        System.out.println("Product name: " + product1.productName
                + ", manufacturer: " + product1.producer.name
                + ", price: " + product1.price + "zł" + ", availability: "
                + product1.availability);

        System.out.println("Product name: " + product2.productName
                + ", manufacturer: " + product2.producer.name
                + ", price: " + product2.price + "zł" + ", availability: "
                + product2.availability);

        System.out.println("Product name: " + product3.productName
                + ", manufacturer: " + product3.producer.name
                + ", price: " + product3.price + "zł" + ", availability: "
                + product3.availability);

        System.out.println(product3.producer.producerAddress.city);
        System.out.println(product3.producer.producerAddress.street);
        System.out.println(product3.producer.producerAddress.number);
    }
}
