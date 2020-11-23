package cwiczenia.lekcja16.cwiczenie5zarzadzaniezadaniami;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // formatr statyczny, zeby wyświetlać date w tej formie

    private String desc;//opis
    private LocalDateTime deadline;// do kiedy należy zrealizować to zadanie

    public Task(String desc, LocalDateTime deadline) {
        this.desc = desc;
        this.deadline = deadline;
    }

    public String getDesc() {
        return desc;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return desc + " (" + deadline.format(formatter) + ")";
    }
}
