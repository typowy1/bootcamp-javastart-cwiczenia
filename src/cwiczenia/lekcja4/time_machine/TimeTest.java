package cwiczenia.lekcja4.time_machine;

import cwiczenia.lekcja4.time_machine.Person;
import cwiczenia.lekcja4.time_machine.TimeMachine;

public class TimeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 25);

        TimeMachine timeMachine = new TimeMachine();
        timeMachine.backInTime(person1);
        System.out.println("Wiek osoby: " + person1.age);
        timeMachine.timeTravel(person1, -5);

        System.out.println("Wiek osoby: " + person1.age);
    }
}
