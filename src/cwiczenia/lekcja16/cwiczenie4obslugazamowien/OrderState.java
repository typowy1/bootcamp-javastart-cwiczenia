package cwiczenia.lekcja16.cwiczenie4obslugazamowien;

import java.util.Arrays;
import java.util.List;

public enum OrderState {// stan zamówienia

    ORDERED("READY_FOR_SHIPPING", "CANCELLED"),
    READY_FOR_SHIPPING("IN_SHIPPING", "CANCELLED"),
    IN_SHIPPING("DONE"),
    DONE,
    CANCELLED;

    private List<String> availableTargetStates;

    private OrderState(String... orderStates) {//, to jest nic innego jak tablica,  operator wieloargumentowy i argumentem bedzie dowolna ilosc argumentow ORDERED("READY_FOR_SHIPPING", "CANCELLED")
        availableTargetStates = Arrays.asList(orderStates);// tworzymy z nich listę, bo order states to była tablica
    }

    public List<String> getAvailableTargetStates() { // tworzymu liste docelowych stanów
        return availableTargetStates;
    }
}
