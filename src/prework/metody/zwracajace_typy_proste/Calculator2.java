package prework.metody.zwracajace_typy_proste;

public class Calculator2 {
    // metody z parametrami też nic nie zwracają

    void add(int a, int b) {
        int sum = a + b;
        System.out.printf("%d + %d = %d\n", a, b, sum);
//        \n dodanie na końcu enter czyli następna linijka
        // do wyświetlania tekstu z parametrami jest metoda System.out.printf
        //%d liczba całkowita i potem pod to podstawiamy parametry kolejno 1, b, sum
    }

    //    zwracające wynik
    // w ramach jednej klasy może być kilka metod o tej samej nazwie ale muszą przyjmować inną liczbe parametrów lub inne typy
    double add(double a, double b) {
        return a + b;
    }
}
