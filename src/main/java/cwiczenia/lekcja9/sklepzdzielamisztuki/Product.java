package cwiczenia.lekcja9.sklepzdzielamisztuki;

public class Product {

    private String name;
    private double price;
    private Client[] clients;

    public Product(String name, double price, Client[] clients) {
        this.name = name;
        this.price = price;
        this.clients = clients;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
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
}
