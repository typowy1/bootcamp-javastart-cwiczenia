package prework2.junit5assertions;

public class Main {

    // Większość asercji ma możliwość definiowania wiadomości która będzie wyświetlana w przypadku błędu. W ramach pierwszego wariantu podaje się tekst jako parametr metody. Sygnatura wygląda następująco:
//    public static void assertNotNull(Object actual, String message)

//    @Test
//    public void test() {
//        String name = null;
//        Assertions.assertNotNull(name, "Name cannot be null");
//    }

    //Natomiast druga metoda pozwala na zdefiniowanie interfejsu funkcyjnego Supplier
    //
    //public static void assertNotNull(Object actual, Supplier<String> messageSupplier)

    //Wywołanie metody z wykorzystaniem wyrażeń lambda:
//    @Test
//    public void test() {
//        String name = null;
//        Assertions.assertNotNull(name, () -> "Name cannot be null"); //// pierw sprawdza, dopieru później uruchamia metode sout
//    }

    //Po co więc dwie metody? Otóż metoda z lambdą zostanie wykonana dopiero wtedy gdy wystąpi błąd. Pozwala to na odroczenie przygotowywania wiadomości do momentu gdy jest ona niezbędna. Zobacz na poniższy kod:

//    @Test
//    public void testNormal()  {
//        String name = "";
//        Assertions.assertNotNull(name, getErrorMessage());
//    }
//
//    @Test
//    public void testSupplier()  {
//        String name = "";
//        Assertions.assertNotNull(name, () -> getErrorMessage()); // pierw sprawdza, dopieru później uruchamia metode
//    }
//
//    private String getErrorMessage() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return "Name cannot be null";
//    }

    //Metoda testNormal() wykonuje się ponad sekundę, natomiast testSupplier() tylko kilka milisekund. Wynika to z tego, że błąd nie wystąpił, więc nie było potrzeby wywoływania getErrorMessage().
    //
    //Rzadko stosuję dodawanie własnych wiadomości do asercji. Jednak jestem sobie w stanie wyobrazić problematyczne przypadki do których warto dodać wiadomość. Szczególnie gdy testujemy wyjątkowo skomplikowany kawałek kodu.

}
