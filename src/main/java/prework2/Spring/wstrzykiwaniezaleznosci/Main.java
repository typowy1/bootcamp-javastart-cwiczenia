package prework2.Spring.wstrzykiwaniezaleznosci;

public class Main {

    public static void main(String[] args) {
        MessageProducer fileMsgProducer = new FileMessageProducer();
        MessagePrinter filePrinter = new MessagePrinter(fileMsgProducer);
        filePrinter.printMessage();

        MessageProducer simpleMsgProducer = new SimpleMessageProducer();
        MessagePrinter simplePrinter = new MessagePrinter(simpleMsgProducer);
        simplePrinter.printMessage();
    }
}
