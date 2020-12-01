package cwiczenia.lekcja17woddzielnymrepo.lekcja17wcwiczeniachwfolderze.cwiczenie3narepolekcja17cwiczenie3;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachineTwo {

    //Rozwiązanie jest na folderze lekcja17cwiczenie3

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        return ppl.stream()
                .filter(kid -> kid.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        return people.stream()
                .map(person -> new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge()))
                .collect(Collectors.toList());
    }
}
