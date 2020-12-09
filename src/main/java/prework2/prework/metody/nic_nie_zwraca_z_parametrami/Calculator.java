package prework2.prework.metody.nic_nie_zwraca_z_parametrami;

public class Calculator {
    // metody z parametrami też nic nie zwracają

    void add(int a, int b) {
        int sum = a + b;
        System.out.printf("%d + %d = %d\n", a, b, sum);
//        \n dodanie na końcu enter czyli następna linijka
        // do wyświetlania tekstu z parametrami jest metoda System.out.printf
        //%d liczba całkowita i potem pod to podstawiamy parametry kolejno 1, b, sum
    }
}
