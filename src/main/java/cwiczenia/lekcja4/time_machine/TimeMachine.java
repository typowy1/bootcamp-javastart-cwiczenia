package cwiczenia.lekcja4.time_machine;

import cwiczenia.lekcja4.time_machine.Person;

public class TimeMachine {

    void backInTime(Person person) {
        person.age = person.age - 1;
    }

    void timeTravel(Person person, int year) { // możemy przekazać liczbe 3 i przeniesiemy osobe o 3 lata do przodu,
        // możemy przekazać liczbe -3 i przeniesiemy oobe o 3 lata wstecz -3 + 25 = 22

        person.age = person.age + year;
    }
}
