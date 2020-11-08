package prework.klasyabstrakcyjne_i_interfejsy.metodyprywatneinterfejsy;

public interface Example {
    //od javy 9 dostępne
    default void complicatedMethod() {
        read(); //np. wczytanie czegoś z pliku
        calculate(); //wykonanie obliczeń
        save(); //zapisanie czegoś w pliku
    }

    private void read() {
        //wczytujemy
    }

    ;

    private void calculate() {
        //obliczamy
    }

    ;

    private void save() {
        //zapisujemy
    }

    ;
}
