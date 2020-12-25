package prework2.Spring.wstrzykiwaniezaleznosci;

public class SimpleMessageProducer implements MessageProducer {


    @Override
    public String getMessage() { //return "Example message " + System.currentTimeMillis();
        return "Example message " + System.currentTimeMillis();
    }
}
