package cwiczenia.lekcja16.cwiczenie5zarzadzaniezadaniami;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    public static final int ALL_TASKS = 1;
    public static final int PAST_TASKS = 2;
    public static final int FUTURE_TASKS = 3;
    public static final int END = 0;

    public static final int FUTURE_24H = 1;
    public static final int FUTURE_THIS_WEEK = 2;
    public static final int FUTURE_30_DAYS = 3;

    public void run() {
        List<Task> tasks = readData();
        if (tasks != null) {
            System.out.println("Wczytano listę zadań. Liczba: " + tasks.size());
            Scanner scanner = new Scanner(System.in);


            while (true) { // działa w kółko
                System.out.println("Co chcesz wyświetlić? (1 - wszystkie, 2 - przeszłe, 3 - przyszłe, 0 - koniec)");
                int userInput = scanner.nextInt();
                scanner.nextLine();

                switch (userInput) {
                    case ALL_TASKS:
                        System.out.println(tasks); // wszystkie taski z listy
                        break;
                    case PAST_TASKS: // zakończone taski, przeszłe
                        List<Task> pastTasks = getPastTasks(tasks);// szukamy przeszłych tasków z tablicy
                        System.out.println(pastTasks); //wyswietlamy przeszłe taski
                        break;
                    case FUTURE_TASKS:// taski do zrobienia
                        List<Task> futureTasks = getFutureTasks(tasks, scanner);
                        System.out.println(futureTasks);
                        break;
                    case END: // koniec
                        return;// kończymy aplikacje, zakończ

                    default:
                        System.out.println("Nieprawidłowy wybór");
                }
            }

        }
        /*

        wszystkich zadań
        przeszłych zadań
        przyszłych zadań
            tych które należy wykonać w ciągu najbliższych 24 godzin
            tych które należy wykonać w bieżącym tygodniu (np. jeśli jest piątek to tylko te do końca niedzieli)
            tych które należy wykonać w ciągu 30 dni
         */


    }

    private List<Task> getFutureTasks(List<Task> tasks, Scanner scanner) {// użytkownik wybiera opcje
        System.out.println("Co chcesz wyświetlić? (1 - 24h, 2 - do końca tyg., 3 - 30 dni)");
        int userInput = scanner.nextInt();
        scanner.nextLine();

        List<Task> filtered = new ArrayList<>();

        LocalDateTime now = LocalDateTime.now(); // aktualna data

        switch (userInput) {
            case FUTURE_24H:
                filterForNext24H(tasks, filtered, now);
                break;
            case FUTURE_THIS_WEEK:
                filterForThisWeek(tasks, filtered, now);
                break;
            case FUTURE_30_DAYS:
                filterFor30Days(tasks, filtered, now);
                break;

            default:
                throw new IllegalArgumentException("Nieprawidłowy wybór");

        }

        return filtered; // zwracamy odfiltrowaną liste tasków według wybranych opcji użytkownika
    }

    private void filterFor30Days(List<Task> tasks, List<Task> filtered, LocalDateTime now) {// w ciągu najbiższych 30 dni
        LocalDateTime in30Days = now.plusDays(30); // od teraz do 30 dni
        for (Task task : tasks) {
            if (task.getDeadline().isAfter(now) && task.getDeadline().isBefore(in30Days)) {
                filtered.add(task);
            }
        }
    }

    private void filterForThisWeek(List<Task> tasks, List<Task> filtered, LocalDateTime now) {//do końca następnego tygodnia
        LocalDateTime nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));// od teraz do następnej niedzieli
        nextSunday = nextSunday.withHour(23).withMinute(59).withSecond(59);
        for (Task task : tasks) {
            if (task.getDeadline().isAfter(now) && task.getDeadline().isBefore(nextSunday)) {
                filtered.add(task);
            }
        }
    }

    private void filterForNext24H(List<Task> tasks, List<Task> filtered, LocalDateTime now) {//do 42h
        LocalDateTime in24H = now.plusHours(24); // teraz plus 24h
        for (Task task : tasks) {
            if (task.getDeadline().isAfter(now) && task.getDeadline().isBefore(in24H)) {// póżniej niż teraz i wcześniej niż za 24 h
                filtered.add(task);// dodajemy do listy tasków
            }

        }
    }

    private List<Task> getPastTasks(List<Task> tasks) {// przeszły task do dziesiejszej daty
        List<Task> pastTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getDeadline().isBefore(LocalDateTime.now())) { //patrzymy czy zakończenie zadania jest przed aktualnym czasem czyli np wczoraj
                pastTasks.add(task); // i  dodajemy wszystkie stare, przeszłe zadania do nowej tablicy pastTasks
            }
        }
        return pastTasks; // zwracam liste zadan przeszłych
    }


    private List<Task> readData() {
        try {
            List<String> strings = Files.readAllLines(Path.of("tasks.csv"));// czyta wszystkie linie z pliku

            List<Task> tasks = new ArrayList<>();// lista zadani

            for (String string : strings) {// przejdziemy po wszystkich elementach pliku
                String[] split = string.split(";"); /// dzielimy linie

                List<String> patterns = Arrays.asList("yyyy-MM-dd HH:mm", "dd.MM.yyyy HH:mm");// lista obslugiwanych wartosci

                boolean added = false;
                for (String pat : patterns) { // wyciągamy z listy patterns formaty które mają być pat
                    try {// łapiemy wyjatek
                        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(pat);// z javaTime, formatujemy czas, wzór czasu
                        TemporalAccessor temporalAccessor = pattern.parse(split[1]); // zwróci nam implementacje interfejsu, parsujemy date do TemporalAccessor i parsujemy z stringa na niego i  z niego możemy utworzyć lokacDateTime,
                        //opis czasu read only
                        LocalDateTime deadline = LocalDateTime.from(temporalAccessor); //local date time tworzymy z temporary Accesor i wartosci z pliku
                        tasks.add(new Task(split[0], deadline)); // do listy tasks dodajemy dowe zadanie, dedline data do kiedy nalezy wykonac
                        added = true;
                        break;
                    } catch (DateTimeParseException e) {
                        // ignore
                    }
                }

                if (!added) {
                    throw new IllegalArgumentException("Nie udało się sprasować wartości: " + split[1]);
                }
            }

            return tasks; // zwraca liste tasków

        } catch (IOException e) {
            System.out.println("Błąd wczytywania danych");
            return null;
        }
    }
}
