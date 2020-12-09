package prework2.prework.wyjątki.livecoding.rzucaniewyjatkowiwlasnewyjatki;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int divide = calculator.divide(5, 0);// problematyczny wiersz opakowujemy w blok try i za pomocą catch łapiemy wyjątek
            System.out.println(divide);
        } catch (ArithmeticException ex) {
            // System.err.println(ex.getMessage());//err wyświetla komunikat w kolorze czerwonym // wyciąga komuniakt który mam bezpośrednio przy wyjątku
            ex.printStackTrace(); // jeżeli mamy to, to nie musimy dawać wiadomości jak wyżej dlatego że wiadomość wyświetli sie za wyjątkiem
        }
    }
}
