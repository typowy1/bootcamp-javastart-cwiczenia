package prework2.Spring.wstrzykiwaniezaleznosci;

public class MessagePrinter { //klasa drukująca wiadomości pobierane z MessageProducer

    private MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }

//    W klasie MessagePrinter dodaliśmy konstruktor przyjmujący argument typu MessageProducer, możemy tu więc przekazać
//    zarówno obiekt SimpleMessageProducer jak i FileMessageProducer.
//    Naprawiliśmy tym samym problem silnego wiązania pomiędzy klasami. Jeżeli ktoś będzie chciał skorzystać z tej klasy, to sam decyduje, której implementacji chce użyć, a tym samym nasz kod jest dużo bardziej podatny na rozbudowę i staje się łatwiejszy w utrzymaniu.
}
