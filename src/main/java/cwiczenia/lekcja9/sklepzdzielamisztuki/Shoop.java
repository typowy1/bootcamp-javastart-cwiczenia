package cwiczenia.lekcja9.sklepzdzielamisztuki;

public class Shoop {
    public static void main(String[] args) {
        Client[] clients = new Client[5];
        clients[0] = new Company("Rafał", "Lech", "Warszawa", true, "CCC",
                "67789987", "56677888");
        clients[1] = new Individual("Tomasz", "Kowalski", "Kraków", false,
                "566789900");

//        Product product1 = new Product("Brylant", 100000, clients[0]);
//        Product product2 = new Product("Obraz", 1000000, clients[1]);
    }
}
