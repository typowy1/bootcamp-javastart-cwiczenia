package cwiczenia.lekcja2_i_3.Informacjeoproduktach1klasyobiekty;

public class Producer {

    String name;
    ProducerAddress producerAddress;

    // można też tak producer ProducerAddress producerAddress =  new ProducerAddress();
    // nie trzeba tego będzie juz robić w klasie testowej
    Producer(String nam, ProducerAddress proAddre) {
        name = nam;
        producerAddress = proAddre;
    }
}
